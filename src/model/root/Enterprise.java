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
    
    
    private UUID enterpriseId;
    private String enterpriseName;
    EnterpriseType enterpriseType;

    public Enterprise(UUID enterpriseId, String enterpriseName, EnterpriseType enterpriseType) {
        this.enterpriseId = enterpriseId;
        this.enterpriseName = enterpriseName;
        this.enterpriseType = enterpriseType;
    }

    public UUID getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(UUID enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    

    }
