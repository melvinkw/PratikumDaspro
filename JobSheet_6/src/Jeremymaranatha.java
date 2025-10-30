import java.util.Scanner;

public class Jeremymaranatha {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====INPUT DATA MAHASISWA=====");
        System.out.print("NAMA    :   ");
        String nama = sc.nextLine();
        System.out.print("NIM     :   ");
        String NIM = sc.nextLine();

        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS    :   ");
        double UTS1 = sc.nextDouble();
        System.out.print("Nilai UAS    :   ");   
        double UAS1 = sc.nextDouble();     
        System.out.print("Nilai Tugas  :   ");    
        double Tugas1 = sc.nextDouble();

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS    :   ");
        double UTS2 = sc.nextDouble();
        System.out.print("Nilai UAS    :   ");   
        double UAS2 = sc.nextDouble();     
        System.out.print("Nilai Tugas  :   ");    
        double Tugas2 = sc.nextDouble();

        String NilaiHuruf1, NilaiHuruf2, Kualifikasi, status1, status2;
        double NilaiSetara;

        //Proses 
        double finalscore1 = (UTS1 * 0.3) + (UAS1 * 0.4) + (Tugas1 * 0.3);
        double finalscore2 = (UTS2 * 0.3) + (UAS2 * 0.4) + (Tugas2 * 0.3);


        //Struktur if else untuk final score pertama
        if (finalscore1 > 80 && finalscore1 <= 100) {
            NilaiHuruf1 = "A";
            NilaiSetara = '4';
            Kualifikasi = "Sangat Baik";
        } else if (finalscore1 > 73 && finalscore1 <= 80) {
            NilaiHuruf1 = "B+";
            NilaiSetara = 3.5;
            Kualifikasi = "Lebih Dari Baik";  
        } else if (finalscore1 > 65 && finalscore1 <= 73 ) {
            NilaiHuruf1 = "B";
            NilaiSetara = 3;
            Kualifikasi = "Baik";
        } else if (finalscore1 > 60 && finalscore1 <= 65 ) {
            NilaiHuruf1 = "C+";
            NilaiSetara = 2.5;
            Kualifikasi = "Lebih Dari Cukup";
        }else if (finalscore1 > 50 && finalscore1 <= 60) {
            NilaiHuruf1 = "C";
            NilaiSetara = 2;
            Kualifikasi = "Cukup";
        } else if (finalscore1 > 39 && finalscore1 <= 50) {
            NilaiHuruf1 = "D";
            NilaiSetara = 1;
            Kualifikasi = "Kurang";
        } else {
            NilaiHuruf1 = "E";
            NilaiSetara = 0;
            Kualifikasi = "Gagal";
        } if (finalscore1 >= 60) {
            status1 = "PASS";
        } else {
            status1 = "NOT PASSED";
        }

        //Struktur if else untuk final score ke 2
                if (finalscore2 > 80 && finalscore1 <= 100) {
            NilaiHuruf2 = "A";
            NilaiSetara = '4';
            Kualifikasi = "Sangat Baik";
        } else if (finalscore2 > 73 && finalscore2 <= 80) {
            NilaiHuruf2 = "B+";
            NilaiSetara = 3.5;
            Kualifikasi = "Lebih Dari Baik";  
        } else if (finalscore2 > 65 && finalscore2 <= 73) {
            NilaiHuruf2 = "B";
            NilaiSetara = 3;
            Kualifikasi = "Baik";
        } else if (finalscore2 > 60 && finalscore2 <= 65 ) {
            NilaiHuruf2 = "C+";
            NilaiSetara = 2.5;
            Kualifikasi = "Lebih Dari Cukup";
        }else if (finalscore2 > 50 && finalscore2 <= 60) {
            NilaiHuruf2 = "C";
            NilaiSetara = 2;
            Kualifikasi = "Cukup";
        } else if (finalscore2 >39 && finalscore2 <= 50) {
            NilaiHuruf2 = "D";
            NilaiSetara = 1;
            Kualifikasi = "Kurang";
        } else {
            NilaiHuruf2 = "E";
            NilaiSetara = 0;
            Kualifikasi = "Gagal";
        } if (finalscore2 >= 60) {
            status2 = "PASS";
        } else {
            status2 = "NOT PASSED";
        }


        System.out.println("========== HASIL PENELITIAN AKADEMIK ==========");
        System.out.print("Nama    :   " + nama);
        System.out.print("NIM :   " + NIM);
        System.out.println();
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman           " + UTS1 + "\t" + UAS1 + " \t " + Tugas1 + "\t   " + (int) finalscore1 + "\t\t\t" + NilaiHuruf1 + "\t"+ status1);
        System.out.println("Struktur Data                   " + UTS2 + "\t" + UAS2 + " \t " + Tugas2 + "\t   " + (int) finalscore2 + "\t\t\t" + NilaiHuruf2 + "\t"+ status2);

        double ratarata = (finalscore1 + finalscore2) / 2;

        String semesterstatus;

        System.out.println("Rata-rata Nilai Akhir       :   " + ratarata);
        if (ratarata >= 70) {
            semesterstatus = "LULUS";
        } else {
            semesterstatus = "TIDAK LULUS";
        }
        System.out.println("Status Semester             :   " + semesterstatus);
        sc.close();
    }
}