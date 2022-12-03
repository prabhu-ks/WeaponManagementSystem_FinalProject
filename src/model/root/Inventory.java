/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

/**
 *
 * @author manavmalavia
 */
public class Inventory {
    private long capacity;
    private long available;
    private long filled;
    
    public Inventory(long capacity, long available, long filled) {
        this.capacity = capacity;
        this.available = available;
        this.filled = filled;
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
