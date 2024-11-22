import java.util.Scanner;

public class CalculatePrimeDigitsCountOrtheirSum {



    // Function to count the number of prime digits in a number
    public static int countPrimeDigits(int num) {
        int count = 0;
        int sum = 0;
        // Loop through each digit of the number
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++; // Increment count if the digit is prime
                sum += digit;
            }
            num /= 10; // Remove the last digit
        }
        System.out.println(sum);
        return count;
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count and display the number of prime digits
        int primeDigitsCount = countPrimeDigits(number);
        System.out.println("Number of prime digits in " + number + ": " + primeDigitsCount);

        scanner.close();
    }
}
