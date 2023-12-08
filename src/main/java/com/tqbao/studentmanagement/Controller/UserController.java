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

    public List<User> getAllUsers() {
        return userDAO.readAll();
    }
    public User getUser(int id) {
        return userDAO.read(id);
    }
    public User getUser(String user, String pass) {
        return userDAO.check(user, pass);
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(int id) {
        userDAO.delete(id);
    }

    public void updatePassword(int id, String password) {userDAO.updatePassword(id, password);}
}
