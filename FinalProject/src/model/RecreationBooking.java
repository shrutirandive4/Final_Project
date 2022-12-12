/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shruti
 */
public class RecreationBooking {
    public int recreationBookingId;
    public int guestId;
    public int recreationId;
    public String recreationName;
    public String recreationTime;
    public String recreationBookingDate;
    public String emailAddress;
    public String guestName;
    public int price;
    public static List<RecreationBooking> recreationBookingList= new ArrayList<RecreationBooking>();
    public static List<RecreationBooking> guestRecreationBooking= new ArrayList<RecreationBooking>();
    @Override
    public String toString() {
        return emailAddress ;
    }

    public RecreationBooking(String recreationName, String recreationTime, String recreationBookingDate, String emailAddress, String guestName) {
        this.recreationName = recreationName;
        this.recreationTime = recreationTime;
        this.recreationBookingDate = recreationBookingDate;
        this.emailAddress = emailAddress;
        this.guestName = guestName;
    }

    public RecreationBooking(String recreationName, String recreationTime, String guestName, int price) {
        this.recreationName = recreationName;
        this.recreationTime = recreationTime;
        this.guestName = guestName;
        this.price = price;
    }


    
    
    public RecreationBooking(int recreationBookingId, int guestId, int recreationId, String recreationTime, String recreationBookingDate, String emailAddress) {
        this.recreationBookingId = recreationBookingId;
        this.guestId = guestId;
        this.recreationId = recreationId;
        this.recreationTime = recreationTime;
        this.recreationBookingDate = recreationBookingDate;
        this.emailAddress = emailAddress;
    }

    public int getRecreationBookingId() {
        return recreationBookingId;
    }

    public void setRecreationBookingId(int recreationBookingId) {
        this.recreationBookingId = recreationBookingId;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getRecreationId() {
        return recreationId;
    }

    public void setRecreationId(int recreationId) {
        this.recreationId = recreationId;
    }

    public String getRecreationTime() {
        return recreationTime;
    }

    public void setRecreationTime(String recreationTime) {
        this.recreationTime = recreationTime;
    }

    public String getRecreationBookingDate() {
        return recreationBookingDate;
    }

    public void setRecreationBookingDate(String recreationBookingDate) {
        this.recreationBookingDate = recreationBookingDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static List<RecreationBooking> getRecreationBookingList() {
        return recreationBookingList;
    }

    public static void setRecreationBookingList(List<RecreationBooking> recreationBookingList) {
        RecreationBooking.recreationBookingList = recreationBookingList;
    }

    public String getRecreationName() {
        return recreationName;
    }

    public void setRecreationName(String recreationName) {
        this.recreationName = recreationName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public static List<RecreationBooking> getGuestRecreationBooking() {
        return guestRecreationBooking;
    }

    public static void setGuestRecreationBooking(List<RecreationBooking> guestRecreationBooking) {
        RecreationBooking.guestRecreationBooking = guestRecreationBooking;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
