package com.tqbao.studentmanagement.DAO;

import com.tqbao.studentmanagement.Model.Certificate;
import com.tqbao.studentmanagement.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CertificateDAO implements Repository<Certificate, Integer> {
    private static final String CREATE_TABLE_CERTIFICATE = "CREATE TABLE IF NOT EXISTS certificate("
            + "id INT AUTO_INCREMENT PRIMARY KEY,"
            + "name VARCHAR(255) NOT NULL)";

    private static final String GET_ALL_CERTIFICATE = "select * from certificate";
    private static final String SELECT_CERTIFICATE = "select * from certificate where id=?";
    private static final String INSERT_CERTIFICATE = "insert into certificate(name) values(?)";
    private static final String UPDATE_CERTIFICATE = "update certificate set name=? where id=?";
    private static final String DELETE_CERTIFICATE = "delete from certificate where id=?";

    public CertificateDAO() {
        createTable();
    }

    private void createTable() {
        try (Connection conn = ConnectionDB.getConnection()) {
            Statement stm = (Statement) conn.createStatement();
            stm.executeUpdate(CREATE_TABLE_CERTIFICATE);
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
                System.out.println(item.getName() + " was added successfully");
            }
            conn.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return item.getId();
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
                System.out.println("Certificate has been updated successfully");
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
                System.out.println("Deleted successfully");
                return true;
            }
            conn.close();
            pstm.close();
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
