/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import static ui.IdCheckerJFrame.idcheckFrame;
import static ui.MainFrame.mainFrame;

/**
 *
 * @author pho3nix28
 */
public class ApprovalManager extends javax.swing.JFrame {
    
    public static JFrame apprFrame;

    /**
     * Creates new form ApprovalManager
     */
    public ApprovalManager() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        appManLogoutButton = new javax.swing.JButton();
        appManWeaponApprovalButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));

        appManLogoutButton.setBackground(new java.awt.Color(126, 87, 194));
        appManLogoutButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        appManLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        appManLogoutButton.setText("Logout");
        appManLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appManLogoutButtonActionPerformed(evt);
            }
        });

        appManWeaponApprovalButton.setBackground(new java.awt.Color(126, 87, 194));
        appManWeaponApprovalButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        appManWeaponApprovalButton.setForeground(new java.awt.Color(255, 255, 255));
        appManWeaponApprovalButton.setText("Weapon Approval");
        appManWeaponApprovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appManWeaponApprovalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appManWeaponApprovalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(appManLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(appManWeaponApprovalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(appManLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
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
        lblTitle1.setText("Approval Manager Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addComponent(lblTitle1)
                .addContainerGap(668, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appManLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appManLogoutButtonActionPerformed
        // TODO add your handling code here:
        ApprovalManager.apprFrame.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_appManLogoutButtonActionPerformed

    private void appManWeaponApprovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appManWeaponApprovalButtonActionPerformed
        // TODO add your handling code here:
        WeaponApprovalJPanel ordcr = new WeaponApprovalJPanel();
        splitPane.setRightComponent(ordcr);
    }//GEN-LAST:event_appManWeaponApprovalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ApprovalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApprovalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApprovalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApprovalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(apprFrame == null){
                    apprFrame = new ApprovalManager();
                }
                
                apprFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appManLogoutButton;
    private javax.swing.JButton appManWeaponApprovalButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
