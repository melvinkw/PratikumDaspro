import java.util.Scanner;

public class greetings_15 {
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you " +name+ " May the force be with u!");
    }

    public static String  getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people u want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
}
