import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaTiket = 50000, totalHargaPerHari = 0, totalHarga;
        int tiket, totalTiket = 0;
        String namaPelanggan;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.println("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();
            if (tiket < 0) {
                System.out.println("jumlah tiket tidak valid. Masukkan lagi jumlah tiket yang valid!");
                continue;
            }
            totalTiket += tiket;

            if (tiket >= 10) {
                totalHarga = (tiket * hargaTiket) * 0.85 ;
                System.out.println("Total harga tiket " +namaPelanggan + " adalah: " + totalHarga);
                totalHargaPerHari += totalHarga;
            } else if (tiket >=4) {
                totalHarga = (tiket * hargaTiket) * 0.9 ;
                System.out.println("Total harga tiket " +namaPelanggan + " adalah: " + totalHarga);
                totalHargaPerHari += totalHarga;
            } else {
                totalHarga = tiket * hargaTiket ;
                System.out.println("Total harga tiket " +namaPelanggan + " adalah: " + totalHarga);
                totalHargaPerHari += totalHarga;
            }
            sc.nextLine();

        } while (true);

        System.out.println(" Semua transaksi selesai. ");
        System.out.println("Jumlah tiket hari ini adalah "+totalTiket);
        System.out.println("Total penjualan tiket hari ini adalah "+totalHargaPerHari);

        sc.close();
    }
}
