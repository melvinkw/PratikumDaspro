import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        int basicSalary;
        double bonus, totalSalary, transportAllowance = 600000, mealAllowance=400000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary (RP): ");
        basicSalary = sc.nextInt();
        bonus = 0.05*basicSalary;
        totalSalary = basicSalary+transportAllowance+mealAllowance+bonus-(0.1*basicSalary);

        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary        : Rp " + basicSalary);
        System.out.println("Transport Allowance : Rp " + transportAllowance);
        System.out.println("Meal Allowance      : Rp " + mealAllowance);
        System.out.println("Performance Bonus   : Rp " + bonus);
        System.out.println("Total Salary   : Rp " + totalSalary);
        sc.close();
    }
}
