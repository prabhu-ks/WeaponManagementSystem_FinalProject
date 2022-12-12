/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.manufacturer.ManufacturerAdmin;
import static ui.MainFrame.mainFrame;

/**
 *
 * @author pho3nix28
 */
public class SupplierAdminFrame extends javax.swing.JFrame {

    public static JFrame manuAdminFrame;
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    ManufacturerAdmin ma;
    /**
     * Creates new form ManufacturerAdmin
     */
    
    public SupplierAdminFrame(){
    }

    public SupplierAdminFrame(Db4oUtils db ,OperatingSystem os, ManufacturerAdmin ma) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        this.ma = ma;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        manAdminCreateEmployeeButton = new javax.swing.JButton();
        manAdminLogoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        manAdminCreateEmployeeButton.setBackground(new java.awt.Color(126, 87, 194));
        manAdminCreateEmployeeButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        manAdminCreateEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        manAdminCreateEmployeeButton.setText("Create Employee");
        manAdminCreateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manAdminCreateEmployeeButtonActionPerformed(evt);
            }
        });

        manAdminLogoutButton.setBackground(new java.awt.Color(126, 87, 194));
        manAdminLogoutButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        manAdminLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        manAdminLogoutButton.setText("Logout");
        manAdminLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manAdminLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manAdminCreateEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(manAdminLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(manAdminCreateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(manAdminLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Manufacturer Admin Dashboard");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Weapon Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addComponent(lblTitle1)
                .addContainerGap(668, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manAdminCreateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manAdminCreateEmployeeButtonActionPerformed
        // TODO add your handling code here:

        SupplierEmployeeManagement ordcr = new SupplierEmployeeManagement(dB4OUtility ,operatingSystem);
        splitPane.setRightComponent(ordcr);
    }//GEN-LAST:event_manAdminCreateEmployeeButtonActionPerformed

    private void manAdminLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manAdminLogoutButtonActionPerformed
        // TODO add your handling code here:
        SupplierAdminFrame.manuAdminFrame.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_manAdminLogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManufacturerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManufacturerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManufacturerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManufacturerAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(manuAdminFrame == null){
                    manuAdminFrame = new RegulatorAdminFrame();
                }
                
                manuAdminFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JButton manAdminCreateEmployeeButton;
    private javax.swing.JButton manAdminLogoutButton;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
