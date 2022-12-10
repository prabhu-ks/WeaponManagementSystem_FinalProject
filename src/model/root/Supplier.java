/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

import java.util.UUID;
import model.root.Enterprise;

/**
 *
 * @author pho3nix28
 */
public class Supplier extends Enterprise {

    public Supplier(UUID enterpriseId, String enterpriseName, EnterpriseType enterpriseType) {
        super(enterpriseId, enterpriseName, enterpriseType.SUPPLIER);
    }
    
}
