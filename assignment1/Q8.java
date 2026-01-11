import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        double a, b, c, s, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of side a of triangle:");
        a = input.nextDouble();

        System.out.println("Enter length of side b of triangle:");
        b = input.nextDouble();

        System.out.println("Enter length of side c of triangle:");
        c = input.nextDouble();

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle is: " + area);
    }
}