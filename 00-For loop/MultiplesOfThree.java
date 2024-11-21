import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print all multiples of 3 from 1 to n
        System.out.println("Multiples of 3 from 1 to " + n + " are:");
        for (int i = 3; i <= n; i += 3) {
            System.out.print(i + " "); // Print the multiple of 3
        }
    }
}
