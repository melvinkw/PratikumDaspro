import java.util.Scanner;

public class ifCetakKRS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- Pint KRS Siakad ---");
        System.out.println("Have the tuition fees been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if(uktLunas){
            System.out.println("UKT Payment has been verified");
            System.out.println("KRS now can be printed and you can ask the academic advisor to sign it ");
        } else {
            System.out.println("Regisration rejected. Please pay UKT firstz");
        }

        System.out.println("\n=== Using Ternary Operator ===");
        String result = uktLunas ? 
            "UKT payment verified\nPlease print KRS and ask for Academic Advisor signature" : 
            "Registration rejected. Please pay UKT first";
        System.out.println(result);
        sc.close();
    }
}
