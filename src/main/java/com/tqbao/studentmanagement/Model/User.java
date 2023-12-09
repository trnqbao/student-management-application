package com.tqbao.studentmanagement.Model;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private int id;
    private String name;
    private int age;
    private String phone;
    private String status;
    private String role;
    private String username;
    private String password;
    private String loginHistory;

    public User() {};

    public User(int id, String name, int age, String phone, String status, String role, String username, String password, String loginHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.username = username;
        this.password = password;
        this.loginHistory = loginHistory;
    }

    public User(String name, int age, String phone, String status, String role, String username, String password, String loginHistory) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.username = username;
        this.password = password;
        this.loginHistory = loginHistory;
    }

    public User(String name, int age, String phone, String status, String role, String username, String password) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.username = username;
        this.password = password;
        this.loginHistory = null;
    }

    public User(int id, String name, int age, String phone, String status, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.username = name + phone;
        this.password = name + phone;
    }

    public User(String name, int age, String phone, String status, String role) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.username = name + phone;
        this.password = name + phone;
    }

    public String getLoginHistory() {
        return loginHistory;
    }

    public void setLoginHistory(String loginHistory) {
        this.loginHistory = loginHistory;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loginHistory='" + loginHistory + '\'' +
                '}';
    }
}
