/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.ArrayList;
import java.util.UUID;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class ApprovalOfficer extends Person {
    
    private ArrayList<TestBattery> approvalList;

    public ApprovalOfficer(ArrayList<TestBattery> approvalList, UUID ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, role);
        this.approvalList = approvalList;
    }

    public ArrayList<TestBattery> getApprovalList() {
        return approvalList;
    }

    public void setApprovalList(ArrayList<TestBattery> approvalList) {
        this.approvalList = approvalList;
    }
    
    
    
}
