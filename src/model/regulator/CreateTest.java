/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.regulator;

import model.root.Weapon;

/**
 *
 * @author manavhirey
 */
public class CreateTest {
    
    private Test selectedTest;
    private Weapon selectedWeapon;
    private boolean approval;
    private boolean completed;

    public CreateTest(Test selectedTest, Weapon selectedWeapon, boolean approval, boolean completed) {
        this.selectedTest = selectedTest;
        this.selectedWeapon = selectedWeapon;
        this.approval = approval;
        this.completed = completed;
    }

    public Test getSelectedTest() {
        return selectedTest;
    }

    public void setSelectedTest(Test selectedTest) {
        this.selectedTest = selectedTest;
    }

    public Weapon getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(Weapon selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    
}
