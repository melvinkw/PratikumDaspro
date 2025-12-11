import java.util.Scanner;

public class CubeStudent15 {
    
    public static double calculateSurfaceArea(double side) {
        return 6 * side * side;
    }
    
    public static double calculateVolume(double side) {
        return side * side * side;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG KUBUS");
        System.out.println("========================");
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double side = scanner.nextDouble();

        double surfaceArea = calculateSurfaceArea(side);
        double volume = calculateVolume(side);
        
        System.out.println("\nHASIL PERHITUNGAN:");
        System.out.println("Luas permukaan kubus: " + surfaceArea);
        System.out.println("Volume kubus: " + volume);
        
        scanner.close();
    }
}