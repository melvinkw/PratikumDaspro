import java.util.Scanner;

public class arrayAverageScore15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0;
        double average;
        int passed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
            if (score[i] > 70) {
                passed++;
            }
        }

        average = total / score.length;

        System.out.println("\n=== Score List ===");
        for (int i = 0; i < score.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + score[i]);
        }

        System.out.println("\nTotal Score : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Passed      : " + passed + " students");

        sc.close();
    }
}
