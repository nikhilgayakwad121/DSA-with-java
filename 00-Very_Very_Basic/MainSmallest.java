//print smallest three integer value
import java.util.Scanner;
class MainSmallest{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int small = a;
    if(small>b)
    small = b;
    if(small>c)
    small = c;

    System.out.println("Smallest is "+ small);
    }
}