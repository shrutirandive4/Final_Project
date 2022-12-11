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
    
     public boolean scheduleAirportPickup(String email,String pickup_location,String pickup_time, String Schedule_airport_pickup, String driver_name){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pickup_location, pickup_time,travel_type, driver_name, drop_location, drop_time)"
                        + "VALUES ('" + email+ "' , '" + pickup_location + "', '"
                        + pickup_time + "','"+Schedule_airport_pickup+"', '" + driver_name + "', 'Boston Logan Airport', '1hr');";

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
    
    public boolean scheduleDropDestination(String email, String destinationLocation, String pickupTime, String driverName, String scheduleDestinationDrop){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pickup_location, pickup_time, travel_type, driver_name, drop_location, drop_time)"
                        + "VALUES ('" + email+ "' , 'Hotel', '"
                        + pickupTime + "','"+scheduleDestinationDrop+"', '" + driverName + "', '"+destinationLocation+"', 'Null');";


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
    public boolean scheduleCityTour(String guestEmail, String pickupTime, String selectCity, String ScheduleCityTour, String driverName){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.travel " + "(email, pickup_location, pickup_time, travel_type, driver_name, drop_location, drop_time)"
                        + "VALUES ('" + guestEmail+ "' , 'Hotel', '"
                        + pickupTime + "','"+ScheduleCityTour+"', '" + driverName + "', '"+selectCity+"', 'Null');";

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
    

