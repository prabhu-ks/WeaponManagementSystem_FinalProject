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
    
    private long Order_id;
    private String Order_status;
    private String Test_status;
    private long Manf_id;
    private long Supp_id;

    public Order(long Order_id, String Order_status, String Test_status, long Manf_id, long Supp_id) {
        this.Order_id = Order_id;
        this.Order_status = Order_status;
        this.Test_status = Test_status;
        this.Manf_id = Manf_id;
        this.Supp_id = Supp_id;
    }

    public long getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(long Order_id) {
        this.Order_id = Order_id;
    }

    public String getOrder_status() {
        return Order_status;
    }

    public void setOrder_status(String Order_status) {
        this.Order_status = Order_status;
    }

    public String getTest_status() {
        return Test_status;
    }

    public void setTest_status(String Test_status) {
        this.Test_status = Test_status;
    }

    public long getManf_id() {
        return Manf_id;
    }

    public void setManf_id(long Manf_id) {
        this.Manf_id = Manf_id;
    }

    public long getSupp_id() {
        return Supp_id;
    }

    public void setSupp_id(long Supp_id) {
        this.Supp_id = Supp_id;
    }
    
    
}
