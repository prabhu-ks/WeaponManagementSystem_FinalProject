/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.root.Enterprise;
import model.root.Enterprise.EnterpriseType;
import model.root.Order;
import model.root.Supplier;

/**
 *
 * @author manavmalavia
 */
public class RegionalManagerOrders extends javax.swing.JPanel {

     OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    
    /**
     * Creates new form RegionalManagerOrders
     */
    public RegionalManagerOrders() {
        initComponents();
    }
    
    public RegionalManagerOrders(Db4oUtils db ,OperatingSystem os) {
        initComponents();
        this.dB4OUtility= db;
        this.operatingSystem = os;
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
        regionalManagerWeaponType = new javax.swing.JTextField();
        regionalManagerOrderQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regionalManagerStoreId = new javax.swing.JTextField();
        regionalManagerOrderStatus = new javax.swing.JComboBox<>();
        regionalManagerCreateOrder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regionalManagerViewOrder = new javax.swing.JButton();
        regionalManagerDealerId = new javax.swing.JComboBox<>();
        regionalManagerSupplierId = new javax.swing.JComboBox<>();

        regionalManagerOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Order Status", "Store Id", "Weapon Type", "Weapon Quantity", "Dealer Id", "Supplier Id"
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

        jLabel3.setText("Weapon Type");

        regionalManagerWeaponType.setEditable(false);
        regionalManagerWeaponType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerWeaponTypeActionPerformed(evt);
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

        regionalManagerCreateOrder.setText("Create Order");
        regionalManagerCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalManagerCreateOrderActionPerformed(evt);
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
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(regionalManagerOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(regionalManagerOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(regionalManagerWeaponType, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(regionalManagerCreateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(regionalManagerStoreId)
                                    .addComponent(regionalManagerOrderQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(regionalManagerDealerId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(regionalManagerSupplierId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regionalManagerViewOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regionalManagerOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(regionalManagerOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionalManagerWeaponType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionalManagerOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionalManagerStoreId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(regionalManagerDealerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(regionalManagerSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regionalManagerCreateOrder)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regionalManagerOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerOrderIdActionPerformed

    private void regionalManagerWeaponTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerWeaponTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerWeaponTypeActionPerformed

    private void regionalManagerOrderQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerOrderQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerOrderQuantityActionPerformed

    private void regionalManagerStoreIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerStoreIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerStoreIdActionPerformed

    private void regionalManagerOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerOrderStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionalManagerOrderStatusActionPerformed

    private void regionalManagerCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerCreateOrderActionPerformed
        // TODO add your handling code here:
        String orderId = regionalManagerOrderId.getText();
        String orderStatus = regionalManagerOrderStatus.getSelectedItem().toString();
        String weaponType= regionalManagerWeaponType.getText();
        String orderQuantity= regionalManagerOrderQuantity.getText();
        String storeId =regionalManagerStoreId.getText();
        String dealerId= regionalManagerDealerId.getSelectedItem().toString();
        String supplierId= regionalManagerSupplierId.getSelectedItem().toString();
        
        List<Order> orders= operatingSystem.getOrderDirectory();
        Order order = orders.stream().filter(o -> o.getOrderId().equals(orderId)).
                findFirst().orElse(null);
       order.setDealerId(dealerId);
       order.setSupplierId(supplierId);
       
       this.dB4OUtility.storeSystem(operatingSystem);
        
    }//GEN-LAST:event_regionalManagerCreateOrderActionPerformed

    private void regionalManagerViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalManagerViewOrderActionPerformed
        // TODO add your handling code here:
        int selected= regionalManagerOrdersTable.getSelectedRow();
        String orderId =regionalManagerOrdersTable.getModel().getValueAt(selected, 0).toString();
        List<Order> orders= operatingSystem.getOrderDirectory();
        Order selectedOrder = orders.stream().filter(order -> order.getOrderId().equals(orderId)).
                findFirst().orElse(null);
        
        regionalManagerOrderId.setText(orderId);
        regionalManagerOrderStatus.setSelectedItem(selectedOrder.getStatus());
        regionalManagerWeaponType.setText(selectedOrder.getWeaponID());
        regionalManagerOrderQuantity.setText(Integer.toString(selectedOrder.getQuantity()));
        regionalManagerStoreId.setText("");
        
        List<Enterprise> dealers = operatingSystem.getEnterpriseDirectory().stream()
                .filter(enterprise -> enterprise.getEnterpriseType().equals(EnterpriseType.DEALER.name())).toList();
        dealers.forEach(dealer -> regionalManagerDealerId.addItem(dealer.getEnterpriseName()));
        List<Enterprise> suppliers = operatingSystem.getEnterpriseDirectory().stream()
                .filter(supplier -> supplier.getEnterpriseType().equals(EnterpriseType.SUPPLIER.name())).toList();
        suppliers.forEach(supplier -> regionalManagerSupplierId.addItem(supplier.getEnterpriseName()));
    }//GEN-LAST:event_regionalManagerViewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regionalManagerCreateOrder;
    private javax.swing.JComboBox<String> regionalManagerDealerId;
    private javax.swing.JTextField regionalManagerOrderId;
    private javax.swing.JTextField regionalManagerOrderQuantity;
    private javax.swing.JComboBox<String> regionalManagerOrderStatus;
    private javax.swing.JTable regionalManagerOrdersTable;
    private javax.swing.JTextField regionalManagerStoreId;
    private javax.swing.JComboBox<String> regionalManagerSupplierId;
    private javax.swing.JButton regionalManagerViewOrder;
    private javax.swing.JTextField regionalManagerWeaponType;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) regionalManagerOrdersTable.getModel();
        model.setRowCount(0);
        List<Order> persons = operatingSystem.getOrderDirectory().stream()
                .filter(o -> Order.OrderStatus.valueOf(o.getStatus()).equals(Order.OrderStatus.REQUESTED)).toList();
         
        for ( Order order : persons){
            
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