/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import model.regulator.Report;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class Tester extends Person {
    
    private ArrayList<Report> reportDirectory;
    private UUID workingDeptId;

    public Tester(ArrayList<Report> reportDirectory, UUID workingDeptId, long ssn, UUID puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, role.TESTER);
        this.reportDirectory = reportDirectory;
        this.workingDeptId = workingDeptId;
    }

    public ArrayList<Report> getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ArrayList<Report> reportDirectory) {
        this.reportDirectory = reportDirectory;
    }

    public UUID getWorkingDeptId() {
        return workingDeptId;
    }

    public void setWorkingDeptId(UUID workingDeptId) {
        this.workingDeptId = workingDeptId;
    }
    
    

   
}
