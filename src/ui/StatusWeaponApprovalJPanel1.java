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
import model.regulator.Report;
import model.root.Person;
import model.root.Weapon;

/**
 *
 * @author pho3nix28
 */
public class StatusWeaponApprovalJPanel1 extends javax.swing.JPanel {
    
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    /**
     * Creates new form WeaponApprovalJPanel
     */
    public StatusWeaponApprovalJPanel1(){
        
    }
    public StatusWeaponApprovalJPanel1(OperatingSystem operatingSystem,Db4oUtils dB4OUtility) {
        initComponents();
        this.operatingSystem = operatingSystem;
        this.dB4OUtility = dB4OUtility;
        populateTable();
        populateReportTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        weaponReportTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        weaponAppSelectButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        weaponAppWeaponListTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 33, 35));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Weapon Approval Management");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weapon List:");

        weaponReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ReportID", "Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Approved"
            }
        ));
        jScrollPane1.setViewportView(weaponReportTable);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        weaponAppSelectButton.setBackground(new java.awt.Color(126, 87, 194));
        weaponAppSelectButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        weaponAppSelectButton.setForeground(new java.awt.Color(255, 255, 255));
        weaponAppSelectButton.setText("Select");
        weaponAppSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weaponAppSelectButtonActionPerformed(evt);
            }
        });

        weaponAppWeaponListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "WeaponID", "Name", "Type", "ReportID"
            }
        ));
        jScrollPane2.setViewportView(weaponAppWeaponListTable);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Report List:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(weaponAppSelectButton)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weaponAppSelectButton)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void weaponAppSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weaponAppSelectButtonActionPerformed
        // TODO add your handling code here:
        int selected = weaponAppWeaponListTable.getSelectedRow();
        List<Weapon> weapon = operatingSystem.getWeaponDirectory().stream().toList();
        Weapon w = weapon.get(selected);
        
        populateReportTable(w);
        
    }//GEN-LAST:event_weaponAppSelectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton weaponAppSelectButton;
    private javax.swing.JTable weaponAppWeaponListTable;
    private javax.swing.JTable weaponReportTable;
    // End of variables declaration//GEN-END:variables
private void populateTable(){
    
    DefaultTableModel model = (DefaultTableModel) weaponAppWeaponListTable.getModel();
        model.setRowCount(0);
        List<Weapon> weapons = operatingSystem.getWeaponDirectory();
         
        for (Weapon weapon : weapons){

            Object[] row =  new Object[8];
            row[0] = weapon.getWeaponId();
            row[1] = weapon.getName();
            row[2] = weapon.getType();
            row[3] = weapon.getReportId();

            model.addRow(row);


        }
        
    }
private void populateReportTable(){
    
    DefaultTableModel model = (DefaultTableModel) weaponReportTable.getModel();
    model.setRowCount(0);
    List<Report> reports = operatingSystem.getReportDirectory();
            
        for(Report report: reports){
            Object[] row =  new Object[8];
            row[0] = report.getReportId();
            row[1] = report.isTest1();
            row[2] = report.isTest2();
            row[3] = report.isTest3();
            row[4] = report.isTest4();
            row[5] = report.isTest5();
            row[6] = report.isApproved();

            model.addRow(row);
        }
    }

private void populateReportTable(Weapon w){
    
    DefaultTableModel model = (DefaultTableModel) weaponReportTable.getModel();
    model.setRowCount(0);
    List<Report> reports = operatingSystem.getReportDirectory().stream()
            .filter(r -> r.getReportId().equals(w.getReportId())).toList();
    if(reports.size() == 0){
        model.setRowCount(0);
    }else{
        for(Report report: reports){
            Object[] row =  new Object[8];
            row[0] = report.getReportId();
            row[1] = report.isTest1();
            row[2] = report.isTest2();
            row[3] = report.isTest3();
            row[4] = report.isTest4();
            row[5] = report.isTest5();
            row[6] = report.isApproved();

            model.addRow(row);
        }
    }
}
        
}

