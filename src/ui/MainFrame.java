/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.JFrame;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.dealer.Inventory;
import model.dealer.Store;
import model.dealer.Transaction;
import model.root.Dealer;
import model.root.Enterprise;
import model.root.Enterprise.EnterpriseType;
import model.root.FulfillmentOfficer;
import model.root.Manufacturer;
import model.root.ManufacturerAdmin;
import model.root.Order;
import model.root.OrderManager;
import model.root.Person.UserRole;
import model.root.RegionalManager;
import model.root.Regulator;
import model.root.RegulatorAdmin;
import model.root.Supplier;
import model.root.SupplierAdmin;
import model.root.Weapon;

/**
 *
 * @author manavhirey
 */
public class MainFrame extends javax.swing.JFrame {
    
    public static JFrame mainFrame;
    private OperatingSystem operatingSystem;
    private Db4oUtils dB4OUtility = Db4oUtils.getInstance();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.operatingSystem = dB4OUtility.retrieveSystem();
        System.out.println(this.operatingSystem);
        createStaticUsers();
    }
    
    public void createStaticUsers(){
//        Dealer dealer = (Dealer) operatingSystem.getEnterpriseDirectory().stream()
//            .filter(e -> e.getEnterpriseType().equals(EnterpriseType.DEALER.name()))
//            .findFirst().orElse(null);
//        RegionalManager rmdef = new RegionalManager(dealer.getEnterpriseId(), 12345698, UUID.randomUUID().toString(),"Second regional admin","Female", new Date(), 123456789, "regionaladmin456@gmail.com", "Boston", "newregionaladmin", "admin123", UserRole.REGIONAL_MANAGER.name());
//        operatingSystem.addPersonToPersonDirectory(rmdef);
//        dB4OUtility.storeSystem(operatingSystem);
//
//        Dealer dealer = new Dealer(UUID.randomUUID().toString(),"Dealer", EnterpriseType.DEALER.name());
//        operatingSystem.addEnterprisetoEnterpriseDirectory(dealer);
//        dB4OUtility.storeSystem(operatingSystem);
//
//        Regulator regulator = new Regulator(UUID.randomUUID().toString(),"Regulator", EnterpriseType.REGULATOR.name());
//        operatingSystem.addEnterprisetoEnterpriseDirectory(regulator);
//        dB4OUtility.storeSystem(operatingSystem);
//
//        Manufacturer manufacturer = new Manufacturer(UUID.randomUUID().toString(),"Manufacturer", EnterpriseType.MANUFACTURER.name());
//        operatingSystem.addEnterprisetoEnterpriseDirectory(manufacturer);
//        dB4OUtility.storeSystem(operatingSystem);
//
//        Supplier supplier = new Supplier(UUID.randomUUID().toString(),"Supplier", EnterpriseType.SUPPLIER.name());
//        operatingSystem.addEnterprisetoEnterpriseDirectory(supplier);
//        dB4OUtility.storeSystem(operatingSystem);
//          
//        RegulatorAdmin rgdef = new RegulatorAdmin("", 7843578, UUID.randomUUID().toString(),"Regulator Admin","Binnary", new Date(), 123456789, "regulatoradmin123@gmail.com", "Boston", "regulatoradmin", "admin123", UserRole.REGULATOR_SYSADMIN.name());
//        operatingSystem.addPersonToPersonDirectory(rgdef);
//        dB4OUtility.storeSystem(operatingSystem);
//
//        ManufacturerAdmin madef = new ManufacturerAdmin("", 7843578, UUID.randomUUID().toString(),"Regulator Admin","Binnary", new Date(), 123456789, "regulatoradmin123@gmail.com", "Boston", "manufadmin", "admin123", UserRole.MANUFACTURER_SYSADMIN.name());
//        operatingSystem.addPersonToPersonDirectory(madef);
//        dB4OUtility.storeSystem(operatingSystem);
//
//        Supplier sp = (Supplier) operatingSystem.getEnterpriseDirectory().stream()
//                                  .filter(e -> e.getEnterpriseType().equals(EnterpriseType.SUPPLIER.name()))
//                                  .findFirst().orElse(null);
//        OrderManager om = new OrderManager(sp.getEnterpriseId(), 11113242, 
//                      UUID.randomUUID().toString(), "Order Manager",
//                      "Female", new Date(), 12345678, "ordermanager123@gmail.com","1189 Boylston Street", "ordermanager123", "admin123", UserRole.ORDER_MANAGER.name());
//        operatingSystem.addPersonToPersonDirectory(om);
//        dB4OUtility.storeSystem(operatingSystem);
//        Order order = operatingSystem.getOrderDirectory().stream().filter(o -> o.getOrderId().equals("b6c42956-9547-4b6e-b4e3-75cc33989894")).findFirst().orElse(null);
//        operatingSystem.deleteOrderFromOrderDirectory(order);
//        dB4OUtility.storeSystem(operatingSystem);
//          
//          SupplierAdmin sup = (SupplierAdmin) operatingSystem.getPersonDirectory().stream()
//                              .filter(p -> p.getUsername().equals("supplieradmin"))
//                              .findFirst().orElse(null);
//          operatingSystem.deletePersonFromPersonDirectory(sup);
//          
//            Supplier sp = (Supplier) operatingSystem.getEnterpriseDirectory().stream()
//                            .filter(e -> e.getEnterpriseType().equals(EnterpriseType.SUPPLIER.name()))
//                            .findFirst().orElse(null);
//          SupplierAdmin supad = new SupplierAdmin(sp.getEnterpriseId(), 7843578, UUID.randomUUID().toString(),"Supplier Admin","Other", new Date(), 123456789, "supplieradmin123@gmail.com", "Boston", "supplieradmin", "admin123", UserRole.SUPPLIER_SYSADMIN.name());
//          operatingSystem.addPersonToPersonDirectory(supad);
//          dB4OUtility.storeSystem(operatingSystem);
//            operatingSystem.setTransactionDirectory(new ArrayList<Transaction>());
//            dB4OUtility.storeSystem(operatingSystem);
        FulfillmentOfficer full = (FulfillmentOfficer) operatingSystem.getPersonDirectory().stream().filter(p -> p.getUsername().equals("fullofficer123")).findFirst().orElse(null);
        System.out.println(full.getEnterpriseId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        mainLoginButton = new javax.swing.JButton();
        mainRegisterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Weapon Management System");

        mainLoginButton.setBackground(new java.awt.Color(126, 87, 194));
        mainLoginButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        mainLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        mainLoginButton.setText("Login");
        mainLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainLoginButtonActionPerformed(evt);
            }
        });

        mainRegisterButton.setBackground(new java.awt.Color(126, 87, 194));
        mainRegisterButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        mainRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        mainRegisterButton.setText("Register");
        mainRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainRegisterButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Not a Customer? ");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register Here:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sign In here:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(mainRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblTitle)
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainLoginButtonActionPerformed
        // TODO add your handling code here:
        
        LoginFrame.loginFrame = new LoginFrame(dB4OUtility, operatingSystem);
        LoginFrame.loginFrame.setVisible(true);
        mainFrame.setVisible(false);
    }//GEN-LAST:event_mainLoginButtonActionPerformed

    private void mainRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainRegisterButtonActionPerformed
        // TODO add your handling code here:
        RegisterFrame.registerFrame = new RegisterFrame(dB4OUtility,operatingSystem);
        RegisterFrame.registerFrame.setVisible(true);
        mainFrame.setVisible(false);
    }//GEN-LAST:event_mainRegisterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton mainLoginButton;
    private javax.swing.JButton mainRegisterButton;
    // End of variables declaration//GEN-END:variables
}
