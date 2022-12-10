/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

import java.util.Date;

/**
 *
 * @author manavhirey
 */
public class RegionalManager extends Person {
    
    private String workingDepartmentId;

    public RegionalManager(String workingDepartmentId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, UserRole.REGIONAL_MANAGER.toString());
        this.workingDepartmentId = workingDepartmentId;
    }

    public String getWorkingDepartmentId() {
        return workingDepartmentId;
    }

    public void setWorkingDepartmentId(String workingDepartmentId) {
        this.workingDepartmentId = workingDepartmentId;
    }
    
    
}