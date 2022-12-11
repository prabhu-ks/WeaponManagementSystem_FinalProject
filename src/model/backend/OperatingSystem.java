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
import model.root.IdChecker;
import model.root.Order;
import model.root.Person;
import model.root.UserTest;
import model.root.Weapon;
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
//    private ArrayList<StoreOrder> storeOrderDirectory;
//    private ArrayList<DealerOrder> dealerOrderDirectory;
//    private ArrayList<Shipping> supplierOrderDirectory;
//    private ArrayList<Order> manufacturerOrderDirectory;
    private ArrayList<Order> orderDirectory;
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
//        storeOrderDirectory = new ArrayList<StoreOrder>();
//        dealerOrderDirectory = new ArrayList<DealerOrder>();
//        supplierOrderDirectory = new ArrayList<Shipping>();
//        manufacturerOrderDirectory = new ArrayList<Order>();
        orderDirectory = new ArrayList<Order>();
        personDirectory = new ArrayList<Person>();
        enterpriseDirectory = new ArrayList<Enterprise>();
       
        
    }

    @Override
    public String toString() {
        return "OperatingSystem{" + "regionDirectory=" + regionDirectory + ", weaponDirectory=" + weaponDirectory + ", storeDirectory=" + storeDirectory + ", reportDirectory=" + reportDirectory + ", userTestDir=" + userTestDir + ", personDirectory=" + personDirectory +", enterpriseDirectory=" + enterpriseDirectory +  '}';
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

//    public ArrayList<StoreOrder> getStoreOrderDirectory() {
//        return storeOrderDirectory;
//    }
//
//    public void setStoreOrderDirectory(ArrayList<StoreOrder> storeOrderDirectory) {
//        this.storeOrderDirectory = storeOrderDirectory;
//    }
//    
//    public void addStoreOrderToDirectory(StoreOrder storeOrder){
//        if(storeOrderDirectory == null)
//            storeOrderDirectory = new ArrayList<StoreOrder>();
//        storeOrderDirectory.add(storeOrder);
//    }
//    
//    public void deleteStoreFromDirectory(StoreOrder storeOrder){
//        storeOrderDirectory.remove(storeOrder);
//    }
//
//    public ArrayList<DealerOrder> getDealerOrderDirectory() {
//        return dealerOrderDirectory;
//    }
//
//    public void setDealerOrderDirectory(ArrayList<DealerOrder> dealerOrderDirectory) {
//        this.dealerOrderDirectory = dealerOrderDirectory;
//    }
//    
//    public void addDealerOrderToDirectory(DealerOrder dealerOrder){
//        if(dealerOrderDirectory == null)
//            dealerOrderDirectory = new ArrayList<DealerOrder>();
//        dealerOrderDirectory.add(dealerOrder);
//    }
//    
//    public void deleteDealerOrderFromDirectory(DealerOrder dealerOrder){
//        dealerOrderDirectory.remove(dealerOrder);
//    }
//    public ArrayList<Shipping> getSupplierOrderDirectory() {
//        return supplierOrderDirectory;
//    }
//
//    public void setSupplierOrderDirectory(ArrayList<Shipping> supplierOrderDirectory) {
//        this.supplierOrderDirectory = supplierOrderDirectory;
//    }
//    
//    public ArrayList<Order> getManufacturerOrderDirectory() {
//        return manufacturerOrderDirectory;
//    }
//
//    public void setManufacturerOrderDirectory(ArrayList<Order> manufacturerOrderDirectory) {
//        this.manufacturerOrderDirectory = manufacturerOrderDirectory;
//    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public void addOrderToOrderDirectory(Order order){
        if(orderDirectory ==null)
            orderDirectory = new ArrayList<Order>();
        orderDirectory.add(order);
    }
    
    public void deleteOrderFromOrderDirectory(Order order){
        orderDirectory.remove(order);
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
    
    public void addEnterprisetoEnterpriseDirectory(Enterprise enterprise){
        if(enterpriseDirectory == null){
            enterpriseDirectory = new ArrayList<Enterprise>();
        }
        enterpriseDirectory.add(enterprise);
    }
    
    public void addWeaponToWeaponDirectory(Weapon weapon){
        if(weaponDirectory == null){
            weaponDirectory = new ArrayList<Weapon>();
        }
        weaponDirectory.add(weapon);
    }
    
    public void deleteWeaponFromWeaponDirectory(Weapon weapon){
        weaponDirectory.remove(weapon);
    }
    
    public void addReportToReportDirectory(Report report){
        if(reportDirectory == null){
            reportDirectory = new ArrayList<Report>();
        }
        reportDirectory.add(report);
    }
    
}
