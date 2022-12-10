/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Davleen kaur
 */
public class Travel {
    
    public String email;
    public String pick_up_location ;
    public String pick_up_time;
    public String pick_up_type;

    public Travel(String email, String pick_up_location, String pick_up_time, String pick_up_type) {
        this.email = email;
        this.pick_up_location = pick_up_location;
        this.pick_up_time = pick_up_time;
        this.pick_up_type = pick_up_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPick_up_location() {
        return pick_up_location;
    }

    public void setPick_up_location(String pick_up_location) {
        this.pick_up_location = pick_up_location;
    }

    public String getPick_up_time() {
        return pick_up_time;
    }

    public void setPick_up_time(String pick_up_time) {
        this.pick_up_time = pick_up_time;
    }

    public String getPick_up_type() {
        return pick_up_type;
    }

    public void setPick_up_type(String pick_up_type) {
        this.pick_up_type = pick_up_type;
    }

   
    
}
