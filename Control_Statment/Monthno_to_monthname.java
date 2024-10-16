import javax.swing.*;
import java.util.Scanner;

public class Monthno_to_monthname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month no. ");
        int m = sc.nextInt();
        if (m == 1)
            System.out.println("january");
        else if (m == 2)
            System.out.println("febuary");
        else if (m == 3)
            System.out.println("march");
        else if (m == 4)
            System.out.println("April");
        else if (m == 5)
            System.out.println("may");
        else if (m == 6)
            System.out.println("june");
        else if (m == 7)
            System.out.println("july");
        else if (m == 8)
            System.out.println("August");
        else if (m == 9)
            System.out.println("september");
        else if (m == 10)
            System.out.println("octomber");
        else if (m == 11)
            System.out.println("November");
        else if (m == 12)
            System.out.println("december");
        else
            System.out.println("Invalid");

    }
}
