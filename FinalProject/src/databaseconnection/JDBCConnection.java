/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shubhimiradwal
 */

public class JDBCConnection {
    
       public static Connection Connect(){
         Connection conn=null;
        try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","system");

            if(conn!=null)
            {
                System.out.print("connection successfull");
            }
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("erro:"+e);
            return null;

        }
                    
       }
    }
    






