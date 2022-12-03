/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class InventoryManager extends Person {
    private long workingStoreId;

    public InventoryManager(long workingStoreId, long ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.INVENTORY_MANAGER);
        this.workingStoreId = workingStoreId;
    }
    
}
