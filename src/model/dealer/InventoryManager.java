/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.Date;
import java.util.UUID;
import model.root.Person;
import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class InventoryManager extends Person {
    private String workingStoreId;

    public InventoryManager(String workingStoreId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, role);
        this.workingStoreId = workingStoreId;
    }

    

    public String getWorkingStoreId() {
        return workingStoreId;
    }

    public void setWorkingStoreId(String workingStoreId) {
        this.workingStoreId = workingStoreId;
    }
    
}
