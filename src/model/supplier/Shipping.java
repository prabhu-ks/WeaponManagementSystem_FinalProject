/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.supplier;


import java.util.UUID;
import model.manufacturer.Weapon;

/**
 *
 * @author pho3nix28
 */
public class Shipping {
    
    private long shippingId;
    private String shippingStatus;
    private UUID dealerId;
    private UUID supplierId;
    private Weapon weapon;
    private int quantity;

    public long getShippingId() {
        return shippingId;
    }

    public void setShippingId(long shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public UUID getDealerId() {
        return dealerId;
    }

    public void setDealerId(UUID dealerId) {
        this.dealerId = dealerId;
    }

    public UUID getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(UUID supplierId) {
        this.supplierId = supplierId;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
}
