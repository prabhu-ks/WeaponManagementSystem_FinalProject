

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.supplier;

import java.util.Date;
import java.util.UUID;
import model.root.Person;
import model.root.Person;

/**
 *
 * @author pho3nix28
 */
public class ShippingManager extends Person {
    
    private String enterpriseId;

    public ShippingManager(String enterpriseId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, UserRole.SUPPLIER_SYSADMIN.toString());
        this.enterpriseId = enterpriseId;
    }

    
    
    
    
}
