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
public class Guest {
    public String name;
    public int guestId;
    public String address ;
    public long phoneNumber;
    public String emailAddress;    

    public static List<Guest> guestList= new ArrayList<Guest>();
    public static List<Guest> guestEachList= new ArrayList<Guest>();
    
    
    public Guest(String name, String address, long phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Guest() {
    }

    @Override
    public String toString() {
        return name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return guestId;
    }

    public void setCustomerId(int customerId) {
        this.guestId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public static List<Guest> getGuestList() {
        return guestList;
    }

    public static void setGuestList(List<Guest> guestList) {
        Guest.guestList = guestList;
    }
    public void updateGuest(Guest gue, int gueIndex){
        guestList.set(gueIndex, gue);
    }
    public void deleteGuest(Guest gue) {
        guestList.remove(gue);
    }

    public static List<Guest> getGuestEachList() {
        return guestEachList;
    }

    public static void setGuestEachList(List<Guest> guestEachList) {
        Guest.guestEachList = guestEachList;
    }

    
}
