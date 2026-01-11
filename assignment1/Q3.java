import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        double per, op, dp;
        Scanner x;
        x = new Scanner(System.in);

        System.out.println("Enter Original price: ");
        op = x.nextDouble();

        System.out.println("Enter Discount percentage: ");
        per = x.nextDouble();

        dp = op - ( op * per / 100) ;
        System.out.println("Discounted price is: " + dp);
    }
}
