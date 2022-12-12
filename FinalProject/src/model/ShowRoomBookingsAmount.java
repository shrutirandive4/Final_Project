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
public class ShowRoomBookingsAmount {
    String guest;
    Date checkout;
    int total;
public ShowRoomBookingsAmount(String name,
           Date check_out_date,Integer total)
    {
        
        this.guest = name;
        
        this.checkout= check_out_date;
        this.total=total;
    }
    
    
    
    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public static List<ShowRoomBookingsAmount> roomAmountList= new ArrayList<ShowRoomBookingsAmount>();

    public static List<ShowRoomBookingsAmount> getRoomAmountList() {
        return roomAmountList;
    }

    public static void setRoomAmountList(List<ShowRoomBookingsAmount> roomAmountList) {
        ShowRoomBookingsAmount.roomAmountList = roomAmountList;
    }
    
    @Override
    public String toString(){
        return this.guest;
    }
    
}
