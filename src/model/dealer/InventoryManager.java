/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dealer;

import java.util.UUID;
import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class InventoryManager extends Person {
    private UUID workingStoreId;

    public InventoryManager( long ssn, UUID puid, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UUID workingStoreId) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, UserRole.INVENTORY_MANAGER);
        this.workingStoreId = workingStoreId;
    }

    public UUID getWorkingStoreId() {
        return workingStoreId;
    }

    public void setWorkingStoreId(UUID workingStoreId) {
        this.workingStoreId = workingStoreId;
    }

    
    
    
}
