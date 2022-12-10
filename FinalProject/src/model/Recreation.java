/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Davleen kaur
 */
public class Recreation {
    public int recreation_id;
    public String recreationName;
    public int recreation_price;
    public String recreation_time;

    public Recreation(int recreation_id, String recreationName, int recreation_price, String recreation_time) {
        this.recreation_id = recreation_id;
        this.recreationName = recreationName;
        this.recreation_price = recreation_price;
        this.recreation_time = recreation_time;
    }

    public Recreation(String recreationName, int recreation_price, String recreation_time) {
        this.recreationName = recreationName;
        this.recreation_price = recreation_price;
        this.recreation_time = recreation_time;
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

    public int getRecreation_price() {
        return recreation_price;
    }

    public void setRecreation_price(int recreation_price) {
        this.recreation_price = recreation_price;
    }

    public String getRecreation_time() {
        return recreation_time;
    }

    public void setRecreation_time(String recreation_time) {
        this.recreation_time = recreation_time;
    }

    
    
}
