package Own_Sheet;

import java.util.HashSet;

public class _8_HappyNumber {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappyNumber(n)); // should print true for happy numbers
    }

    static boolean isHappyNumber(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    // Helper method to calculate the sum of the squares of digits of n
    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
