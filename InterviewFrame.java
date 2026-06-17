package gui;

import model.Question;
import report.ReportGenerator;
import report.ScoreCalculator;
import session.InterviewSession;
import util.QuestionManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InterviewFrame extends JFrame {

    private JLabel questionNoLabel;
    private JLabel questionLabel;
    private JLabel timerLabel;

    private JRadioButton option1;
    private JRadioButton option2;
    private JRadioButton option3;
    private JRadioButton option4;

    private ButtonGroup group;

    private JButton submitButton;
    private JButton resetButton;

    private JProgressBar progressBar;

    private InterviewSession session;

    private Timer timer;
    private int seconds = 15;

    public InterviewFrame(String category) {

        QuestionManager manager =
                new QuestionManager();

        ArrayList<Question> questions =
                manager.getRandomQuestions(category);

        session =
                new InterviewSession(questions);

        setTitle("Mock Interview Session");

        setSize(850, 550);

        setLayout(null);

        setLocationRelativeTo(null);

        setResizable(false);

        getContentPane().setBackground(
                new Color(248,250,252));

        // =========================
        // Heading
        // =========================

        JLabel heading =
                new JLabel("MOCK INTERVIEW SESSION");

        heading.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        26));

        heading.setForeground(
                new Color(37,99,235));

        heading.setBounds(
                220,20,400,40);

        add(heading);

        // =========================
        // Question Number
        // =========================

        questionNoLabel =
                new JLabel();

        questionNoLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16));

        questionNoLabel.setBounds(
                50,80,250,30);

        add(questionNoLabel);

        // =========================
        // Timer
        // =========================

        timerLabel =
                new JLabel("⏱ Time Left: 15");

        timerLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        16));

        timerLabel.setForeground(
                new Color(22,163,74));

        timerLabel.setBounds(
                620,80,180,30);

        add(timerLabel);

        // =========================
        // Progress Bar
        // =========================

        progressBar =
                new JProgressBar();

        progressBar.setBounds(
                50,120,730,25);

        progressBar.setStringPainted(true);

        progressBar.setForeground(
                new Color(37,99,235));

        add(progressBar);

        // =========================
        // Question Label
        // =========================

        questionLabel =
                new JLabel();

        questionLabel.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        18));

        questionLabel.setBounds(
                50,170,750,40);

        add(questionLabel);

        // =========================
        // Options
        // =========================

        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();

        Font optionFont =
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        16);

        option1.setFont(optionFont);
        option2.setFont(optionFont);
        option3.setFont(optionFont);
        option4.setFont(optionFont);

        option1.setBackground(
                new Color(248,250,252));

        option2.setBackground(
                new Color(248,250,252));

        option3.setBackground(
                new Color(248,250,252));

        option4.setBackground(
                new Color(248,250,252));

        group = new ButtonGroup();

        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        option1.setBounds(
                70,230,700,30);

        option2.setBounds(
                70,280,700,30);

        option3.setBounds(
                70,330,700,30);

        option4.setBounds(
                70,380,700,30);

        add(option1);
        add(option2);
        add(option3);
        add(option4);

        // =========================
        // Buttons
        // =========================

        submitButton =
                new JButton("Submit");

        submitButton.setBounds(
                220,450,140,40);

        submitButton.setBackground(
                new Color(22,163,74));

        submitButton.setForeground(
                Color.WHITE);

        submitButton.setFocusPainted(false);

        submitButton.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15));

        add(submitButton);

        resetButton =
                new JButton("Back");

        resetButton.setBounds(
                450,450,140,40);

        resetButton.setBackground(
                new Color(245,158,11));

        resetButton.setForeground(
                Color.WHITE);

        resetButton.setFocusPainted(false);

        resetButton.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15));

        add(resetButton);

        // =========================
        // Load First Question
        // =========================

        loadQuestion();

        startTimer();

        submitButton.addActionListener(
                e -> submitAnswer());

        resetButton.addActionListener(
                e -> {

                    timer.stop();

                    dispose();

                    new CategoryFrame();
                });

        setDefaultCloseOperation(
                EXIT_ON_CLOSE);

        setVisible(true);
    }

    private void loadQuestion() {

        Question q =
                session.getCurrentQuestion();

        if(q != null) {

            questionLabel.setText(
                    q.getQuestion());

            option1.setText(
                    q.getOption1());

            option2.setText(
                    q.getOption2());

            option3.setText(
                    q.getOption3());

            option4.setText(
                    q.getOption4());

            group.clearSelection();

            int current =
                    session.getCurrentIndex() + 1;

            int total =
                    session.getTotalQuestions();

            questionNoLabel.setText(
                    "Question "
                            + current
                            + " of "
                            + total);

            progressBar.setMaximum(
                    total);

            progressBar.setValue(
                    current);

            seconds = 15;

            timerLabel.setText(
                    "⏱ Time Left: "
                            + seconds);
        }
    }

    private String getSelectedAnswer() {

        if(option1.isSelected())
            return option1.getText();

        if(option2.isSelected())
            return option2.getText();

        if(option3.isSelected())
            return option3.getText();

        if(option4.isSelected())
            return option4.getText();

        return "";
    }

    private void submitAnswer() {

        String answer =
                getSelectedAnswer();

        session.submitAnswer(answer);

        if(session.hasNext()) {

            loadQuestion();
        }
        else {

            finishInterview();
        }
    }

    private void startTimer() {

        timer =
                new Timer(
                        1000,
                        e -> {

                            seconds--;

                            timerLabel.setText(
                                    "⏱ Time Left: "
                                            + seconds);

                            if(seconds <= 5) {

                                timerLabel.setForeground(
                                        new Color(
                                                220,
                                                38,
                                                38));
                            }

                            if(seconds <= 0) {

                                session.submitAnswer("");

                                if(session.hasNext()) {

                                    loadQuestion();
                                }
                                else {

                                    finishInterview();
                                }
                            }
                        });

        timer.start();
    }

    private void finishInterview() {

        timer.stop();

        int score =
                session.getScore();

        int total =
                session.getTotalQuestions();

        double percentage =
                ScoreCalculator.calculateScore(
                        score,
                        total);

        String grade =
                ScoreCalculator.grade(
                        percentage);

        String feedback =
                ReportGenerator.generateFeedback(
                        percentage);

        dispose();

        new DashboardFrame(
                percentage,
                grade,
                feedback);
    }
}