import javax.swing.*;
import java.util.Scanner;

public class Digit_three_number {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number");

        int n = sc.nextInt();

        if(n <=999 && n >= 100 || n >= -999 && n<= -100)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("no");

    }
}
