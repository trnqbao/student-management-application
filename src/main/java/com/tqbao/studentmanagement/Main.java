package com.tqbao.studentmanagement;

import com.tqbao.studentmanagement.View.AccountManagement.login;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
}
