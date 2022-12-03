/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import java.util.UUID;
import model.root.Person;

/**
 *
 * @author manavmalavia
 */
public class ApprovalEmployee extends Person {
    private UUID workingDepartmentId;

    public ApprovalEmployee(UUID ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password,UUID workingDepartmentId) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.APPROVAL_EMPLOYEE);
        this.workingDepartmentId = workingDepartmentId;
    }

    public UUID getWorkingDepartmentId() {
        return workingDepartmentId;
    }

    public void setWorkingDepartmentId(UUID workingDepartmentId) {
        this.workingDepartmentId = workingDepartmentId;
    }
    
}
