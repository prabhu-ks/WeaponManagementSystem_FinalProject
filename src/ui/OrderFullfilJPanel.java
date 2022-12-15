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
import model.root.Weapon;
import model.root.FulfillmentOfficer;
import model.root.Order;
import model.root.Order.OrderStatus;

/**
 *
 * @author pho3nix28
 */
public class OrderFullfilJPanel extends javax.swing.JPanel {
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    FulfillmentOfficer fo;
    List<Order> ordersList;
    List<Weapon> weaponsList;
    /**
     * Creates new form OrderFullfilJPanel
     */
    public OrderFullfilJPanel(Db4oUtils dB4OUtility, OperatingSystem operatingSystem, FulfillmentOfficer fo) {
        initComponents();
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.fo = fo;
        populaterOrdersList();
        populaterWeaponsList();
        populateOrdersTable();
        populateInventoryTable();
        
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
        orderTbl = new javax.swing.JTable();
        orderManFulfillOrderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        invTbl = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitle2 = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 33, 35));

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Fullfilment Officer Dashboard");

        orderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "WeaponID", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTbl);

        orderManFulfillOrderButton.setBackground(new java.awt.Color(126, 87, 194));
        orderManFulfillOrderButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        orderManFulfillOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderManFulfillOrderButton.setText("Fulfill Order");
        orderManFulfillOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderManFulfillOrderButtonActionPerformed(evt);
            }
        });

        invTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "WeaponID", "Name", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(invTbl);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblTitle2.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle2.setText("Order Fulfillment:");

        lblTitle3.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblTitle3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle3.setText("Weapon Inventory:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(orderManFulfillOrderButton))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderManFulfillOrderButton)
                .addGap(46, 46, 46)
                .addComponent(lblTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderManFulfillOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderManFulfillOrderButtonActionPerformed
        // TODO add your handling code here:
        if(orderTbl.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(jScrollPane1, "Please select an order to populate");
            return;
        }
        Order order = ordersList.get(orderTbl.getSelectedRow());
//        if(order.getStatus().equals(OrderStatus.WAITING_FOR_MANUFACTURER)){
//            JOptionPane.showMessageDialog(jScrollPane1, "You cannot fulfill this order.");
//            return;
//        }
        String weaponId = order.getWeaponID();
        Weapon weapon = weaponsList.stream().filter(w -> w.getWeaponId().equals(weaponId)).findFirst().orElse(null);
        weapon.setQuantity(weapon.getQuantity()-order.getQuantity());
        order.setStatus(OrderStatus.FULFILLED.name());
        dB4OUtility.storeSystem(operatingSystem);
        
        populaterOrdersList();
        populaterWeaponsList();
        populateOrdersTable();
        populateInventoryTable();
        
    }//GEN-LAST:event_orderManFulfillOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable invTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JButton orderManFulfillOrderButton;
    private javax.swing.JTable orderTbl;
    // End of variables declaration//GEN-END:variables

    private void populaterOrdersList() {
        ordersList = operatingSystem.getOrderDirectory().stream()
                .filter(order -> order.getManufacturerId()!=null && order.getManufacturerId().equals(fo.getEnterpriseId()) && order.getStatus().equals(OrderStatus.WAITING_FOR_MANUFACTURER.name()))
                .toList();
    }

    private void populateOrdersTable() {
        DefaultTableModel model = (DefaultTableModel) orderTbl.getModel();
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
    
    private void populaterWeaponsList() {
        weaponsList = operatingSystem.getWeaponDirectory();
    }

    private void populateInventoryTable() {
        DefaultTableModel model = (DefaultTableModel) invTbl.getModel();
        model.setRowCount(0);
         
        for (Weapon weapon : weaponsList){

            Object[] row =  new Object[8];
            row[0] = weapon.getWeaponId();
            row[1] = weapon.getName();
            row[2] = weapon.getType();
            row[3] = weapon.getQuantity();
            model.addRow(row);
            
        }
    }
    
}
