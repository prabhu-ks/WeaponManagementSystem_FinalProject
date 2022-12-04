/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.supplier;

import java.util.ArrayList;
import model.root.Weapon;

/**
 *
 * @author pho3nix28
 */
public class Order {
    
    private long order_id;
    private String order_status;
    private String test_status;
    private long manf_id;
    private long supp_id;
    private ArrayList<Weapon> weaponList;

    public Order(long order_id, String order_status, String test_status, long manf_id, long supp_id, ArrayList<Weapon> weaponList) {
        this.order_id = order_id;
        this.order_status = order_status;
        this.test_status = test_status;
        this.manf_id = manf_id;
        this.supp_id = supp_id;
        this.weaponList = weaponList;
    }
    
    
    
    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getTest_status() {
        return test_status;
    }

    public void setTest_status(String test_status) {
        this.test_status = test_status;
    }

    public long getManf_id() {
        return manf_id;
    }

    public void setManf_id(long manf_id) {
        this.manf_id = manf_id;
    }

    public long getSupp_id() {
        return supp_id;
    }

    public void setSupp_id(long supp_id) {
        this.supp_id = supp_id;
    }

   
    
    
}
