import java.util.Scanner;

public class searchNilai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = 0;
        int key = 0 ;
        int hasil = -1;

        System.out.print("Enter the number of array elements: ");
        input = sc.nextInt();

        int[] arrNilai = new int [input];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Enter the array element-"+ (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Enter the key u want to search for: ");
        key = sc.nextInt();

        for(int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("The key in the array is located at index position " + hasil);
        } else {
            System.out.println("Key not found.");
        }
        sc.close();
    }
}
