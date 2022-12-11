/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

/**
 *
 * @author Manav Hirey
 */
public class Order {
    
    public enum OrderStatus{
        REQUESTED,
        CREATED,
        WAITING_FOR_MANUFACTURER,
        FULFILLED,
        READY_TO_SHIP,
        SHIPPED,
        DELIVERED
    }
    private String orderId;
    private String storeId;
    private String dealerId;
    private String supplierId;
    private String manufacturerId;
    private String weaponID;
    private int quantity;
    private String status;

    public Order(String orderId, String storeId, String dealerId, String supplierId, String manufacturerId, String weaponID, int quantity, String status) {
        this.orderId = orderId;
        this.storeId = storeId;
        this.dealerId = dealerId;
        this.supplierId = supplierId;
        this.manufacturerId = manufacturerId;
        this.weaponID = weaponID;
        this.quantity = quantity;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(String weaponID) {
        this.weaponID = weaponID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
