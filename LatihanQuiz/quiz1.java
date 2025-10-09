package LatihanQuiz;
import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        double panjang, lebar, luas, inci = 2.54, luas_dlm_inci, tarif_per_inci, total;
        Scanner sc = new Scanner(System.in);
        panjang = sc.nextDouble();
        lebar = sc.nextDouble();
        tarif_per_inci = sc.nextDouble();
        luas = panjang * lebar;
        luas_dlm_inci = luas / inci;
        total = tarif_per_inci * luas_dlm_inci;
        System.out.println(total);

        

    }
}
