import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (min 3): ");
        int N = sc.nextInt();

        for (int baris = 1; baris <= N; baris++) {
            for (int kolom = 1; kolom <= N; kolom++) {
                if (baris == 1 || baris == N || kolom == 1 || kolom == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
        sc.close();
    }
}
