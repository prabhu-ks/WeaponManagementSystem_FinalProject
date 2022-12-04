/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import java.util.ArrayList;
import java.util.UUID;
import model.root.Weapon;

/**
 *
 * @author manavhirey
 */
public class CreateTestBattery {
    private UUID batteryId;
    private ArrayList<Test> testList;
    private Weapon selectedWeapon;

    public CreateTestBattery(UUID batteryId, ArrayList<Test> testList, Weapon selectedWeapon) {
        this.batteryId = batteryId;
        this.testList = testList;
        this.selectedWeapon = selectedWeapon;
    }

    public UUID getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(UUID batteryId) {
        this.batteryId = batteryId;
    }

    public ArrayList<Test> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Test> testList) {
        this.testList = testList;
    }

    public Weapon getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(Weapon selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
    }
    
}
