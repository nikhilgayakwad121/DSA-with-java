import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        // Initialize factorial to 1
        long factorial = 1;

        // Using a while loop to calculate factorial
        int i = 1;
        while (i <= n) {
            factorial *= i; // Multiply current value of factorial by i
            i++; // Increment i
        }

        // Display the result
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
