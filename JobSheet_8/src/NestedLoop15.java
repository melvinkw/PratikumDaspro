import java.util.Locale;
import java.util.Scanner;

public class NestedLoop15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[][] temps = new double[2][7]; // 5 cities, 7 days

        // fill array (same as before)
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // display using foreach and compute average per city
        System.out.println("=== Temperatures (After) ===");
        int cityIndex = 0;
        for (double[] cityTemps : temps) {
            System.out.println("City: " + cityIndex);
            double sum = 0.0;
            int day = 1;
            for (double t : cityTemps) {
                System.out.print(String.format("%.1f ", t));
                sum += t;
                day++;
            }
            double avg = sum / cityTemps.length;
            System.out.println(); // newline after row
            System.out.println(String.format("Average for City %d: %.2f\n", cityIndex, avg));
            cityIndex++;
        }

        scanner.close();
        // Scanner scanner = new Scanner(System.in);
        // double[][] temps = new double[2][3]; // 5 rows (cities), 7 cols (days)

        // // fill array
        // for (int i = 0; i < temps.length; i++) {
        //     System.out.println("City: " + i);
        //     for (int j = 0; j < temps[0].length; j++) {
        //         System.out.print("Day " + (j + 1) + ": ");
        //         temps[i][j] = scanner.nextDouble();
        //     }
        //     System.out.println();
        // }

        // // display array
        // System.out.println("=== Temperatures (Before) ===");
        // for (int i = 0; i < temps.length; i++) {
        //     System.out.println("City: " + i);
        //     for (int j = 0; j < temps[0].length; j++) {
        //         System.out.print(temps[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // scanner.close();
    }
}
