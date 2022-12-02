/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

/**
 *
 * @author manavhirey
 */
public class Department {
      private String Dept_name;
    private long Dept_ID;

    public Department(String Dept_name, long Dept_ID) {
        this.Dept_name = Dept_name;
        this.Dept_ID = Dept_ID;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String Dept_name) {
        this.Dept_name = Dept_name;
    }

    public long getDept_ID() {
        return Dept_ID;
    }

    public void setDept_ID(long Dept_ID) {
        this.Dept_ID = Dept_ID;
    }

   
}
