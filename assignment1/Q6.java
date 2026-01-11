import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Trapezoid Area Calculator");
        System.out.println("Formula: Area = h * (a + b) ÷ 2");
        System.out.println("where: a, b = parallel sides, h = height\n");
        

        System.out.print("Enter length of first parallel side (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter length of second parallel side (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter height (perpendicular distance between sides): ");
        double h = scanner.nextDouble();
        

        double k = h * (a + b) / 2;
        

        System.out.println("\n Calculation Result");
        System.out.println("Area of Trapezoid is: " + k + " square units");
        
        scanner.close();
    }
}
