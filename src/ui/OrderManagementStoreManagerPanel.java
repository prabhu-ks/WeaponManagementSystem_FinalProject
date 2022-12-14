/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.dealer.Inventory;
import model.dealer.Store;
import model.root.Dealer;
import model.root.Enterprise.EnterpriseType;
import model.root.Order;
import model.root.Order.OrderStatus;
import model.root.Weapon;
import model.root.StoreManager;


/**
 *
 * @author Raja Shekar
 */
public class OrderManagementStoreManagerPanel extends javax.swing.JPanel {

    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    private List<Weapon> weaponsList;
    private List<Order> ordersList;
    StoreManager storeManager;
    /**
     * Creates new form OrderManagementStoreManagerPanel
     */
    public OrderManagementStoreManagerPanel(Db4oUtils db ,OperatingSystem os, StoreManager storeManager) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        this.storeManager = storeManager;
        weaponsList = operatingSystem.getWeaponDirectory(); 
        weaponsList.forEach(weapon -> System.out.println(weapon.getName()));
        storeManager = storeManager;
        populateWeapons();
        populateOrders();
        populateOrdersTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderManOrderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        weaponComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        createOrderButton = new javax.swing.JButton();
        addToInventoryButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 33, 35));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Order Management System");

        orderManOrderTable.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        orderManOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Order Status", "Weapon ID", "Weapon Name", "Quantity"
            }
        ));
        orderManOrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderManOrderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderManOrderTable);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weapon:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity:");

        quantityTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTxtFocusLost(evt);
            }
        });
        quantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtActionPerformed(evt);
            }
        });
        quantityTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityTxtKeyPressed(evt);
            }
        });

        createOrderButton.setBackground(new java.awt.Color(126, 87, 194));
        createOrderButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        createOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        createOrderButton.setText("Create");
        createOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderButtonActionPerformed(evt);
            }
        });

        addToInventoryButton.setBackground(new java.awt.Color(126, 87, 194));
        addToInventoryButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        addToInventoryButton.setForeground(new java.awt.Color(255, 255, 255));
        addToInventoryButton.setText("Add to inventory");
        addToInventoryButton.setEnabled(false);
        addToInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToInventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createOrderButton)
                        .addGap(49, 49, 49)
                        .addComponent(addToInventoryButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(weaponComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weaponComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOrderButton)
                    .addComponent(addToInventoryButton))
                .addContainerGap(412, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void quantityTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtFocusLost

    private void quantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtActionPerformed

    private void quantityTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtKeyPressed

    private void createOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderButtonActionPerformed
        // TODO add your handling code here:
        String selectedWeaponName = (String)weaponComboBox.getSelectedItem();
        if(selectedWeaponName == null){
            JOptionPane.showMessageDialog(weaponComboBox, "Please eelect a weapon");
            return;
        }
        String weaponId = weaponsList.stream().filter(weapon -> weapon.getName().equals(selectedWeaponName)).findFirst().orElse(null).getWeaponId();
        int quantity = Integer.parseInt(quantityTxt.getText());
        
        Dealer dealer = (Dealer) operatingSystem.getEnterpriseDirectory().stream()
                        .filter(e -> EnterpriseType.valueOf(e.getEnterpriseType()).equals(EnterpriseType.DEALER))
                        .findFirst()
                        .orElse(null);
        
        Order order = new Order(UUID.randomUUID().toString(), storeManager.getManagingStoreId(), dealer.getEnterpriseId(), null, null,weaponId, quantity, OrderStatus.REQUESTED.name());
        
        operatingSystem.getOrderDirectory().add(order);
        dB4OUtility.storeSystem(operatingSystem);
        
        weaponComboBox.setSelectedIndex(-1);
        quantityTxt.setText("");
        populateOrdersTable();
        
    }//GEN-LAST:event_createOrderButtonActionPerformed

    private void orderManOrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderManOrderTableMouseClicked
        // TODO add your handling code here:
        if(orderManOrderTable.getSelectedRow()!= -1){
            addToInventoryButton.setEnabled(true);
        }
    }//GEN-LAST:event_orderManOrderTableMouseClicked

    private void addToInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToInventoryButtonActionPerformed
        // TODO add your handling code here:
          int selectedRow = orderManOrderTable.getSelectedRow();
        Order order = ordersList.get(selectedRow);
        if(OrderStatus.valueOf(order.getStatus()).equals(OrderStatus.DELIVERED) == false){
            JOptionPane.showMessageDialog(weaponComboBox, "Order has not yet been delivered");
            return;
        }
        Weapon weapon = weaponsList.stream().filter(w -> w.getWeaponId().equals(order.getWeaponID())).findFirst().orElse(null);
        Store store = operatingSystem.getStoreDirectory().stream()
                .filter(s -> s.getId().equals(storeManager.getManagingStoreId()))
                .findFirst().orElse(null);
        Inventory inventory = store.getInventory();
        if(inventory.getWeaponsList().containsKey(weapon))
           inventory.getWeaponsList().put(weapon, inventory.getWeaponsList().get(weapon)+order.getQuantity());
        else
            inventory.getWeaponsList().put(weapon, order.getQuantity());
        inventory.setFilled(inventory.getFilled()+order.getQuantity());
        inventory.setAvailable(inventory.getCapacity()-inventory.getFilled());
        addToInventoryButton.setEnabled(false);
    }//GEN-LAST:event_addToInventoryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToInventoryButton;
    private javax.swing.JButton createOrderButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable orderManOrderTable;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JComboBox<String> weaponComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateWeapons(){
        weaponsList.forEach(weapon -> {
            System.out.println(weapon.getName());
            weaponComboBox.addItem(weapon.getName());
        });
        
    }
    
    private void populateOrders(){
        ordersList = operatingSystem.getOrderDirectory().stream()
                .filter(order -> order.getStoreId().equals(storeManager.getManagingStoreId()))
                .toList();
    }
    
    private void populateOrdersTable(){
        DefaultTableModel model = (DefaultTableModel) orderManOrderTable.getModel();
        model.setRowCount(0);
        ordersList = operatingSystem.getOrderDirectory().stream()
                            .filter(order -> order.getStoreId().equals(storeManager.getManagingStoreId()))
                            .toList();
         
        for (Order order : ordersList){

            Object[] row =  new Object[8];
            row[0] = order.getOrderId();
            row[1] = order.getStatus();
            row[2] = order.getWeaponID();
            row[3] = operatingSystem.getWeaponDirectory().stream().filter(w -> w.getWeaponId().equals(order.getWeaponID())).findFirst().orElse(null).getName();
            row[4] = order.getQuantity();

            model.addRow(row);
            
        }
    }

}
