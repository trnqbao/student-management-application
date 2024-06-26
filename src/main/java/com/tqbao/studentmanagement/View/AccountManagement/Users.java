/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqbao.studentmanagement.View.AccountManagement;


import com.tqbao.studentmanagement.Controller.UserController;
import com.tqbao.studentmanagement.Model.User;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tqbao
 */
public class Users extends javax.swing.JInternalFrame {

    /**
     * Creates new form user
     */
    public Users() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        getUsers();
        txtStatus.setSelectedIndex(0);
        txtRole.setSelectedIndex(1);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnCancel.setEnabled(false);
    }

    UserController userController = new UserController();
    DefaultTableModel dtm;

    private void getUsers() {
        userController.showAllUsers(list_users, dtm);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel46 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        txtRole = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        txtPhone = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        txtAge = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_users = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        btnLocked = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        btnNormal = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        btnEmployee = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        btnManager = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Status");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 80, 70));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 80, 80));

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jPanel14.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 90, 70));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Age");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 90, 70));

        jPanel8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 90, 80));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone");
        jPanel16.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 90, 70));

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 90, 80));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 320));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 80));

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 80));

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 160, 80));

        jPanel17.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, 80));

        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 160, 80));

        jPanel17.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, 80));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 80));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Role");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 80));

        txtRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Employee" }));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        jPanel17.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 120, 80));

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 170, 80));

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        jPanel9.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 80));

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        jPanel9.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 80));

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 160, 80));
        jPanel20.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        jPanel9.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, 80));

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Locked" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, 70, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 70, 80));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 260, 340));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 360, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Management");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 350, 90));

        jPanel12.setBackground(new java.awt.Color(252, 253, 253));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel49.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel36.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 60));

        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel50.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        jPanel36.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        jPanel12.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, 60));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel47.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 30));

        jPanel45.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 60));

        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel48.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jPanel45.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        jPanel12.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 350, 60));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 510));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Age", "Status", "Role", "Login History"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        list_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_usersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_users);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));

        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 160, 80));

        jPanel1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, 80));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 450));

        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLocked.setText("Locked");
        btnLocked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockedActionPerformed(evt);
            }
        });
        jPanel43.add(btnLocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel39.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 50));

        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNormal.setText("Normal");
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });
        jPanel44.add(btnNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel39.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 270, 60));

        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        jPanel41.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel40.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 50));

        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManager.setText("Manager");
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });
        jPanel42.add(btnManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel40.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 50));

        jPanel38.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        jPanel5.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 540, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 560, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_usersMouseClicked
        // TODO add your handling code here:
        dtm = (DefaultTableModel) list_users.getModel();
        int selectIndex = list_users.getSelectedRow();
        String name = dtm.getValueAt(selectIndex, 1).toString();
        String phone = dtm.getValueAt(selectIndex, 2).toString();
        int age = (int) dtm.getValueAt(selectIndex, 3);
        String status = dtm.getValueAt(selectIndex, 4).toString();
        String role = dtm.getValueAt(selectIndex, 5).toString();

        txtName.setText(name);
        txtPhone.setText(phone);
        txtAge.setText(String.valueOf(age));
        txtStatus.setSelectedItem(status);
        txtRole.setSelectedItem(role);
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_list_usersMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String age = txtAge.getText();
        String status = (String) txtStatus.getSelectedItem();
        String role = (String) txtRole.getSelectedItem();

        if (!name.equals("")) {
            if (phone.length() < 10) {
                JOptionPane.showMessageDialog(this, "Phone number must be greater than 10 digits");
                txtPhone.requestFocus();
            } else if (!phone.chars().allMatch( Character::isDigit)){
                JOptionPane.showMessageDialog(this, "Phone number must not contain characters");
                txtPhone.requestFocus();
            } else if (!age.chars().allMatch( Character::isDigit)) {
                JOptionPane.showMessageDialog(this, "Age must not contain characters");
                txtAge.requestFocus();
            }else {
                User user = new User(name, Integer.parseInt(age), phone, status, role);
                User comparedUser = userController.get(user.getPhone());
                if (comparedUser==null) {
                    userController.add(user);

                    JOptionPane.showMessageDialog(this, role + " added");

                    txtName.setText("");
                    txtPhone.setText("");
                    txtAge.setText("");
                    txtStatus.setSelectedIndex(0);
                    txtRole.setSelectedIndex(1);
                    getUsers();
                } else {
                    JOptionPane.showMessageDialog(this, "Phone has been existed");
                    txtPhone.requestFocus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please provide details");
            txtName.requestFocus();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        dtm = (DefaultTableModel) list_users.getModel();
        int selectIndex = list_users.getSelectedRow();

        int id = (int) dtm.getValueAt(selectIndex, 0);
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String age = txtAge.getText();
        String status = txtStatus.getSelectedItem().toString();
        String role = txtRole.getSelectedItem().toString();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Check again with your information");
            txtName.requestFocus();
        } else if(!age.chars().allMatch(Character::isDigit)) {
            JOptionPane.showMessageDialog(this, "Check again with your information");
            txtAge.grabFocus();
        } else if (!phone.chars().allMatch(Character::isDigit)) {
            JOptionPane.showMessageDialog(this, "Check again with your information");
            txtPhone.requestFocus();
        }else {
            User user1 = new User(id, name, Integer.parseInt(age), phone, status, role);
            userController.update(user1);

            JOptionPane.showMessageDialog(this, role + " Updated");

            btnAdd.setEnabled(true);
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnCancel.setEnabled(false);
            txtName.setText("");
            txtPhone.setText("");
            txtAge.setText("");
            txtStatus.setSelectedIndex(0);
            txtRole.setSelectedIndex(1);
            getUsers();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        dtm = (DefaultTableModel) list_users.getModel();
        int selectIndex = list_users.getSelectedRow();

        int id = (int) dtm.getValueAt(selectIndex, 0);
        String role = Objects.requireNonNull(txtRole.getSelectedItem()).toString();

        int result = JOptionPane.showConfirmDialog(this, "Are you sure to delete this " + role, "", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            userController.delete(id);
            JOptionPane.showMessageDialog(this, role + " has been deleted");
            btnAdd.setEnabled(true);
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnCancel.setEnabled(false);
            txtName.setText("");
            txtPhone.setText("");
            txtAge.setText("");
            txtStatus.setSelectedIndex(0);
            txtRole.setSelectedIndex(1);
            getUsers();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        // TODO add your handling code here:
        userController.showManager(list_users, dtm);
    }//GEN-LAST:event_btnManagerActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
        userController.showEmployee(list_users, dtm);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        // TODO add your handling code here:
        userController.showNormalUser(list_users, dtm);
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnLockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockedActionPerformed
        // TODO add your handling code here:
        userController.showLockedUser(list_users, dtm);
    }//GEN-LAST:event_btnLockedActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        btnCancel.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        txtName.setText("");
        txtPhone.setText("");
        txtAge.setText("");
        txtStatus.setSelectedIndex(0);
        txtRole.setSelectedIndex(1);
        getUsers();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLocked;
    private javax.swing.JButton btnManager;
    private javax.swing.JButton btnNormal;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable list_users;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JComboBox<String> txtRole;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
