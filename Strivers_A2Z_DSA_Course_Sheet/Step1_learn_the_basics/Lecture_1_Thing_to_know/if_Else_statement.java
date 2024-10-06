package Step1_learn_the_basics.Lecture_1_Thing_to_know;
import java.util.Scanner;

public class if_Else_statement {

    String strivers = "https://takeuforward.org/if-else/if-else-statements/";

    public static void main(String[] args) {
      System.out.println("Enter your  marks");
      Scanner  sc = new Scanner(System.in);
      int marks = sc.nextInt();


        char grade;

        if (marks < 25) {
            grade = 'F';
        } else if (marks <= 44) {
            grade = 'E';
        } else if (marks <= 49) {
            grade = 'D';
        } else if (marks <= 59) {
            grade = 'C';
        } else if (marks <= 69) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'A';
        } else {
            grade = 'X'; // Use 'X' to indicate invalid marks
        }

        System.out.println("Grade: " + grade);

    }
}
