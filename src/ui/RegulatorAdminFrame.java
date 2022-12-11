/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.root.RegulatorAdmin;
import static ui.MainFrame.mainFrame;

/**
 *
 * @author pho3nix28
 */
public class RegulatorAdminFrame extends javax.swing.JFrame {
    
    public static JFrame regAdminFrame;
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    RegulatorAdmin ra;
    /**
     * Creates new form RegulatorAdmin
     */
    public RegulatorAdminFrame() {
    
    }   
        public RegulatorAdminFrame(Db4oUtils db ,OperatingSystem os, RegulatorAdmin ra) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        this.ra = ra;
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
        regAdminApprovalManagerButton = new javax.swing.JButton();
        regAdminCreateEmployeeButton = new javax.swing.JButton();
        regAdminTestingButton = new javax.swing.JButton();
        regAdminLogoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        regAdminApprovalManagerButton.setBackground(new java.awt.Color(126, 87, 194));
        regAdminApprovalManagerButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regAdminApprovalManagerButton.setForeground(new java.awt.Color(255, 255, 255));
        regAdminApprovalManagerButton.setText("Approval Manager");
        regAdminApprovalManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAdminApprovalManagerButtonActionPerformed(evt);
            }
        });

        regAdminCreateEmployeeButton.setBackground(new java.awt.Color(126, 87, 194));
        regAdminCreateEmployeeButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regAdminCreateEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        regAdminCreateEmployeeButton.setText("Create Employee");
        regAdminCreateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAdminCreateEmployeeButtonActionPerformed(evt);
            }
        });

        regAdminTestingButton.setBackground(new java.awt.Color(126, 87, 194));
        regAdminTestingButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regAdminTestingButton.setForeground(new java.awt.Color(255, 255, 255));
        regAdminTestingButton.setText("Testing");
        regAdminTestingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAdminTestingButtonActionPerformed(evt);
            }
        });

        regAdminLogoutButton.setBackground(new java.awt.Color(126, 87, 194));
        regAdminLogoutButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regAdminLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        regAdminLogoutButton.setText("Logout");
        regAdminLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAdminLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regAdminCreateEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regAdminTestingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regAdminLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regAdminApprovalManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(regAdminCreateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regAdminApprovalManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regAdminTestingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regAdminLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Regulator Admin Dashboard");

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
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
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

    private void regAdminLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAdminLogoutButtonActionPerformed
        // TODO add your handling code here:
        RegulatorAdminFrame.regAdminFrame.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_regAdminLogoutButtonActionPerformed

    private void regAdminApprovalManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAdminApprovalManagerButtonActionPerformed
        // TODO add your handling code here:
        WeaponApprovalJPanel ordcr = new WeaponApprovalJPanel();
        splitPane.setRightComponent(ordcr);
        
    }//GEN-LAST:event_regAdminApprovalManagerButtonActionPerformed

    private void regAdminCreateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAdminCreateEmployeeButtonActionPerformed
        // TODO add your handling code here:
        
        RegulatorEmployeeManagement ordcr = new RegulatorEmployeeManagement(dB4OUtility,operatingSystem);
        splitPane.setRightComponent(ordcr);
    }//GEN-LAST:event_regAdminCreateEmployeeButtonActionPerformed

    private void regAdminTestingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAdminTestingButtonActionPerformed
        // TODO add your handling code here:
        WeaponTestingPanel ordcr = new WeaponTestingPanel();
        splitPane.setRightComponent(ordcr);
        
    }//GEN-LAST:event_regAdminTestingButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegulatorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegulatorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegulatorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegulatorAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(regAdminFrame == null){
                    regAdminFrame = new RegulatorAdminFrame();
                }
                
                regAdminFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JButton regAdminApprovalManagerButton;
    private javax.swing.JButton regAdminCreateEmployeeButton;
    private javax.swing.JButton regAdminLogoutButton;
    private javax.swing.JButton regAdminTestingButton;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}