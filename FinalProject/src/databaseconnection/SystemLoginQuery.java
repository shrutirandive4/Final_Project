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
 * @author Davleen kaur
 */
public class SystemLoginQuery {
    public  SystemLoginQuery(){}
    
    public boolean CheckUsernamePwd(String email,String password ){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "Select * from hotelmanagement.login where email='"+ email +"' and password='"+ password +"'" ;
                
                        

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
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
            
        }
        
        
    }
    
    
    public String getRole(String email ){
        String role="";
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "Select * from hotelmanagement.login where email='"+ email +"'" ;
                
                        

                System.out.println(sql);
               
                ResultSet rs=statement.executeQuery(sql);
              while (rs.next()) 
              {
                   role=rs.getString(3);
              }
            }
              
               
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            
            
        }
        return role;
        
    }
    
    
}
