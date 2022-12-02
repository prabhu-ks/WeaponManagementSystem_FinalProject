/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

/**
 *
 * @author manavmalavia
 */
public class Enterprise {
    public enum EnterpriseType{
        Dealer,
        Manufacturer,
        Seller,
        Regulator,
    } 
    private EnterpriseType enterpriseType;

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
}
