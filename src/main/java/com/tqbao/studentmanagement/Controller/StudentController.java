package com.tqbao.studentmanagement.Controller;

import com.tqbao.studentmanagement.DAO.StudentDAO;
import com.tqbao.studentmanagement.Model.Student;

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

    public List<Student> getAll() {
        return studentDAO.readAll();
    }

    public void update(Student student) {
        studentDAO.update(student);
    }

    public void delete(int id) {
        studentDAO.delete(id);
    }
}
