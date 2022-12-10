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
public class Enterprise {
    public enum EnterpriseType{
        DEALER,
        MANUFACTURER,
        SUPPLIER,
        REGULATOR,
    }
    
    
    private String enterpriseId;
    private String enterpriseName;
    private String enterpriseType;

    public Enterprise(String enterpriseId, String enterpriseName, String enterpriseType) {
        this.enterpriseId = enterpriseId;
        this.enterpriseName = enterpriseName;
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    
    

    }
