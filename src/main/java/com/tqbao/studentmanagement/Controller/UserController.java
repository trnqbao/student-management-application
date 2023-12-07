package com.tqbao.studentmanagement.Controller;

import com.tqbao.studentmanagement.DAO.UserDAO;
import com.tqbao.studentmanagement.Model.User;

import java.sql.ResultSet;
import java.util.List;

public class UserController  {
    private UserDAO userDAO;
    public UserController() {
        userDAO = new UserDAO();
    }

    public void addUser(User user) {
        userDAO.add(user);
    }

    public ResultSet getAllUsers() {
        return userDAO.getAll();
    }

    public User getUser(String a, String b) {
        return userDAO.check(a, b);
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(int id) {
        userDAO.delete(id);
    }
}
