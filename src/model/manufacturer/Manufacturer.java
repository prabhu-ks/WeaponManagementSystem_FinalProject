/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import java.util.UUID;
import model.root.Enterprise;

/**
 *
 * @author manavmalavia
 */
public class Manufacturer extends Enterprise {
    private UUID id;
    private String name;
    
    public Manufacturer(){
        this.setEnterpriseType(EnterpriseType.Manufacturer);
    }
    
    

    public Manufacturer(UUID id, String name) {
        this.id = id;
        this.name = name;
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
    
    
}
