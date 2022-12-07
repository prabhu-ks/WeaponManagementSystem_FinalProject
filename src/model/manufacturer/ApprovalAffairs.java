/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import java.util.ArrayList;
import java.util.UUID;
import model.root.Department;

/**
 *
 * @author manavmalavia
 */
public class ApprovalAffairs extends Department {
    private ArrayList <Report> reports;
    
   

    public ApprovalAffairs(String Dept_name, UUID Dept_ID) {
        super(Dept_name, Dept_ID);
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }
   
    
}
