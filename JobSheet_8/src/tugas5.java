import java.util.Arrays;
import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] athletes = new String[sports.length][5];

        // input data atlet
        for (int i = 0; i < sports.length; i++) {
            System.out.println("Enter 5 athletes for " + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
            System.out.println();
        }

        // tampilkan data terurut ascending per cabang
        System.out.println("=== Sorted Athlete List ===");
        for (int i = 0; i < sports.length; i++) {
            Arrays.sort(athletes[i]);
            System.out.println(sports[i] + ":");
            for (String name : athletes[i]) {
                System.out.println(" - " + name);
            }
            System.out.println();
        }

        sc.close();
    }
}
