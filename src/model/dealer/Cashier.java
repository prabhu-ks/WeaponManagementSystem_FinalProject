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
public class Cashier extends Person {
    private long workingStoreId;

    public Cashier(long workingStoreId) {
        this.workingStoreId = workingStoreId;
    }
    
    public Cashier(long ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.CASHIER);
    }
    
    
    
}
