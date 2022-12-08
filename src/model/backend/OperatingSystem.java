/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.backend;

import java.util.ArrayList;
import model.dealer.Dealer;
import model.dealer.Region;
import model.dealer.Store;
import model.manufacturer.Report;
import model.root.Weapon;
import model.supplier.Order;
import model.supplier.Supplier;

/**
 *
 * @author manavmalavia
 */
public class OperatingSystem {
    private static OperatingSystem os;
    private ArrayList<Region> regionList;
    private ArrayList<Weapon> weaponList;
    private ArrayList<Store> storeList;
    private ArrayList <Report> reports;
    private ArrayList<Order> orderList;
    private ArrayList<Order> storeOrderDirectory;
    private ArrayList<Order> dealerOrderDirectory;
    private ArrayList<Order> supplierOrderDirectory;
    private ArrayList<Order> manufactureOrderDirectory;

    public static OperatingSystem getInstance(){
        if(os == null){
            os = new OperatingSystem();
        }
        return os;
    }
    public static OperatingSystem getOs() {
        return os;
    }

    public static void setOs(OperatingSystem os) {
        OperatingSystem.os = os;
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }

    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(ArrayList<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> getStoreOrderDirectory() {
        return storeOrderDirectory;
    }
     public void addStoreOrder(Order order) {
        storeOrderDirectory.add(order);
    }
      public void deleteStoreOrder(Order order) {
        storeOrderDirectory.remove(order);
    }

    public void setStoreOrderDirectory(ArrayList<Order> storeOrderDirectory) {
        this.storeOrderDirectory = storeOrderDirectory;
    }

    public ArrayList<Order> getDealerOrderDirectory() {
        return dealerOrderDirectory;
    }
    public void addDealerOrder(Order order) {
        dealerOrderDirectory.add(order);
    }
      public void deleteDealerOrder(Order order) {
        dealerOrderDirectory.remove(order);
    }

    public void setDealerOrderDirectory(ArrayList<Order> dealerOrderDirectory) {
        this.dealerOrderDirectory = dealerOrderDirectory;
    }

    public ArrayList<Order> getSuppliereOrderDirectory() {
        return supplierOrderDirectory;
    }
    public void addSupplierOrder(Order order) {
        supplierOrderDirectory.add(order);
    }
      public void deleteSupplierOrder(Order order) {
        supplierOrderDirectory.remove(order);
    }

    public void setSuppliereOrderDirectory(ArrayList<Order> suppliereOrderDirectory) {
        this.supplierOrderDirectory = suppliereOrderDirectory;
    }

    public ArrayList<Order> getManufactureOrderDirectory() {
        return manufactureOrderDirectory;
    }
    public void addManufactureOrder(Order order) {
        manufactureOrderDirectory.add(order);
    }
      public void deleteManufactureOrder(Order order) {
        manufactureOrderDirectory.remove(order);
    }

    public void setManufactureOrderDirectory(ArrayList<Order> manufactureOrderDirectory) {
        this.manufactureOrderDirectory = manufactureOrderDirectory;
    }

   
    
}
