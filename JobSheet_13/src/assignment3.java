import java.util.Scanner;

public class assignment3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SISTEM MANAJEMEN NILAI DINAMIS");
        System.out.println("================================");
        
        System.out.print("Masukkan jumlah siswa: ");
        int numStudents = scanner.nextInt();
        
        System.out.print("Masukkan jumlah minggu: ");
        int numWeeks = scanner.nextInt();
        
        String[] students = new String[numStudents];
        int[][] grades = new int[numStudents][numWeeks];
        
        System.out.println("\nINPUT DATA SISWA DAN NILAI");
        System.out.println("============================");
        
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine();
            System.out.print("\nMasukkan nama siswa ke-" + (i+1) + ": ");
            students[i] = scanner.nextLine();
            
            System.out.println("Masukkan nilai untuk " + students[i] + ":");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print("  Minggu ke-" + (j+1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
        
        int choice;
        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("===========");
            System.out.println("1. Tampilkan semua nilai");
            System.out.println("2. Modifikasi data nilai");
            System.out.println("3. Cari minggu dengan nilai tertinggi");
            System.out.println("4. Cari siswa dengan nilai tertinggi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayAllGrades(students, grades, numStudents, numWeeks);
                    break;
                case 2:
                    inputGradeData(students, grades, numStudents, numWeeks, scanner);
                    break;
                case 3:
                    findWeekWithHighestGrade(students, grades, numStudents, numWeeks);
                    break;
                case 4:
                    findStudentWithHighestGrade(students, grades, numStudents, numWeeks);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static void inputGradeData(String[] students, int[][] grades, 
                                     int numStudents, int numWeeks, Scanner scanner) {
        System.out.println("\nMODIFIKASI DATA NILAI");
        System.out.println("======================");
        
        System.out.println("Daftar siswa:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i+1) + ". " + students[i]);
        }
        
        System.out.print("Pilih nomor siswa (1-" + numStudents + "): ");
        int studentIdx = scanner.nextInt() - 1;
        
        if (studentIdx < 0 || studentIdx >= numStudents) {
            System.out.println("Nomor siswa tidak valid!");
            return;
        }
        
        System.out.print("Pilih minggu (1-" + numWeeks + "): ");
        int weekIdx = scanner.nextInt() - 1;
        
        if (weekIdx < 0 || weekIdx >= numWeeks) {
            System.out.println("Nomor minggu tidak valid!");
            return;
        }
        
        System.out.print("Masukkan nilai baru untuk " + students[studentIdx] + 
                        " minggu ke-" + (weekIdx+1) + ": ");
        int newGrade = scanner.nextInt();
        
        grades[studentIdx][weekIdx] = newGrade;
        System.out.println("Data berhasil diupdate!");
    }
    
    public static void displayAllGrades(String[] students, int[][] grades, 
                                       int numStudents, int numWeeks) {
        System.out.println("\nDATA NILAI SISWA");
        System.out.println("================================================================");
        
        System.out.print("Nama\t\t");
        for (int week = 1; week <= numWeeks; week++) {
            System.out.print("W" + week + "\t");
        }
        System.out.println("Total\tRata-rata");
        System.out.println("----------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s", students[i]);
            int total = 0;
            
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + "\t");
                total += grades[i][j];
            }
            
            double average = (double) total / numWeeks;
            System.out.printf("%d\t%.2f%n", total, average);
        }
        System.out.println("================================================================");
    }
    
    public static void findWeekWithHighestGrade(String[] students, int[][] grades, int numStudents, int numWeeks) {
        int[] weekTotals = new int[numWeeks];
        int maxTotal = 0;
        int maxWeekIdx = 0;
        
        System.out.println("\nTOTAL NILAI PER MINGGU");
        System.out.println("=======================");
        
        for (int week = 0; week < numWeeks; week++) {
            int total = 0;
            for (int student = 0; student < numStudents; student++) {
                total += grades[student][week];
            }
            weekTotals[week] = total;
            
            System.out.println("Minggu " + (week+1) + ": " + total + " poin");
            
            if (total > maxTotal) {
                maxTotal = total;
                maxWeekIdx = week;
            }
        }
        
        System.out.println("\nKESIMPULAN:");
        System.out.println("Minggu dengan nilai tertinggi: Minggu " + (maxWeekIdx+1));
        System.out.println("Total nilai: " + maxTotal + " poin");
        
        System.out.println("\nDetail nilai Minggu " + (maxWeekIdx+1) + ":");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i] + ": " + grades[i][maxWeekIdx] + " poin");
        }
    }
    
    public static void findStudentWithHighestGrade(String[] students, int[][] grades, 
                                                  int numStudents, int numWeeks) {
        int maxTotal = 0;
        int topStudentIdx = 0;
        
        System.out.println("\nPERINGKAT NILAI SISWA");
        System.out.println("======================");
        
        int[] studentTotals = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numWeeks; j++) {
                total += grades[i][j];
            }
            studentTotals[i] = total;
            
            if (total > maxTotal) {
                maxTotal = total;
                topStudentIdx = i;
            }
        }
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i+1) + ". " + students[i] + ": " + studentTotals[i] + " poin");
        }
        
        System.out.println("\nSISWA TERBAIK:");
        System.out.println("Nama: " + students[topStudentIdx]);
        System.out.println("Total nilai: " + maxTotal + " poin");
        System.out.print("Detail nilai: ");
        
        for (int week = 0; week < numWeeks; week++) {
            System.out.print("Minggu " + (week+1) + "=" + grades[topStudentIdx][week] + " ");
        }
        System.out.println();
    }
}