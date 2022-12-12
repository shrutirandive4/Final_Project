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
public class ShowRecreationBookingsAmount {
    
      
    String guest;
    Date checkout;
    int total;
  public ShowRecreationBookingsAmount(String name,
          Integer total)
    {
        
        this.guest = name;
        
        
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
    public static List<ShowRecreationBookingsAmount> recAmountList= new ArrayList<ShowRecreationBookingsAmount>();

    public static List<ShowRecreationBookingsAmount> getRecAmountList() {
        return recAmountList;
    }

    public static void setRecAmountList(List<ShowRecreationBookingsAmount> recAmountList) {
        ShowRecreationBookingsAmount.recAmountList = recAmountList;
    }

    
    
    @Override
    public String toString(){
        return this.guest;
    }
    
    
}
