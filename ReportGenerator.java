package report;

public class ReportGenerator {

    public static String generateFeedback(double score) {

        if(score >= 80)
            return "Excellent performance. You are interview ready.";

        if(score >= 60)
            return "Good work. Improve some concepts.";

        if(score >= 40)
            return "Average performance. More practice needed.";

        return "Needs Improvement. Focus on preparation.";
    }
}
