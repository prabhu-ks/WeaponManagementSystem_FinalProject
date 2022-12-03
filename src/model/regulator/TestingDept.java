/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import model.root.Department;
import java.util.UUID;

/**
 *
 * @author manavhirey
 */
public class TestingDept extends Department{

    public TestingDept() {
    }

    public TestingDept(String Dept_name, UUID Dept_ID) {
        super(Dept_name, Dept_ID);
    }
    
}
