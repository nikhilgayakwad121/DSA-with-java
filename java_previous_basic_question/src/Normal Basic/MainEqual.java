//Print two integer equal or not.
import java.util.Scanner;
class MainEqual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two integer number ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        if(x%y==0)
        System.out.println("integer is equal");
        else
        System.out.println("integer is not equal");

    }
}