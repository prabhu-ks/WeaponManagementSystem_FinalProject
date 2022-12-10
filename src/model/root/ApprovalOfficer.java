/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

import java.util.Date;
import java.util.UUID;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class ApprovalOfficer extends Person {
    private String workingDepartmentId;

    public ApprovalOfficer(long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, UserRole.APPROVAL_OFFICER);
    }

    public String getWorkingDepartmentId() {
        return workingDepartmentId;
    }

    public void setWorkingDepartmentId(String workingDepartmentId) {
        this.workingDepartmentId = workingDepartmentId;
    }
    
}
