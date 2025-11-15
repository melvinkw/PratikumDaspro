import java.util.Scanner;

public class arrayAverageScore15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberStudent = 0;
        double totalPassed = 0;
        double totalnotpassed = 0;
        double averagepassed, averagenotpassed;
        int passed = 0, notpassed = 0;

        System.out.print( "Enter the number of students: ");
        numberStudent = sc.nextInt();

        int[] score = new int[numberStudent];
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                passed++;
                totalPassed += score[i];
            } else {
                notpassed++; 
                totalnotpassed += score [i];
            }
        }

        averagepassed = totalPassed / passed;
        averagenotpassed = totalnotpassed / notpassed;

        System.out.println("The average score of students who passed is: " + averagepassed);
        System.out.println("The average score of students who not passed is: " + averagenotpassed);


        sc.close();
    }
}
