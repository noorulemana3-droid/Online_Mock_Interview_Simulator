package util;

import model.Question;
import java.util.ArrayList;
import java.util.Collections;

public class QuestionManager {

    private ArrayList<Question> questions;

    public QuestionManager() {

        questions = new ArrayList<>();
        loadQuestions();
    }

    private void loadQuestions() {

        // ==========================
        // TECHNICAL QUESTIONS
        // ==========================

        questions.add(new Question(
                "Technical",
                "What does OOP stand for?",
                "Object Oriented Programming",
                "Operating Output Process",
                "Online Object Platform",
                "None",
                "Object Oriented Programming"));

        questions.add(new Question(
                "Technical",
                "Which keyword is used for inheritance?",
                "implement",
                "extends",
                "super",
                "this",
                "extends"));

        questions.add(new Question(
                "Technical",
                "Which collection stores unique values?",
                "ArrayList",
                "LinkedList",
                "HashSet",
                "Vector",
                "HashSet"));

        questions.add(new Question(
                "Technical",
                "Which method is the entry point of Java?",
                "start()",
                "main()",
                "run()",
                "init()",
                "main()"));

        questions.add(new Question(
                "Technical",
                "Which principle hides data?",
                "Inheritance",
                "Polymorphism",
                "Encapsulation",
                "Abstraction",
                "Encapsulation"));

        questions.add(new Question(
                "Technical",
                "JVM stands for?",
                "Java Variable Machine",
                "Java Virtual Machine",
                "Java Verified Method",
                "Java Visual Manager",
                "Java Virtual Machine"));

        questions.add(new Question(
                "Technical",
                "Which operator compares values?",
                "=",
                "==",
                "!=",
                "&&",
                "=="));

        questions.add(new Question(
                "Technical",
                "Java is a?",
                "Database",
                "Programming Language",
                "Browser",
                "Compiler",
                "Programming Language"));

        // ==========================
        // HR QUESTIONS
        // ==========================

        questions.add(new Question(
                "HR",
                "What is considered a strength?",
                "Laziness",
                "Hardworking",
                "Carelessness",
                "Ignoring Deadlines",
                "Hardworking"));

        questions.add(new Question(
                "HR",
                "Why should we hire you?",
                "No Skills",
                "I am Interested",
                "Strong Skills",
                "Luck",
                "Strong Skills"));

        questions.add(new Question(
                "HR",
                "What is important in a workplace?",
                "Professionalism",
                "Sleeping",
                "Avoiding Work",
                "Complaints",
                "Professionalism"));

        questions.add(new Question(
                "HR",
                "A good employee should be?",
                "Punctual",
                "Late",
                "Careless",
                "Unmotivated",
                "Punctual"));

        questions.add(new Question(
                "HR",
                "What should you do when facing challenges?",
                "Give Up",
                "Stay Calm",
                "Blame Others",
                "Avoid Work",
                "Stay Calm"));

        questions.add(new Question(
                "HR",
                "Which quality is valued most?",
                "Teamwork",
                "Dishonesty",
                "Laziness",
                "Negativity",
                "Teamwork"));

        questions.add(new Question(
                "HR",
                "Why do companies conduct interviews?",
                "Entertainment",
                "Assess Candidates",
                "Waste Time",
                "Marketing",
                "Assess Candidates"));

        questions.add(new Question(
                "HR",
                "What should you do before an interview?",
                "Prepare",
                "Ignore Research",
                "Arrive Late",
                "Sleep",
                "Prepare"));

        // ==========================
        // BEHAVIORAL QUESTIONS
        // ==========================

        questions.add(new Question(
                "Behavioral",
                "Good teamwork requires?",
                "Communication",
                "Conflict",
                "Silence",
                "Ignoring Others",
                "Communication"));

        questions.add(new Question(
                "Behavioral",
                "How should you handle stress?",
                "Panic",
                "Stay Organized",
                "Quit",
                "Ignore Tasks",
                "Stay Organized"));

        questions.add(new Question(
                "Behavioral",
                "Leadership means?",
                "Guiding Others",
                "Controlling Everyone",
                "Avoiding Work",
                "Complaining",
                "Guiding Others"));

        questions.add(new Question(
                "Behavioral",
                "How should conflicts be resolved?",
                "Discussion",
                "Arguments",
                "Ignoring",
                "Fighting",
                "Discussion"));

        questions.add(new Question(
                "Behavioral",
                "A team player should?",
                "Collaborate",
                "Work Alone",
                "Ignore Team",
                "Create Problems",
                "Collaborate"));

        questions.add(new Question(
                "Behavioral",
                "What is time management?",
                "Planning Tasks",
                "Wasting Time",
                "Delaying Work",
                "Ignoring Priorities",
                "Planning Tasks"));

        questions.add(new Question(
                "Behavioral",
                "How should feedback be treated?",
                "Learning Opportunity",
                "Insult",
                "Ignored",
                "Avoided",
                "Learning Opportunity"));

        questions.add(new Question(
                "Behavioral",
                "What should you do after failure?",
                "Learn and Improve",
                "Quit",
                "Blame Others",
                "Ignore It",
                "Learn and Improve"));
    }

    // Search Questions by Category

    public ArrayList<Question> searchQuestion(String category) {

        ArrayList<Question> result = new ArrayList<>();

        for (Question q : questions) {

            if (q.getCategory().equalsIgnoreCase(category)) {

                result.add(q);
            }
        }

        return result;
    }

    // Random 5 Questions

    public ArrayList<Question> getRandomQuestions(String category) {

        ArrayList<Question> selected =
                searchQuestion(category);

        Collections.shuffle(selected);

        int limit = Math.min(5, selected.size());

        return new ArrayList<>(
                selected.subList(0, limit));
    }

    // Total Questions

    public int getTotalQuestions() {

        return questions.size();
    }
}