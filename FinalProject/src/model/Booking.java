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
 * @author Davleen kaur
 */
public class Booking {
    public int hotelid;
    public int bookingId;
    public int customerId;
    public int roomid ;
    public Date check_in_date;
    public Date check_out_date;
    public String emailAddress;
    public String RoomType;
    public int price;
    public static List<Booking> guestRoomBooking= new ArrayList<Booking>();
    
    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public String getGuestName() {
        return GuestName;
    }

    public void setGuestName(String GuestName) {
        this.GuestName = GuestName;
    }
    public String GuestName;

    
    @Override
    public String toString(){
        return this.emailAddress;
    }

    public Booking(Date check_in_date, Date check_out_date, int price, String GuestName) {
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.price = price;
        this.GuestName = GuestName;
    }
    
    public Booking(int roomid,
            Date check_in_date, Date check_out_date,String emailAddress,
            String guestName, String roomType)
    {
        
        this.roomid = roomid;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.emailAddress = emailAddress;
        this.GuestName = guestName;
        this.RoomType = roomType;
    }
    
    public static List<Booking> bookingList= new ArrayList<Booking>();

    public static List<Booking> getBookingList() {
        return bookingList;
    }

    public static void setBookingList(List<Booking> bookingList) {
        Booking.bookingList = bookingList;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public Date getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(Date check_in_date) {
        this.check_in_date = check_in_date;
    }

    public Date getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(Date check_out_date) {
        this.check_out_date = check_out_date;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static List<Booking> getGuestRoomBooking() {
        return guestRoomBooking;
    }

    public static void setGuestRoomBooking(List<Booking> guestRoomBooking) {
        Booking.guestRoomBooking = guestRoomBooking;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
