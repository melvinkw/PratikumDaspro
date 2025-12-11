import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double bicycle_price = 1000000, final_price,  discount = 0.05, sales_summary = 0, total_sales_per_month = 0;

        int menu;

        String[] names ={"Sito", "Semi", "Risma", "Vero", "Barri"};

        String[] months ={"January", "February", "March", "April"};

        double[][] sales = new double[names.length][months.length];

        System.out.println("Input Sales Data per names");

        for(int i = 0; i < names.length; i++){
            System.out.println("Input Sales For " + names[i] +": ");
            
            for(int j = 0; j < months.length; j++){
                System.out.print(months[j] + ": ");
                sales[i][j] = sc.nextDouble();
            }
        }

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Show Sales Summary");
            System.out.println("2. Show total sales per month");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("SALES SUMMARY");
                System.out.printf("%-10s", "Name");

                for(String month : months){
                    System.out.printf("%-15s", month);
                }

                System.out.println();

                for(int i=0; i<names.length; i++){
                    System.out.printf("%-10s", names[i]);

                    for(int j = 0; j<months.length; j++){
                        final_price = bicycle_price;

                        if (j == 1) {
                            final_price -= (final_price * discount);
                        }

                        sales_summary = sales[i][j] * final_price;

                        System.out.printf("%-15.0f", sales_summary);
                    }

                    System.out.println();
                }
            } else if (menu == 2) {

                System.out.println("\nTOTAL SALES PER MONTH ===");

                for (int m = 0; m < months.length; m++) {

                    total_sales_per_month = 0;
                    final_price = bicycle_price;

                    for (int k = 0; k < names.length; k++) {

                        final_price = bicycle_price;

                        if (m == 1) {
                            final_price -= (final_price * discount);
                        }

                        total_sales_per_month += sales[k][m] * final_price;
                    }

                    System.out.printf("%s : %.0f\n", months[m], total_sales_per_month);
                }
            } else if (menu == 3) {
                System.out.println("Thanks");
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
    }
}
