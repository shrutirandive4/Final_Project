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
import model.Room;
import static model.Room.room_no;


/**
 *
 * @author Davleen kaur
 */
public class AddRoomsQuery {
    public AddRoomsQuery (){
    }
    public boolean CheckRoomNo(int roomNo ){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "Select room_no from hotelmanagement.room where room_no='"+ roomNo +"'";

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
    
    
    public boolean addRooms(int roomNo,String roomType,int room_price){
        try {
            try (Connection connection = JDBCConnection.Connect()) {
                Statement statement = (Statement) connection.createStatement();

                String sql = "INSERT INTO hotelmanagement.room " + "(room_no,room_type,room_price)"
                        + "VALUES ('" + roomNo + "' , '" + roomType+ "' , '" + room_price + "');";

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
        
        
        public static List<String> getRoom_no() throws SQLException{
        Connection connection = JDBCConnection.Connect(); 
        Statement statement = (Statement) connection.createStatement();
        
        String sql = "select room_no from hotelmanagement.room";
        System.out.println(sql);
        //statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        
        while (resultSet.next()) {
            String room_no = resultSet.getString(1);
            Room.room_no.add(room_no);
            System.out.println("===========Room No================"+room_no);
            
        }  
        return room_no;

    }
}
    

