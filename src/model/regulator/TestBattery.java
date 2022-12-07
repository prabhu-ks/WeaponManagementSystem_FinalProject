/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.regulator;

import java.util.ArrayList;

/**
 *
 * @author manavhirey
 */
class TestBattery {
    
    private ArrayList<CreateTestBattery> battery;
    private boolean completed;

    public TestBattery(ArrayList<CreateTestBattery> battery, boolean completed) {
        this.battery = battery;
        this.completed = completed;
    }

    public ArrayList<CreateTestBattery> getBattery() {
        return battery;
    }

    public void setBattery(ArrayList<CreateTestBattery> battery) {
        this.battery = battery;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    
    
}
