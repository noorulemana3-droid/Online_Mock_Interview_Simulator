package gui;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame(
            double percentage,
            String grade,
            String feedback) {

        setTitle("Interview Results");

        setSize(650, 500);

        setLayout(null);

        setLocationRelativeTo(null);

        setResizable(false);

        getContentPane().setBackground(
                new Color(248,250,252));

        // =========================
        // Heading
        // =========================

        JLabel heading =
                new JLabel("INTERVIEW RESULTS");

        heading.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28));

        heading.setForeground(
                new Color(37,99,235));

        heading.setBounds(
                170,20,350,40);

        add(heading);

        // =========================
        // Score Title
        // =========================

        JLabel scoreTitle =
                new JLabel("YOUR SCORE");

        scoreTitle.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16));

        scoreTitle.setBounds(
                250,80,150,30);

        add(scoreTitle);

        // =========================
        // Percentage
        // =========================

        JLabel scoreLabel =
                new JLabel(
                        String.format("%.2f",
                                percentage)
                                + "%");

        scoreLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        42));

        scoreLabel.setBounds(
                235,110,200,60);

        scoreLabel.setForeground(
                new Color(37,99,235));

        add(scoreLabel);

        // =========================
        // Grade Badge
        // =========================

        JLabel gradeLabel =
                new JLabel(
                        grade,
                        SwingConstants.CENTER);

        gradeLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        18));

        gradeLabel.setForeground(
                Color.WHITE);

        gradeLabel.setOpaque(true);

        if(percentage >= 80) {

            gradeLabel.setBackground(
                    new Color(22,163,74));
        }

        else if(percentage >= 60) {

            gradeLabel.setBackground(
                    new Color(37,99,235));
        }

        else if(percentage >= 40) {

            gradeLabel.setBackground(
                    new Color(245,158,11));
        }

        else {

            gradeLabel.setBackground(
                    new Color(220,38,38));
        }

        gradeLabel.setBounds(
                220,190,180,40);

        add(gradeLabel);

        // =========================
        // Status Message
        // =========================

        JLabel statusLabel =
                new JLabel();

        statusLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16));

        if(percentage >= 80) {

            statusLabel.setText(
                    "Interview Status: Ready for Interviews");
        }

        else if(percentage >= 60) {

            statusLabel.setText(
                    "Interview Status: Good Candidate");
        }

        else if(percentage >= 40) {

            statusLabel.setText(
                    "Interview Status: Needs More Practice");
        }

        else {

            statusLabel.setText(
                    "Interview Status: Beginner Level");
        }

        statusLabel.setBounds(
                130,250,400,30);

        add(statusLabel);

        // =========================
        // Feedback Area
        // =========================

        JTextArea feedbackArea =
                new JTextArea();

        feedbackArea.setEditable(false);

        feedbackArea.setLineWrap(true);

        feedbackArea.setWrapStyleWord(true);

        feedbackArea.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15));

        feedbackArea.setText(
                feedback);

        JScrollPane scrollPane =
                new JScrollPane(
                        feedbackArea);

        scrollPane.setBounds(
                90,290,450,100);

        add(scrollPane);

        // =========================
        // Buttons
        // =========================

        JButton newInterviewBtn =
                new JButton(
                        "New Interview");

        newInterviewBtn.setBounds(
                120,420,160,40);

        newInterviewBtn.setBackground(
                new Color(37,99,235));

        newInterviewBtn.setForeground(
                Color.WHITE);

        newInterviewBtn.setFocusPainted(false);

        newInterviewBtn.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15));

        add(newInterviewBtn);

        JButton exitBtn =
                new JButton(
                        "Exit");

        exitBtn.setBounds(
                350,420,160,40);

        exitBtn.setBackground(
                new Color(220,38,38));

        exitBtn.setForeground(
                Color.WHITE);

        exitBtn.setFocusPainted(false);

        exitBtn.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15));

        add(exitBtn);

        // =========================
        // Actions
        // =========================

        newInterviewBtn.addActionListener(
                e -> {

                    dispose();

                    new CategoryFrame();
                });

        exitBtn.addActionListener(
                e -> System.exit(0));

        setDefaultCloseOperation(
                EXIT_ON_CLOSE);

        setVisible(true);
    }
}