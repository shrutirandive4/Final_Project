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
    public String recreationTime;
    public Date recreationBookingDate;
    public String emailAddress;
    public static List<RecreationBooking> recreationBookingList= new ArrayList<RecreationBooking>();
    
    @Override
    public String toString() {
        return emailAddress ;
    }

    public RecreationBooking(int recreationBookingId, int guestId, int recreationId, String recreationTime, Date recreationBookingDate, String emailAddress) {
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

    public Date getRecreationBookingDate() {
        return recreationBookingDate;
    }

    public void setRecreationBookingDate(Date recreationBookingDate) {
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
    
    
    
}
