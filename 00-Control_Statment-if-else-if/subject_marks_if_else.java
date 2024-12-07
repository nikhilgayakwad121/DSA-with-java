import java.util.Scanner;

public class subject_marks_if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  m = sc.nextInt();
        int  p = sc.nextInt();
        int  c = sc.nextInt();
        int  b = sc.nextInt();

        double perc = (m+c+p+b)/4.0;

        if(m < 35 || p < 35 || c < 35 || b <35 )
            System.out.println("fail");
        else
            if (perc >= 85)
                System.out.println("first class");
            else if (perc >= 65)
                System.out.println("Second class");
            else if (perc >= 55)
                System.out.println("Third class");
            else
                System.out.println("pass");
    }
}
