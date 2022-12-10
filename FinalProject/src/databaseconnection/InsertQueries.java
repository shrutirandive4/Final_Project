/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import model.EmailFormat;


/**
 *
 * @author Davleen kaur
 */

public class InsertQueries {
    public  InsertQueries(){}
    
    public boolean CheckEmail(String emailid ){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "Select email from hotelmanagement.employee where email='"+ emailid +"'";
                        

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
    public boolean addEmp(String name,String email,Long phoneNo,String address,String role,int salary){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.employee " + "( email,name, address, role, salary,phone)"
                        + "VALUES ('" + email + "' , '" + name+ "' , '" + address + "', '"
                        + role + "', '" + salary + "', '" + phoneNo  + "');";

                System.out.println(sql);
                statement.executeUpdate(sql);
                EmailFormat In = new EmailFormat(email,"pagal","Welcome");
                In.sendEmail();
                
       
            
            return true;

            }
            //System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            System.out.println(exception);
            return false;
        }
    }                                      

        
        
        
    }
    
    

