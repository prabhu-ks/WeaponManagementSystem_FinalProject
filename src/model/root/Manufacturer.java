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
public class Manufacturer extends Enterprise{

    public Manufacturer(UUID enterpriseId, String enterpriseName, EnterpriseType enterpriseType) {
        super(enterpriseId, enterpriseName, enterpriseType.MANUFACTURER);
    } 
    
}
