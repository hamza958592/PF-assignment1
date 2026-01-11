import java.util.Scanner;


public class Q2 {
    public static void main(String[] args){


        double c, a, r;
        double pi = 3.14;
        Scanner x;
        x = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        r = x.nextDouble();

        c = 2 * pi * r;
        a = pi * Math.pow(r, 2);

        System.out.println("The circumference of the circle is: " + c);
        System.out.println("The area of the circle is: " + a);
    }
}
