import java.util.Scanner;

public class midterm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double uts_algoritma, uas_algoritma, tugas_algoritma;
        double uts_SD, uas_SD, tugas_SD;
        double nilai_akhir_algoritma, nilai_akhir_SD, rata_rata;
        String status_algoritma, status_SD, status_semester, nilai_huruf_algoritma, nilai_huruf_SD;
        String nama_mahasiswa, nim_mahasiswa;

        System.out.println("=== STUDENT DATA INPUT ===");
        System.out.print("Name\t: ");
        nama_mahasiswa = input.nextLine();
        System.out.print("NIM\t: ");
        nim_mahasiswa = input.nextLine();

        System.out.println("\n--- Course 1: Algorithms and Programming");
        System.out.print("Mid-term Exam Score\t: ");
        uts_algoritma = input.nextDouble();
        System.out.print("Final Exam Score\t: ");
        uas_algoritma = input.nextDouble();
        System.out.print("Assignment Score\t: ");
        tugas_algoritma = input.nextDouble();

        System.out.println("\n--- Course 2: Data Structure");
        System.out.print("Mid-term Exam Score\t: ");
        uts_SD = input.nextDouble();
        System.out.print("Final Exam Score\t: ");
        uas_SD = input.nextDouble();
        System.out.print("Assignment Score\t: ");
        tugas_SD = input.nextDouble();

        nilai_akhir_algoritma = (uts_algoritma * 0.3) + (uas_algoritma * 0.4) + (tugas_algoritma * 0.3);
        if (nilai_akhir_algoritma >= 80) {
            nilai_huruf_algoritma = "A";
            status_algoritma = "PASS";
        } else if (nilai_akhir_algoritma >= 73) {
            nilai_huruf_algoritma = "B";
            status_algoritma = "PASS";
        } else if (nilai_akhir_algoritma >= 65) {
            nilai_huruf_algoritma = "C";
            status_algoritma = "PASS";
        } else if (nilai_akhir_algoritma >= 60) {
            nilai_huruf_algoritma = "D";
            status_algoritma = "NOT PASSED";
        } else {
            nilai_huruf_algoritma = "E";
            status_algoritma = "NOT PASSED";
        }

        nilai_akhir_SD = (uts_SD * 0.3) + (uas_SD * 0.4) + (tugas_SD * 0.3);
         if (nilai_akhir_SD >= 85) {
            nilai_huruf_SD = "A";
            status_SD = "PASS";
        } else if (nilai_akhir_SD >= 70) {
            nilai_huruf_SD = "B";
            status_SD = "PASS";
        } else if (nilai_akhir_SD >= 60) {
            nilai_huruf_SD = "C";
            status_SD = "PASS";
        } else if (nilai_akhir_SD >= 50) {
            nilai_huruf_SD = "D";
            status_SD = "NOT PASSED";
        } else {
            nilai_huruf_SD = "E";
            status_SD = "NOT PASSED";
        }

        rata_rata = (nilai_akhir_algoritma + nilai_akhir_SD) / 2;

        if (status_algoritma.equals("PASS") && status_SD.equals("PASS")) {
            if (rata_rata >= 70) {
                status_semester = "PASS SEMESTER";
            } else {
                status_semester = "NOT PASSED SEMESTER (Average score < 70)";
            }
        } else {
            status_semester = "NOT PASSED SEMESTER (There are failed courses)";
        }

        System.out.println("\n==================== ACADEMIC ASSESSMENT RESULTS ====================");
        System.out.println("Name\t: " + nama_mahasiswa);
        System.out.println("NIM\t: " + nim_mahasiswa);
        System.out.printf("\n%-25s %-8s %-8s %-8s %-12s %-12s %-15s%n", "Course", "Mid-term", "Final", "Assignment", "Final Score", "Letter Grade", "Status");
        System.out.println("================================================================================================================");
        System.out.printf("%-25s %-8.1f %-8.1f %-11.1f %-15.2f %-12s %-15s%n", "Algorithms Programming", uts_algoritma, uas_algoritma, tugas_algoritma, nilai_akhir_algoritma, nilai_huruf_algoritma, status_algoritma);
        System.out.printf("%-25s %-8.1f %-8.1f %-11.1f %-15.2f %-12s %-15s%n", "Data Structure", uts_SD, uas_SD, tugas_SD, nilai_akhir_SD, nilai_huruf_SD, status_SD);
        System.out.println("================================================================================================================");
        System.out.println("Average Score: " + rata_rata);
        System.out.println("Semester Status: " + status_semester);

        input.close();
        
    }
}