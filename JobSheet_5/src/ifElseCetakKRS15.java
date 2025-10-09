import java.util.Scanner;

public class ifElseCetakKRS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Masukkan Semester Saat: ");
        int semester = sc.nextInt();
        
         if (semester == 1) {
            System.out.println("Semester 1 KRS displayed");
        } else if (semester == 2) {
            System.out.println("Semester 2 KRS displayed");
        } else if (semester == 3) {
            System.out.println("Semester 3 KRS displayed");
        } else if (semester == 4) {
            System.out.println("Semester 4 KRS displayed");
        } else if (semester == 5) {
            System.out.println("Semester 5 KRS displayed");
        } else if (semester == 6) {
            System.out.println("Semester 6 KRS displayed");
        } else if (semester == 7) {
            System.out.println("Semester 7 KRS displayed");
        } else if (semester == 8) {
            System.out.println("Semester 8 KRS displayed");
        } else {
            System.out.println("Invalid semester");
        }
        sc.close();
    }
}
