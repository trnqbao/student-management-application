package com.tqbao.studentmanagement.DAO;

import com.tqbao.studentmanagement.Model.Student;
import com.tqbao.studentmanagement.View.AccountManagement.dashboard;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDAO implements Repository<Student, Integer> {

    private static final String GET_ALL_STUDENTS = "select * from student";
    private static final String SELECT_STUDENT = "select * from student where id=?";
    private static final String INSERT_STUDENT = "insert into student(name, birthday, gender, phone, address, grade, certificate) values(?,?,?,?,?,?,?)";
    private static final String UPDATE_STUDENT = "update student set name=?, birthday=?, gender=?, phone=?, address=?, grade=?, certificate=? where id=?";
    private static final String DELETE_STUDENT = "delete from student where id=?";
    private static final String SORT_BY_GRADE_ASC = "select * from student order by grade";
    private static final String CREATE_TABLE_STUDENT = "CREATE TABLE IF NOT EXISTS student("
            + "id INT AUTO_INCREMENT PRIMARY KEY,"
            + "name VARCHAR(255) NOT NULL,"
            + "birthday date,"
            + "gender VARCHAR(255) NOT NULL,"
            + "phone VARCHAR(255) NOT NULL,"
            + "address VARCHAR(255) NOT NULL,"
            + "grade VARCHAR(255) NOT NULL,"
            + "certificate VARCHAR(255))";

    public StudentDAO() {
        createTable();
    }

    private void createTable() {
        try (Connection conn = ConnectionDB.getConnection()) {
            Statement stm = (Statement) conn.createStatement();
            stm.executeUpdate(CREATE_TABLE_STUDENT);
            conn.close();
            stm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer add(Student item) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(INSERT_STUDENT);

            pstm.setString(1, item.getName());

            pstm.setDate(2, item.getBirthday());
            pstm.setString(3, item.getGender());
            pstm.setString(4, item.getPhone());
            pstm.setString(5, item.getAddress());
            pstm.setString(6, item.getGrade());
            pstm.setString(7, item.getCertificate());

            int row = pstm.executeUpdate();

            if (row == 1) {
                System.out.println("Student has been added");
            }
            conn.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return item.getId();
    }

    @Override
    public List<Student> readAll() {
        try (Connection conn = ConnectionDB.getConnection()) {
            Statement stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery(GET_ALL_STUDENTS);

            List<Student> students = new ArrayList<Student>();

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Date birthday = rs.getDate(3);
                String gender = rs.getString(4);
                String phone = rs.getString(5);
                String address = rs.getString(6);
                String grade = rs.getString(7);
                String certificate = rs.getString(8);

                Student student = new Student(id, name, birthday, gender, phone, address, grade, certificate);
                students.add(student);
            }
            conn.close();
            stm.close();
            rs.close();
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void showStudents(JTable jTable, DefaultTableModel dtm) {
        int c;
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = conn.prepareStatement(GET_ALL_STUDENTS);
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
                    vector.add(rs.getDate("birthday"));
                    vector.add(rs.getString("gender"));
                    vector.add(rs.getString("phone"));
                    vector.add(rs.getString("address"));
                    vector.add(rs.getString("grade"));
                    vector.add(rs.getString("certificate"));
                }
                dtm.addRow(vector);
            }

        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public Student read(Integer id) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(SELECT_STUDENT);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                String name = rs.getString(2);
                Date birthday = rs.getDate(3);
                String gender = rs.getString(4);
                String phone = rs.getString(5);
                String address = rs.getString(6);
                String grade = rs.getString(7);
                String certificate = rs.getString(8);

                Student student = new Student(id, name, birthday, gender, phone, address, grade, certificate);
                pstm.close();
                rs.close();
                return student;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }



    @Override
    public boolean update(Student item) {
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(UPDATE_STUDENT);
            pstm.setString(1, item.getName());
            pstm.setDate(2, item.getBirthday());
            pstm.setString(3, item.getGender());
            pstm.setString(4, item.getPhone());
            pstm.setString(5, item.getAddress());
            pstm.setString(6, item.getGrade());
            pstm.setString(7, item.getCertificate());
            pstm.setInt(8, item.getId());

            int updated_row = pstm.executeUpdate();

            if (updated_row > 0) {
                System.out.println("Student has been updated");
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
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(DELETE_STUDENT);
            pstm.setInt(1, id);
            int row = pstm.executeUpdate();
            if (row > 0) {
                System.out.println("Student has been deleted");
                return true;
            }
            conn.close();
            pstm.close();
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void sortASCByGrade(JTable jTable, DefaultTableModel dtm) {
        int c;
        try (Connection conn = ConnectionDB.getConnection()) {
            PreparedStatement pstm = conn.prepareStatement(SORT_BY_GRADE_ASC);
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
                    vector.add(rs.getDate("birthday"));
                    vector.add(rs.getString("gender"));
                    vector.add(rs.getString("phone"));
                    vector.add(rs.getString("address"));
                    vector.add(rs.getString("grade"));
                    vector.add(rs.getString("certificate"));
                }
                dtm.addRow(vector);
            }

        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
