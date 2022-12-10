/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import model.regulator.Report;
import java.util.ArrayList;
import java.util.UUID;
import model.root.Department;

/**
 *
 * @author manavmalavia
 */
public class ApprovalAffairs extends Department {
    private ArrayList <Report> reports;

    public ApprovalAffairs(ArrayList<Report> reports, String deptName, UUID deptId, UUID enterpriseId) {
        super(deptName, deptId, enterpriseId);
        this.reports = reports;
    }
    
    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }
   
    
}
