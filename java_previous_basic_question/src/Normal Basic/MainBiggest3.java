//Read three integer value from the user and print the biggest one.
import java.util.Scanner;
class MainBiggest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integer");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int big=x;
        if(big<y)
        big = y;
        if(big<z)
        big=z;
        System.out.println("Biggest is : "+big);

    }
}