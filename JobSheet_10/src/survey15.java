import java.util.Scanner;

public class survey15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respondents = 10;
        int questions = 6;

        int[][] survey = new int[respondents][questions];

        System.out.println("=== CUSTOMER SATISFACTION SURVEY ===");

        for (int i = 0; i < respondents; i++) {
            System.out.println("\nEnter answers for Respondent " + (i + 1));

            for (int j = 0; j < questions; j++) {
                System.out.print("Score for Question " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Average Score per Respondent ===");
        for (int i = 0; i < respondents; i++) {
            double sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += survey[i][j];
            }
            double avg = sum / questions;
            System.out.println("Respondent " + (i + 1) + ": " + avg);
        }

        System.out.println("\n=== Average Score per Question ===");
        for (int j = 0; j < questions; j++) {
            double sum = 0;
            for (int i = 0; i < respondents; i++) {
                sum += survey[i][j];
            }
            double avg = sum / respondents;
            System.out.println("Question " + (j + 1) + ": " + avg);
        }

        double total = 0;
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                total += survey[i][j];
            }
        }

        double overallAvg = total / (respondents * questions);

        System.out.println("\n=== Overall Average Score ===");
        System.out.println(overallAvg);
    }
}