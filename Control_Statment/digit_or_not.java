import java.util.Scanner;

public class digit_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        if(n<= 9 && n>=-9){
            System.out.println("Entered the digit");
        }
        else
            System.out.println(" Entered not digit");
    }

}
