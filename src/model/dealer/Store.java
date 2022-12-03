/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

/**
 *
 * @author manavmalavia
 */
public class Store {
    private long  id;
    private String name;
    private Inventory inventory;

    public Store(long id, String name, Inventory inventory) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
    }

    

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
}
