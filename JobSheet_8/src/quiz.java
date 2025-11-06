import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';

        do {
            int number = rand.nextInt(10) + 1; // random 1..10
            Boolean success = false;

            System.out.println("I'm thinking of a number between 1 and 10. Try to guess it!");

            do {
                System.out.print("Guess the number (1-10): ");
                int answer;

                // handle non-integer input gracefully
                try {
                    answer = input.nextInt();
                } catch (InputMismatchException e) {
                    input.nextLine(); // clear bad input
                    System.out.println("Please enter a valid integer between 1 and 10.");
                    continue;
                }
                input.nextLine(); // consume newline

                if (answer < 1 || answer > 10) {
                    System.out.println("Out of range! Enter between 1 and 10.");
                    continue;
                }

                if (answer == number) {
                    success = true;
                    System.out.println("🎉 Correct! The number was " + number + ".");
                } else if (answer < number) {
                    System.out.println("Too low — try a bigger number.");
                } else {
                    System.out.println("Too high — try a smaller number.");
                }

            } while (!success);

            System.out.print("Do you want to play again? (Y/N): ");
            String line = input.nextLine().trim();
            if (line.isEmpty()) {
                menu = 'n';
            } else {
                menu = line.charAt(0);
            }

        } while (menu == 'Y' || menu == 'y');

        System.out.println("Thanks for playing! Bye 👋");
        input.close();

        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();

        // char menu = 'y';
        // do {
        //     int number = rand.nextInt(10)+1;
        //     boolean success = false;

        //     do {
        //         System.out.print("Guess the number (1-10): ");
        //         int answer = sc.nextInt();
        //         sc.nextLine();
        //         success = (answer == number);
        //     } while (!success);
        //     System.out.println("Do u want to repeat the game (Y/N)");
        //     menu = sc.next().charAt(0);
        //     sc.nextLine();
            
        // } while (menu == 'y' || menu == 'Y');
    }
}
