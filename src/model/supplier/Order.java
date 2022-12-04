/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.supplier;

/**
 *
 * @author pho3nix28
 */
public class Order {
    
    private long order_Id;
    private String order_Status;
    private String test_Status;
    private long manf_Id;
    private long supp_Id;

    public Order(long order_Id, String order_Status, String test_Status, long manf_Id, long supp_Id) {
        this.order_Id = order_Id;
        this.order_Status = order_Status;
        this.test_Status = test_Status;
        this.manf_Id = manf_Id;
        this.supp_Id = supp_Id;
    }

    public long getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(long order_Id) {
        this.order_Id = order_Id;
    }

    public String getOrder_Status() {
        return order_Status;
    }

    public void setOrder_Status(String order_Status) {
        this.order_Status = order_Status;
    }

    public String getTest_Status() {
        return test_Status;
    }

    public void setTest_Status(String test_Status) {
        this.test_Status = test_Status;
    }

    public long getManf_Id() {
        return manf_Id;
    }

    public void setManf_Id(long manf_Id) {
        this.manf_Id = manf_Id;
    }

    public long getSupp_Id() {
        return supp_Id;
    }

    public void setSupp_Id(long supp_Id) {
        this.supp_Id = supp_Id;
    }

   
    
    
}
