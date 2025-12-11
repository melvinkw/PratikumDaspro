import java.util.Scanner;

public class siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int studentCount = sc.nextInt();

        System.out.println("Enter number of courses: ");
        int courseCount = sc.nextInt();
        sc.nextLine();

        String[] courseNames = new String[courseCount];
        System.out.println("\nEnter the course names: ");
        for (int j = 0; j < courseCount; j++) {
            System.out.print("Course " + (j + 1) + ": ");
            courseNames[j] = sc.nextLine();
        }

        int[][] grades = new int[studentCount][courseCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Input grades for student " + (i + 1) + ": ");
            double totalPerStudent = 0;

            for (int j = 0; j < courseCount; j++) {
                System.out.print("Grade for " + courseNames[j] + ": ");
                grades[i][j] = sc.nextInt();
                totalPerStudent += grades[i][j];
            }

            double avgStudent = totalPerStudent / courseCount;
            System.out.println("Average grade of student " + (i + 1) + ": " + avgStudent);
        }

        System.out.println("=================================================");
        System.out.println("Average Grade for Each Course: ");

        for (int j = 0; j < courseCount; j++) {
            double totalPerCourse = 0;

            for (int i = 0; i < studentCount; i++) {
                totalPerCourse += grades[i][j];
            }

            System.out.println("Course " + courseNames[j] + ": " + (totalPerCourse / studentCount));
        }

    }
}
