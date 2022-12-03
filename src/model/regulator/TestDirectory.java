/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.ArrayList;

/**
 *
 * @author manavhirey
 */
public class TestDirectory {

    private ArrayList<Test> testDir;

    public TestDirectory(ArrayList<Test> testDir) {
        this.testDir = testDir;
    }

    public ArrayList<Test> getTestDir() {
        return testDir;
    }

    public void setTestDir(ArrayList<Test> testDir) {
        this.testDir = testDir;
    }    
    
}
