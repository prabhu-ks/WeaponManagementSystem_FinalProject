/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.backend;


import java.util.ArrayList;
import model.dealer.Region;
import model.dealer.Store;
import model.manufacturer.Report;
import model.root.Weapon;
import model.supplier.Order;

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
     private ArrayList<Order> storeOrderDirectory;
     private ArrayList<Order> dealerOrderDirectory;
     private ArrayList<Order> supplierOrderDirectory;
     private ArrayList<Order> manufactureOrderDirectory;

    
     public static OperatingSystem getOs() {
         return os;
     }

     public static void setOs(OperatingSystem os) {
         OperatingSystem.os = os;
     }

    public ArrayList<Region> getRegionDirectory() {
        return regionDirectory;
    }
    public void addRegion(Region r) {
         regionDirectory.add(r);
     }
    public void deleteRegion(Region r) {
         regionDirectory.remove(r);
     }
    public ArrayList<Weapon> getWeaponDirectory() {
        return weaponDirectory;
    }
    public void addWeapon(Weapon w) {
         weaponDirectory.add(w);
     }
    public void deleteWeapon(Weapon w) {
         weaponDirectory.remove(w);
     }

    public void setWeaponDirectory(ArrayList<Weapon> weaponDirectory) {
        this.weaponDirectory = weaponDirectory;
    }
    

    public void setRegionDirectory(ArrayList<Region> regionDirectory) {
        this.regionDirectory = regionDirectory;
    }

    public ArrayList<Store> getStoreDirectory() {
        return storeDirectory;
    }
    public void addStore(Store s) {
         storeDirectory.add(s);
     }
    public void deleteStore(Store s) {
         storeDirectory.remove(s);
     }

    public void setStoreDirectory(ArrayList<Store> storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    public ArrayList<Report> getReportDirectory() {
        return reportDirectory;
    }
    public void addReport(Report r) {
         reportDirectory.add(r);
     }
    public void deleteReport(Store s) {
         reportDirectory.remove(s);
     }

    public void setReportDirectory(ArrayList<Report> reportDirectory) {
        this.reportDirectory = reportDirectory;
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }
    public void addOrder(Order o) {
         orderDirectory.add(o);
     }
    public void deleteOrder(Order o) {
         orderDirectory.remove(o);
     }

     public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
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

     public ArrayList<Order> getSupplierOrderDirectory() {
         return supplierOrderDirectory;
     }
     public void addSupplierOrder(Order order) {
         supplierOrderDirectory.add(order);
     }
       public void deleteSupplierOrder(Order order) {
         supplierOrderDirectory.remove(order);
     }

     public void setSupplierOrderDirectory(ArrayList<Order> supplierOrderDirectory) {
         this.supplierOrderDirectory = supplierOrderDirectory;
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
