/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.regulator;

import model.root.ApprovalOfficer;
import model.root.Tester;
import model.root.Weapon;

/**
 *
 * @author manavmalavia
 */
public class Report {
    private String status;
    private boolean approved;
    private boolean test1;
    private boolean test2;
    private boolean test3;
    private boolean test4;
    private boolean testr;
    private ApprovalOfficer approvalOfficerId;
    private Tester testerId;

    public Report(String status, boolean approved, boolean test1, boolean test2, boolean test3, boolean test4, boolean testr, ApprovalOfficer approvalOfficerId, Tester testerId) {
        this.status = status;
        this.approved = approved;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
        this.testr = testr;
        this.approvalOfficerId = approvalOfficerId;
        this.testerId = testerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isTest1() {
        return test1;
    }

    public void setTest1(boolean test1) {
        this.test1 = test1;
    }

    public boolean isTest2() {
        return test2;
    }

    public void setTest2(boolean test2) {
        this.test2 = test2;
    }

    public boolean isTest3() {
        return test3;
    }

    public void setTest3(boolean test3) {
        this.test3 = test3;
    }

    public boolean isTest4() {
        return test4;
    }

    public void setTest4(boolean test4) {
        this.test4 = test4;
    }

    public boolean isTestr() {
        return testr;
    }

    public void setTestr(boolean testr) {
        this.testr = testr;
    }

    public ApprovalOfficer getApprovalOfficerId() {
        return approvalOfficerId;
    }

    public void setApprovalOfficerId(ApprovalOfficer approvalOfficerId) {
        this.approvalOfficerId = approvalOfficerId;
    }

    public Tester getTesterId() {
        return testerId;
    }

    public void setTesterId(Tester testerId) {
        this.testerId = testerId;
    }

    
    
    
}
