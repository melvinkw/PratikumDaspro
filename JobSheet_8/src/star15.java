import java.util.Scanner;

public class star15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N = ");
        int N = sc.nextInt();

        for (int i =1; i <=N; i++){
            System.out.print("*");
        }

        sc.close();
    }
}
