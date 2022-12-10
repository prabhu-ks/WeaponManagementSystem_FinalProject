/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import java.util.ArrayList;
import java.util.UUID;
import model.root.Department;
import model.supplier.Order;

/**
 *
 * @author manavmalavia
 */
public class FulfillmentDepartment extends Department{
    private ArrayList<Order> orderList;

    public FulfillmentDepartment(ArrayList<Order> orderList, String deptName, UUID deptId, UUID enterpriseId) {
        super(deptName, deptId, enterpriseId);
        this.orderList = orderList;
    }

    

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
}
