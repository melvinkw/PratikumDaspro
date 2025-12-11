public class FruitSales {

    static String[] fruits = {"Apple", "Orange", "Grape", "Kiwi", "Guava"};
    static int[][] sales = new int[5][7]; // 5 fruits, 7 days

    // a) Function to input fruit sales data (manual input based on the table)
    public static void inputData() {
        int[][] data = {
            {20, 19, 25, 20, 10, 0, 10},   // Apple
            {30, 30, 40, 10, 15, 20, 25},  // Orange
            {5, 0, 20, 25, 10, 5, 45},     // Grape
            {50, 0, 7, 8, 0, 30, 60},      // Kiwi
            {15, 10, 16, 15, 10, 10, 5}    // Guava
        };

        // Copy data to sales[][]
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < 7; j++) {
                sales[i][j] = data[i][j];
            }
        }
    }

    // b) Function to display all fruit sales
    public static void displayAllData() {
        System.out.println("\n=== Fruit Sales Data (Day 1 - Day 7) ===");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
    }

    // c) Function to find which day has the biggest total sales
    public static void biggestSalesDay() {
        int maxTotal = 0;
        int bestDay = 0;

        for (int day = 0; day < 7; day++) {
            int sum = 0;
            for (int fruit = 0; fruit < 5; fruit++) {
                sum += sales[fruit][day];
            }

            if (sum > maxTotal) {
                maxTotal = sum;
                bestDay = day;
            }
        }

        System.out.println("\nDay with biggest total sales: Day " + (bestDay + 1));
        System.out.println("Total sold = " + maxTotal);
    }

    // d) Function to display best-selling fruit each day
    public static void bestFruitEachDay() {
        System.out.println("\n=== Best-Selling Fruit Per Day ===");

        for (int day = 0; day < 7; day++) {
            int max = -1;
            String bestFruit = "";

            for (int fruit = 0; fruit < 5; fruit++) {
                if (sales[fruit][day] > max) {
                    max = sales[fruit][day];
                    bestFruit = fruits[fruit];
                }
            }

            System.out.println("Day " + (day + 1) + ": " + bestFruit + " (" + max + ")");
        }
    }

    public static void main(String[] args) {
        inputData();         // Load sales data
        displayAllData();    // Print table
        biggestSalesDay();   // Find top sales day
        bestFruitEachDay();  // Show best fruit per day
    }
}
