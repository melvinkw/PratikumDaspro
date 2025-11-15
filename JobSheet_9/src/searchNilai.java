import java.util.Scanner;

public class searchNilai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = 0;
        int key = 0 ;
        int hasil = 0;

        System.out.println("Masukkan banyaknya nilai yang akan di input: ");
        input = sc.nextInt();

        int[] arrNilai = new int [input];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        for (int i = 0; i < arrNilai.length; i++) {

            System.out.println("Masukkan nilai yang ingin di cari: ");
            key = sc.nextInt();
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai "+ key +" ketemu di indeks ke-" + hasil);
        System.out.println();

        sc.close();
    }
}
