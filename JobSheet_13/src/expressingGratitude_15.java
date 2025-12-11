import java.util.Scanner;

public class expressingGratitude_15 {
    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings("And I wish you all the best!");
    }
    public static String  getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people u want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you"+name+"for being the best teacher in the world. \n" + 
            "You inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static void sayAdditionalGreetings(String additionalMessage) {
        System.out.println(additionalMessage);
    }
}
