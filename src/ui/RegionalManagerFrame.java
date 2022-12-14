/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.root.Person;
import model.root.RegionalManager;
import static ui.MainFrame.mainFrame;
import static ui.ShippingManagerFrame.shipFrame;

/**
 *
 * @author pho3nix28
 */
public class RegionalManagerFrame extends javax.swing.JFrame {
    
    public static JFrame regFrame;
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    RegionalManager rm;

    /**
     * Creates new form DealerDashboard
     */
    public RegionalManagerFrame() {
        initComponents();
    }
    
    public RegionalManagerFrame(Db4oUtils db ,OperatingSystem os, RegionalManager rm) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        this.rm = rm;
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
        splitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        regManStoreManButton = new javax.swing.JButton();
        regManLogoutButton = new javax.swing.JButton();
        regManEmployeeManagementButton = new javax.swing.JButton();
        regManSalesReportButton = new javax.swing.JButton();
        regManagerOrders = new javax.swing.JButton();
        regManIdCheckerButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));

        regManStoreManButton.setBackground(new java.awt.Color(126, 87, 194));
        regManStoreManButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regManStoreManButton.setForeground(new java.awt.Color(255, 255, 255));
        regManStoreManButton.setText("Store Management");
        regManStoreManButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regManStoreManButtonActionPerformed(evt);
            }
        });

        regManLogoutButton.setBackground(new java.awt.Color(126, 87, 194));
        regManLogoutButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regManLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        regManLogoutButton.setText("Logout");
        regManLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regManLogoutButtonActionPerformed(evt);
            }
        });

        regManEmployeeManagementButton.setBackground(new java.awt.Color(126, 87, 194));
        regManEmployeeManagementButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regManEmployeeManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        regManEmployeeManagementButton.setText("Employee Management");
        regManEmployeeManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regManEmployeeManagementButtonActionPerformed(evt);
            }
        });

        regManSalesReportButton.setBackground(new java.awt.Color(126, 87, 194));
        regManSalesReportButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regManSalesReportButton.setForeground(new java.awt.Color(255, 255, 255));
        regManSalesReportButton.setText("Sales report");
        regManSalesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regManSalesReportButtonActionPerformed(evt);
            }
        });

        regManagerOrders.setBackground(new java.awt.Color(126, 87, 194));
        regManagerOrders.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regManagerOrders.setForeground(new java.awt.Color(255, 255, 255));
        regManagerOrders.setText("Manage Orders");
        regManagerOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regManagerOrdersActionPerformed(evt);
            }
        });

        regManIdCheckerButton.setBackground(new java.awt.Color(126, 87, 194));
        regManIdCheckerButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regManIdCheckerButton.setForeground(new java.awt.Color(255, 255, 255));
        regManIdCheckerButton.setText("ID Checker");
        regManIdCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regManIdCheckerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regManEmployeeManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regManLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regManSalesReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regManStoreManButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regManagerOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regManIdCheckerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(regManEmployeeManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regManStoreManButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regManagerOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regManSalesReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regManIdCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(regManLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(32, 33, 35));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Weapon Management System");

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Regional Manager Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addComponent(lblTitle1)
                .addContainerGap(681, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regManStoreManButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regManStoreManButtonActionPerformed
        // TODO add your handling code here:
        StoreManagement ordcr = new StoreManagement(dB4OUtility,operatingSystem);
        splitPane.setRightComponent(ordcr);

     
    }//GEN-LAST:event_regManStoreManButtonActionPerformed

    private void regManLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regManLogoutButtonActionPerformed
        // TODO add your handling code here:
        RegionalManagerFrame.regFrame.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_regManLogoutButtonActionPerformed

    private void regManEmployeeManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regManEmployeeManagementButtonActionPerformed
        // TODO add your handling code here:
        RegionalEmployeeManagement ordcr = new RegionalEmployeeManagement(dB4OUtility , operatingSystem);
        splitPane.setRightComponent(ordcr);
        
    }//GEN-LAST:event_regManEmployeeManagementButtonActionPerformed

    private void regManSalesReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regManSalesReportButtonActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_regManSalesReportButtonActionPerformed

    private void regManagerOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regManagerOrdersActionPerformed
        // TODO add your handling code here:
        RegionalManagerOrders ordcr = new RegionalManagerOrders(dB4OUtility, operatingSystem, rm);
        splitPane.setRightComponent(ordcr);
    }//GEN-LAST:event_regManagerOrdersActionPerformed

    private void regManIdCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regManIdCheckerButtonActionPerformed
        // TODO add your handling code here:
        
        IdCheckerManager ordcr = new IdCheckerManager(dB4OUtility  ,operatingSystem);
        splitPane.setRightComponent(ordcr);
    }//GEN-LAST:event_regManIdCheckerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegionalManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegionalManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegionalManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegionalManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(regFrame == null){
                    regFrame = new RegionalManagerFrame();
                }
                
                regFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JButton regManEmployeeManagementButton;
    private javax.swing.JButton regManIdCheckerButton;
    private javax.swing.JButton regManLogoutButton;
    private javax.swing.JButton regManSalesReportButton;
    private javax.swing.JButton regManStoreManButton;
    private javax.swing.JButton regManagerOrders;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
