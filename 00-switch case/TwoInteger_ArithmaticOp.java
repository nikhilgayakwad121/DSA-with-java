import java.util.Scanner;

public class TwoInteger_ArithmaticOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Prompt user for an arithmetic operator
        System.out.print("Enter an arithmetic operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Use switch case to determine the operation
        switch (operator) {
            case '+':
                System.out.println("Result of Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result of Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result of Multiplication: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result of Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("Result of Modulus: " + (num1 % num2));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /, %.");
        }

        scanner.close();
    }
}
