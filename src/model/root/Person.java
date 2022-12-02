/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.root;

/**
 *
 * @author manavhirey
 */
public class Person {
    
    public enum UserRole{
        TESTER,
        APP_OFF,
        EMP,
        FUL_OFF,
        ASSEM,
        ORD_MAN,
        SHIP_MAN,
        IN_MAN,
        ACC_VERIFY,
        REG_MAN,
        STR_MAN,
        CUSTOMER
    }
    
    private long ssn;
    private String name;
    private String gender;
    private String dob;
    private long phoneNo;
    private String email;
    private String address;
    private String username;
    private String password;
    private UserRole role;

    public Person(long ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        this.ssn = ssn;
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
