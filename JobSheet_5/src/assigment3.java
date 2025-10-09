import java.util.Scanner;

public class assigment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Integrated Library and WiFi Access System ===");
        
        // Library System with Yes/No input
        System.out.println("\n--- Library Access System ---");
        System.out.print("Do you have student ID? (Yes/No): ");
        String hasID = sc.nextLine().trim().toLowerCase();
        System.out.print("Have you registered online? (Yes/No): ");
        String onlineReg = sc.nextLine().trim().toLowerCase();
        
        boolean hasStudentID = hasID.equals("yes");
        boolean onlineRegistration = onlineReg.equals("yes");
        
        if (hasStudentID || onlineRegistration) {
            System.out.println("✓ Access granted to library");
        } else {
            System.out.println("✗ Access denied to library");
        }
        
        // WiFi System
        System.out.println("\n--- Campus WiFi Access System ---");
        System.out.print("Enter user type (Lecturer/Student/Other): ");
        String userType = sc.nextLine().trim().toLowerCase();
        
        switch (userType) {
            case "lecturer":
                System.out.println("✓ WiFi access granted (lecturer)");
                break;
            case "student":
                System.out.print("Enter number of credits taken: ");
                int credits = sc.nextInt();
                
                if (credits >= 12) {
                    System.out.println("✓ WiFi access granted (active student)");
                } else {
                    System.out.println("✗ Access denied, credits less than 12");
                }
                break;
            default:
                System.out.println("✗ Access denied - invalid user type");
        }
        
        sc.close();
    }
}
