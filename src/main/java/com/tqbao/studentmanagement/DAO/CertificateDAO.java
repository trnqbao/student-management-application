package com.tqbao.studentmanagement.DAO;

import com.tqbao.studentmanagement.Model.Certificate;
import com.tqbao.studentmanagement.Model.User;
import com.tqbao.studentmanagement.View.AccountManagement.dashboard;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CertificateDAO implements Repository<Certificate, Integer> {
    private static final String CREATE_TABLE_CERTIFICATE = "CREATE TABLE IF NOT EXISTS certificate("
            + "id INT AUTO_INCREMENT PRIMARY KEY,"
            + "name VARCHAR(255) NOT NULL)";

    public static final String GET_ALL_CERTIFICATE = "select * from certificate";
    private static final String SELECT_CERTIFICATE = "select * from certificate where id=?";
    private static final String INSERT_CERTIFICATE = "insert into certificate(name) values(?)";
    private static final String INSERT_NULL_CERTIFICATE = "insert into certificate(name) values(\"Null\")";
    private static final String UPDATE_CERTIFICATE = "update certificate set name=? where id=?";
    private static final String DELETE_CERTIFICATE = "delete from certificate where id=?";

    public CertificateDAO() {
        createTable();
    }

    private void createTable() {
        try (Connection conn = ConnectionDB.getConnection()) {
            Statement stm = (Statement) conn.createStatement();
            stm.executeUpdate(CREATE_TABLE_CERTIFICATE);
            stm.executeUpdate(INSERT_NULL_CERTIFICATE);
            conn.close();
            stm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer add(Certificate item) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(INSERT_CERTIFICATE);
            pstm.setString(1, item.getName());
            int row = pstm.executeUpdate();
            if (row == 1) {
                System.out.println(item.getName() + "has been added");
            }
            conn.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return item.getId();
    }

    public ResultSet getAll(JComboBox jComboBox) {
        try (Connection conn = ConnectionDB.getConnection()) {
            Statement stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery(GET_ALL_CERTIFICATE);


            while (rs.next()) {
                jComboBox.addItem(rs.getString("name"));
            }
            conn.close();
            stm.close();
            rs.close();
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Certificate> readAll() {
        try (Connection conn = ConnectionDB.getConnection()) {
            Statement stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery(GET_ALL_CERTIFICATE);

            List<Certificate> certificates = new ArrayList<Certificate>();

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);


                Certificate certificate = new Certificate(id, name);
                certificates.add(certificate);
            }
            conn.close();
            stm.close();
            rs.close();
            return certificates;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Certificate read(Integer id) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(SELECT_CERTIFICATE);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                String name = rs.getString(2);

                Certificate certificate = new Certificate(id, name);
                pstm.close();
                rs.close();
                return certificate;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public boolean update(Certificate item) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(UPDATE_CERTIFICATE);
            pstm.setString(1, item.getName());
            pstm.setInt(2, item.getId());

            int updated_row = pstm.executeUpdate();

            if (updated_row > 0) {
                System.out.println("Certificate has been updated");
                return true;
            }
            conn.close();
            pstm.close();
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Integer id) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(DELETE_CERTIFICATE);
            pstm.setInt(1, id);
            int row = pstm.executeUpdate();
            if (row > 0) {
                System.out.println("Certificate has been deleted");
                return true;
            }
            conn.close();
            pstm.close();
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void showCertificates(JTable jTable, DefaultTableModel dtm) {
        int c;
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = conn.prepareStatement(GET_ALL_CERTIFICATE);
            ResultSet rs = pstm.executeQuery();



            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            dtm = (DefaultTableModel) jTable.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector vector = new Vector();
                for (int i = 0; i < c; i++) {
                    vector.add(rs.getInt("id"));
                    vector.add(rs.getString("name"));
                }
                dtm.addRow(vector);
            }

        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
