/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.UUID;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class ApprovalOfficer extends Person {

    public ApprovalOfficer(UUID ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(UUID.randomUUID(), name, gender, dob, phoneNo, email, address, username, password, UserRole.APPROVAL_OFFICER);
    }
    
}
