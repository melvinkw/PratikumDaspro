import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("Enter the food/drink name to search: ");
        String searchItem = sc.nextLine();
        boolean found = false;
        for(String item : menu) {
            if (item.equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }
        System.out.println("\n===Search Result===");
        if (found) {
            System.out.println(searchItem + " is Available on the menu");
        } else{
            System.out.println(searchItem + " is Not on the menu");
        }
        sc.close();
    }
}
