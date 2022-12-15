/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.dealer.Inventory;
import model.dealer.Store;
import model.dealer.Transaction;
import model.dealer.Transaction.OrderStatus;
import model.root.StoreManager;
import model.root.Weapon;

/**
 *
 * @author pho3nix28
 */
public class TransactionsJPanel extends javax.swing.JPanel {
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    StoreManager storeManager;
    List<Transaction> transactionsList;
    /**
     * Creates new form TransactionsJPanel
     */
    public TransactionsJPanel(Db4oUtils db ,OperatingSystem os, StoreManager sm) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        this.storeManager = sm;
        populateTable();
        populateTransactionsList();
        updateTransactionButton.setEnabled(false);
//        cmbStatus.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransactions = new javax.swing.JTable();
        viewTransactionButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtWeaponId = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        updateTransactionButton = new javax.swing.JButton();
        txtTrans = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 33, 35));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaction");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transactions:");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "WeaponID", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblTransactions);

        viewTransactionButton.setBackground(new java.awt.Color(126, 87, 194));
        viewTransactionButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        viewTransactionButton.setForeground(new java.awt.Color(255, 255, 255));
        viewTransactionButton.setText("View");
        viewTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransactionButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Weapon ID:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status:");

        txtWeaponId.setEditable(false);

        txtQuantity.setEditable(false);
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        updateTransactionButton.setBackground(new java.awt.Color(126, 87, 194));
        updateTransactionButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        updateTransactionButton.setForeground(new java.awt.Color(255, 255, 255));
        updateTransactionButton.setText("Update");
        updateTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTransactionButtonActionPerformed(evt);
            }
        });

        txtTrans.setEditable(false);
        txtTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TransactionID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(viewTransactionButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateTransactionButton)
                                    .addComponent(txtWeaponId)
                                    .addComponent(txtQuantity)
                                    .addComponent(cmbStatus, 0, 180, Short.MAX_VALUE)
                                    .addComponent(txtTrans))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewTransactionButton)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWeaponId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(updateTransactionButton)
                .addContainerGap(314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransactionButtonActionPerformed
        // TODO add your handling code here:
        int selected = tblTransactions.getSelectedRow();
//        List<Transaction> transaction = operatingSystem.getTransactionDirectory();
        Transaction t = transactionsList.get(selected);
        
        txtTrans.setText(t.getTransactionId());
        txtWeaponId.setText(t.getWeaponId());
        txtQuantity.setText(String.valueOf(t.getQuantity()));
        if(t.getOrderStatus().equals(OrderStatus.PLACED.name())){
            System.out.println("Order status is placed");
            cmbStatus.addItem(OrderStatus.PLACED.name());
            cmbStatus.addItem(OrderStatus.DELIVERED.name());
            cmbStatus.setSelectedIndex(0);
            System.out.println("Enabling combo box");
            cmbStatus.setEnabled(true);
            updateTransactionButton.setEnabled(true);
        }
        else{
            cmbStatus.addItem(OrderStatus.DELIVERED.name());
            cmbStatus.setSelectedIndex(0);
            cmbStatus.setEnabled(false);
        }
        
    }//GEN-LAST:event_viewTransactionButtonActionPerformed

    private void updateTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTransactionButtonActionPerformed
        // TODO add your handling code here:
        String selectedWeaponId = (String)txtWeaponId.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        String selectedTransaction = (String)txtTrans.getText();
        String transactionId = txtTrans.getText();
        
        Transaction transaction = transactionsList.stream().filter(t ->t.getTransactionId().equals(transactionId)).findFirst().orElse(null);

        if(cmbStatus.getSelectedItem().equals(OrderStatus.DELIVERED.name())){
            transaction.setOrderStatus(OrderStatus.DELIVERED.name());
            Store store = operatingSystem.getStoreDirectory().stream()
                        .filter(s -> s.getId().equals(storeManager.getManagingStoreId()))
                        .findFirst()
                        .orElse(null);
        
            Inventory inventory = store.getInventory();
            Weapon weapon = inventory.getWeaponsList().keySet().stream().filter(w -> w.getWeaponId().equals(transaction.getWeaponId())).findFirst().orElse(null);
            
            inventory.getWeaponsList().put(weapon, inventory.getWeaponsList().get(weapon)-transaction.getQuantity());
        
        }
        
        dB4OUtility.storeSystem(operatingSystem);
        
        txtTrans.setText("");
        txtWeaponId.setText("");
        txtQuantity.setText("");
        cmbStatus.removeAllItems();
        cmbStatus.setEnabled(false);
        populateTransactionsList();
 
        populateTable();
    }//GEN-LAST:event_updateTransactionButtonActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTransactions;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTrans;
    private javax.swing.JTextField txtWeaponId;
    private javax.swing.JButton updateTransactionButton;
    private javax.swing.JButton viewTransactionButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblTransactions.getModel();
        model.setRowCount(0);
        List<Transaction> transactions = operatingSystem.getTransactionDirectory().stream()
                .filter(t -> t.getStoreId().equals(storeManager.getManagingStoreId())).toList();
         
        for (Transaction transaction : transactions){

            Object[] row =  new Object[8];
            row[0] = transaction.getTransactionId();
            row[1] = transaction.getWeaponId();
            row[2] = transaction.getQuantity();
            row[3] = transaction.getOrderStatus();

            model.addRow(row);


        }
        
    }
    
    private void populateTransactionsList(){
        transactionsList = operatingSystem.getTransactionDirectory().stream()
                            .filter(t -> t.getStoreId().equals(storeManager.getManagingStoreId())).toList();
        
    }
    
}
