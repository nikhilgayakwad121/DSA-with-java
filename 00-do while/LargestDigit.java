import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the largest digit to the smallest possible value
        int largestDigit = -1;

        // Special case: If the number is 0, the largest digit is 0
        if (number == 0) {
            largestDigit = 0;
        } else {
            // Using a do-while loop to extract digits and find the largest digit
            do {
                int digit = number % 10;  // Extract the last digit

                // Update the largest digit if the current digit is greater
                if (digit > largestDigit) {
                    largestDigit = digit;
                }

                number /= 10;  // Remove the last digit
            } while (number != 0);  // Continue until the number becomes 0
        }

        // Display the largest digit
        System.out.println("The largest digit is: " + largestDigit);
    }
}
