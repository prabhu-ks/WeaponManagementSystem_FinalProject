/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.root.Customer;
import model.root.Person;

/**
 *
 * @author pho3nix28
 */
public class IdCheckerManager extends javax.swing.JPanel {

    /**
     * Creates new form IdCheckerManager
     */
    
     OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    String selectedImagePath;
    public IdCheckerManager() {
    }
    
    public IdCheckerManager(Db4oUtils db ,OperatingSystem os) {
        initComponents();
        this.operatingSystem = os;
        this.dB4OUtility = db;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        idCheckCustomerListTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IdCheckViewCustomerButton = new javax.swing.JButton();
        idCheckCustNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idCheckBirthText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idCheckApprovedToBuyCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        idCheckSubmitButton = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 33, 35));

        idCheckCustomerListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Phone No", "Email", "Approval Status"
            }
        ));
        jScrollPane1.setViewportView(idCheckCustomerListTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Checker");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer List:");

        IdCheckViewCustomerButton.setBackground(new java.awt.Color(126, 87, 194));
        IdCheckViewCustomerButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        IdCheckViewCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        IdCheckViewCustomerButton.setText("View Customer");
        IdCheckViewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCheckViewCustomerButtonActionPerformed(evt);
            }
        });

        idCheckCustNameText.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Birth:");

        idCheckBirthText.setEditable(false);
        idCheckBirthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckBirthTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Proof");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Approved to Buy:");

        idCheckApprovedToBuyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        idCheckSubmitButton.setBackground(new java.awt.Color(126, 87, 194));
        idCheckSubmitButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        idCheckSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        idCheckSubmitButton.setText("Submit");
        idCheckSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckSubmitButtonActionPerformed(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(255, 255, 255));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 127, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idCheckSubmitButton)
                                    .addComponent(idCheckApprovedToBuyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IdCheckViewCustomerButton)
                                    .addComponent(idCheckCustNameText)
                                    .addComponent(idCheckBirthText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))))
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdCheckViewCustomerButton)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCheckCustNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idCheckBirthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idCheckApprovedToBuyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(idCheckSubmitButton)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IdCheckViewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCheckViewCustomerButtonActionPerformed
        // TODO add your handling code here:
        int selected = idCheckCustomerListTable.getSelectedRow();
        List<Person> persons = operatingSystem.getPersonDirectory().stream()
                .filter(p -> Person.UserRole.valueOf(p.getRole()).equals(Person.UserRole.CUSTOMER)).toList(); 
        Customer cust = (Customer) persons.get(selected);
        
        idCheckCustNameText.setText(cust.getName());
        idCheckBirthText.setText(cust.getDob().toString());
        selectedImagePath = cust.getSelectedImagePath();
        
        
        
        try {
           
            BufferedImage image = ImageIO.read(new File(selectedImagePath));
            lblImage.setIcon(new ImageIcon(image.getScaledInstance(301, 180, Image.SCALE_DEFAULT)));  
        } catch (IOException excp) {
            Logger.getLogger(IdCheckerManager.class.getName()).log(Level.SEVERE, selectedImagePath, excp);
        }
        
        
                
        
    }//GEN-LAST:event_IdCheckViewCustomerButtonActionPerformed

    private void idCheckBirthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCheckBirthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCheckBirthTextActionPerformed

    private void idCheckSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCheckSubmitButtonActionPerformed
        // TODO add your handling code here:
        
        int selected = idCheckCustomerListTable.getSelectedRow();
        List<Person> persons = operatingSystem.getPersonDirectory().stream()
                .filter(p -> Person.UserRole.valueOf(p.getRole()).equals(Person.UserRole.CUSTOMER)).toList(); 
        Customer cust = (Customer) persons.get(selected);
        
        String approval = idCheckApprovedToBuyCombo.getSelectedItem().toString();
        if(approval.equals("true")){
        cust.setApprovalStatus(true);
        }
        
        if(approval.equals("falses")){
        cust.setApprovalStatus(false);
        }
        dB4OUtility.storeSystem(operatingSystem);
        populateTable();
       
        
        
    }//GEN-LAST:event_idCheckSubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IdCheckViewCustomerButton;
    private javax.swing.JComboBox<String> idCheckApprovedToBuyCombo;
    private javax.swing.JTextField idCheckBirthText;
    private javax.swing.JTextField idCheckCustNameText;
    private javax.swing.JTable idCheckCustomerListTable;
    private javax.swing.JButton idCheckSubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) idCheckCustomerListTable.getModel();
        model.setRowCount(0);
        List<Person> persons = operatingSystem.getPersonDirectory().stream()
                .filter(p -> Person.UserRole.valueOf(p.getRole()).equals(Person.UserRole.CUSTOMER)).toList();
         
        for ( Person person : persons){
            Customer c = (Customer) person;
            Object[] row =  new Object[8];
            row[0] = c.getName();
            row[1] = c.getPhoneNo();
            row[2] = c.getEmail();
            row[3] = c.approvalStatus;

            model.addRow(row);


        }
        
    }

}
