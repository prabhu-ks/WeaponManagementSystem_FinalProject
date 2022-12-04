/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.UUID;
import model.root.Weapon;

/**
 *
 * @author manavhirey
 */
public class Test {
    
    private String testName;
    private Tester testerName;
    private UUID testID;
    private String selectedWeaponType;
    private String testInfo;

    public Test(UUID testID, String testName, Tester testerName, String testInfo, String selectedWeaponType) {
        this.testName = testName;
        this.testerName = testerName;
        this.testID = testID;
        this.selectedWeaponType = selectedWeaponType;
        this.testInfo = testInfo;
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

    public UUID getTestID() {
        return testID;
    }

    public void setTestID(UUID testID) {
        this.testID = testID;
    }
 
}
