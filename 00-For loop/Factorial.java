import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        // Initialize factorial to 1
        long factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= n; i++) {
            factorial = factorial*  i; // Multiply current value with i
        }

        // Display the result
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
