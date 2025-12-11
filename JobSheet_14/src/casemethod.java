import java.util.Scanner;

public class casemethod {
    static Scanner scanner = new Scanner(System.in);
    
    static String[][] applicants = new String[100][5]; //5 kolom yang berisikan nama, id, gpa, tipe beasiswa, dan juga pendapatan orang tua
    static int applicantCount = 0;

    public static void main(String[] args) {
        int choice;
        
        do {
            displayMenu();
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addApplicant();
                    break;
                case 2:
                    showAllApplicants();
                    break;
                case 3:
                    searchByScholarshipType();
                    break;
                case 4:
                    calculateAverageGPA();
                    break;
                case 0:
                    System.out.println("Thank you. Program finished.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        } while (choice != 0);
        
        scanner.close();
    }
    
    //fungsi untuk menampilkan daftar menu yang ada
    static void displayMenu() {
        System.out.println("===========================");
        System.out.println(" SCHOLARSHIP REGISTRATION");
        System.out.println("===========================");
        System.out.println("1. Add new applicant");
        System.out.println("2. Show all applicants");
        System.out.println("3. Search applicants by scholarship type");
        System.out.println("4. Calculate average GPA per scholarship type");
        System.out.println("0. Exit");
    }
    
    //fungsi untuk menambahkan pendaftar baru
    static void addApplicant() {

        String name, id;
        double gpa;
        int scholarshipChoice, income;
        String scholarshipType = "";
        
        System.out.println("===========================");
        System.out.println("Add New Scholarship Applicant");
        
        System.out.print("Student name    : ");
        name = scanner.nextLine();
        
        System.out.print("Student ID      : ");
        id = scanner.nextLine();
        
        do {
            System.out.print("Latest GPA      : ");
            gpa = scanner.nextDouble();
            scanner.nextLine();
            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("GPA must be between 0.0 and 4.0!");
            }
        } while (gpa < 0.0 || gpa > 4.0);

        do {
            System.out.println("Choose scholarship type:");
            System.out.println("1. Regular");
            System.out.println("2. Excellent");
            System.out.println("3. Research");
            System.out.print("Input your choice (1-3): ");
            scholarshipChoice = scanner.nextInt();
            scanner.nextLine();
            
            switch (scholarshipChoice) {
                case 1:
                    scholarshipType = "Regular";
                    break;
                case 2:
                    scholarshipType = "Excellent";
                    break;
                case 3:
                    scholarshipType = "Research";
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        } while (scholarshipChoice < 1 || scholarshipChoice > 3);
        
        do {
            System.out.print("Parents' income (max 2000000): ");
            income = scanner.nextInt();
            scanner.nextLine();
            if (income < 0 || income > 2000000) {
                System.out.println("Income must be between 0 and 2000000!");
            }
        } while (income < 0 || income > 2000000);
        
        applicants[applicantCount][0] = name;
        applicants[applicantCount][1] = id;
        applicants[applicantCount][2] = String.format("%.2f", gpa);
        applicants[applicantCount][3] = scholarshipType;
        applicants[applicantCount][4] = String.valueOf(income);
        applicantCount++;
        
        System.out.println(">> Applicant data has been added.");
    }
    
    //fungsi untuk menampilkan semua pendaftar yang ada
    static void showAllApplicants() {
        System.out.println("===========================");
        System.out.println("    List of All Scholarship Applicants ===");
        
        if (applicantCount == 0) {
            System.out.println("No applicant data yet.");
            return;
        }
        
        System.out.printf("%-4s %-20s %-15s %-6s %-12s %-10s\n", 
                          "No", "Name", "Student ID", "GPA", "Type", "Income");
        
        for (int i = 0; i < applicantCount; i++) {
            System.out.printf("%-4d %-20s %-15s %-6s %-12s %-10s\n", 
                             i + 1,
                             applicants[i][0],
                             applicants[i][1],
                             applicants[i][2],
                             applicants[i][3],
                             applicants[i][4]);
        }
    }
    
    //fungsi untuk mencari pendaftar berdasarkan tipe beasiswa yang ada
    static void searchByScholarshipType() {
        System.out.println("===========================");
        System.out.println("    Search by Scholarship Type ===");
        
        int scholarshipChoice;
        String scholarshipType = "";
        boolean found = false;

        do {
            System.out.println("Choose scholarship type:");
            System.out.println("1. Regular");
            System.out.println("2. Excellent");
            System.out.println("3. Research");
            System.out.print("Input your choice (1-3): ");
            scholarshipChoice = scanner.nextInt();
            scanner.nextLine();
            
            switch (scholarshipChoice) {
                case 1:
                    scholarshipType = "Regular";
                    break;
                case 2:
                    scholarshipType = "Excellent";
                    break;
                case 3:
                    scholarshipType = "Research";
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        } while (scholarshipChoice < 1 || scholarshipChoice > 3);
        
        System.out.printf("\n=== Applicants for %s Scholarship ===\n", scholarshipType);
        
        for (int i = 0; i < applicantCount; i++) {
            if (applicants[i][3].equals(scholarshipType)) {
                if (!found) {
                    System.out.printf("%-4s %-20s %-15s %-6s %-10s\n", 
                                     "No", "Name", "Student ID", "GPA", "Income");
                    found = true;
                }
                System.out.printf("%-4d %-20s %-15s %-6s %-10s\n", 
                                 i + 1,
                                 applicants[i][0],
                                 applicants[i][1],
                                 applicants[i][2],
                                 applicants[i][4]);
            }
        }
        
        if (!found) {
            System.out.println("No applicants found for this scholarship type.");
        }
    }
    
    //fungsi untuk menghitung rata-rata GPA per tipe beasiswa
    static void calculateAverageGPA() {
        System.out.println("===========================");
        System.out.println("    Average GPA per Scholarship Type ===");
        
        String[] scholarshipTypes = {"Regular", "Excellent", "Research"};
        
        for (String type : scholarshipTypes) {
            double totalGPA = 0;
            int count = 0;
            
            for (int i = 0; i < applicantCount; i++) {
                if (applicants[i][3].equals(type)) {
                    totalGPA += Double.parseDouble(applicants[i][2]);
                    count++;
                }
            }
            
            if (count == 0) {
                System.out.printf("No applicant for %s Scholarship.\n", type);
            } else {
                double average = totalGPA / count;
                System.out.printf("Average GPA for %s Scholarship: %.1f\n", type, average);
            }
        }
    }
}