import java.util.Scanner;

public class siakadFor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade, highest = 0, lowest = 100;
        int n;
        int passed = 0, failed = 0;

        System.out.println("Masukkan ingin berapa kali mengulang: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter the grade of the -" +i + " student: ");
            grade = sc.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

             if (grade >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("The highest grade: "+highest);
        System.out.println("The lowest grade: "+lowest);
        System.out.println("Number of students passed: " + passed);
        System.out.println("Number of students failed: " + failed);

        sc.close();
    }
}
