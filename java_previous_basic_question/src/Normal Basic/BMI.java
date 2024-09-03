//Read the height and weight of a person and calculate and print the BMI.
import java.util.Scanner;
class BMI{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height and weight of person");
        float h = sc.nextFloat();
        float w = sc.nextFloat();

        System.out.println("BMI of the person where weight in kg and height in meter square :"+w/h*h);
        

    }
}