/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Shruti
 */
public class BookHouseKeeping {
//    String name;
    String email;
    String guest_email;
    String role;
    String msg;
    
    
         static public List<BookHouseKeeping> housekeepers= new ArrayList<>();

     static public List<BookHouseKeeping> bookedhousekeeper= new ArrayList<>();

    public BookHouseKeeping(String email, String guest_email, String role, String msg) {
        this.email = email;
        this.guest_email = guest_email;
        this.role = role;
        this.msg = msg;
    }
     
    public String getGuest_email() {
        return guest_email;
    }

    public void setGuest_email(String guest_email) {
        this.guest_email = guest_email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static List<BookHouseKeeping> getHousekeepers() {
        return housekeepers;
    }

    public static void setHousekeepers(List<BookHouseKeeping> housekeepers) {
        BookHouseKeeping.housekeepers = housekeepers;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuest_name() {
        return guest_email;
    }

    public void setGuest_name(String guest_name) {
        this.guest_email = guest_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static List<BookHouseKeeping> getBookedhousekeeper() {
        return bookedhousekeeper;
    }

    public static void setBookedhousekeeper(List<BookHouseKeeping> bookedhousekeeper) {
        BookHouseKeeping.bookedhousekeeper = bookedhousekeeper;
    }
}
