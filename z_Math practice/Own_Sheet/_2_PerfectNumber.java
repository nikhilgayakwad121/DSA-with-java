package Own_Sheet;
import java.util.Scanner;

public class _2_PerfectNumber {

    // Function to check if a number is perfect
    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Find divisors of num and sum them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // A perfect number is equal to the sum of its divisors (excluding itself)
        return sum == num;
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}
