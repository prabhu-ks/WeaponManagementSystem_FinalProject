/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.supplier;

import model.root.Person;

/**
 *
 * @author pho3nix28
 */
public class OrderManager extends Person {

    public OrderManager(long ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.ORDER_MANAGER);
    }
    
    
    
}
