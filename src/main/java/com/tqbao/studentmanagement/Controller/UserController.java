package com.tqbao.studentmanagement.Controller;

import com.tqbao.studentmanagement.DAO.UserDAO;
import com.tqbao.studentmanagement.Model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class UserController  {
    private UserDAO userDAO;
    public UserController() {
        userDAO = new UserDAO();
    }

    public void add(User user) {
        userDAO.add(user);
    }

    public List<User> getAllUsers() {
        return userDAO.readAll();
    }

    public void showAllUsers(JTable jTable, DefaultTableModel dtm) {
        userDAO.showAllUsers(jTable, dtm);
    }

    public void showManager(JTable jTable, DefaultTableModel dtm) {
        userDAO.showManager(jTable, dtm);
    }

    public void showEmployee(JTable jTable, DefaultTableModel dtm) {
        userDAO.showEmployee(jTable, dtm);
    }

    public void showNormalUser(JTable jTable, DefaultTableModel dtm) {
        userDAO.showNormalUser(jTable, dtm);
    }

    public void showLockedUser(JTable jTable, DefaultTableModel dtm) {
        userDAO.showLockedUser(jTable, dtm);
    }

    public User get(int id) {
        return userDAO.read(id);
    }
    public User get(String user, String pass) {
        return userDAO.check(user, pass);
    }

    public void update(User user) {
        userDAO.update(user);
    }

    public void delete(int id) {
        userDAO.delete(id);
    }

    public void updatePassword(int id, String password) {userDAO.updatePassword(id, password);}

    public void updateLoginHistory(User user) {
        userDAO.updateLoginHistory(user);
    }

    public User get(String phone) {
        return userDAO.read(phone);
    }

}
