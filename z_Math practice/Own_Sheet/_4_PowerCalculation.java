package Own_Sheet;
import java.util.Scanner;

public class _4_PowerCalculation {
    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Get base and exponent from user
        System.out.print("Enter the base number (n): ");
        double n = scanner.nextDouble();
        System.out.print("Enter the exponent (p): ");
        double p = scanner.nextDouble();

        // Calculate n raised to the power p
        double result = Math.pow(n, p);

        // Output the result
        System.out.println(n + " raised to the power of " + p + " is: " + result);

        scanner.close();
    }
}
