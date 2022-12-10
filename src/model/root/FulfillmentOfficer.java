/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.root;

import java.util.Date;
import java.util.UUID;
import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class FulfillmentOfficer extends Person {
     private UUID workingDepartmentId;

    public FulfillmentOfficer(UUID workingDepartmentId, long ssn, UUID puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, UserRole.FULFILMENT_OFFICER);
        this.workingDepartmentId = workingDepartmentId;
    }

    public UUID getWorkingDepartmentId() {
        return workingDepartmentId;
    }

    public void setWorkingDepartmentId(UUID workingDepartmentId) {
        this.workingDepartmentId = workingDepartmentId;
    }
     
}