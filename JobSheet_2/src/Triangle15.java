import java.util.Scanner;

public class Triangle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, height;
        float area;

        System.out.println("Input Base: ");
        base = sc.nextInt();
        System.out.println("Input height: ");
        height = sc.nextInt();

        area = base * height / 2;

        System.out.println("Area of the triangle: "+area);
        sc.close();
    }
    
}
