import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize product to 1 (since 1 is the identity for multiplication)
        int product = 1;

        // If the number is 0, product should be 0 (special case)
        if (number == 0) {
            product = 0;
        } else {
            // Using a do-while loop to extract digits and calculate the product
            do {
                int digit = number % 10;  // Extract the last digit
                product *= digit;         // Multiply the digit with the product
                number /= 10;             // Remove the last digit
            } while (number != 0);        // Continue until all digits are processed
        }

        // Display the result
        System.out.println("The product of the digits is: " + product);
    }
}
