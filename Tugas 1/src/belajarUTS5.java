    import java.util.Scanner;

    public class belajarUTS5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double kinerja, lamaKerja, gajiPokok, bonus = 0;
            String sertifikasi;

            System.out.print("Masukkan nilai kinerja (1-100): ");
            kinerja = input.nextDouble();

            System.out.print("Masukkan lama bekerja (tahun): ");
            lamaKerja = input.nextDouble();

            System.out.print("Masukkan gaji pokok (Rp): ");
            gajiPokok = input.nextDouble();

            input.nextLine();
            System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
            sertifikasi = input.nextLine().trim();

            if (kinerja < 70) {
                System.out.println("Karyawan tidak mendapatkan bonus karena nilai kinerja di bawah 70.");
            } 
            else if (kinerja >= 70 && kinerja < 90) {
                if (lamaKerja < 2) {
                    bonus = 0.01 * gajiPokok;
                } 
                else if (lamaKerja < 5) {
                    bonus = 0.03 * gajiPokok;
                } 
                else {
                    bonus = 0.05 * gajiPokok;
                }
            } 
            else if (kinerja >= 90) {
                if (lamaKerja < 2) {
                    bonus = 0.02 * gajiPokok;
                } 
                else if (lamaKerja < 5) {
                    bonus = 0.04 * gajiPokok;
                } 
                else {
                    bonus = 0.07 * gajiPokok;
                }
            }

            if (kinerja >= 70 && sertifikasi.equals("ya")) {
                bonus = bonus + 500000;
            }

            if (kinerja >= 70) {
                System.out.println("Total bonus yang diterima: Rp " + (int)bonus);
            }

            input.close();
        }
    }
