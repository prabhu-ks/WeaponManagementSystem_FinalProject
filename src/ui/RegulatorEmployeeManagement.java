/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.backend.Db4oUtils;
import model.backend.OperatingSystem;
import model.root.ApprovalOfficer;
import model.root.Enterprise.EnterpriseType;
import model.root.Person;
import model.root.Person.UserRole;
import model.root.Tester;

/**
 *
 * @author pho3nix28
 */
public class RegulatorEmployeeManagement extends javax.swing.JPanel {
    
    String gender;
    OperatingSystem operatingSystem;
    Db4oUtils dB4OUtility;
    /**
     * Creates new form RegulatorEmployeeManagement
     */
    
    public RegulatorEmployeeManagement(){
        
    }
    public RegulatorEmployeeManagement(Db4oUtils db ,OperatingSystem os) {
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

        regEmpManRoleCombo = new javax.swing.JComboBox<>();
        regEmpManCreateButton = new javax.swing.JButton();
        regEmpManUpdateButton = new javax.swing.JButton();
        regEmpManDeleteButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        regEmpManBirthText = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        regEmpManPhoneText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regEmpManEmailText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regEmpManAddressText = new javax.swing.JTextField();
        regEmpManUsernameText = new javax.swing.JTextField();
        regEmpManPasswordText = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regEmpManMaleRadioButton = new javax.swing.JRadioButton();
        regEmpManFemaleRadioButton = new javax.swing.JRadioButton();
        regEmpManOtherRadioButton = new javax.swing.JRadioButton();
        regEmpManNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        regEmpManViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitle1 = new javax.swing.JLabel();
        regEmpManSsnText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 33, 35));

        regEmpManRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TESTER", "APPROVAL OFFICER"}));

        regEmpManCreateButton.setBackground(new java.awt.Color(126, 87, 194));
        regEmpManCreateButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regEmpManCreateButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManCreateButton.setText("Create");
        regEmpManCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManCreateButtonActionPerformed(evt);
            }
        });

        regEmpManUpdateButton.setBackground(new java.awt.Color(126, 87, 194));
        regEmpManUpdateButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regEmpManUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManUpdateButton.setText("Update");
        regEmpManUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManUpdateButtonActionPerformed(evt);
            }
        });

        regEmpManDeleteButton.setBackground(new java.awt.Color(126, 87, 194));
        regEmpManDeleteButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regEmpManDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManDeleteButton.setText("Delete");
        regEmpManDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManDeleteButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone Number:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        regEmpManPhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManPhoneTextActionPerformed(evt);
            }
        });
        regEmpManPhoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regEmpManPhoneTextKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address:");

        regEmpManEmailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regEmpManEmailTextFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");

        regEmpManAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManAddressTextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Birth:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Role:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender:");

        regEmpManMaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManMaleRadioButton.setText("Male");
        regEmpManMaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManMaleRadioButtonActionPerformed(evt);
            }
        });

        regEmpManFemaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManFemaleRadioButton.setText("Female");
        regEmpManFemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManFemaleRadioButtonActionPerformed(evt);
            }
        });

        regEmpManOtherRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManOtherRadioButton.setText("Other");
        regEmpManOtherRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManOtherRadioButtonActionPerformed(evt);
            }
        });

        regEmpManNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regEmpManNameTextFocusLost(evt);
            }
        });
        regEmpManNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regEmpManNameTextKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");

        regEmpManViewButton.setBackground(new java.awt.Color(126, 87, 194));
        regEmpManViewButton.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        regEmpManViewButton.setForeground(new java.awt.Color(255, 255, 255));
        regEmpManViewButton.setText("View");
        regEmpManViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpManViewButtonActionPerformed(evt);
            }
        });

        tblEmployee.setBackground(new java.awt.Color(255, 255, 255));
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Employee Management");

        regEmpManSsnText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regEmpManSsnTextFocusLost(evt);
            }
        });
        regEmpManSsnText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regEmpManSsnTextKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SSN:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regEmpManNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(regEmpManViewButton)))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(regEmpManCreateButton)
                        .addGap(30, 30, 30)
                        .addComponent(regEmpManUpdateButton)
                        .addGap(31, 31, 31)
                        .addComponent(regEmpManDeleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regEmpManSsnText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(regEmpManMaleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regEmpManFemaleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regEmpManOtherRadioButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(regEmpManPasswordText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regEmpManPhoneText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regEmpManBirthText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regEmpManEmailText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regEmpManAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regEmpManUsernameText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regEmpManRoleCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 56, 56)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regEmpManViewButton)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(regEmpManNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(regEmpManSsnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(regEmpManMaleRadioButton)
                    .addComponent(regEmpManFemaleRadioButton)
                    .addComponent(regEmpManOtherRadioButton))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(regEmpManBirthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regEmpManPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regEmpManEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regEmpManAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regEmpManUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regEmpManPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regEmpManRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regEmpManCreateButton)
                    .addComponent(regEmpManUpdateButton)
                    .addComponent(regEmpManDeleteButton))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regEmpManDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManDeleteButtonActionPerformed
        // TODO add your handling code here:
        int selected = tblEmployee.getSelectedRow();
        List<Person> person = operatingSystem.getPersonDirectory().stream()
                .filter(p -> UserRole.valueOf(p.getRole()).equals(UserRole.TESTER) || UserRole.valueOf(p.getRole()).equals(UserRole.APPROVAL_OFFICER)).toList();
        Person p = person.get(selected);
        

        operatingSystem.deletePersonFromPersonDirectory(p);
         dB4OUtility.storeSystem(operatingSystem);

            
        JOptionPane.showMessageDialog(this, "Employee Data Deleted!!!");

        populateTable();

        regEmpManNameText.setText("");
        regEmpManSsnText.setText("");
        regEmpManMaleRadioButton.setSelected(false);
        regEmpManFemaleRadioButton.setSelected(false);
        regEmpManOtherRadioButton.setSelected(false);
        regEmpManPhoneText.setText("");
        regEmpManEmailText.setText("");
        regEmpManAddressText.setText("");
        regEmpManUsernameText.setText("");
        regEmpManPasswordText.setText("");
        regEmpManBirthText.setCalendar(null);
    }//GEN-LAST:event_regEmpManDeleteButtonActionPerformed

    private void regEmpManPhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManPhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmpManPhoneTextActionPerformed

    private void regEmpManPhoneTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regEmpManPhoneTextKeyPressed
        // TODO add your handling code here:

        String phoneNumber = regEmpManPhoneText.getText();
        int lengthOfNumber = phoneNumber.length();
        char checkChar = evt.getKeyChar();
        if (checkChar >= '0' && checkChar <= '9') {
            if (lengthOfNumber < 10) {
                regEmpManPhoneText.setEditable(true);
            } else {
                regEmpManPhoneText.setEditable(false);
                JOptionPane.showMessageDialog(this, "Cannot add more than 10 Numbers!");
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                regEmpManPhoneText.setEditable(true);
            } else {
                regEmpManPhoneText.setEditable(false);
            }
        }
    }//GEN-LAST:event_regEmpManPhoneTextKeyPressed

    private void regEmpManEmailTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regEmpManEmailTextFocusLost
        // TODO add your handling code here:

        String emailFormat ="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."+ "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern employeeEmail = Pattern.compile(emailFormat) ;
        Matcher employeeEmailMatch = employeeEmail.matcher(regEmpManEmailText.getText());

        if (!employeeEmailMatch.matches()){
            JOptionPane.showMessageDialog(null,"Invalid Email!");
            regEmpManEmailText.setText("");
        }
    }//GEN-LAST:event_regEmpManEmailTextFocusLost

    private void regEmpManMaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManMaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(regEmpManMaleRadioButton.isSelected()){
            gender = "Male";
            regEmpManFemaleRadioButton.setSelected(false);
            regEmpManOtherRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_regEmpManMaleRadioButtonActionPerformed

    private void regEmpManFemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManFemaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(regEmpManFemaleRadioButton.isSelected()){
            gender = "Female";
            regEmpManMaleRadioButton.setSelected(false);
            regEmpManOtherRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_regEmpManFemaleRadioButtonActionPerformed

    private void regEmpManOtherRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManOtherRadioButtonActionPerformed
        // TODO add your handling code here:
        if(regEmpManOtherRadioButton.isSelected()){
            gender = "Other";
            regEmpManMaleRadioButton.setSelected(false);
            regEmpManFemaleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_regEmpManOtherRadioButtonActionPerformed

    private void regEmpManNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regEmpManNameTextFocusLost
        // TODO add your handling code here:

        Pattern p = Pattern.compile("[^A-Za-z ]");
        Matcher m = p.matcher(regEmpManNameText.getText());
        // boolean b = m.matches();
        boolean b = m.find();
        if (b){
            JOptionPane.showMessageDialog(null,"Special Characters are not allowed.");
            regEmpManNameText.setText("");
        }
    }//GEN-LAST:event_regEmpManNameTextFocusLost

    private void regEmpManNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regEmpManNameTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmpManNameTextKeyPressed

    private void regEmpManViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManViewButtonActionPerformed
        // TODO add your handling code here:
        regEmpManMaleRadioButton.setSelected(false);
        regEmpManFemaleRadioButton.setSelected(false);
        regEmpManOtherRadioButton.setSelected(false);
        
        int selected = tblEmployee.getSelectedRow();
        List<Person> person = operatingSystem.getPersonDirectory().stream()
                .filter(p -> UserRole.valueOf(p.getRole()).equals(UserRole.TESTER) || UserRole.valueOf(p.getRole()).equals(UserRole.APPROVAL_OFFICER)).toList();
        Person p = person.get(selected);
        
        regEmpManNameText.setText(p.getName());
        regEmpManSsnText.setText(String.valueOf(p.getSsn()));
        regEmpManPhoneText.setText(String.valueOf(p.getPhoneNo()));
        regEmpManEmailText.setText(p.getEmail());
        regEmpManAddressText.setText(p.getAddress());
        regEmpManUsernameText.setText(p.getUsername());
        regEmpManPasswordText.setText(p.getPassword());
        regEmpManBirthText.setDate(p.getDob());
        regEmpManRoleCombo.setSelectedItem(p.getRole());
        
        if(gender == "Male"){
            regEmpManMaleRadioButton.setSelected(true);
        }
        if(gender == "Female"){
            regEmpManFemaleRadioButton.setSelected(true);
        }
        if(gender == "Other"){
            regEmpManOtherRadioButton.setSelected(true);
        }
    }//GEN-LAST:event_regEmpManViewButtonActionPerformed

    private void regEmpManAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmpManAddressTextActionPerformed

    private void regEmpManCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManCreateButtonActionPerformed
        // TODO add your handling code here:
        String name = regEmpManNameText.getText();
        long ssn = Long.parseLong(regEmpManSsnText.getText());
        String personGender = gender;
        Date dob = regEmpManBirthText.getDate();
        long phoneNumber = Long.parseLong(regEmpManPhoneText.getText());
        String email = regEmpManEmailText.getText();
        String address = regEmpManAddressText.getText();
        String username = regEmpManUsernameText.getText();
        String password = new String(regEmpManPasswordText.getPassword());
        String uuid = UUID.randomUUID().toString();
        String role = regEmpManRoleCombo.getSelectedItem().toString();
        if(role.equals("TESTER")){
            
            String dealerId = operatingSystem.getEnterpriseDirectory().stream()
                    .filter(ent -> EnterpriseType.valueOf(ent.getEnterpriseType()).equals(EnterpriseType.REGULATOR))
                    .findFirst()
                    .orElse(null).getEnterpriseId();
            Person person = new Tester(dealerId, ssn, uuid, name, personGender, dob, phoneNumber, email, address, username, password, Person.UserRole.TESTER.name());
            operatingSystem.addPersonToPersonDirectory(person);
            dB4OUtility.storeSystem(operatingSystem);
            OperatingSystem os= dB4OUtility.retrieveSystem();
            
        }
        if(role.equals("APPROVAL OFFICER")){
            
            String dealerId = operatingSystem.getEnterpriseDirectory().stream()
                    .filter(ent -> EnterpriseType.valueOf(ent.getEnterpriseType()).equals(EnterpriseType.REGULATOR))
                    .findFirst()
                    .orElse(null).getEnterpriseId();
            Person person = new ApprovalOfficer(dealerId, ssn, uuid, name, personGender, dob, phoneNumber, email, address, username, password, Person.UserRole.APPROVAL_OFFICER.name());
            operatingSystem.addPersonToPersonDirectory(person);
            dB4OUtility.storeSystem(operatingSystem);
            OperatingSystem os= dB4OUtility.retrieveSystem();
            
        }
        
        JOptionPane.showMessageDialog(this, "Data Created");
        populateTable();
        regEmpManNameText.setText("");
        regEmpManSsnText.setText("");
        regEmpManMaleRadioButton.setSelected(false);
        regEmpManFemaleRadioButton.setSelected(false);
        regEmpManOtherRadioButton.setSelected(false);
        regEmpManPhoneText.setText("");
        regEmpManEmailText.setText("");
        regEmpManAddressText.setText("");
        regEmpManUsernameText.setText("");
        regEmpManPasswordText.setText("");
        regEmpManBirthText.setCalendar(null);
    }//GEN-LAST:event_regEmpManCreateButtonActionPerformed

    private void regEmpManSsnTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regEmpManSsnTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmpManSsnTextFocusLost

    private void regEmpManSsnTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regEmpManSsnTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmpManSsnTextKeyPressed

    private void regEmpManUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpManUpdateButtonActionPerformed
        // TODO add your handling code here:
        int selected = tblEmployee.getSelectedRow();
        List<Person> person = operatingSystem.getPersonDirectory().stream()
                .filter(p -> UserRole.valueOf(p.getRole()).equals(UserRole.TESTER) || UserRole.valueOf(p.getRole()).equals(UserRole.APPROVAL_OFFICER)).toList();
        Person p = person.get(selected);

        String name = regEmpManNameText.getText();
        long ssn = Long.parseLong(regEmpManSsnText.getText());
        String personGender = gender;
        Date dob = regEmpManBirthText.getDate();
        long phoneNumber = Long.parseLong(regEmpManPhoneText.getText());
        String email = regEmpManEmailText.getText();
        String address = regEmpManAddressText.getText();
        String username = regEmpManUsernameText.getText();
        String password = new String(regEmpManPasswordText.getPassword());
        String role = regEmpManRoleCombo.getSelectedItem().toString();
        
        if(role.equals("TESTER")){
            p.setName(name);
            p.setSsn(ssn);
            p.setGender(personGender);
            p.setDob(dob);
            p.setPhoneNo(phoneNumber);
            p.setEmail(email);
            p.setRole(UserRole.TESTER.name());
            p.setAddress(address);
            p.setUsername(username);
            p.setPassword(password);

        }
        
        if(role.equals("APPROVAL OFFICER")){
            p.setName(name);
            p.setSsn(ssn);
            p.setGender(personGender);
            p.setDob(dob);
            p.setPhoneNo(phoneNumber);
            p.setEmail(email);
            p.setRole(UserRole.APPROVAL_OFFICER.name());
            p.setAddress(address);
            p.setUsername(username);
            p.setPassword(password);

        }
        
        dB4OUtility.storeSystem(operatingSystem);
        populateTable();
        JOptionPane.showMessageDialog(this, "Data Updated");
        regEmpManNameText.setText("");
        regEmpManSsnText.setText("");
        regEmpManMaleRadioButton.setSelected(false);
        regEmpManFemaleRadioButton.setSelected(false);
        regEmpManOtherRadioButton.setSelected(false);
        regEmpManPhoneText.setText("");
        regEmpManEmailText.setText("");
        regEmpManAddressText.setText("");
        regEmpManUsernameText.setText("");
        regEmpManPasswordText.setText("");
        regEmpManBirthText.setCalendar(null);
    }//GEN-LAST:event_regEmpManUpdateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField regEmpManAddressText;
    private com.toedter.calendar.JDateChooser regEmpManBirthText;
    private javax.swing.JButton regEmpManCreateButton;
    private javax.swing.JButton regEmpManDeleteButton;
    private javax.swing.JTextField regEmpManEmailText;
    private javax.swing.JRadioButton regEmpManFemaleRadioButton;
    private javax.swing.JRadioButton regEmpManMaleRadioButton;
    private javax.swing.JTextField regEmpManNameText;
    private javax.swing.JRadioButton regEmpManOtherRadioButton;
    private javax.swing.JPasswordField regEmpManPasswordText;
    private javax.swing.JTextField regEmpManPhoneText;
    private javax.swing.JComboBox<String> regEmpManRoleCombo;
    private javax.swing.JTextField regEmpManSsnText;
    private javax.swing.JButton regEmpManUpdateButton;
    private javax.swing.JTextField regEmpManUsernameText;
    private javax.swing.JButton regEmpManViewButton;
    private javax.swing.JTable tblEmployee;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        List<Person> persons = operatingSystem.getPersonDirectory().stream()
            .filter( x -> UserRole.valueOf(x.getRole()).equals(UserRole.TESTER) || UserRole.valueOf(x.getRole()).equals(UserRole.APPROVAL_OFFICER))
            .toList();
         
        for (Person person : persons){

            Object[] row =  new Object[8];
            row[0] = person.getSsn();
            row[1] = person.getName();
            row[2] = person.getAddress();
            row[3] = person.getRole();
            row[4] = person.getPhoneNo();

            model.addRow(row);


        }
        
    }

}