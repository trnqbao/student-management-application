package com.tqbao.studentmanagement.View.AccountManagement;

import javax.swing.*;
import java.awt.*;

public class Login {
    private JPanel panel1;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;

    private JFrame jFrame;
    public Login() {
        jFrame = new JFrame("Login Frame");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(300, 250));
        jFrame.setResizable(false);

        jFrame.add(panel1);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
