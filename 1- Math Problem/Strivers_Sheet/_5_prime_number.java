package Strivers_Sheet;

class optimal_prime_number {

    public static void main(String[] args) {

        int n = 12;
        String result = primeNumber(n);
        System.out.println(result);
    }

    static String primeNumber(int n) {
        int count = 0;
        int Sqrt = (int) (Math.sqrt(n));
        for (int i = 1; i <= Sqrt; i++) {

            if (n % i == 0) {
                count = count + 1;
                if (i != n / i)
                    count = count + 1;
            }
            if(count> 2)
                break;
        }
        if(count==2)
            return "prime no";
        else
            return "not a  prime number";
    }
//    Time Complexity: O(sqrt(N))where N is the input number. The loop iterates up to the square root of n performing constant time operations at each step.
//
//    Space Complexity : O(1) as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variables.

}



class prime_number {
    // Function to check if a
    // given number is prime.
    static boolean checkPrime(int n) {
        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;
        // Loop through numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
            }
        }

        // If the number of
        // factors is exactly 2
        if (cnt == 2) {
            // Return true, indicating
            // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else {
            // Return false, indicating
            // that the number is not prime.
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

