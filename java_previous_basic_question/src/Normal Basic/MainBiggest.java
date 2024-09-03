// Read an integer value from the user and print the biggest one.
import java.util.Scanner;
class MainBiggest{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int big = x;
        if(big<y)
        big=y;
        System.out.println("Biggest is :" + big );

    }
}