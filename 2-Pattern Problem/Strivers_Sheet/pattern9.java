package Strivers_Sheet;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        //erect pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //invert pyramid
        for (int i = 0; i < n ; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
