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
    

   private String dept_Name;
   private UUID dept_ID;
   
   public Department(){
    
}

    public Department(String dept_Name, UUID dept_ID) {
        this.dept_Name = dept_Name;
        this.dept_ID = dept_ID;
    }

    public String getDept_Name() {
        return dept_Name;
    }

    public void setDept_Name(String dept_Name) {
        this.dept_Name = dept_Name;
    }

    public UUID getDept_ID() {
        return dept_ID;
    }

    public void setDept_ID(UUID dept_ID) {
        this.dept_ID = dept_ID;
    }

   
}
