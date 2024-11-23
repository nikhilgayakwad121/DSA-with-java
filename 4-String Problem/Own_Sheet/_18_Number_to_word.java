package Own_Sheet;

public class _18_Number_to_word {

    public static void main(String[] args) {
        int n = 1000; // Test input

        // If n is 0, special case
        if (n == 0) {
            System.out.println("zero");
            return;
        }

        // Process each part of the number
        nw(n / 10000000, "crore");
        nw((n / 100000) % 100, "lakh");
        nw((n / 1000) % 100, "thousand");
        nw((n / 100) % 10, "hundred");

        // Handle the remainder (units and tens)
        if (n % 100 != 0) {
            if (n > 100) {
                System.out.print("and ");
            }
            nw(n % 100, "");
        }
    }

    static void nw(int x, String st) {
        String[] one = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};

        String[] two = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (x < 20) {
            System.out.print(one[x] + " ");
        } else {
            System.out.print(two[x / 10] + " " + one[x % 10] + " ");
        }

        if (x != 0) {
            System.out.print(st + " ");
        }
    }
}
