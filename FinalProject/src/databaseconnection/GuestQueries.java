/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.EmailFormat;
import model.Guest;
import static model.Guest.guestList;

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
                EmailFormat In = new EmailFormat(email,"Welcomeee","Welcome to our Hotel ");
                In.sendEmail();
                
    //                saving username, password and role in Login Table
                String password = name;
                String role = "Guest";
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
        
        
    }
    
    

