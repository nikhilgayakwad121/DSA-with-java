import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Using a while loop to extract digits and calculate sum
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;             // Add the digit to sum
            number /= 10;             // Remove the last digit
        }

        // Display the result
        System.out.println("The sum of the digits is: " + sum);
    }
}
