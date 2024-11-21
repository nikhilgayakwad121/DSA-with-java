import java.util.Scanner;

public class AverageOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum and count for the digits
        int sum = 0;
        int count = 0;

        // Special case: If the number is 0, the average should be 0
        if (number == 0) {
            System.out.println("The average of digits is: 0");
        } else {
            // Using a do-while loop to extract digits and calculate the sum and count
            do {
                int digit = number % 10;  // Extract the last digit
                sum += digit;             // Add the digit to the sum
                count++;                  // Increment the count of digits
                number /= 10;             // Remove the last digit
            } while (number != 0);        // Continue until the number becomes 0

            // Calculate and display the average of digits
            double average = (double) sum / count;
            System.out.println("The average of the digits is: " + average);
        }
    }
}
