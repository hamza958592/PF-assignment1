import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double op, dp, per;
        Scanner x;
        x = new java.util.Scanner(System.in);

        System.out.println("Enter Discounted Selling price: ");
        dp = x.nextDouble();

        System.out.println("Enter Discount percentage: ");
        per = x.nextDouble();

        op = dp / ( 1 - per / 100);
        System.out.println("Original price is: " + op);
    }
}