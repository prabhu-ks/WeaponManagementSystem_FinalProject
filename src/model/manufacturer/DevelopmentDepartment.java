/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import java.util.ArrayList;
import java.util.UUID;
import model.root.Department;
import model.root.Weapon;

/**
 *
 * @author manavmalavia
 */
public class DevelopmentDepartment extends Department{
    private ArrayList<Weapon> weaponList;

    public DevelopmentDepartment(ArrayList<Weapon> weaponList, String Dept_name, UUID Dept_ID) {
        super(Dept_name, Dept_ID);
        this.weaponList = weaponList;
    }

    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<Weapon> weaponList) {
        this.weaponList = weaponList;
    }
    
}
