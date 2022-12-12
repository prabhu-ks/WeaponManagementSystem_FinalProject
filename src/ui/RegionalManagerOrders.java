/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.root.Enterprise;
import model.root.Order;
import model.root.RegionalManager;

/**
 *
 * @author manavmalavia
 */
public class RegionalManagerOrders extends javax.swing.JPanel {

     OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    RegionalManager regionalManager;
    List<Order> ordersList;
    
    /**
     * Creates new form RegionalManagerOrders
     */
    public RegionalManagerOrders() {
        initComponents();
    }
    
    public RegionalManagerOrders(Db4oUtils db ,OperatingSystem os, RegionalManager rm) {
        initComponents();
        this.dB4OUtility= db;
        this.operatingSystem = os;
        this.regionalManager = rm;
        populaterOrdersList();
        populateOrdersTable();
        regionalManagerUpdateOrder.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        regionalManagerOrdersTable = new javax.swing.JTable();
        regionalManagerOrderId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regionalManagerWeaponID = new javax.swing.JTextField();
        regionalManagerOrderQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regionalManagerStoreId = new javax.swing.JTextField();
        regionalManagerOrderStatus = new javax.swing.JComboBox<>();
        regionalManagerUpdateOrder = new javax.swing.JButton();
        regionalManagerDealerId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regionalManagerViewOrder = new javax.swing.JButton();
        supplierComboBox = new javax.swing.JComboBox<>();

        regionalManagerOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Order Status", "Store Id", "Weapon ID", "Weapon Quantity", "Dealer Id", "Supplier Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(regionalManagerOrdersTable);
        if (regionalManagerOrdersTable.getColumnModel().getColumnCount() > 0) {
            regionalManagerOrdersTable.getColumnModel().getColumn(6).setResizable(false);
        }

        regionalManagerOrderId.setEditable(false);
        regionalManagerOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerOrderIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Order Id");

        jLabel2.setText("Order Status");

        jLabel3.setText("Weapon ID");

        regionalManagerWeaponID.setEditable(false);
        regionalManagerWeaponID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerWeaponIDActionPerformed(evt);
            }
        });

        regionalManagerOrderQuantity.setEditable(false);
        regionalManagerOrderQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerOrderQuantityActionPerformed(evt);
            }
        });

        jLabel4.setText("Weapon Quantity");

        jLabel5.setText("Store Id");

        regionalManagerStoreId.setEditable(false);
        regionalManagerStoreId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerStoreIdActionPerformed(evt);
            }
        });

        regionalManagerOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerOrderStatusActionPerformed(evt);
            }
        });

        regionalManagerUpdateOrder.setText("Update Order");
        regionalManagerUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerUpdateOrderActionPerformed(evt);
            }
        });

        regionalManagerDealerId.setEditable(false);
        regionalManagerDealerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerDealerIdActionPerformed(evt);
            }
        });

        jLabel6.setText("Dealer Id");

        jLabel7.setText("Supplier Id");

        regionalManagerViewOrder.setText("View Order");
        regionalManagerViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerViewOrderActionPerformed(evt);
            }
        });

        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regionalManagerViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(regionalManagerOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(regionalManagerOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(regionalManagerWeaponID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(regionalManagerUpdateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(regionalManagerDealerId, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(regionalManagerStoreId)
                                    .addComponent(regionalManagerOrderQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(supplierComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regionalManagerViewOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regionalManagerOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(regionalManagerOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(regionalManagerWeaponID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionalManagerOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionalManagerStoreId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionalManagerDealerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(supplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regionalManagerUpdateOrder)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regionalManagerOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerOrderIdActionPerformed

    private void regionalManagerWeaponIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerWeaponIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerWeaponIDActionPerformed

    private void regionalManagerOrderQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerOrderQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerOrderQuantityActionPerformed

    private void regionalManagerStoreIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerStoreIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerStoreIdActionPerformed

    private void regionalManagerOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerOrderStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerOrderStatusActionPerformed

    private void regionalManagerUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerUpdateOrderActionPerformed
        // TODO add your handling code here:
        //String orderId= regionalManagerOrderId.getText();
//        String orderId = regionalManagerOrderId.getText();
//        String orderStatus = regionalManagerOrderStatus.getSelectedItem().toString();
//        String weaponType= regionalManagerWeaponID.getText();
//        String orderQuantity= regionalManagerOrderQuantity.getText();
//        String storeId =regionalManagerStoreId.getText();
//        String dealerId= regionalManagerDealerId.getText();
//        String supplierId= regionalManagerSupplierId.getText();
        Order order = ordersList.stream()
                        .filter(o -> o.getOrderId().equals(regionalManagerOrderId.getText().trim()))
                        .findFirst()
                        .orElse(null);
        if(regionalManagerOrderStatus.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(jScrollPane1, "Please select a valid order status");
            return;
        }
        if(supplierComboBox.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(jScrollPane1, "Please select a supplier ID");
            return;
        }
        
        Order.OrderStatus updatedOrderStatus = Order.OrderStatus.valueOf(regionalManagerOrderStatus.getSelectedItem().toString());
        order.setStatus(updatedOrderStatus.name());
        String supplierId = supplierComboBox.getSelectedItem().toString();
        order.setSupplierId(supplierId);
        
        dB4OUtility.storeSystem(operatingSystem);
       
        
        regionalManagerOrderId.setText("");
        regionalManagerOrderStatus.removeAllItems();
        regionalManagerOrderStatus.setEnabled(false);
        regionalManagerStoreId.setText("");
        regionalManagerDealerId.setText("");
        supplierComboBox.removeAllItems();
        supplierComboBox.setEnabled(false);
        regionalManagerWeaponID.setText("");
        regionalManagerOrderQuantity.setText("");
        regionalManagerUpdateOrder.setEnabled(false);
        
        populaterOrdersList();
        populateOrdersTable();
        
        
    }//GEN-LAST:event_regionalManagerUpdateOrderActionPerformed

    private void regionalManagerDealerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerDealerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerDealerIdActionPerformed

    private void regionalManagerViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = regionalManagerOrdersTable.getSelectedRow();
        Order order = ordersList.get(selectedRowIndex);
        
        regionalManagerOrderId.setText(order.getOrderId());
        
        if(Order.OrderStatus.valueOf(order.getStatus()).equals(Order.OrderStatus.REQUESTED) || Order.OrderStatus.valueOf(order.getStatus()).equals(Order.OrderStatus.SHIPPED)){
            regionalManagerOrderStatus.removeAllItems();
            if(Order.OrderStatus.valueOf(order.getStatus()).equals(Order.OrderStatus.REQUESTED)){
                regionalManagerOrderStatus.addItem(Order.OrderStatus.REQUESTED.name());
                regionalManagerOrderStatus.addItem(Order.OrderStatus.CREATED.name());
            }
            else{
                regionalManagerOrderStatus.addItem(Order.OrderStatus.FULFILLED.name());
                regionalManagerOrderStatus.addItem(Order.OrderStatus.READY_TO_SHIP.name());
            }
            regionalManagerOrderStatus.setEnabled(true);
            regionalManagerOrderStatus.setSelectedIndex(0);
            regionalManagerUpdateOrder.setEnabled(true);
            List<Enterprise> supplierList = operatingSystem.getEnterpriseDirectory().stream()
                                .filter(e -> Enterprise.EnterpriseType.valueOf(e.getEnterpriseType()).equals(Enterprise.EnterpriseType.SUPPLIER))
                                .toList();
            supplierList.forEach(m -> supplierComboBox.addItem(m.getEnterpriseId()));
            supplierComboBox.setSelectedIndex(0);
            supplierComboBox.setEnabled(true);
            
        }
        else{
            regionalManagerOrderStatus.setEnabled(false);
            regionalManagerOrderStatus.addItem(order.getStatus());
            regionalManagerOrderStatus.setSelectedIndex(0);
            regionalManagerUpdateOrder.setEnabled(false);
            supplierComboBox.removeAllItems();
            supplierComboBox.addItem(order.getManufacturerId());
            supplierComboBox.setSelectedIndex(0);
            supplierComboBox.setEnabled(false);
        }
        
        regionalManagerStoreId.setText(order.getStoreId());
        regionalManagerDealerId.setText(order.getDealerId());
        regionalManagerWeaponID.setText(order.getWeaponID());
        regionalManagerOrderQuantity.setText(String.valueOf(order.getQuantity()));
    }//GEN-LAST:event_regionalManagerViewOrderActionPerformed

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField regionalManagerDealerId;
    private javax.swing.JTextField regionalManagerOrderId;
    private javax.swing.JTextField regionalManagerOrderQuantity;
    private javax.swing.JComboBox<String> regionalManagerOrderStatus;
    private javax.swing.JTable regionalManagerOrdersTable;
    private javax.swing.JTextField regionalManagerStoreId;
    private javax.swing.JButton regionalManagerUpdateOrder;
    private javax.swing.JButton regionalManagerViewOrder;
    private javax.swing.JTextField regionalManagerWeaponID;
    private javax.swing.JComboBox<String> supplierComboBox;
    // End of variables declaration//GEN-END:variables

    private void populaterOrdersList() {
        ordersList = operatingSystem.getOrderDirectory().stream()
                    .filter(order -> order.getDealerId().equals(regionalManager.getEnterpriseId()))
                    .toList();
        System.out.println("Orders size: " + ordersList.size());
        ordersList.forEach(o -> System.out.println(o.getOrderId()));
    }

    private void populateOrdersTable() {
        DefaultTableModel model = (DefaultTableModel) regionalManagerOrdersTable.getModel();
        model.setRowCount(0);
         
        for (Order order : ordersList){

            Object[] row =  new Object[8];
            row[0] = order.getOrderId();
            row[1] = order.getStatus();
            row[2] = order.getStoreId();
            row[3] = order.getWeaponID();
            row[4] = order.getQuantity();
            row[5] = order.getDealerId();
            row[6] = order.getSupplierId();

            model.addRow(row);
            
        }
    }

    

}
