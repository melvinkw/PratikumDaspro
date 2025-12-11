import java.util.Scanner;

public class cinema15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nama karyawan
        String[] names = {"Sito", "Semi", "Risma", "Vero", "Barri"};

        // Nama bulan
        String[] months = {"January", "February", "March", "April"};

        // Data penjualan (input user)
        int[][] sales = new int[names.length][months.length];

        // Variabel utama dengan tipe double
        double bicycle_price = 1000000;
        double discount = 0.05;

        // Input data penjualan
        System.out.println("=== INPUT SALES DATA ===");

        for (int i = 0; i < names.length; i++) {
            System.out.println("\nInput sales for " + names[i] + ":");

            for (int j = 0; j < months.length; j++) {
                System.out.print(months[j] + " : ");
                sales[i][j] = sc.nextInt();
            }
        }

        // MENU
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Show sales summary");
            System.out.println("2. Show total sales per month");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {

                System.out.println("\n=== SALES SUMMARY ===");
                System.out.printf("%-10s", "Name");

                for (String m : months) {
                    System.out.printf("%-15s", m);
                }
                System.out.println();

                for (int i = 0; i < names.length; i++) {

                    System.out.printf("%-10s", names[i]);

                    for (int j = 0; j < months.length; j++) {

                        // final price
                        double finalPrice = bicycle_price;

                        if (j == 1) {  // February discount
                            finalPrice -= (finalPrice * discount);
                        }

                        double sales_summary = sales[i][j] * finalPrice;

                        System.out.printf("%-15.0f", sales_summary);
                    }
                    System.out.println();
                }

            } else if (menu == 2) {

                System.out.println("\n=== TOTAL SALES PER MONTH ===");

                for (int m = 0; m < months.length; m++) {

                    double total_sales_per_month = 0;
                    double finalPrice = bicycle_price;

                    for (int k = 0; k < names.length; k++) {

                        finalPrice = bicycle_price;

                        if (m == 1) { // February discount
                            finalPrice -= (finalPrice * discount);
                        }

                        total_sales_per_month += sales[k][m] * finalPrice;
                    }

                    System.out.println(months[m] + " : " + total_sales_per_month);
                }

            } else if (menu == 3) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}