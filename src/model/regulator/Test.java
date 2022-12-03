/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.UUID;

/**
 *
 * @author manavhirey
 */
public class Test {
    
    private String testName;
    private Tester testerName;
    private boolean completed;
    private UUID testID;

    public Test(String testName, Tester testerName, boolean completed, UUID testID) {
        this.testName = testName;
        this.testerName = testerName;
        this.completed = completed;
        this.testID = testID;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Tester getTesterName() {
        return testerName;
    }

    public void setTesterName(Tester testerName) {
        this.testerName = testerName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public UUID getTestID() {
        return testID;
    }

    public void setTestID(UUID testID) {
        this.testID = testID;
    }
    
    
    
}
