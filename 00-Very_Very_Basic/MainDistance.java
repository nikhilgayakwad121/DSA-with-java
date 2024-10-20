//read the distance n terms of cm and print same distance in terms of inches , feets ,meters
import java.util.Scanner;
class MainDistance{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in terms of centimeter");
        double cm = sc.nextDouble();
        System.out.println("Distence in terms of inches : "+ cm/2.54);
        System.out.println("Distance in terms of feets : "+cm/30.45);
        System.out.println("Distance in terms of meter : "+cm/100.00);

    }
}