/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.supplier;

import java.util.UUID;
import model.root.Weapon;

/**
 *
 * @author pho3nix28
 */
public class Order {
    
    private long orderId;
    private String orderStatus;
    private UUID manufacturerId;
    private UUID supplierId;
    private Weapon weaponId;
    private int quantity;

    public Order() {
    }

    public Order(long orderId, String orderStatus, UUID manufacturerId, UUID supplierId, Weapon weaponId, int quantity) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.manufacturerId = manufacturerId;
        this.supplierId = supplierId;
        this.weaponId = weaponId;
        this.quantity = quantity;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public UUID getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(UUID manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public UUID getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(UUID supplierId) {
        this.supplierId = supplierId;
    }

    public Weapon getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Weapon weaponId) {
        this.weaponId = weaponId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
 
}
