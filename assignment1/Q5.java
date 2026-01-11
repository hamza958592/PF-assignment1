import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        double amp, volt, watts;
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the voltage (in volts): ");
        volt = value.nextDouble();

        System.out.println("Enter the current (in amperes): ");
        amp = value.nextDouble();

        watts = volt * amp;

        System.out.println("The power in watts is: " + watts + " Watts");
    }
}