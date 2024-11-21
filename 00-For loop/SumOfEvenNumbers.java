import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Calculate the sum of even numbers from 1 to n
        for (int i = 2; i <= n; i += 2) { // Start from 2 and increment by 2 to get even numbers
            sum += i; // Add the even number to the sum
        }

        // Display the result
        System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);
    }
}
