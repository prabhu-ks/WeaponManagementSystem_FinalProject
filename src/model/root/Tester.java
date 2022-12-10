/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import model.regulator.Test;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class Tester extends Person {
    
    private ArrayList<Test> testList;
    private UUID workingDeptId;

    public Tester(ArrayList<Test> testList, UUID workingDeptId, long ssn, UUID puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, UserRole.TESTER);
        this.testList = testList;
        this.workingDeptId = workingDeptId;
    }

    public ArrayList<Test> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Test> testList) {
        this.testList = testList;
    }

    public UUID getWorkingDeptId() {
        return workingDeptId;
    }

    public void setWorkingDeptId(UUID workingDeptId) {
        this.workingDeptId = workingDeptId;
    }
    
}
