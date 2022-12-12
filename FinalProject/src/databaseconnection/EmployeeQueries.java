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
import static model.Employee.employeeList;
import model.EmailFormat;
import static model.Employee.driverName;
import static model.Employee.employeeEachList;


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
        } 
        catch (HeadlessException | SQLException exception) {
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
                
                String password = name+role;
                String msg = "Welcome" +name+ "to our Hotel !!  To login use your email id: "+email+ "and password: "+password;
                System.out.println("================================="+msg);
                EmailFormat In = new EmailFormat(email,msg,"Welcome to our Hotel ");
                In.sendEmail();
                
//                saving username, password and role in Login Table
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
    
    
    public static List<Employee> getEmp() throws SQLException{
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        
        String sql = "select * from hotelmanagement.employee";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        Employee.employeeList.clear();
        while (resultSet.next()) {
            String name = resultSet.getString(3);
            String email = resultSet.getString(2);
            long phone_number = resultSet.getLong(7);
            String address = resultSet.getString(4);
            int salary = resultSet.getInt(6);
            String role= resultSet.getString(5);

            employeeList.add(new Employee(name,email,phone_number,address,salary,role));
                   for(Employee emp:employeeList)
                   {
                       System.out.println(emp.name);
                   }   
                }

                return employeeList;

        } 
    public static void updateEmp(String name, String email, long phone_no, String address, int salary) throws SQLException{
   
           Connection connection = JDBCConnection.Connect(); 
                Statement statement = (Statement) connection.createStatement();

                String sql = "UPDATE hotelmanagement.employee SET name = '"+name+ "', phone_no = "+phone_no+", address = '"+address+"',salary = "+salary+
                            " WHERE email = '" +email+"';";

                System.out.println(sql);
                statement.executeUpdate(sql);
                System.out.println("Employee Updated!!");
                  
    }
    
    public static void deleteSelectedEmp(String email) throws SQLException{
   
   
            Connection connection = JDBCConnection.Connect(); 
            Statement statement = (Statement) connection.createStatement();

            String sql = "DELETE FROM hotelmanagement.employee WHERE email='"+email+ "';";

            System.out.println(sql);
            statement.executeUpdate(sql);
            
            String sql2 = "DELETE FROM hotelmanagement.login WHERE email='"+email+ "';";
            System.out.println(sql2);
            statement.executeUpdate(sql2);

            System.out.println("Employee Deleted!!");
                  
     }
    public static List<String> getDriverName() throws SQLException{
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        
        String sql = "select * from hotelmanagement.employee where role="+"'Driver'"+"";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        Employee.driverName.clear();
        while (resultSet.next()) {
            String name = resultSet.getString(3);
            Employee.driverName.add(name);
            System.out.println("===========DRIVER NAME================"+name);
            
        }  
        return driverName;

    }
    
    
}
      
     
     
    
