import java.util.Scanner;

public class ProductOfOddNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize product to 1 (since 1 is the identity for multiplication)
        long product = 1;

        // Calculate the product of all odd numbers from 1 to n
        for (int i = 1; i <= n; i += 2) { // Start from 1 and increment by 2 to get odd numbers
            product *= i; // Multiply the current odd number with the product
        }

        // Display the result
        System.out.println("The product of odd numbers from 1 to " + n + " is: " + product);
    }
}
