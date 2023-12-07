package com.tqbao.studentmanagement.DAO;

import com.tqbao.studentmanagement.Model.Student;
import com.tqbao.studentmanagement.Model.User;

import java.util.List;

public class StudentDAO implements Repository<Student, Integer> {
    @Override
    public Integer add(Student item) {
        return null;
    }

    @Override
    public List<Student> readAll() {
        return null;
    }

    @Override
    public Student read(Integer id) {
        return null;
    }

    @Override
    public User check(String username, String password) {
        return null;
    }

    @Override
    public boolean update(Student item) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
