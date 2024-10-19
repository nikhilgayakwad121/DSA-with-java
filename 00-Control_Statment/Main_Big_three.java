import java.util.Scanner;

public class Main_Big_three {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a> c)
        {
            System.out.println(a+" is big");
        }
        else if(b>c)
        {
            System.out.println(b+" is big");
        }
        else
        {
            System.out.println(c+" is big");
        }

    }
}
