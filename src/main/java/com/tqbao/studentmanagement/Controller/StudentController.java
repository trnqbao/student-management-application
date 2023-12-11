package com.tqbao.studentmanagement.Controller;

import com.tqbao.studentmanagement.DAO.StudentDAO;
import com.tqbao.studentmanagement.Model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.List;

public class StudentController {
    private StudentDAO studentDAO;
    public StudentController() {
        studentDAO = new StudentDAO();
    }

    public void add(Student student) {
        studentDAO.add(student);
    }

    public Student get(int id) {
        return studentDAO.read(id);
    }

    public Student get(String name, String phone) {
        return studentDAO.read(name, phone);
    }

    public List<Student> getAll() {
        return studentDAO.readAll();
    }

    public void showStudents(JTable jTable, DefaultTableModel dtm) {
        studentDAO.showStudents(jTable, dtm);
    }

    public void showExistedStudent(String name, String phone, JTable jTable, DefaultTableModel dtm) {
        studentDAO.showExistedStudent(name, phone, jTable, dtm);
    }

    public Student showExistedStudent(String name, String phone) {
        return studentDAO.showExistedStudent(name, phone);
    }

    public void update(Student student) {
        studentDAO.update(student);
    }

    public void delete(int id) {
        studentDAO.delete(id);
    }

    public void sortByGrade(JTable jTable, DefaultTableModel dtm){
        studentDAO.sortByGrade(jTable, dtm);
    }

    public void sortByName(JTable jTable, DefaultTableModel dtm){
        studentDAO.sortByName(jTable, dtm);
    }
    public void sortByCertificate(JTable jTable, DefaultTableModel dtm){
        studentDAO.sortByCertificate(jTable, dtm);
    }
}
