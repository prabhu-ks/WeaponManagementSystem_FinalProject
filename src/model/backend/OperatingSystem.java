/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.backend;


import java.util.ArrayList;
import model.dealer.Region;
import model.dealer.Store;
import model.dealer.Transaction;
import model.regulator.Report;
import model.root.Enterprise;
import model.root.Person;
import model.root.UserTest;
import model.root.Weapon;
import model.supplier.Order;
import model.supplier.Shipping;

/**
 *
 * @author manavhirey
 */
public class OperatingSystem {

    private static OperatingSystem os; 
    private ArrayList<Region> regionDirectory;
    private ArrayList<Weapon> weaponDirectory;
    private ArrayList<Store> storeDirectory;
    private ArrayList<Report> reportDirectory;
    private ArrayList<Order> orderDirectory;
    private ArrayList<Transaction> storeOrderDirectory;
    private ArrayList<Transaction> dealerOrderDirectory;
    private ArrayList<Shipping> supplierOrderDirectory;
    private ArrayList<Order> manufacturerOrderDirectory;
    private ArrayList<UserTest> userTestDir;
    private ArrayList<Person> personDirectory;
    private ArrayList<Enterprise> enterpriseDirectory;

    
    public OperatingSystem(){
        System.out.println("in con");
        userTestDir = new ArrayList<UserTest>();
        regionDirectory = new ArrayList<Region>();
        weaponDirectory = new ArrayList<Weapon>();
        storeDirectory = new ArrayList<Store>();
        reportDirectory = new ArrayList<Report>();
        orderDirectory = new ArrayList<Order>();
        storeOrderDirectory = new ArrayList<Transaction>();
        dealerOrderDirectory = new ArrayList<Transaction>();
        supplierOrderDirectory = new ArrayList<Shipping>();
        manufacturerOrderDirectory = new ArrayList<Order>();
        personDirectory = new ArrayList<Person>();
        enterpriseDirectory = new ArrayList<Enterprise>();
        
    }

    @Override
    public String toString() {
        return "OperatingSystem{" + "regionDirectory=" + regionDirectory + ", weaponDirectory=" + weaponDirectory + ", storeDirectory=" + storeDirectory + ", reportDirectory=" + reportDirectory + ", orderDirectory=" + orderDirectory + ", storeOrderDirectory=" + storeOrderDirectory + ", dealerOrderDirectory=" + dealerOrderDirectory + ", supplierOrderDirectory=" + supplierOrderDirectory + ", manufacturerOrderDirectory=" + manufacturerOrderDirectory + ", userTestDir=" + userTestDir + ", personDirectory=" + personDirectory + '}';
    }

    
    public static OperatingSystem getOs() {
        if (os == null) {
            os = new OperatingSystem();
        }
        return os;
     }

    public ArrayList<Region> getRegionDirectory() {
        return regionDirectory;
    }

    public void setRegionDirectory(ArrayList<Region> regionDirectory) {
        this.regionDirectory = regionDirectory;
    }

    public ArrayList<Weapon> getWeaponDirectory() {
        return weaponDirectory;
    }

    public void setWeaponDirectory(ArrayList<Weapon> weaponDirectory) {
        this.weaponDirectory = weaponDirectory;
    }

    public ArrayList<Store> getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreDirectory(ArrayList<Store> storeDirectory) {
        this.storeDirectory = storeDirectory;
    }
    
    public void addStoreToStoreDirectory(Store store){
        if(storeDirectory == null)
            storeDirectory = new ArrayList<Store>();
        storeDirectory.add(store);
    }
    
    public void deleteStoreFromStoreDirectory(Store store){
        storeDirectory.remove(store);
    }

    public ArrayList<Report> getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ArrayList<Report> reportDirectory) {
        this.reportDirectory = reportDirectory;
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public ArrayList<Transaction> getStoreOrderDirectory() {
        return storeOrderDirectory;
    }

    public void setStoreOrderDirectory(ArrayList<Transaction> storeOrderDirectory) {
        this.storeOrderDirectory = storeOrderDirectory;
    }

    public ArrayList<Transaction> getDealerOrderDirectory() {
        return dealerOrderDirectory;
    }

    public void setDealerOrderDirectory(ArrayList<Transaction> dealerOrderDirectory) {
        this.dealerOrderDirectory = dealerOrderDirectory;
    }

    public ArrayList<Shipping> getSupplierOrderDirectory() {
        return supplierOrderDirectory;
    }

    public void setSupplierOrderDirectory(ArrayList<Shipping> supplierOrderDirectory) {
        this.supplierOrderDirectory = supplierOrderDirectory;
    }

    public ArrayList<Order> getManufacturerOrderDirectory() {
        return manufacturerOrderDirectory;
    }

    public void setManufacturerOrderDirectory(ArrayList<Order> manufacturerOrderDirectory) {
        this.manufacturerOrderDirectory = manufacturerOrderDirectory;
    }

    public ArrayList<UserTest> getUserTestDir() {
        return userTestDir;
    }

    public void setUserTestDir(ArrayList<UserTest> userTestDir) {
        this.userTestDir = userTestDir;
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public void addPersonToPersonDirectory(Person person){
        if(personDirectory == null){
            personDirectory = new ArrayList<Person>();
        }
        personDirectory.add(person);
    }
    
    public void deletePersonFromPersonDirectory(Person person){
        personDirectory.remove(person);
    }

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(ArrayList<Enterprise> enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    
}
