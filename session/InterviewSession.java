git package session;

import java.util.ArrayList;
import model.Question;

public class InterviewSession {

    private ArrayList<Question> questions;

    private int currentIndex;
    private int score;

    public InterviewSession(ArrayList<Question> questions) {

        this.questions = questions;
        currentIndex = 0;
        score = 0;
    }

    public Question getCurrentQuestion() {

        if(currentIndex < questions.size()) {
            return questions.get(currentIndex);
        }

        return null;
    }

    public void submitAnswer(String answer) {

        Question q = questions.get(currentIndex);

        if(answer != null &&
           answer.equalsIgnoreCase(
                   q.getCorrectAnswer())) {

            score++;
        }

        currentIndex++;
    }

    public boolean hasNext() {

        return currentIndex < questions.size();
    }

    public int getScore() {

        return score;
    }

    public int getTotalQuestions() {

        return questions.size();
    }

    public int getCurrentIndex() {

        return currentIndex;
    }

    public void resetSession() {

        currentIndex = 0;
        score = 0;
    }
}