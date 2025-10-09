import java.util.Scanner;

public class CalculateAreaOfRectangleMelvin {
    public static void main(String[] args) {
        Double length, width, area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = sc.nextDouble();
        System.out.println("Enter the Width of the rectangle");
        width = sc.nextDouble();
        area = length * width;

        System.out.println("The area of the rectangle is: " + area);

        sc.close();
    }
}
