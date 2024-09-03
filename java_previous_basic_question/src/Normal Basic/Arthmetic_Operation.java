// perform all the arithmetic operation and display the result.

import java.util.Scanner;
class ArithmeticOperation{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first integer number ");
      int first_no = sc.nextInt();
      System.out.println("Enter the second integer number ");
      int second_no = sc.nextInt();
      System.out.println("Sum is "+(first_no+ second_no));
      System.out.println("Substraction is"+(first_no- second_no));
      System.out.println("Multiplication is "+(first_no* second_no));
      System.out.println("Reminder is  "+(first_no/ second_no));
      System.out.println("quotient is "+(first_no% second_no));

    }
}

