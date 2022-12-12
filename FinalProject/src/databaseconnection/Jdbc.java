/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author shubhimiradwal
 */
public class Jdbc {
    public static void main(String[] args)
    {
        Connection conn=null;
        try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagement","root","shubhi2304");
            if(conn!=null)
            {
                System.out.print("connection successfull");
            }
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
       }
    
}
