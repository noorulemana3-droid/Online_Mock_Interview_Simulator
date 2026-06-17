package gui;

import javax.swing.*;
import java.awt.*;

public class CategoryFrame extends JFrame {

    public CategoryFrame() {

        setTitle("Interview Categories");
        setSize(550, 420);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        getContentPane().setBackground(
                new Color(248, 250, 252));

        // Main Title

        JLabel title =
                new JLabel("SELECT INTERVIEW CATEGORY");

        title.setFont(
                new Font("Segoe UI",
                        Font.BOLD,
                        24));

        title.setForeground(
                new Color(37, 99, 235));

        title.setBounds(
                70, 25, 420, 35);

        add(title);

        // Subtitle

        JLabel subtitle =
                new JLabel("Choose a category to start your mock interview");

        subtitle.setFont(
                new Font("Segoe UI",
                        Font.PLAIN,
                        14));

        subtitle.setForeground(
                Color.GRAY);

        subtitle.setBounds(
                105, 60, 350, 25);

        add(subtitle);

        // Technical Button

        JButton technicalBtn =
                createButton("💻 Technical Interview");

        technicalBtn.setBounds(
                120, 120, 300, 50);

        add(technicalBtn);

        // HR Button

        JButton hrBtn =
                createButton("👔 HR Interview");

        hrBtn.setBounds(
                120, 190, 300, 50);

        add(hrBtn);

        // Behavioral Button

        JButton behavioralBtn =
                createButton("🤝 Behavioral Interview");

        behavioralBtn.setBounds(
                120, 260, 300, 50);

        add(behavioralBtn);

        // Button Actions

        technicalBtn.addActionListener(e -> {

            dispose();
            new InterviewFrame("Technical");
        });

        hrBtn.addActionListener(e -> {

            dispose();
            new InterviewFrame("HR");
        });

        behavioralBtn.addActionListener(e -> {

            dispose();
            new InterviewFrame("Behavioral");
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Reusable Styled Button

    private JButton createButton(String text) {

        JButton button =
                new JButton(text);

        button.setFont(
                new Font("Segoe UI",
                        Font.BOLD,
                        16));

        button.setBackground(
                new Color(37, 99, 235));

        button.setForeground(
                Color.WHITE);

        button.setFocusPainted(false);

        button.setBorderPainted(false);

        button.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        return button;
    }
}