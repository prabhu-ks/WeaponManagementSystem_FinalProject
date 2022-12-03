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

    public Department() {
    }
      
    public Department(String Dept_name, UUID Dept_ID) {
        this.Dept_name = Dept_name;
        this.Dept_ID = Dept_ID;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String Dept_name) {
        this.Dept_name = Dept_name;
    }

    public UUID getDept_ID() {
        return Dept_ID;
    }

    public void setDept_ID(UUID Dept_ID) {
        this.Dept_ID = Dept_ID;
    }

   
}
