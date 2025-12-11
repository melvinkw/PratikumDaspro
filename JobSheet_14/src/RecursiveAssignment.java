import java.util.Scanner;

public class RecursiveAssignment {

    public static void descendingRecursive(int n) {
        if (n < 0) return;
        System.out.print(n + " ");
        descendingRecursive(n - 1);
    }

    public static void descendingIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static boolean isPrimeRecursive(int n, int divisor) {
        if (n <= 2) return (n == 2);
        if (n % divisor == 0) return false;
        if (divisor * divisor > n) return true;
        return isPrimeRecursive(n, divisor + 1);
    }

    public static int fibonacciPairs(int month) {
        if (month == 1 || month == 2) return 1;
        return fibonacciPairs(month - 1) + fibonacciPairs(month - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Soal 1
        System.out.print("Masukkan n untuk urutan turun: ");
        int n1 = scanner.nextInt();
        System.out.print("Rekursif: ");
        descendingRecursive(n1);
        System.out.print("\nIteratif: ");
        descendingIterative(n1);
        
        // Soal 2
        System.out.print("\n\nMasukkan n untuk penjumlahan: ");
        int n2 = scanner.nextInt();
        System.out.println("Hasil penjumlahan: " + sumRecursive(n2));
        
        // Soal 3
        System.out.print("\nMasukkan bilangan untuk cek prima: ");
        int n3 = scanner.nextInt();
        boolean prime = isPrimeRecursive(n3, 2);
        System.out.println(n3 + " adalah bilangan prima? " + prime);
        
        // Soal 4
        System.out.print("\nMasukkan bulan yang diinginkan: ");
        int month = scanner.nextInt();
        System.out.println("\nJumlah pasangan marmut bulan ke "+month+": " + fibonacciPairs(month));
        
        scanner.close();
    }
}