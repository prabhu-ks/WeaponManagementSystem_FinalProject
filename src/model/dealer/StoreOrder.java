/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import model.root.Order;

/**
 *
 * @author Manav Hirey
 */
public class StoreOrder extends Order {
    
    public String storeId;

    public StoreOrder(String storeId, String orderId, String weaponID, String quantity, String status) {
        super(orderId, weaponID, quantity, status);
        this.storeId = storeId;
    }
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    
    
}
