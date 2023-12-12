package com.tqbao.studentmanagement;

import com.tqbao.studentmanagement.View.AccountManagement.Login;
import com.tqbao.studentmanagement.View.AccountManagement.Login;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }
}
