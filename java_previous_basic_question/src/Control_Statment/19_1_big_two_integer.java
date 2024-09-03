package Control_Statment;

import java.util.Scanner;
class MainBigtwoint{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a>b)?a+" is biggest ":b+" is biggest");
    }
}