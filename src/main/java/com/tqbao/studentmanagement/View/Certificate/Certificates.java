/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqbao.studentmanagement.View.Certificate;

import com.tqbao.studentmanagement.Controller.CertificateController;
import com.tqbao.studentmanagement.Model.Certificate;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tqbao
 */
public class Certificates extends javax.swing.JInternalFrame {

    /**
     * Creates new form student
     */
    public Certificates() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        getCertificates();
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnCancel.setEnabled(false);
    }

    DefaultTableModel dtm;
    CertificateController certificateController = new CertificateController();

    private void getCertificates() {
        certificateController.showCertificates(listCertificates, dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCertificates = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(940, 544));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Certificate Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 30));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 110));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 60, 80));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 110));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, 110));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel15.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, -1));

        jPanel9.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel16.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, -1));

        jPanel9.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, 50));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 320, 110));

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel7.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, -1));

        jPanel14.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 50));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel8.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, -1));

        jPanel14.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 50));

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 110));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 320, 240));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 490));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listCertificates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listCertificates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCertificatesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listCertificates);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 490));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 580, 510));

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

    private void listCertificatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCertificatesMouseClicked
        // TODO add your handling code here:
        dtm = (DefaultTableModel) listCertificates.getModel();
        int selectIndex = listCertificates.getSelectedRow();
        String name = dtm.getValueAt(selectIndex, 1).toString();
        txtName.setText(name);
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_listCertificatesMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();

        if (name.equals("") || name.equals("Null") || name.equals("null")) {
            JOptionPane.showMessageDialog(this, "Certificate must not be empty");
            txtName.requestFocus();
        }
        else {
            if (certificateController.get(name) == null) {
                Certificate certificate = new Certificate(name);
                certificateController.add(certificate);
                JOptionPane.showMessageDialog(this, certificate.getName() + " has been added");

                txtName.setText("");
                getCertificates();
            } else {
                JOptionPane.showMessageDialog(this, "Certificate has been existed");
                txtName.requestFocus();
            }

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        dtm = (DefaultTableModel) listCertificates.getModel();
        int selectIndex = listCertificates.getSelectedRow();

        int id = (int) dtm.getValueAt(selectIndex, 0);
        String name = txtName.getText();

        if (name.equals("") || name.equals("Null") || name.equals("null")) {
            JOptionPane.showMessageDialog(this, "Check again with your information");
            txtName.requestFocus();
        } else {
            Certificate certificate = new Certificate(id, name);
            System.out.println("ID CERTIFICATE: " + certificate.getId());

            Certificate checkedCertificate = certificateController.get(name);
            if (checkedCertificate == null || !checkedCertificate.getName().equals(name)) {
                certificateController.update(certificate);
                JOptionPane.showMessageDialog(this, "Certificate has been updated");
                btnAdd.setEnabled(true);
                btnDelete.setEnabled(false);
                btnUpdate.setEnabled(false);
                btnCancel.setEnabled(false);
                txtName.setText("");
                getCertificates();
            } else if (checkedCertificate.getName().equals(certificate.getName()) && checkedCertificate.getId() != certificate.getId()) {
                JOptionPane.showMessageDialog(this, "Certificate has been existed");

                btnAdd.setEnabled(true);
                btnDelete.setEnabled(false);
                btnUpdate.setEnabled(false);
                btnCancel.setEnabled(false);
                txtName.setText("");
                getCertificates();

            }  else if (checkedCertificate.getName().equals(certificate.getName()) && checkedCertificate.getId() == certificate.getId()) {
                JOptionPane.showMessageDialog(this, "Nothing to change");

                btnAdd.setEnabled(true);
                btnDelete.setEnabled(false);
                btnUpdate.setEnabled(false);
                btnCancel.setEnabled(false);
                txtName.setText("");
                getCertificates();
            }
            else {
                JOptionPane.showMessageDialog(this, "Certificate has been existed");
                txtName.requestFocus();
            }

        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        dtm = (DefaultTableModel) listCertificates.getModel();
        int selectIndex = listCertificates.getSelectedRow();

        int id = (int) dtm.getValueAt(selectIndex, 0);

        certificateController.delete(id);
        JOptionPane.showMessageDialog(this,"Certificate has been deleted");

        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnCancel.setEnabled(false);
        txtName.setText("");
        getCertificates();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnCancel.setEnabled(false);
        txtName.setText("");
        getCertificates();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listCertificates;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
