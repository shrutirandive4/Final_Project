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
import model.Room;
import static model.Room.room_no;


/**
 *
 * @author Davleen kaur
 */
public class AddRoomsQuery {
    public AddRoomsQuery (){
    }
    public boolean CheckRoomNo(int roomNo ){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "Select room_no from hotelmanagement.room where room_no='"+ roomNo +"'";

                System.out.println(sql);
                ResultSet rs=statement.executeQuery(sql);
                if(rs.next()) {
                   
                       return true;
                       
                }
                else {
                    return false;
                }
            }
               
            //System.out.println("DB Connection Close!!!");
        } 
        catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }        
    }
    
    
    public boolean addRooms(int roomNo,String roomType,int room_price){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.room " + "(room_no,room_type,room_price)"
                        + "VALUES ('" + roomNo + "' , '" + roomType+ "' , '" + room_price + "');";

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
        
        
        public static List<String> getRoom_no(String checkin_date,String checkout_date) throws SQLException{
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        System.out.println("hi");
        String sql = "select room_no from room where room_no not in("
                + "select room_no from hotelmanagement.booking b \n" +
"where ( check_in_date >= "+checkin_date+"  - interval 1 day and 'check_in_date' <= "+checkout_date +
                " )or  ('check_out_date' >= " +checkin_date+" - interval 1 day and 'check_in_date' <= "+checkout_date+"))";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        
        ResultSet resultSet = statement.executeQuery(sql);
        room_no.clear();
        while (resultSet.next()) {
            String room_no = resultSet.getString(1);
            Room.room_no.add(room_no);
            System.out.println("===========Room No================"+room_no);
            
        }  
        return room_no;

    }
        
    public static List<Booking> getBookings() throws SQLException{
        try{
     Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        String sql = "SELECT email, name, b.room_no, room_type, check_in_date, check_out_date FROM hotelmanagement.booking b join guest g on g.guest_id =b.guest_id \n" +
"join room r on r.room_no = b.room_no;";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        Booking.bookingList.clear();
         while (resultSet.next()) {
             for (int i = 1; i <= columnsNumber; i++) {
        if (i > 1) System.out.print(",  ");
        String columnValue = resultSet.getString(i);
        System.out.print(columnValue + " " + rsmd.getColumnName(i) + " " +  rsmd.getColumnTypeName(i));
    }
    System.out.println("");
//             System.out.println("Inside result seeettttt");
            String name = resultSet.getString(2);
//            System.out.println(name);
            String email = resultSet.getString(1);
//            System.out.println(email);
            Integer room_no = resultSet.getInt(3);
//             System.out.println(room_no);
            Date checkin_date = resultSet.getDate(5);
            Date checkout_date = resultSet.getDate(6);
            String room_type = resultSet.getString(4);
//            System.out.println(room_type);
           bookingList.add(new Booking(room_no,checkin_date,checkout_date,email,
           name, room_type));
            }
          for(Booking emp:bookingList)
                   {
                       System.out.println(emp.emailAddress);
                   } 
        return bookingList;
        }catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
                return bookingList;
        
        } 

    }
}
    


