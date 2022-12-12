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
import model.root.Enterprise.EnterpriseType;
import model.root.Order;
import model.root.Order.OrderStatus;
import model.root.OrderManager;
import model.root.Weapon;

/**
 *
 * @author pho3nix28
 */
public class OrderManagerOrders extends javax.swing.JPanel {

    private List<Order> ordersList;
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    OrderManager orderManager;
    /**
     * Creates new form OrderManagerOrders
     */
    public OrderManagerOrders(Db4oUtils db ,OperatingSystem os, OrderManager orderManager) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        this.orderManager = orderManager;
        populateOrderList();
        populateOrdersTable();
        orderStatusComboBox.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderManOrderTable = new javax.swing.JTable();
        orderManViewOrderButton = new javax.swing.JButton();
        orderManUpdateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderIDTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        storeIDTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dealerIDTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        supplierIDTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manufacturerComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        weaponIDTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        orderStatusComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(32, 33, 35));

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Manufacturer-Supplier Order Management");

        orderManOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Order Status", "Store ID", "Dealer ID", "Supplier ID", "Manufacturer ID", "Weapon ID", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(orderManOrderTable);

        orderManViewOrderButton.setBackground(new java.awt.Color(126, 87, 194));
        orderManViewOrderButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        orderManViewOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderManViewOrderButton.setText("View Order");
        orderManViewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderManViewOrderButtonActionPerformed(evt);
            }
        });

        orderManUpdateButton.setBackground(new java.awt.Color(126, 87, 194));
        orderManUpdateButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        orderManUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        orderManUpdateButton.setText("Update");
        orderManUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderManUpdateButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Status:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order ID:");

        orderIDTxt.setEditable(false);
        orderIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orderIDTxtFocusLost(evt);
            }
        });
        orderIDTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                orderIDTxtKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Store ID:");

        storeIDTxt.setEditable(false);
        storeIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                storeIDTxtFocusLost(evt);
            }
        });
        storeIDTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                storeIDTxtKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dealer ID:");

        dealerIDTxt.setEditable(false);
        dealerIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealerIDTxtFocusLost(evt);
            }
        });
        dealerIDTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealerIDTxtKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Supplier ID:");

        supplierIDTxt.setEditable(false);
        supplierIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierIDTxtFocusLost(evt);
            }
        });
        supplierIDTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierIDTxtKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manufacturer ID:");

        manufacturerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Weapon ID:");

        weaponIDTxt.setEditable(false);
        weaponIDTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                weaponIDTxtFocusLost(evt);
            }
        });
        weaponIDTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weaponIDTxtKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity:");

        quantityTxt.setEditable(false);
        quantityTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTxtFocusLost(evt);
            }
        });
        quantityTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityTxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderManViewOrderButton)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(storeIDTxt)
                                        .addComponent(dealerIDTxt)
                                        .addComponent(orderIDTxt)
                                        .addComponent(orderStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(supplierIDTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(manufacturerComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(weaponIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(orderManUpdateButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(orderManViewOrderButton)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealerIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weaponIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(orderManUpdateButton)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderManUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderManUpdateButtonActionPerformed
        // TODO add your handling code here:
        Order order = ordersList.stream()
                        .filter(o -> o.getOrderId().equals(orderIDTxt.getText().trim()))
                        .findFirst()
                        .orElse(null);
        if(orderStatusComboBox.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(jScrollPane1, "Please select a valid order status");
            return;
        }
        if(manufacturerComboBox.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(jScrollPane1, "Please select a manufacturer ID");
            return;
        }
        
        OrderStatus updatedOrderStatus = OrderStatus.valueOf(orderStatusComboBox.getSelectedItem().toString());
        order.setStatus(updatedOrderStatus.name());
        String manufactuerID = manufacturerComboBox.getSelectedItem().toString();
        order.setManufacturerId(manufactuerID);
        
        dB4OUtility.storeSystem(operatingSystem);
        
        orderIDTxt.setText("");
        orderStatusComboBox.removeAllItems();
        orderStatusComboBox.setEnabled(false);
        storeIDTxt.setText("");
        dealerIDTxt.setText("");
        supplierIDTxt.setText("");
        manufacturerComboBox.removeAllItems();
        manufacturerComboBox.setEnabled(false);
        weaponIDTxt.setText("");
        quantityTxt.setText("");
        orderManUpdateButton.setEnabled(false);
        
        populateOrderList();
        populateOrdersTable();
    }//GEN-LAST:event_orderManUpdateButtonActionPerformed

    private void orderIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orderIDTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIDTxtFocusLost

    private void orderIDTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderIDTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIDTxtKeyPressed

    private void storeIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_storeIDTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_storeIDTxtFocusLost

    private void storeIDTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storeIDTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeIDTxtKeyPressed

    private void dealerIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealerIDTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerIDTxtFocusLost

    private void dealerIDTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealerIDTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerIDTxtKeyPressed

    private void supplierIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierIDTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierIDTxtFocusLost

    private void supplierIDTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierIDTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierIDTxtKeyPressed

    private void weaponIDTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weaponIDTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_weaponIDTxtFocusLost

    private void weaponIDTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weaponIDTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_weaponIDTxtKeyPressed

    private void quantityTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtFocusLost

    private void quantityTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtKeyPressed

    private void orderManViewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderManViewOrderButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = orderManOrderTable.getSelectedRow();
        Order order = ordersList.get(selectedRowIndex);
        
        orderIDTxt.setText(order.getOrderId());
        
        if(OrderStatus.valueOf(order.getStatus()).equals(OrderStatus.CREATED) || OrderStatus.valueOf(order.getStatus()).equals(OrderStatus.FULFILLED)){
            orderStatusComboBox.removeAllItems();
            if(OrderStatus.valueOf(order.getStatus()).equals(OrderStatus.CREATED)){
                orderStatusComboBox.addItem(OrderStatus.CREATED.name());
                orderStatusComboBox.addItem(OrderStatus.WAITING_FOR_MANUFACTURER.name());
            }
            else{
                orderStatusComboBox.addItem(OrderStatus.FULFILLED.name());
                orderStatusComboBox.addItem(OrderStatus.READY_TO_SHIP.name());
            }
            orderStatusComboBox.setEnabled(true);
            orderStatusComboBox.setSelectedIndex(0);
            orderManUpdateButton.setEnabled(true);
            List<Enterprise> manufacturerList = operatingSystem.getEnterpriseDirectory().stream()
                                .filter(e -> EnterpriseType.valueOf(e.getEnterpriseType()).equals(EnterpriseType.MANUFACTURER))
                                .toList();
            manufacturerList.forEach(m -> manufacturerComboBox.addItem(m.getEnterpriseId()));
            manufacturerComboBox.setSelectedIndex(0);
            manufacturerComboBox.setEnabled(true);
            
        }
        else{
            orderStatusComboBox.setEnabled(false);
            orderStatusComboBox.addItem(order.getStatus());
            orderStatusComboBox.setSelectedIndex(0);
            orderManUpdateButton.setEnabled(false);
            manufacturerComboBox.removeAllItems();
            manufacturerComboBox.addItem(order.getManufacturerId());
            manufacturerComboBox.setSelectedIndex(0);
            manufacturerComboBox.setEnabled(false);
        }
        
        storeIDTxt.setText(order.getStoreId());
        dealerIDTxt.setText(order.getDealerId());
        supplierIDTxt.setText(order.getSupplierId());
        weaponIDTxt.setText(order.getWeaponID());
        quantityTxt.setText(String.valueOf(order.getQuantity()));
 
        
    }//GEN-LAST:event_orderManViewOrderButtonActionPerformed

    private void manufacturerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dealerIDTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JComboBox<String> manufacturerComboBox;
    private javax.swing.JTextField orderIDTxt;
    private javax.swing.JTable orderManOrderTable;
    private javax.swing.JButton orderManUpdateButton;
    private javax.swing.JButton orderManViewOrderButton;
    private javax.swing.JComboBox<String> orderStatusComboBox;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JTextField storeIDTxt;
    private javax.swing.JTextField supplierIDTxt;
    private javax.swing.JTextField weaponIDTxt;
    // End of variables declaration//GEN-END:variables

    private void populateOrderList() {
        
        ordersList = operatingSystem.getOrderDirectory().stream()
                    .filter(order -> order.getSupplierId().equals(orderManager.getEnterpriseId()))
                    .toList();
    }
    
    private void populateOrdersTable(){
        DefaultTableModel model = (DefaultTableModel) orderManOrderTable.getModel();
        model.setRowCount(0);
         
        for (Order order : ordersList){

            Object[] row =  new Object[8];
            row[0] = order.getOrderId();
            row[1] = order.getStatus();
            row[2] = order.getStoreId();
            row[3] = order.getDealerId();
            row[4] = order.getSupplierId();
            row[5] = order.getManufacturerId();
            row[6] = order.getWeaponID();
            row[7] = order.getQuantity();

            model.addRow(row);


        }
    }
}
