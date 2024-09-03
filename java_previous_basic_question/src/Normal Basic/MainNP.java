//Read integer value from the user and print if it is either a positive or negative 
import java.util.Scanner;
class MainNP{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        // if(n<0)
        // System.out.println(n+ " is negative");
        // else
        // System.out.println(n+ " is positive");

       System.out.println((n>0)?n+ " is positive":n+ " is negative");
    }
}