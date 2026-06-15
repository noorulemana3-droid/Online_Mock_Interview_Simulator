package report;

public class ScoreCalculator {

    public static double calculateScore(int correct, int total) {

        return ((double) correct / total) * 100;
    }

    public static String grade(double score) {

        if(score >= 80)
            return "Excellent";

        if(score >= 60)
            return "Good";

        if(score >= 40)
            return "Average";

        return "Needs Improvement";
    }
}