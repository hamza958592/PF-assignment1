import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
      int om , mm;
      double p;
      Scanner x;

      x = new Scanner(System.in);

      System.out.print("Enter the marks obtained: ");
      om = x.nextInt();


      System.out.println("Enter the maximum marks: ");
        mm = x.nextInt();


        p = 1.0 * (om * 100) / mm;

        System.out.println("The percentage is: " + p);
    }
}