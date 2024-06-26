package com.tqbao.studentmanagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.tqbao.studentmanagement.ConstantJDBC.*;

public class ConnectionDB {

    private static Connection conn;

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_NAME);
            try {
                conn = DriverManager.getConnection(URL_TO_DATABASE, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return conn;
    }

    public static Connection getConnectionMysql() {
        try {
            Class.forName(DRIVER_NAME);
            try {
                conn = DriverManager.getConnection(URL_TO_LOCALHOST, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return conn;
    }
}
