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
}
