/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.ArrayList;
import java.util.UUID;
import model.root.Enterprise;
import model.root.Enterprise.EnterpriseType;

/**
 *
 * @author manavmalavia
 */
public class Dealer extends Enterprise{
    private UUID id;
    private String name;
    private ArrayList<Region> regionList;
    
    public Dealer(){
        this.setEnterpriseType(EnterpriseType.Dealer);
    }

    public Dealer(UUID id, String name, ArrayList<Region> regionList) {
        this.id = id;
        this.name = name;
        this.regionList = regionList;
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

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }
    
}