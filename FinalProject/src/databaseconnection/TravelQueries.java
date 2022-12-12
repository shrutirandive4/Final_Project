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

/**
 *
 * @author shubhimiradwal
 */
public class TravelQueries {

    public TravelQueries() {
    }
    
     public boolean schedulePickup(String email,String pickup_location,String pickup_time, String Schedule_pickup, String driver_name){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql_get_guestid="Select guest_id from guest where email = '"+email+ "'";
                ResultSet resultSet = statement.executeQuery(sql_get_guestid);
                int guest_id=0;
                while (resultSet.next()) {
                guest_id = Integer.parseInt(resultSet.getString(1));
                }
                
                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pickup_location, pickup_time,travel_type, driver_name, drop_location, drop_time, guest_id)"
                        + "VALUES ('" + email+ "' , '" + pickup_location + "', '"
                        + pickup_time + "','"+Schedule_pickup+"', '" + driver_name + "', 'Boston Logan Airport', '1hr', '" + guest_id + "' );";

                System.out.println(sql);
                statement.executeUpdate(sql);
            return true;

            }
            //System.out.println("DB Connection Close!!!");
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }
     }
    
    public boolean scheduleDropDestination(String email, String destinationLocation, String pickupTime, String driverName, String scheduleDestinationDrop){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql_get_guestid="Select guest_id from guest where email = '"+email+ "'";
                ResultSet resultSet = statement.executeQuery(sql_get_guestid);
                int guest_id=0;
                while (resultSet.next()) {
                guest_id = Integer.parseInt(resultSet.getString(1));
                }
                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pickup_location, pickup_time, travel_type, driver_name, drop_location, drop_time, guest_id)"
                        + "VALUES ('" + email+ "' , 'Hotel', '"
                        + pickupTime + "','"+scheduleDestinationDrop+"', '" + driverName + "', '"+destinationLocation+"', 'Null', '" + guest_id + "');";


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
    public boolean scheduleCityTour(String email, String pickupTime, String selectCity, String ScheduleCityTour, String driverName){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();
                String sql_get_guestid="Select guest_id from guest where email = '"+email+ "'";
                ResultSet resultSet = statement.executeQuery(sql_get_guestid);
                int guest_id=0;
                while (resultSet.next()) {
                guest_id = Integer.parseInt(resultSet.getString(1));
                }
                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pickup_location, pickup_time, travel_type, driver_name, drop_location, drop_time, guest_id)"
                        + "VALUES ('" + email+ "' , 'Hotel', '"
                        + pickupTime + "','"+ScheduleCityTour+"', '" + driverName + "', '"+selectCity+"', 'Null', '" + guest_id + "' );";

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
}
    

