import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        double total = 0, biaya;

        do {
            System.out.println("1 = Mobil | 2 = Motor | 0 = keluar");
            System.out.println(("Masukkan jenis kendaraan (1/2/0): "));
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid, masukkan ulang!");
                continue;
            }

            System.out.println("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi < 0) {
                System.out.println("Durasi tidak valid, masukkan ulang!");
                continue;
            }

            if (durasi > 5) {
                biaya = 12500;
            } else if (jenis == 1) {
                biaya = durasi * 3000;
            } else{
                biaya = durasi * 2000;
            }

            total += biaya;

            System.out.println("Biaya Parkir kendaraan ini: Rp " + biaya);
            
        } while (true);

        System.out.println("Total pendapatan parkir hari ini: Rp "+total);

        sc.close();        
    }    
}
