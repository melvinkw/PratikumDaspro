import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int count = sc.nextInt();
        sc.nextLine(); 

        String[] orderNames = new String[count];
        double[] orderPrices = new double[count];
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of food/drink for order " + (i + 1) + ": ");
            orderNames[i] = sc.nextLine();

            System.out.print("Enter the price for " + orderNames[i] + ": ");
            orderPrices[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        double totalCost = 0;
        for (double price : orderPrices) {
            totalCost += price;
        }

        System.out.println("\n=== Order Summary ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - $" + orderPrices[i]);
        }

        System.out.println("\nTotal cost of all orders: $" + totalCost);

        sc.close();
    }
}
