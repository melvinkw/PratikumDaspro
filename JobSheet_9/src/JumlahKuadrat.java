import java.util.Scanner;

public class JumlahKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int total = 0;
            
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                total = total + kuadrat;
            }
            
            System.out.println("n = " + i + " → jumlah kuadrat = " + total);
        }
        
        input.close();
    }
}