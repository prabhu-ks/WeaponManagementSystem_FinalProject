/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.UUID;
import model.root.Enterprise;
import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class StoreManager extends Person {
    private UUID managingStoreId;

    

    public StoreManager(UUID ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password,UUID managingStoreId) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.STORE_MANAGER);
        this.managingStoreId = managingStoreId;
    }

    public UUID getManagingStoreId() {
        return managingStoreId;
    }

    public void setManagingStoreId(UUID managingStoreId) {
        this.managingStoreId = managingStoreId;
    }
    
    
    
}
