/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.ArrayList;
import java.util.Map;
import model.manufacturer.Weapon;

/**
 *
 * @author manavmalavia
 */
public class Inventory {
    private long capacity;
    private long available;
    private long filled;
    private Map<Weapon, Integer> weaponsList;

    public Inventory(long capacity, long available, long filled, Map<Weapon, Integer> weaponsList) {
        this.capacity = capacity;
        this.available = available;
        this.filled = filled;
        this.weaponsList = weaponsList;
    }
    
   

    public Map<Weapon, Integer> getWeaponsList() {
        return weaponsList;
    }

    public void setWeaponsList(Map<Weapon, Integer> weaponsList) {
        this.weaponsList = weaponsList;
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
