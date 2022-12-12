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
import static model.Booking.guestRoomBooking;
import model.EmailFormat;
import model.Employee;
import static model.Employee.employeeEachList;
import model.Guest;
import static model.Guest.guestEachList;
import static model.Guest.guestList;
import model.RecreationBooking;
import static model.RecreationBooking.guestRecreationBooking;
import model.ShowRecreationBookingsAmount;
import static model.ShowRecreationBookingsAmount.recAmountList;
import model.ShowRoomBookingsAmount;
import static model.ShowRoomBookingsAmount.roomAmountList;

/**
 *
 * @author shubhimiradwal
 */
    
public class GuestQueries {
    public  GuestQueries(){
    }
    public boolean CheckEmail(String emailid ){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "Select email from hotelmanagement.guest where email='"+ emailid +"'";

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
    
    public boolean addGuest(String name,String email, long phone_number,String address){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.guest " + "(name, email, phone_number, address)"
                        + "VALUES ('" + name+ "' , '" + email + "', '"
                        + phone_number + "', '" + address + "');";

                System.out.println(sql);
                statement.executeUpdate(sql);
                String role = "Guest";
                String password = name+role;
                String msg = "Welcome" +name+ "to our Hotel !! You have successfully registered. To login use your email id: "+email+ "and password: "+password;
                System.out.println("================================="+msg);
                EmailFormat In = new EmailFormat(email,msg,"Welcome to our Hotel ");
                In.sendEmail();
                
    //                saving username, password and role in Login Table
                
                String sqlLogin = "INSERT INTO hotelmanagement.login " + "( email,password,role)"
                        + "VALUES ('" +email+ "' , '" +password+ "' , '" +role+ "');";

                System.out.println(sqlLogin);
                statement.executeUpdate(sqlLogin);
                
       
            return true;

            }
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }
    }        
    public boolean addGuestRegisterJFrame(String name,String email, long phone_number,String address, String password){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.guest " + "(name, email, phone_number, address)"
                        + "VALUES ('" + name+ "' , '" + email + "', '"
                        + phone_number + "', '" + address + "');";

                System.out.println(sql);
                statement.executeUpdate(sql);
                String role = "Guest";
//                String password = name+role;
                String msg = "Welcome " +name+ " to our Hotel !! You have successfully registered. To login use your email id: "+email+ " and password: "+password;
                System.out.println("================================="+msg);
                EmailFormat In = new EmailFormat(email,msg,"Welcome to our Hotel ");
                In.sendEmail();
                
    //                saving username, password and role in Login Table
                
                String sqlLogin = "INSERT INTO hotelmanagement.login " + "( email,password,role)"
                        + "VALUES ('" +email+ "' , '" +password+ "' , '" +role+ "');";

                System.out.println(sqlLogin);
                statement.executeUpdate(sqlLogin);
                
       
            return true;

            }
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }
    }        
     public boolean bookRoom(String email,int room_no,String room_type, String checkin_date, String checkout_date){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql_get_guestid="Select guest_id from guest where email = '"+email+ "'";
                ResultSet resultSet = statement.executeQuery(sql_get_guestid);
                int guest_id=0;
                while (resultSet.next()) {
                guest_id = Integer.parseInt(resultSet.getString(1));
                }
                
                String sql = "INSERT INTO hotelmanagement.booking " + "(guest_id,room_no,check_in_date,check_out_date)"
                        + "VALUES ('" + guest_id+ "' ,'" + room_no+ "' , '" + checkin_date + "', '"
                        + checkout_date +"');";

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
    public boolean bookRecreation(String email, String activityName, String time, String date){
        try {
                try (Connection connection = JDBCConnection.Connect()) {
                    Statement statement = (Statement) connection.createStatement();
                    String sql_get_guestid="Select guest_id from guest where email = '"+email+ "'";
                    ResultSet resultSet = statement.executeQuery(sql_get_guestid);
                    int guest_id=0;
                    while (resultSet.next()) {
                    guest_id = Integer.parseInt(resultSet.getString(1));
                    }
                    String sql_get_recreationid="Select recreation_id from recreation where recreation_name = '"+activityName+ "'";
                    ResultSet rs = statement.executeQuery(sql_get_recreationid);
                    int recreation_id=0;
                    while (rs.next()) {
                    recreation_id = Integer.parseInt(rs.getString(1));
                    }
                    String sql = "INSERT INTO hotelmanagement.recreation_booking " + "(guest_id, recreation_id, recreation_booking_time, recreation_booking_date)"
                            + "VALUES ('" + guest_id+ "' ,'" + recreation_id+ "' , '" + time + "', '"
                            + date +"');";

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
    
    
    public static List<Guest> getGuest() throws SQLException{
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        
        String sql = "select * from hotelmanagement.guest";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        Guest.guestList.clear();
        while (resultSet.next()) {
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            long phoneNumber = resultSet.getLong(4);
            String address = resultSet.getString(5);
            guestList.add(new Guest(name, address, phoneNumber, email));
                   for(Guest gue:guestList)
                   {
                       System.out.println(gue.name);
                   }   
                }

                return guestList;
        } 
            
    public static void updateGuest(String name, long phone_no, String address, String email) throws SQLException{
   
           Connection connection = JDBCConnection.Connect(); 
                Statement statement = (Statement) connection.createStatement();

                String sql = "UPDATE hotelmanagement.guest SET name = '"+name+ "', phone_number = '"+phone_no+"', address = '"+address+"' WHERE email = '" +email+"';";

                System.out.println(sql);
                statement.executeUpdate(sql);
                System.out.println("Guest Updated!!");
                  
    }
    
    public static void deleteSelectedGuest(String email) throws SQLException{
   
   
            Connection connection = JDBCConnection.Connect(); 
            Statement statement = (Statement) connection.createStatement();

            String sql = "DELETE FROM hotelmanagement.guest WHERE email='"+email+ "';";

            System.out.println(sql);
            //statement.executeUpdate(sql);
            statement.executeUpdate(sql);
            
            String sql2 = "DELETE FROM hotelmanagement.login WHERE email='"+email+ "';";
            System.out.println(sql2);
            statement.executeUpdate(sql2);

            System.out.println("Guest Deleted!!");
                  
     }   
    
    
    public static List<ShowRoomBookingsAmount> getRoomAmount() throws SQLException{
        try{
     Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        String sql = "select g.guest_id, g.name,b.check_out_date, sum(room_price) " +
" from hotelmanagement.guest g join hotelmanagement.booking b on g.guest_id=b.guest_id " +
" join hotelmanagement.room r on r.room_no=b.room_no " +
" group by g.guest_id; ";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        ShowRoomBookingsAmount.roomAmountList.clear();
         while (resultSet.next()) {
             for (int i = 1; i <= columnsNumber; i++) {
        if (i > 1) System.out.print(",  ");
        String columnValue = resultSet.getString(i);
        System.out.print(columnValue + " " + rsmd.getColumnName(i) + " " +  rsmd.getColumnTypeName(i));
    }
    System.out.println("");
//             System.out.println("Inside result seeettttt");
            String name = resultSet.getString(2);
            System.out.println(name);
            Date checkout_date = resultSet.getDate(3);
                        System.out.println(checkout_date);
            Integer total = resultSet.getInt(4);
             System.out.println(total);
            
//            System.out.println(room_type);
           roomAmountList.add(new ShowRoomBookingsAmount(name,checkout_date,total));
            }
          
        return roomAmountList;
        }catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
                return roomAmountList;
        
        } 

    }
    
    
    public static List<ShowRecreationBookingsAmount> getRecAmount() throws SQLException{
        try{
     Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        String sql = "select g.name, sum(recreation_price) from recreation_booking rb " +
" join recreation  r on r.recreation_id = rb.recreation_id " +
" join guest g on g.guest_id=rb.guest_id " +
" group by g.name;";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        ShowRecreationBookingsAmount.recAmountList.clear();
         while (resultSet.next()) {
             for (int i = 1; i <= columnsNumber; i++) {
        if (i > 1) System.out.print(",  ");
        String columnValue = resultSet.getString(i);
        System.out.print(columnValue + " " + rsmd.getColumnName(i) + " " +  rsmd.getColumnTypeName(i));
    }
    System.out.println("");
//             System.out.println("Inside result seeettttt");
            String name = resultSet.getString(1);
            System.out.println(name);
            //Date checkout_date = resultSet.getDate(3);
                        //System.out.println(checkout_date);
            Integer total = resultSet.getInt(2);
             System.out.println(total);
            
//            System.out.println(room_type);
           recAmountList.add(new ShowRecreationBookingsAmount(name,total));
            }
          
        return recAmountList;
        }catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
                return recAmountList;
        
        } 

    }
    public static List<Guest> getEachGuestDetails(String emailID) throws SQLException{
       Connection connection = JDBCConnection.Connect(); 
       Statement statement = (Statement) connection.createStatement();

       String sql = "select * from hotelmanagement.guest where email='"+emailID+ "';";
       System.out.println(sql);
       //statement.executeUpdate(sql);
       ResultSet resultSet = statement.executeQuery(sql);
       Guest.guestEachList.clear();
       while (resultSet.next()) {
           String name = resultSet.getString(2);
           String email = resultSet.getString(3);
           long phone_number = resultSet.getLong(4);
           String address = resultSet.getString(5);


           guestEachList.add(new Guest(name,address,phone_number,email));
               }

          return guestEachList;

       }    
    public static List<Booking> getEachGuestRoomBoking(String emailID) throws SQLException{
       Connection connection = JDBCConnection.Connect(); 
       Statement statement = (Statement) connection.createStatement();

       String sql = "select  g.name,b.check_in_date,b.check_out_date,r.room_price from guest g join booking b on g.guest_id=b.guest_id join room r on r.room_no=b.room_no where g.email='"+emailID+ "';";
       System.out.println(sql);
       //statement.executeUpdate(sql);
       ResultSet resultSet = statement.executeQuery(sql);
       Booking.guestRoomBooking.clear();
       while (resultSet.next()) {
           String name = resultSet.getString(1);
           Date checkinDate = resultSet.getDate(2);
           Date checkoutDate = resultSet.getDate(3);
           int price = resultSet.getInt(4);

           
           guestRoomBooking.add(new Booking(checkinDate,checkoutDate,price, name));
               }

          return guestRoomBooking;

       }    
    public static List<RecreationBooking> getEachGuestRecreationBoking(String emailID) throws SQLException{
       Connection connection = JDBCConnection.Connect(); 
       Statement statement = (Statement) connection.createStatement();

       String sql = "select g.name,r.recreation_name,r.recreation_time,r.recreation_price from recreation_booking rb join recreation  r on r.recreation_id = rb.recreation_id join guest g on g.guest_id=rb.guest_id where g.email='"+emailID+ "';";
       System.out.println(sql);
       //statement.executeUpdate(sql);
       ResultSet resultSet = statement.executeQuery(sql);
       RecreationBooking.guestRecreationBooking.clear();
       
       while (resultSet.next()) {
           String name = resultSet.getString(1);
           String recreation_name = resultSet.getString(2);
           String recreation_time = resultSet.getString(3);
           int price = resultSet.getInt(4);

           guestRecreationBooking.add(new RecreationBooking(recreation_name, recreation_time, name, price));

               }

          return guestRecreationBooking;

       }    
    }
    
    

