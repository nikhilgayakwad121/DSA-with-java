import java.util.Scanner;

public class dayno_to_dayname {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("friday");
                break;
            case 7 :
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid month number");
        }
    }
}
