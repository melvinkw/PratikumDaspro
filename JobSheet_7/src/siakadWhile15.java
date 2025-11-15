import java.util.Scanner;

public class siakadWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Enter the number of students: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("Enter the grade of the -" + (i+1) + " students: ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Invalid grade. Re-enter a valid grade!");
                continue;
            }

            if (nilai > 80 && nilai <=100) {
                System.out.println("The grade of the " + (i+1)+" student is A");
                System.out.println("Good, keep it up!");
            } else if (nilai > 73 && nilai <=80) {
                System.out.println("The grade of the " + (i+1)+" student is B+");
            } else if (nilai > 65 && nilai <=73) {
                System.out.println("The grade of the " + (i+1)+" student is B");
            } else if (nilai > 60 && nilai <=65) {
                System.out.println("The grade of the " + (i+1)+" student is C+");
            } else if (nilai > 50 && nilai <=60) {
                System.out.println("The grade of the " + (i+1)+" student is C");
            } else if (nilai > 39 && nilai <=50) {
                System.out.println("The grade of the " + (i+1)+" student is D");
            } else {
                System.out.println("The grade of the " + (i+1)+" student is E");
            }
            i++;
        }

        sc.close();
    }
}
