/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.ArrayList;
import model.root.Weapon;

/**
 *
 * @author manavmalavia
 */
public class Inventory {
    private long capacity;
    private long available;
    private long filled;
    private ArrayList<Weapon> weaponList;

    public Inventory(long capacity, long available, long filled, ArrayList<Weapon> weaponList) {
        this.capacity = capacity;
        this.available = available;
        this.filled = filled;
        this.weaponList = weaponList;
    }
    
   

    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public long getCapacity() {
        return capacity;
        
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getAvailable() {
        return available;
    }

    public void setAvailable(long available) {
        this.available = available;
    }

    public long getFilled() {
        return filled;
    }

    public void setFilled(long filled) {
        this.filled = filled;
    }
    
    
}
