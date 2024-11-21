import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize counters for even and odd digits
        int evenCount = 0;
        int oddCount = 0;

        // Using a while loop to extract digits and classify them as even or odd
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit

            if (digit % 2 == 0) {
                evenCount++;  // If the digit is even, increment evenCount
            } else {
                oddCount++;   // If the digit is odd, increment oddCount
            }

            number /= 10;  // Remove the last digit from the number
        }

        // Display the results
        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}
