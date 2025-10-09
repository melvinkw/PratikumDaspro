import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Even/Odd Number Checker===");
        System.out.println("enter the number: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else{
            System.out.println("Ganjil");
        }

        sc.close();
    }
}
