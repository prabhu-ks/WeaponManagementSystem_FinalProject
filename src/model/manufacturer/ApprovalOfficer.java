/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.manufacturer;

import java.util.Date;
import java.util.UUID;
import model.root.Person;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class ApprovalOfficer extends Person {
    private String enterpriseId;

    public ApprovalOfficer(String workingDepartmentId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, role);
        this.enterpriseId = workingDepartmentId;
    }

    

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
}
