import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Calculate the sum of the first n natural numbers using a for loop
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
