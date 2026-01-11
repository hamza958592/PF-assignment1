import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        int x;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}