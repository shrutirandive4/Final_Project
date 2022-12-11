/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author shubhimiradwal
 */
public class TravelQueries {

    public TravelQueries() {
    }
    
     public boolean scheduleAirportPickup(String email,String pick_up_location,String pick_up_time, String Schedule_airport_pickup, String driver_name){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pick_up_location, pick_up_time,travel_type,driver_name)"
                        + "VALUES ('" + email+ "' , '" + pick_up_location + "', '"
                        + pick_up_time + "','"+Schedule_airport_pickup+"','"+driver_name+"');";

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
    
    public boolean scheduleCityTour(String email,String pick_up_location,String pick_up_time, List<String>cites){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pick_up_location, pick_up_time,travel_type)"
                        + "VALUES ('" + email+ "' , '" + pick_up_location + "', '"
                        + pick_up_time + "','"+cites+"');";

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
    
    
//     public boolean scheduleDestinationDrop(String guestEmail,String destination_location,){
//    try {
//            try (Connection connection = JDBCConnection.Connect()) {
//                Statement statement = (Statement) connection.createStatement();
//
//                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pick_up_location, pick_up_time,travel_type,driver_name)"
//                        + "VALUES ('" + guestEmail+ "' , '" + destination_location + "', '"
//                        + destination_time + "','"+ ariport_pickup + "','"+driverName+"');";
//
//                System.out.println(sql);
//                statement.executeUpdate(sql);
//            return true;
//
//            }
//            //System.out.println("DB Connection Close!!!");
//        } catch (HeadlessException | SQLException exception) {
//            System.out.println(exception);
//            return false;
//            
//        }
//    } 
}
    

