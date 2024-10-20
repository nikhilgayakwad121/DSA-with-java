//print biggest three value by double
import java.util.Scanner;
class MainBiggestDouble{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three double values");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double big=x;
        if(big<y)
         big=y;
        if(big<z)
         big=z;
        System.out.println("Biggest is "+big);
    }
}