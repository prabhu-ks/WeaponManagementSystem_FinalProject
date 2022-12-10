/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

import java.util.UUID;

/**
 *
 * @author manavmalavia
 */
public class Weapon {
    private String name;
    private UUID weaponId;
    private UUID serialNo;
    private String type;
    private long price;
    private boolean approval;

    public Weapon(String name, UUID weaponId, UUID serialNo, String type, long price, boolean approval) {
        this.name = name;
        this.weaponId = weaponId;
        this.serialNo = serialNo;
        this.type = type;
        this.price = price;
        this.approval = approval;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(UUID weaponId) {
        this.weaponId = weaponId;
    }

    public UUID getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(UUID serialNo) {
        this.serialNo = serialNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
    
    
   
}
