/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.personProfile;

/**
 *
 * @author asus
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewJPanel
     */
    
     personProfile personprofile;
    
    public ViewJPanel(personProfile personprofile) {
        initComponents();
        
        this.personprofile = personprofile;
        displayPersonProfile();
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
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lbltelephoneNumber = new javax.swing.JLabel();
        lblFAXNumber = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedicalRecordNum = new javax.swing.JLabel();
        lblHealthPlanBeneficiaryNum = new javax.swing.JLabel();
        lblBankAccountNum = new javax.swing.JLabel();
        lblLiscenceNum = new javax.swing.JLabel();
        lblVechicalIdentifierNum = new javax.swing.JLabel();
        lblDeviceSerialNumber = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        lblUniqueIdentifierNumber = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        txtFAXNumber = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtSSNNumber = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtHealthPlanBeneficiaryNumber = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtLiscenceNumber = new javax.swing.JTextField();
        txtVechicalIdentifierNumber = new javax.swing.JTextField();
        txtDeviceSerialNumber = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIPAddress = new javax.swing.JTextField();
        txtUniqueIdentifierNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfAddress = new javax.swing.JTextArea();
        lblPhotoUpload = new javax.swing.JLabel();
        lblBiometricUpload = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Person Profile");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name: ");
        lblName.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblDOB.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDOB.setText("Date of Birth: ");
        lblDOB.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbltelephoneNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbltelephoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbltelephoneNumber.setText("Telephone Number: ");
        lbltelephoneNumber.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblFAXNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblFAXNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFAXNumber.setText("FAX Number: ");
        lblFAXNumber.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblEmailID.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailID.setText("Email ID: ");
        lblEmailID.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblSSN.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSSN.setText("SSN Number: ");
        lblSSN.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblMedicalRecordNum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblMedicalRecordNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMedicalRecordNum.setText("Medical Record Number: ");
        lblMedicalRecordNum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblHealthPlanBeneficiaryNum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblHealthPlanBeneficiaryNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHealthPlanBeneficiaryNum.setText("Health Plan Beneficiary Number: ");
        lblHealthPlanBeneficiaryNum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblBankAccountNum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblBankAccountNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBankAccountNum.setText("Bank Account Number: ");
        lblBankAccountNum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblLiscenceNum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblLiscenceNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLiscenceNum.setText("Liscence Number:  ");
        lblLiscenceNum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblVechicalIdentifierNum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblVechicalIdentifierNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVechicalIdentifierNum.setText("Vechical Identifier Number: ");
        lblVechicalIdentifierNum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblDeviceSerialNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblDeviceSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDeviceSerialNumber.setText("Device Serial Number: ");
        lblDeviceSerialNumber.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblLinkedIn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblLinkedIn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLinkedIn.setText("LinkedIn: ");
        lblLinkedIn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblIPAddress.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIPAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblIPAddress.setText("IP Address: ");
        lblIPAddress.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblUniqueIdentifierNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblUniqueIdentifierNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUniqueIdentifierNumber.setText("Unique Identifier Number: ");
        lblUniqueIdentifierNumber.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtTelephoneNumber.setEditable(false);
        txtTelephoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneNumberActionPerformed(evt);
            }
        });

        txtFAXNumber.setEditable(false);
        txtFAXNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAXNumberActionPerformed(evt);
            }
        });

        txtEmailID.setEditable(false);
        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        txtSSNNumber.setEditable(false);
        txtSSNNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNNumberActionPerformed(evt);
            }
        });

        txtMedicalRecordNumber.setEditable(false);
        txtMedicalRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNumberActionPerformed(evt);
            }
        });

        txtHealthPlanBeneficiaryNumber.setEditable(false);
        txtHealthPlanBeneficiaryNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthPlanBeneficiaryNumberActionPerformed(evt);
            }
        });

        txtBankAccountNumber.setEditable(false);
        txtBankAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccountNumberActionPerformed(evt);
            }
        });

        txtLiscenceNumber.setEditable(false);
        txtLiscenceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiscenceNumberActionPerformed(evt);
            }
        });

        txtVechicalIdentifierNumber.setEditable(false);
        txtVechicalIdentifierNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVechicalIdentifierNumberActionPerformed(evt);
            }
        });

        txtDeviceSerialNumber.setEditable(false);
        txtDeviceSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceSerialNumberActionPerformed(evt);
            }
        });

        txtLinkedIn.setEditable(false);
        txtLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedInActionPerformed(evt);
            }
        });

        txtIPAddress.setEditable(false);
        txtIPAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPAddressActionPerformed(evt);
            }
        });

        txtUniqueIdentifierNumber.setEditable(false);
        txtUniqueIdentifierNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdentifierNumberActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Address: ");

        txtfAddress.setEditable(false);
        txtfAddress.setColumns(20);
        txtfAddress.setRows(5);
        jScrollPane1.setViewportView(txtfAddress);

        lblPhotoUpload.setText("Photo Upload: ");

        lblBiometricUpload.setText("Biometric :");

        txtDOB.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUniqueIdentifierNumber)
                            .addComponent(lblIPAddress)
                            .addComponent(lblLinkedIn)
                            .addComponent(lblDeviceSerialNumber)
                            .addComponent(lblVechicalIdentifierNum)
                            .addComponent(lblLiscenceNum)
                            .addComponent(lblBankAccountNum)
                            .addComponent(lblHealthPlanBeneficiaryNum)
                            .addComponent(lblMedicalRecordNum)
                            .addComponent(lblSSN)
                            .addComponent(lblEmailID)
                            .addComponent(lblFAXNumber)
                            .addComponent(lbltelephoneNumber)
                            .addComponent(lblDOB)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLinkedIn)
                            .addComponent(txtDeviceSerialNumber)
                            .addComponent(txtVechicalIdentifierNumber)
                            .addComponent(txtLiscenceNumber)
                            .addComponent(txtBankAccountNumber)
                            .addComponent(txtHealthPlanBeneficiaryNumber)
                            .addComponent(txtMedicalRecordNumber)
                            .addComponent(txtSSNNumber)
                            .addComponent(txtEmailID)
                            .addComponent(txtFAXNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtTelephoneNumber)
                            .addComponent(txtIPAddress)
                            .addComponent(txtUniqueIdentifierNumber)
                            .addComponent(txtName)
                            .addComponent(txtDOB))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPhotoUpload)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBiometricUpload))
                            .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBankAccountNum, lblDOB, lblDeviceSerialNumber, lblEmailID, lblFAXNumber, lblHealthPlanBeneficiaryNum, lblIPAddress, lblLinkedIn, lblLiscenceNum, lblMedicalRecordNum, lblName, lblSSN, lblUniqueIdentifierNumber, lblVechicalIdentifierNum, lbltelephoneNumber});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBankAccountNumber, txtDeviceSerialNumber, txtEmailID, txtFAXNumber, txtHealthPlanBeneficiaryNumber, txtIPAddress, txtLinkedIn, txtLiscenceNumber, txtMedicalRecordNumber, txtName, txtSSNNumber, txtTelephoneNumber, txtUniqueIdentifierNumber, txtVechicalIdentifierNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltelephoneNumber)
                            .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFAXNumber)
                            .addComponent(txtFAXNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailID)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhotoUpload))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSSN)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMedicalRecordNum)
                                    .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHealthPlanBeneficiaryNum)
                                    .addComponent(txtHealthPlanBeneficiaryNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBankAccountNum)
                            .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(txtSSNNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLiscenceNum)
                    .addComponent(txtLiscenceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVechicalIdentifierNum)
                            .addComponent(txtVechicalIdentifierNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBiometricUpload)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceSerialNumber)
                    .addComponent(txtDeviceSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIPAddress)
                    .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueIdentifierNumber)
                    .addComponent(txtUniqueIdentifierNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBankAccountNum, lblDOB, lblDeviceSerialNumber, lblEmailID, lblFAXNumber, lblHealthPlanBeneficiaryNum, lblIPAddress, lblLinkedIn, lblLiscenceNum, lblMedicalRecordNum, lblName, lblSSN, lblUniqueIdentifierNumber, lblVechicalIdentifierNum, lbltelephoneNumber});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBankAccountNumber, txtDeviceSerialNumber, txtEmailID, txtFAXNumber, txtHealthPlanBeneficiaryNumber, txtIPAddress, txtLinkedIn, txtLiscenceNumber, txtMedicalRecordNumber, txtName, txtSSNNumber, txtTelephoneNumber, txtUniqueIdentifierNumber, txtVechicalIdentifierNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void txtTelephoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneNumberActionPerformed

    private void txtFAXNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAXNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAXNumberActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtSSNNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNNumberActionPerformed

    private void txtMedicalRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNumberActionPerformed

    private void txtHealthPlanBeneficiaryNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthPlanBeneficiaryNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthPlanBeneficiaryNumberActionPerformed

    private void txtBankAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccountNumberActionPerformed

    private void txtLiscenceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiscenceNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLiscenceNumberActionPerformed

    private void txtVechicalIdentifierNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVechicalIdentifierNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVechicalIdentifierNumberActionPerformed

    private void txtDeviceSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceSerialNumberActionPerformed

    private void txtLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedInActionPerformed

    private void txtIPAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPAddressActionPerformed

    private void txtUniqueIdentifierNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdentifierNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIdentifierNumberActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    
    
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBankAccountNum;
    private javax.swing.JLabel lblBiometricUpload;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceSerialNumber;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblFAXNumber;
    private javax.swing.JLabel lblHealthPlanBeneficiaryNum;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblLiscenceNum;
    private javax.swing.JLabel lblMedicalRecordNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoUpload;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUniqueIdentifierNumber;
    private javax.swing.JLabel lblVechicalIdentifierNum;
    private javax.swing.JLabel lbltelephoneNumber;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDeviceSerialNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFAXNumber;
    private javax.swing.JTextField txtHealthPlanBeneficiaryNumber;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtLiscenceNumber;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSNNumber;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtUniqueIdentifierNumber;
    private javax.swing.JTextField txtVechicalIdentifierNumber;
    private javax.swing.JTextArea txtfAddress;
    // End of variables declaration//GEN-END:variables

    private void displayPersonProfile(){
        txtName.setText(personprofile.getName());
        txtTelephoneNumber.setText(Long.toString(personprofile.getTelephoneNumber()));
        txtfAddress.setText(personprofile.getGeographicData());
        
        
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       txtDOB.setText(personprofile.getDOB());
       lblPhoto.setIcon(personprofile.getPhoto_Image());
       txtFAXNumber.setText(Long.toString(personprofile.getFaxNumber())); 
       txtEmailID.setText(personprofile.getEmailID());
       txtSSNNumber.setText(Long.toString(personprofile.getSsnNumber()));
       txtMedicalRecordNumber.setText(Long.toString(personprofile.getMedicalRecordNumber()));
       txtHealthPlanBeneficiaryNumber.setText(Long.toString(personprofile.getHealthPlanBeneficiaryNumber()));
       txtBankAccountNumber.setText(Long.toString(personprofile.getBankAccountNumber()));
       txtLiscenceNumber.setText(personprofile.getLiscenceNumber());
       txtVechicalIdentifierNumber.setText(personprofile.getVechicalIdentifierNumber());
       txtDeviceSerialNumber.setText(personprofile.getDeviceSerialNumber());
       txtLinkedIn.setText(personprofile.getLinkedIn());
       txtIPAddress.setText(personprofile.getIpAddress());
       txtUniqueIdentifierNumber.setText(Long.toString(personprofile.getUniqueIdentifierNumber()));
    }

}
