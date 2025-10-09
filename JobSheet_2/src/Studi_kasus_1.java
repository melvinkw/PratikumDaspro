import java.util.Scanner;

public class Studi_kasus_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary, child_allowance, children;
        double potongan = 0.05, net_salary, jml_potongan;

        System.out.println("Input ur salary");
        salary = sc.nextInt();
        System.out.println("Input the child allowance");
        child_allowance = sc.nextInt();
        System.out.println("Input how many children");
        children = sc.nextInt();

        jml_potongan = salary * potongan;
        net_salary = (salary - jml_potongan) + (child_allowance*children);

        System.out.println("The net salary you get is: "+net_salary);

        sc.close();
    }
}
