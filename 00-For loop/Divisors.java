import java.util.Scanner;

public class Divisors {

    // Function to find and print divisors of a number
    public static void findDivisors(int n) {
        System.out.print("Divisors of " + n + " are: ");
        int count = 0;
        // Loop to find all divisors from 1 to n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // If i is a divisor of n
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total count : "+ count); // Print a newline after the divisors
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and print divisors of the number
        findDivisors(number);

        scanner.close();
    }
}
