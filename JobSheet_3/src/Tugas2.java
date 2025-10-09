import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        double distance, gas_needed, cost;
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance Malang - Surabaya (km): ");
        distance = sc.nextDouble();
        gas_needed = distance / 2;
        cost = gas_needed * 10000;
        System.out.println("2km = 1 liter of fuel.");
        System.out.println("Fuel price: 10,000/liter");
        System.out.println("Distance: " + distance);
        System.out.println("---------------------------------");
        System.out.println("Fuel cost: Rp" + cost);
        sc.close();
    }
}