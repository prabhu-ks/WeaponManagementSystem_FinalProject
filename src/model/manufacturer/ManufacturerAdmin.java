/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.manufacturer;

import java.util.Date;
import model.root.Person;

/**
 *
 * @author manavhirey
 */
public class ManufacturerAdmin extends Person {

    private String enterpriseId;

    public ManufacturerAdmin(String enterpriseId, long ssn, String puid, String name, String gender, Date dob, long phoneNo, String email, String address, String username, String password, String role) {
        super(ssn, puid, name, gender, dob, phoneNo, email, address, username, password, Person.UserRole.MANUFACTURER_SYSADMIN.toString());
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}
