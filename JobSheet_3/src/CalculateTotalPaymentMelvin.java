import java.util.Scanner;

public class CalculateTotalPaymentMelvin {

    public static void main(String[] args) {
        double price, discount, totalPayment, discountCode = 0.15;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the price of the clothes (RP): ");
        price = sc.nextDouble();
        discount = discountCode*price;
        totalPayment = price - discount;
        System.out.println("Original Price: RP " + price);
        System.out.println("Discount (15%): RP " + discount);
        System.out.println("Total to be paid: RP " + totalPayment);
        sc.close();
    }
}