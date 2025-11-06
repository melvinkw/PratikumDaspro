import java.util.Scanner;

public class kafeDoWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.println("Enter customer name (type 'cancel' to exit): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.println("Number of kopi: ");
            kopi = sc.nextInt();
            System.out.println("Number of teh: ");
            teh = sc.nextInt();
            System.out.println("Number of roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total to be paid: Rp "+ totalHarga);
            sc.nextLine();
            
        } while (true);

        System.out.println("All transaction completed. ");

        sc.close();
    }
}
