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
import java.util.List;
import model.Employee;
import static model.Employee.employeelist;

/**
 *
 * @author Davleen kaur
 */

public class EmployeeQueries {
    
    public  EmployeeQueries(){
    }
    
    
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
    public boolean addEmp(String email, String name,String address,String role,int  salary,long phone_no){
    try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.employee " + "( email,name, address, role, salary,phone_no)"
                        + "VALUES ('" + email + "' , '" + name+ "' , '" + address + "', '"
                        + role + "', '" + salary + "', '" + phone_no  + "');";

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
    
    
     public static List<Employee> getEmp() throws SQLException{
//        
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        
        String sql = "select * from hotelmanagement.employee";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String name = resultSet.getString(3);
            String email = resultSet.getString(2);
            long phone_number = resultSet.getLong(7);
            String address = resultSet.getString(4);
            int salary = resultSet.getInt(6);
            String role= resultSet.getString(5);

            employeelist.add(new Employee(name,email,phone_number,address,salary,role));
                   for(Employee emp:employeelist)
                   {
                       System.out.println(emp.name);
                   }   
                }

                return employeelist;

        } 
            
        }
      
     
     
    

