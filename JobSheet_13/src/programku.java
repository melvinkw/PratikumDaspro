public class programku {
    public static void TampilHinggakei(int i) {
        for (int j =1; j<=i; j++){
            System.out.println(j);
        }
    }

    public static int jumlah (int bil1, int bil2){
        return (bil1 + bil2);
    }

    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggakei(jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}
