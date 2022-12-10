/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shubhimiradwal
 */
    
public class GuestQueries {
    public  GuestQueries(){
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
            return true;

            }
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }
    }                                      

        
        
        
    }
    
    

