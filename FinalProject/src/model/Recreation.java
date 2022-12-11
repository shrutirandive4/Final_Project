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
public class Recreation {
    public int recreation_id;
    public String recreationName;
    public int recreationPrice;
    public String recreationTime;
    public static List<Recreation> recreationList= new ArrayList<Recreation>();
    static public List<String> recreationNameList= new ArrayList<>();

    public Recreation(int recreation_id, String recreationName, int recreation_price, String recreation_time) {
        this.recreation_id = recreation_id;
        this.recreationName = recreationName;
        this.recreationPrice = recreation_price;
        this.recreationTime = recreation_time;
    }

    public Recreation(String recreationName, int recreation_price, String recreation_time) {
        this.recreationName = recreationName;
        this.recreationPrice = recreation_price;
        this.recreationTime = recreation_time;
    }
    

    public int getRecreation_id() {
        return recreation_id;
    }

    public void setRecreation_id(int recreation_id) {
        this.recreation_id = recreation_id;
    }

    public String getRecreationName() {
        return recreationName;
    }

    public void setRecreationName(String recreationName) {
        this.recreationName = recreationName;
    }

    public int getRecreationPrice() {
        return recreationPrice;
    }

    public void setRecreationPrice(int recreationPrice) {
        this.recreationPrice = recreationPrice;
    }

    public String getRecreationTime() {
        return recreationTime;
    }

    public void setRecreationTime(String recreationTime) {
        this.recreationTime = recreationTime;
    }

    public static List<String> getRecreationNameList() {
        return recreationNameList;
    }

    public static void setRecreationNameList(List<String> recreationNameList) {
        Recreation.recreationNameList = recreationNameList;
    }

    public void updateRecreation(Recreation rea, int reaIndex){
        recreationList.set(reaIndex, rea);
    }
    public void deleteEmployee(Recreation rea) {
        recreationList.remove(rea);
    }
    
}
