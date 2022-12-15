/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.root;

import java.util.Date;
import java.util.UUID;
import model.root.Person;
import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class StoreManager extends Person {
    private String managingStoreId;

    public StoreManager(String managingStoreId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, role);
        this.managingStoreId = managingStoreId;
    }

    

    public String getManagingStoreId() {
        return managingStoreId;
    }

    public void setManagingStoreId(String managingStoreId) {
        this.managingStoreId = managingStoreId;
    }
    
    
    
}

