/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

import java.util.UUID;

/**
 *
 * @author manavhirey
 */
public class Person {
    
    public enum UserRole{
        TESTER,
        APPROVAL_OFFICER,
        APPROVAL_EMPLOYEE,
        FULFILMENT_OFFICER,
        ASSEMBLER,
        ORDER_MANAGER,
        SHIPMENT_MANAGER,
        INVENTORY_MANAGER,
        ACCOUNT_VERIFYER,
        REGIONAL_MANAGER,
        STORE_MANAGER,
        CASHIER,
        CUSTOMER
    }
    
    private long ssn;
    private UUID puid;
    private String name;
    private String gender;
    private String dob;
    private long phoneNo;
    private String email;
    private String address;
    private String username;
    private String password;
    private UserRole role;
    
    public Person(){
        
    }

    public Person(long ssn,UUID puid, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        this.ssn = ssn;
        this.puid = puid;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public UUID getPuid() {
        return puid;
    }

    public void setPuid(UUID puid) {
        this.puid = puid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    
}
