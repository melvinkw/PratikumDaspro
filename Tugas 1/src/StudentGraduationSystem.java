import java.util.Scanner;

public class StudentGraduationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Algorithms and Programming course
        System.out.println("=== ALGORITHMS AND PROGRAMMING COURSE ===");
        System.out.print("Enter Mid-term Exam Score (0-100): ");
        double algoMidTerm = scanner.nextDouble();
        System.out.print("Enter Final Exam Score (0-100): ");
        double algoFinalExam = scanner.nextDouble();
        System.out.print("Enter Assignment Score (0-100): ");
        double algoAssignment = scanner.nextDouble();
        
        // Input for Data Structure course
        System.out.println("\n=== DATA STRUCTURE COURSE ===");
        System.out.print("Enter Mid-term Exam Score (0-100): ");
        double dataMidTerm = scanner.nextDouble();
        System.out.print("Enter Final Exam Score (0-100): ");
        double dataFinalExam = scanner.nextDouble();
        System.out.print("Enter Assignment Score (0-100): ");
        double dataAssignment = scanner.nextDouble();
        
        // Calculate final scores for each course
        double algoFinalScore = (algoMidTerm * 0.3) + (algoFinalExam * 0.4) + (algoAssignment * 0.3);
        double dataFinalScore = (dataMidTerm * 0.3) + (dataFinalExam * 0.4) + (dataAssignment * 0.3);
        
        // Determine letter grades and pass status for each course
        String algoLetterGrade;
        String algoStatus;
        
        if (algoFinalScore >= 85) {
            algoLetterGrade = "A";
            algoStatus = "PASS";
        } else if (algoFinalScore >= 70) {
            algoLetterGrade = "B";
            algoStatus = "PASS";
        } else if (algoFinalScore >= 60) {
            algoLetterGrade = "C";
            algoStatus = "PASS";
        } else if (algoFinalScore >= 50) {
            algoLetterGrade = "D";
            algoStatus = "NOT PASSED";
        } else {
            algoLetterGrade = "E";
            algoStatus = "NOT PASSED";
        }
        
        String dataLetterGrade;
        String dataStatus;
        
        if (dataFinalScore >= 85) {
            dataLetterGrade = "A";
            dataStatus = "PASS";
        } else if (dataFinalScore >= 70) {
            dataLetterGrade = "B";
            dataStatus = "PASS";
        } else if (dataFinalScore >= 60) {
            dataLetterGrade = "C";
            dataStatus = "PASS";
        } else if (dataFinalScore >= 50) {
            dataLetterGrade = "D";
            dataStatus = "NOT PASSED";
        } else {
            dataLetterGrade = "E";
            dataStatus = "NOT PASSED";
        }
        
        // Determine semester status using nested if
        String semesterStatus;
        
        if (algoStatus.equals("PASS") && dataStatus.equals("PASS")) {
            double averageScore = (algoFinalScore + dataFinalScore) / 2;
            if (averageScore >= 70) {
                semesterStatus = "PASS";
            } else {
                semesterStatus = "NOT PASSED";
            }
        } else {
            semesterStatus = "NOT PASSED";
        }
        
        // Display results
        System.out.println("\n=== FINAL RESULTS ===");
        System.out.println("ALGORITHMS AND PROGRAMMING:");
        System.out.printf("Final Score: %.2f\n", algoFinalScore);
        System.out.println("Letter Grade: " + algoLetterGrade);
        System.out.println("Course Status: " + algoStatus);
        
        System.out.println("\nDATA STRUCTURE:");
        System.out.printf("Final Score: %.2f\n", dataFinalScore);
        System.out.println("Letter Grade: " + dataLetterGrade);
        System.out.println("Course Status: " + dataStatus);
        
        System.out.println("\nSEMESTER STATUS: " + semesterStatus);
        
        scanner.close();
    }
}