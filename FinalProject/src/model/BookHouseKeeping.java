/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shubhimiradwal
 */
public class BookHouseKeeping {
    String name;
    String email;
    String guest_email;
    String role;
    
    
         static public List<BookHouseKeeping> housekeepers= new ArrayList<>();

     static public List<BookHouseKeeping> bookedhousekeeper= new ArrayList<>();
    public BookHouseKeeping(String name, String email, String guest_name, String role) {
        this.name = name;
        this.email = email;
        this.guest_email = guest_name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
