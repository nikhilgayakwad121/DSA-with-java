//WAJP to read student mark of a student and print the student is either pass or fail
package Control_Statment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainStudentResult {
    public static void main(String[] args) {
        System.out.println(" Enter the marks of all the subject");
        Scanner sc = new Scanner(System.in);
        int physics= sc.nextInt();
        int chemistry = sc .nextInt();
        int maths = sc. nextInt();
        if(physics>=35&& chemistry>=35&& maths>=35){
            System.out.println("pass, congrats");
        }
        else
            System.out.println("fail");

    }
}
