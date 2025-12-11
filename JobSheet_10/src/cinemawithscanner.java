import java.util.Scanner;

public class cinemawithscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2]; // 4 rows, 2 columns
        int menu;

        while (true) {
            System.out.println("\n===== CINEMA MENU =====");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (menu) {

                case 1:
                    while (true) {
                        System.out.print("Enter a name: ");
                        String name = sc.nextLine();

                        int row, column;

                        while (true) {
                            System.out.print("Enter row number (1-4): ");
                            row = sc.nextInt();
                            System.out.print("Enter column number (1-2): ");
                            column = sc.nextInt();
                            sc.nextLine();

                            if (row < 1 || row > 4 || column < 1 || column > 2) {
                                System.out.println("Invalid seat! Seat doesn't exist. Try again.");
                            } else if (audience[row - 1][column - 1] != null) {
                                System.out.println("Seat already occupied by: " + audience[row - 1][column - 1]);
                                System.out.println("Please choose another seat.");
                            } else {
                                break;
                            }
                        }

                        audience[row - 1][column - 1] = name;
                        System.out.println("Audience added successfully!");

                        System.out.print("Add another? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) break;
                    }
                    break;

                case 2:
                    System.out.println("\n===== AUDIENCE LIST =====");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(audience[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid menu!");
            }
        } 
    }
}
