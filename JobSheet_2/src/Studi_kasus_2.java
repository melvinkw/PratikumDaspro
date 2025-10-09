import java.util.Scanner;

public class Studi_kasus_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double wide, length, diameter, sides;

        System.out.print("Input the Wide of land (m): ");
        wide = sc.nextDouble();
        System.out.print("Input the long of land (m): ");
        length = sc.nextDouble();
        System.out.print("Input the Diameter of circle (m): ");
        diameter = sc.nextDouble();
        System.out.print("Input the Sides of square (m): ");
        sides = sc.nextDouble();

        double AreaofLand = wide * length;
        double radius = diameter / 2;
        double areaofcircular = Math.PI * radius * radius;
        double areaofsquare = sides * sides;
        double total_pool = areaofcircular + areaofsquare;
        double areaofgrass = AreaofLand - total_pool;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Area of land: " + AreaofLand + " m²");
        System.out.println("total area: " + total_pool + " m²");
        System.out.println("Area of Grass: " + areaofgrass + " m²");
        sc.close();

        
    }
}
