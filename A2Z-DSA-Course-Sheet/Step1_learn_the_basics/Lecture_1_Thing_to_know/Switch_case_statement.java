package Step1_learn_the_basics.Lecture_1_Thing_to_know;


import java.util.Scanner;

//We can only use the integer and char value with switch statements.
//duplicates of case values are disallowed.
//Default Case is Optional.

public class Switch_case_statement {

    String strivers ="https://takeuforward.org/switch-case/switch-case-statements/";

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = sc.nextInt();
        System.out.println("Enter the grade");
        char grade = sc.next().charAt(0);


        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }


        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            default:
                System.out.println("Not specified.");
        }

    }
}
