/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

import java.util.UUID;
/**
 *
 * @author kshitijprabhu
 */
public class Department {

   private String deptName;
   private UUID deptId;

    public Department(String deptName, UUID deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public UUID getDeptId() {
        return deptId;
    }

    public void setDeptId(UUID deptId) {
        this.deptId = deptId;
    }
   

    
   
}
