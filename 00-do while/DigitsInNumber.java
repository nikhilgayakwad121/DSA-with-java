import java.util.Scanner;

class DigitsInNumber  {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a counter for the number of digits
        int count = 0;

        // Special case: If the number is 0, it has exactly 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Using a do-while loop to count the digits
            do {
                number /= 10;  // Remove the last digit
                count++;       // Increment the count for each digit
            } while (number != 0);  // Continue until the number becomes 0
        }

        // Display the result
        System.out.println("The number of digits is: " + count);
    }
}
