import java.util.Scanner;

public class assignment2 {
    
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] grades = {
        {20, 19, 25, 20, 10, 0, 10},  
        {30, 30, 40, 10, 15, 20, 25},   
        {5, 0, 20, 25, 10, 5, 45},    
        {50, 0, 7, 8, 0, 30, 60},       
        {15, 10, 16, 15, 10, 10, 5}      
    };
    static int numStudents = 5;
    static int numWeeks = 7;
    

    public static void inputGradeData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nMODIFIKASI DATA NILAI");
        System.out.println("======================");
        
        System.out.println("Pilih siswa:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i+1) + ". " + students[i]);
        }
        System.out.print("Masukkan pilihan (1-5): ");
        int studentChoice = scanner.nextInt() - 1;
        
        System.out.print("Pilih minggu (1-7): ");
        int weekChoice = scanner.nextInt() - 1;
        
        System.out.print("Masukkan nilai baru: ");
        int newGrade = scanner.nextInt();
 
        if (studentChoice >= 0 && studentChoice < numStudents && 
            weekChoice >= 0 && weekChoice < numWeeks) {
            grades[studentChoice][weekChoice] = newGrade;
            System.out.println("Data berhasil diupdate!");
        } else {
            System.out.println("Input tidak valid!");
        }
    }

    public static void displayAllGrades() {
        System.out.println("\nDATA NILAI SISWA");
        System.out.println("====================================================================");
        System.out.print("Nama\t");
        for (int week = 1; week <= numWeeks; week++) {
            System.out.print("Minggu " + week + "\t");
        }
        System.out.println("Rata-rata");
        System.out.println("--------------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print(students[i] + "\t");
            int total = 0;
            
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + "\t\t");
                total += grades[i][j];
            }
            
            double average = (double) total / numWeeks;
            System.out.printf("%.2f%n", average);
        }
        System.out.println("====================================================================\n");
    }

    public static void findWeekWithHighestGrade() {
        int[] weekTotals = new int[numWeeks];
        int maxTotal = 0;
        int maxWeek = 0;

        for (int week = 0; week < numWeeks; week++) {
            int total = 0;
            for (int student = 0; student < numStudents; student++) {
                total += grades[student][week];
            }
            weekTotals[week] = total;
            
            if (total > maxTotal) {
                maxTotal = total;
                maxWeek = week;
            }
        }
        
        System.out.println("\nPERHITUNGAN NILAI PER MINGGU");
        System.out.println("=============================");
        for (int week = 0; week < numWeeks; week++) {
            System.out.println("Minggu " + (week+1) + ": " + weekTotals[week] + " poin");
        }
        System.out.println("\nMinggu dengan nilai tertinggi dari semua siswa: Minggu " + (maxWeek+1));
        System.out.println("Total nilai: " + maxTotal + " poin");
    }
    
    public static void findStudentWithHighestGrade() {
        int maxTotal = 0;
        int topStudentIndex = 0;
        
        System.out.println("\nNILAI TOTAL SETIAP SISWA");
        System.out.println("=========================");
        
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            System.out.print(students[i] + ": ");
            
            for (int j = 0; j < numWeeks; j++) {
                total += grades[i][j];
                System.out.print(grades[i][j] + " ");
            }
            
            System.out.println("= " + total + " poin");
            
            if (total > maxTotal) {
                maxTotal = total;
                topStudentIndex = i;
            }
        }
        
        System.out.println("\nSISWA DENGAN NILAI TERTINGGI");
        System.out.println("==============================");
        System.out.println("Nama: " + students[topStudentIndex]);
        System.out.println("Total nilai: " + maxTotal + " poin");
        System.out.print("Detail nilai per minggu: ");
        
        for (int week = 0; week < numWeeks; week++) {
            System.out.print(grades[topStudentIndex][week] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nSISTEM MANAJEMEN NILAI SISWA");
            System.out.println("=============================");
            System.out.println("1. Tampilkan semua nilai");
            System.out.println("2. Modifikasi data nilai");
            System.out.println("3. Cari minggu dengan nilai tertinggi");
            System.out.println("4. Cari siswa dengan nilai tertinggi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayAllGrades();
                    break;
                case 2:
                    inputGradeData();
                    break;
                case 3:
                    findWeekWithHighestGrade();
                    break;
                case 4:
                    findStudentWithHighestGrade();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}