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
public class DealerOrder extends Order {
    private String dealerId;
    private String supplierId;

    public DealerOrder(String dealerId, String supplierId, String orderId, String weaponID, String quantity, String status) {
        super(orderId, weaponID, quantity, status);
        this.dealerId = dealerId;
        this.supplierId = supplierId;
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
    
    
}
