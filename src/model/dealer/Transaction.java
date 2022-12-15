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
    
    public enum OrderStatus{
        PLACED,
        DELIVERED
    }
    
    private String transactionId;
    private String orderStatus;
    private String storeId;
    private String customerId;
    private String weaponId;
    private int quantity;

    public Transaction(String transactionId, String orderStatus, String dealerId, String customerId, String weaponId, int quantity) {
        this.transactionId = transactionId;
        this.orderStatus = orderStatus;
        this.storeId = dealerId;
        this.customerId = customerId;
        this.weaponId = weaponId;
        this.quantity = quantity;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(String weaponId) {
        this.weaponId = weaponId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

        
}
