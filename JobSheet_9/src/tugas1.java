import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student grades: ");
        int count = sc.nextInt();

        int[] grades = new int[count];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        int total = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / count;

        System.out.println("\n=== Grade Summary ===");
        System.out.println("All grades entered:");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println("\n\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        sc.close();
    }
}
