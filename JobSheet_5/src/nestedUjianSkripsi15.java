import java.util.Scanner;

public class nestedUjianSkripsi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        
        System.out.print("Has the student been cleared compensation? (Yes/No): ");
        String compensationStatus = sc.nextLine().trim();
        
        System.out.print("Enter number of guidance logs with Supervisor 1: ");
        int supervisor1 = sc.nextInt();
        System.out.print("Enter number of guidance logs with Supervisor 2: ");
        int supervisor2 = sc.nextInt();
        
        if (compensationStatus.equalsIgnoreCase("Yes")) {
            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed! Guidance logs with Supervisor 1 are fewer than 8 times and Supervisor 2 fewer than 4";
            } else if (supervisor1 < 8) {
                message = "Failed! Guidance logs with Supervisor 1 are fewer than 8 times";
            } else {
                message = "Failed! Guidance logs with Supervisor 2 are fewer than 4 times";
            }
        } else {
            message = "Failed! The Student has not been cleared of compensation";
        }
        System.out.println(message);
        
        sc.close();
    }
}
