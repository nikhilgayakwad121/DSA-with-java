import java.util.Scanner;

public class twoDigitno_not {

    public static void main(String[] args) {
        System.out.println(" Enter two integer");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>= 99 && n<=-99){
            System.out.println(" Two digit number ");
        }
        else
            System.out.println(" Not a digit number ");
    }
}
