/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Davleen kaur
 */
public class Room {
    public String roomType;
    public int room_price;
    public int roomNo;

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public static List<String> getRoom_no() {
        return room_no;
    }

    public static void setRoom_no(List<String> room_no) {
        Room.room_no = room_no;
    }
    
    static public List<String> room_no=new ArrayList<>();

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    
    
}
