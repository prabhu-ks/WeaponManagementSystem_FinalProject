/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import model.regulator.Report;
import model.root.Person;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class Tester extends Person {
   
    private String enterpriseId;

    public Tester(String workingDeptId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, role);
        this.enterpriseId = workingDeptId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
    

   
}
