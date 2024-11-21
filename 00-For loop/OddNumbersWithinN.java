import java.util.Scanner;

public class OddNumbersWithinN {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print all odd numbers from 1 to n
        System.out.println("Odd numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.print(i + " "); // Print the odd number
            }
        }
    }
}
