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
public class Tester extends Person {
    
    private ArrayList<Test> testList;
    private UUID workingDeptId;

    public Tester(ArrayList<Test> testList, UUID workingDeptId, UUID ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, role);
        this.testList = testList;
        this.workingDeptId = workingDeptId;
    }
    
}
