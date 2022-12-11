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
import model.Employee;
import static model.Employee.driverName;
import model.Guest;
import static model.Guest.guestList;
import model.Recreation;
import static model.Recreation.recreationNameList;

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
    

}
