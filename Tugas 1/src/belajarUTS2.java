import java.util.Scanner;

public class belajarUTS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time, drinkTemperature;
        double discount, basePrice, finalTicketPrice;

        System.out.println("Enter Time (morning/afternoon/evening): ");
        time = sc.nextLine().trim();
        System.out.println("Enter drink temperature(hot/cold): ");
        drinkTemperature = sc.nextLine().trim();

        if (time.equalsIgnoreCase("morning")) {
            if (drinkTemperature.equalsIgnoreCase("hot")) {
                basePrice = 15000;
                discount = 0.1;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + (int)finalTicketPrice);
                
            } else if (drinkTemperature.equalsIgnoreCase("cold")) {
                basePrice = 18000;
                discount = 0;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + (int)finalTicketPrice);
            }
        } else if (time.equalsIgnoreCase("afternoon")) {
            if (drinkTemperature.equalsIgnoreCase("hot")) {
                basePrice = 20000;
                discount = 0.05;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + (int)finalTicketPrice);
                
            } else if (drinkTemperature.equalsIgnoreCase("cold")) {
                basePrice = 22000;
                discount = 0.05;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + (int)finalTicketPrice);
            }
        } else if (time.equalsIgnoreCase("evening")){
            if (drinkTemperature.equalsIgnoreCase("hot")) {
                basePrice = 17000;
                discount = 0;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + (int)finalTicketPrice);
                
            } else if (drinkTemperature.equalsIgnoreCase("cold")) {
                basePrice = 19000;
                discount = 0.15;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + (int)finalTicketPrice);
            }
        }
        
        sc.close();
    }
}
