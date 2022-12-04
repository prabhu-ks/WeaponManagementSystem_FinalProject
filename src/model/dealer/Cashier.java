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
public class Cashier extends Person {
    private UUID workingStoreId;

    public Cashier(UUID workingStoreId) {
        this.workingStoreId = workingStoreId;
    }
    
    public Cashier(UUID ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.CASHIER);

    }
    
    
    
    
}
