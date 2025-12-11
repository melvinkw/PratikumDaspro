import java.util.Scanner;

public class expreriment6_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Input Length = ");
        p = input.nextInt();
        System.out.print("Input width = ");
        l = input.nextInt();
        System.out.print("Input height = ");
        t = input.nextInt();

        input.close();

        L = calculateArea(p, l);
        System.out.println("Area of the rectangle = " + L);
        vol = calculateVolume(t, p, l);
        System.out.println("Volume of the rectangle = " +vol);

        // L = p*l;
        // System.out.println("Area of the rectangle = " + L);
        // vol = p*l*t;
        // System.out.println("Volume of the rectangle = " +vol);
    }

    static int calculateArea (int l, int w) {
        int area = l*w;
        return area;
    }

    static int calculateVolume (int l, int w, int h){
        int vol = calculateArea(l, w) * h;
        return vol;
    }

}
