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
   private String deptId;
   private String enterpriseId;

    public Department(String deptName, String deptId, String enterpriseId) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.enterpriseId = enterpriseId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    
   
}
