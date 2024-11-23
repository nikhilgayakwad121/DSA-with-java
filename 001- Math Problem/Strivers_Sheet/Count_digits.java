package Strivers_Sheet;

import java.util.Scanner;

public class Count_digits {
    static int countDigit(int n)
    {
        int count = 0;
        while(n > 0){
            count += 1;
            n=n/10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digit count " +n+ " is = " +countDigit(n));
    }

}