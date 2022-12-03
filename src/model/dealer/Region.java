/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author manavmalavia
 */
public class Region {
    private UUID  id;
    private String name;
    private long zip;
    private ArrayList<Store> storeList;

    public Region(UUID id, String name, long zip, ArrayList<Store> storeList) {
        this.id = id;
        this.name = name;
        this.zip = zip;
        this.storeList = storeList;
    }

   

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }
    
}
