import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sums for even and odd digits
        int evenSum = 0;
        int oddSum = 0;

        // Special case: If the number is 0, treat it as having 0 even and odd sum
        if (number == 0) {
            evenSum = 0;
            oddSum = 0;
        } else {
            // Using a do-while loop to extract digits and sum them based on even/odd
            do {
                int digit = number % 10;  // Extract the last digit

                if (digit % 2 == 0) {
                    evenSum += digit;  // Add to even sum if the digit is even
                } else {
                    oddSum += digit;   // Add to odd sum if the digit is odd
                }

                number /= 10;  // Remove the last digit
            } while (number != 0);  // Continue until the number becomes 0
        }

        // Display the results
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
