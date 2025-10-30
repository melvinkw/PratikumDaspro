import java.util.Scanner;

public class belajarUTS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dayType;

        int viewerAge;
        double discount, basePrice, finalTicketPrice;

        System.out.println("Enter Day Type (weekday/weekend): ");
        dayType = sc.nextLine().trim();
        System.out.println("Enter Viewer Age: ");
        viewerAge = sc.nextInt();

        if (dayType.equalsIgnoreCase("weekday")) {
            basePrice = 40000;

            if (viewerAge <= 12) {
                discount = 0.5;
                finalTicketPrice = basePrice - (basePrice * discount);

                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + finalTicketPrice);
            } else if ( viewerAge > 12  && viewerAge < 60) {
                discount = 0;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + finalTicketPrice);
            } else if (viewerAge >= 60 ) {
                discount = 0.3;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + finalTicketPrice);
            } 
        } else {
            basePrice = 50000;

            if (viewerAge <= 12) {
                discount = 0.3;
                finalTicketPrice = basePrice - (basePrice * discount);

                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + finalTicketPrice);

            } else if ( viewerAge > 12  && viewerAge < 60) {
                if (viewerAge >= 18 && viewerAge <=25) {
                    double extraSurcharge = 0.05;
                    finalTicketPrice = basePrice + (basePrice * extraSurcharge);
                    System.out.println("extra Surcharge: " + extraSurcharge*100 + "%");
                    System.out.println("Final Ticket Price: " + finalTicketPrice);

                } else{
                    discount = 0;
                    finalTicketPrice = basePrice - (basePrice * discount);
                    System.out.println("Discount: " + discount*100 + "%");
                    System.out.println("Final Ticket Price: " + finalTicketPrice);
                }
                
            } else if (viewerAge >= 60 ) {
                discount = 0.1;
                finalTicketPrice = basePrice - (basePrice * discount);
                System.out.println("Discount: " + discount*100 + "%");
                System.out.println("Final Ticket Price: " + finalTicketPrice);
            } 
        }
        
        sc.close();
    }
}
