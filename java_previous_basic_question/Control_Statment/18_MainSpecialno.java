package Control_Statment;// print that integer is a special two digit.
import java.util.Scanner;
class mainSpecialno{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int n = sc.nextInt();
        int d1=n/10;
        int d2=n%10;

        int sum= d1+d2+d1*d2;
        if(sum == n)
        System.out.println(n+" is special two digit number");
        else
        System.out.println(n+" is not a two special digit number");
    }
}