/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqbao.studentmanagement.View.AccountManagement;

import com.tqbao.studentmanagement.View.Certificate.Certificates;
import com.tqbao.studentmanagement.View.StudentManagement.Students;

import javax.swing.*;
import java.awt.Color;
import java.sql.*;

import static com.tqbao.studentmanagement.View.AccountManagement.Login.user;
/**
 *
 * @author tqbao
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
   
    Color DefauColor, ClickColor;
    public Dashboard() throws SQLException {
        initComponents();
        this.setResizable(false);
        this.setTitle("Home Page");
        System.out.println("Dashboard User: " + user.toString());
        DefauColor = new Color(1,1,1);
        ClickColor = new Color(65, 65, 65);
        if (user.getRole().equals("Manager")) {
            menuUser.setVisible(false);
            jDesktopPane.removeAll();
            jDesktopPane.add(new Profile()).setVisible(true);
            menuProfile.setBackground(ClickColor);
            
        } else if (user.getRole().equals("Employee")) {
            menuUser.setVisible(false);
            menuCertificate.setVisible(false);
            jDesktopPane.removeAll();
            jDesktopPane.add(new Profile()).setVisible(true);
            menuProfile.setBackground(ClickColor);
          
        } else {
            jDesktopPane.removeAll();
            jDesktopPane.add(new Profile()).setVisible(true);
            menuProfile.setBackground(ClickColor);
           
        }




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        menuCertificate = new javax.swing.JPanel();
        menuCertificate_1 = new javax.swing.JLabel();
        menuProfile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuStudent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        menuUser = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(63, 82, 188));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 130));

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Education System Information");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 610, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("\"An investment in knowledge pays the best interest\"");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 620, 30));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 950, 130));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 130));

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 950, 530));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        menuCertificate.setBackground(new java.awt.Color(0, 0, 0));
        menuCertificate.setPreferredSize(new java.awt.Dimension(150, 90));
        menuCertificate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCertificateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCertificateMousePressed(evt);
            }
        });

        menuCertificate_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuCertificate_1.setForeground(new java.awt.Color(255, 255, 255));
        menuCertificate_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuCertificate_1.setText("Certificates");

        javax.swing.GroupLayout menuCertificateLayout = new javax.swing.GroupLayout(menuCertificate);
        menuCertificate.setLayout(menuCertificateLayout);
        menuCertificateLayout.setHorizontalGroup(
            menuCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuCertificateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuCertificate_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuCertificateLayout.setVerticalGroup(
            menuCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCertificateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuCertificate_1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuProfile.setBackground(new java.awt.Color(0, 0, 0));
        menuProfile.setPreferredSize(new java.awt.Dimension(150, 90));
        menuProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuProfileMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profile");

        javax.swing.GroupLayout menuProfileLayout = new javax.swing.GroupLayout(menuProfile);
        menuProfile.setLayout(menuProfileLayout);
        menuProfileLayout.setHorizontalGroup(
            menuProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuProfileLayout.setVerticalGroup(
            menuProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuStudent.setBackground(new java.awt.Color(0, 0, 0));
        menuStudent.setPreferredSize(new java.awt.Dimension(150, 90));
        menuStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStudentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuStudentMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Students");

        javax.swing.GroupLayout menuStudentLayout = new javax.swing.GroupLayout(menuStudent);
        menuStudent.setLayout(menuStudentLayout);
        menuStudentLayout.setHorizontalGroup(
            menuStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuStudentLayout.setVerticalGroup(
            menuStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuUser.setBackground(new java.awt.Color(0, 0, 0));
        menuUser.setPreferredSize(new java.awt.Dimension(150, 90));
        menuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuUserMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Users");

        javax.swing.GroupLayout menuUserLayout = new javax.swing.GroupLayout(menuUser);
        menuUser.setLayout(menuUserLayout);
        menuUserLayout.setHorizontalGroup(
            menuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuUserLayout.setVerticalGroup(
            menuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfileMousePressed
        // TODO add your handling code here:
        menuProfile.setBackground(ClickColor);
        menuStudent.setBackground(DefauColor);
        menuCertificate.setBackground(DefauColor);
        menuUser.setBackground(DefauColor);
       
    }//GEN-LAST:event_menuProfileMousePressed

    private void menuStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStudentMousePressed
        // TODO add your handling code here:
        menuProfile.setBackground(DefauColor);
        menuStudent.setBackground(ClickColor);
        menuCertificate.setBackground(DefauColor);
        menuUser.setBackground(DefauColor);
        
    }//GEN-LAST:event_menuStudentMousePressed

    private void menuCertificateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCertificateMousePressed
        // TODO add your handling code here:
        menuProfile.setBackground(DefauColor);
        menuStudent.setBackground(DefauColor);
        menuCertificate.setBackground(ClickColor);
        menuUser.setBackground(DefauColor);
        
    }//GEN-LAST:event_menuCertificateMousePressed

    private void menuUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMousePressed
        // TODO add your handling code here:
        menuProfile.setBackground(DefauColor);
        menuStudent.setBackground(DefauColor);
        menuCertificate.setBackground(DefauColor);
        menuUser.setBackground(ClickColor);
  
    }//GEN-LAST:event_menuUserMousePressed

    private void menuProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfileMouseClicked
        // TODO add your handling code here:
        jDesktopPane.removeAll();
        try {
            jDesktopPane.add(new Profile()).setVisible(true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_menuProfileMouseClicked

    private void menuStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStudentMouseClicked
        // TODO add your handling code here:
        jDesktopPane.removeAll();
        jDesktopPane.add(new Students(user.getRole())).setVisible(true);
    }//GEN-LAST:event_menuStudentMouseClicked

    private void menuCertificateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCertificateMouseClicked
        // TODO add your handling code here:
        jDesktopPane.removeAll();
        jDesktopPane.add(new Certificates()).setVisible(true);
    }//GEN-LAST:event_menuCertificateMouseClicked

    private void menuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMouseClicked
        // TODO add your handling code here:
        jDesktopPane.removeAll();
        jDesktopPane.add(new Users()).setVisible(true);
    }//GEN-LAST:event_menuUserMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Remember account for the next time?", "", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Login login = new Login(user.getUsername(), user.getPassword());
            login.setVisible(true);
        } else {
            this.setVisible(false);
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed





    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel menuCertificate;
    private javax.swing.JLabel menuCertificate_1;
    private javax.swing.JPanel menuProfile;
    private javax.swing.JPanel menuStudent;
    private javax.swing.JPanel menuUser;
    // End of variables declaration//GEN-END:variables
}
