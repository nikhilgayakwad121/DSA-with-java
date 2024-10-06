package Step1_learn_the_basics.Lecture_4_know_basic_maths;

import java.util.ArrayList;

public class Print_all_divisiors {
    public static int[] printDivisors(int n, int[] size) {
        // Allocate memory for
        // the array of divisors
        int[] divisors = new int[n];
        // Initialize the count of divisors
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // Add the divisor to the array
                divisors[count++] = i;
            }
        }
        // Update the size parameter
        // with the count of divisors
        size[0] = count;
        // Return the array of divisors
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] size = new int[1];
        int[] divisors = printDivisors(number, size);

        System.out.print("Divisors of " + number + " are: ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();

        // Free dynamically allocated memory
        divisors = null;
    }

//        Time Complexity: O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check if it is a divisor.
//
//        Space Complexity : O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check if it is a divisor.

}


class optimal__print_divisors {
    public static ArrayList<Integer> findDivisors(int n) {
        // Initialize an empty
        // ArrayList to store the divisors
        ArrayList<Integer> divisors = new ArrayList<>();

        // Iterate up to the square
        // root of n to find divisors
        // Calculate the square root of n
        int sqrtN = (int) Math.sqrt(n);

        // Loop from 1 to the
        // square root of n
        for (int i = 1; i <= sqrtN; ++i) {
            // Check if i divides n
            // without leaving a remainder
            if (n % i == 0) {
                // Add divisor i to the list
                divisors.add(i);

                // Add the counterpart divisor
                // if it's different from i
                if (i != n / i) {
                    // Add the counterpart
                    // divisor to the list
                    divisors.add(n / i);
                }
            }
        }

        // Return the list of divisors
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
//    Complexity Analysis

//    Time Complexity: O(sqrt(N)) where N is the input number. The algorithm iterates through each number from 1 to the square root of N once to check if it is a divisor.
//
//    Space Complexity : O(2*sqrt(N))where N is the input number. This approach allocates memory for an array to hold all the divisors. The size of this array could go to be 2*(sqrt(N)).

}