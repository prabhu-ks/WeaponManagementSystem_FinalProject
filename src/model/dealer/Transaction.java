/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.UUID;
import model.root.Weapon;

/**
 *
 * @author pho3nix28
 */
public class Transaction {
    
    private UUID transactionId;
    private String orderStatus;
    private UUID dealerId;
    private UUID customerId;
    private Weapon weaponId;
    private int quantity;

    public Transaction(UUID transactionId, String orderStatus, UUID manufacturerId, UUID supplierId, Weapon weaponId, int quantity) {
        this.transactionId = transactionId;
        this.orderStatus = orderStatus;
        this.dealerId = manufacturerId;
        this.customerId = supplierId;
        this.weaponId = weaponId;
        this.quantity = quantity;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public UUID getDealerId() {
        return dealerId;
    }

    public void setDealerId(UUID dealerId) {
        this.dealerId = dealerId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
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
