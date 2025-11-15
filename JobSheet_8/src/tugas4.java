import java.util.Arrays;
import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] sportsBranches = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        
        String[][] athleteData = new String[4][5];
        
        System.out.println("=== INPUT ATHLETE DATA FOR PORSENJ 2024 ===");
        
        for (int i = 0; i < sportsBranches.length; i++) {
            System.out.println("\nSport: " + sportsBranches[i]);
            System.out.println("Enter 5 athlete names:");
            
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athleteData[i][j] = input.nextLine();
            }
        }
        
        System.out.println("\n=== ATHLETE DATA FOR PORSENJ 2024 (ASCENDING ORDER) ===");
        
        for (int i = 0; i < sportsBranches.length; i++) {
           
            String[] sortedAthletes = athleteData[i].clone();
            Arrays.sort(sortedAthletes);
            
            System.out.println("\n" + sportsBranches[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println((j + 1) + ". " + sortedAthletes[j]);
            }
        }
        
        input.close();
    }
}