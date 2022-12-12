/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import model.Booking;
import static model.Booking.bookingList;
import model.Employee;
import static model.Employee.driverName;
import model.Guest;
import static model.Guest.guestList;
import model.Recreation;
import static model.Recreation.recreationNameList;
import model.RecreationBooking;
import static model.RecreationBooking.recreationBookingList;

/**
 *
 * @author shubhimiradwal
 */
public class RecreationQueries {

    public RecreationQueries() {
    }
    
    public boolean addRecreation(String recreation_name,int recreation_price,String recreation_time){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.recreation " + "(recreation_name, recreation_price, recreation_time)"
                        + "VALUES ('" + recreation_name+ "' , '" + recreation_price + "', '"
                        + recreation_time + "');";

                System.out.println(sql);
                statement.executeUpdate(sql);
            return true;

            }
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }
    }
//    DROPDOWN 
    public static List<String> getRecreationName() throws SQLException{
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        
        String sql = "select recreation_name from hotelmanagement.recreation";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        Recreation.recreationList.clear();
        
        while (resultSet.next()) {
            String recreation_name = resultSet.getString(1);
            Recreation.recreationNameList.add(recreation_name);
            
            System.out.println("===========DRIVER NAME================"+recreation_name);
            
        }  
        return recreationNameList;
    }
    
    public static List<RecreationBooking> getRecreationBookings() throws SQLException{
        try{
            Connection connection = JDBCConnection.Connect(); 
               Statement statement = (Statement) connection.createStatement();
               String sql = "SELECT email, name, r.recreation_name, recreation_booking_time, recreation_booking_date FROM hotelmanagement.recreation_booking b JOIN guest g ON g.guest_id = b.guest_id JOIN recreation r ON r.recreation_id = b.recreation_id;";
               System.out.println(sql);
               //statement.executeUpdate(sql);
               ResultSet resultSet = statement.executeQuery(sql);
               ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
               int columnsNumber = rsmd.getColumnCount();

               RecreationBooking.recreationBookingList.clear();
                while (resultSet.next()) {
                    for (int i = 1; i <= columnsNumber; i++) {
                        if (i > 1) System.out.print(",  ");
                        String columnValue = resultSet.getString(i);
                        System.out.print(columnValue + " " + rsmd.getColumnName(i) + " " +  rsmd.getColumnTypeName(i));
                    }
                   System.out.println("");
                   String name = resultSet.getString(2);
                   String email = resultSet.getString(1);
                   String recreation_name = resultSet.getString(3);
                   String recreation_booking_time = resultSet.getString(4);
                   String recreation_booking_date = resultSet.getString(5);
       //            System.out.println(room_type);
                  recreationBookingList.add(new RecreationBooking(recreation_name, recreation_booking_time, recreation_booking_date, email, name));
                   }
                for (RecreationBooking re : recreationBookingList){
                    System.out.println(re.guestName);
                }
                
               return recreationBookingList;
        }catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
                return recreationBookingList;
        
        } 

    }

}
