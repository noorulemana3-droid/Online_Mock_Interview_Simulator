package gui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField userField;
    private JPasswordField passField;

    public LoginFrame() {

        setTitle("Mock Interview Simulator");
        setSize(500, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        getContentPane().setBackground(
                new Color(248, 250, 252));

        // Main Title

        JLabel title =
                new JLabel("MOCK INTERVIEW SIMULATOR");

        title.setFont(
                new Font("Segoe UI",
                        Font.BOLD,
                        24));

        title.setForeground(
                new Color(37, 99, 235));

        title.setBounds(
                50, 20, 400, 40);

        add(title);

        // Subtitle

        JLabel subtitle =
                new JLabel("Practice • Improve • Succeed");

        subtitle.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        14));

        subtitle.setForeground(
                Color.GRAY);

        subtitle.setBounds(
                145, 55, 250, 25);

        add(subtitle);

        // Username Label

        JLabel userLabel =
                new JLabel("Username");

        userLabel.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        15));

        userLabel.setBounds(
                80, 110, 100, 25);

        add(userLabel);

        // Username Field

        userField =
                new JTextField();

        userField.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        14));

        userField.setBounds(
                180, 110, 220, 35);

        add(userField);

        // Password Label

        JLabel passLabel =
                new JLabel("Password");

        passLabel.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        15));

        passLabel.setBounds(
                80, 165, 100, 25);

        add(passLabel);

        // Password Field

        passField =
                new JPasswordField();

        passField.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        14));

        passField.setBounds(
                180, 165, 220, 35);

        add(passField);

        // Login Button

        JButton loginBtn =
                new JButton("LOGIN");

        loginBtn.setBounds(
                180, 235, 140, 40);

        loginBtn.setBackground(
                new Color(37, 99, 235));

        loginBtn.setForeground(
                Color.WHITE);

        loginBtn.setFocusPainted(false);

        loginBtn.setFont(
                new Font("Segoe UI",
                        Font.BOLD,
                        15));

        add(loginBtn);

        // Login Action

        loginBtn.addActionListener(e -> {

            String username =
                    userField.getText().trim();

            String password =
                    String.valueOf(
                            passField.getPassword());

            if(username.isEmpty()
                    || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields.");

                return;
            }

            if(username.equals("admin")
                    && password.equals("123")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Login Successful!");

                dispose();

                new CategoryFrame();
            }
            else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Username or Password",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}