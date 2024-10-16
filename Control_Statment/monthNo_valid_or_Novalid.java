import java.util.Scanner;

public class monthNo_valid_or_Novalid {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter month number");

        int m = sc.nextInt();

        if(m>=1 && m<=12)
        {
            System.out.println("valid");
        }

        else
        {
            System.out.println("Invalid");
        }
    }
}
