package Step1_learn_the_basics.Lecture_2_build_up_logical_thinking;

import java.util.Scanner;

public class pattern {
    static void  pattern1(int n){
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0; j < n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        for(int i=0; i < n ;i++){
            for(int j=0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i =1 ;i<=n; i++){
            for(int j =1 ;j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for(int i = 1; i<=n ; i++){
            for(int j =1 ; j<= i ;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = n ; j > i ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i = n ; i > 0 ; i--){
            for(int j=1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void pattern7(int n){
        // This is the outer loop which will loop for the rows.
        for (int i = 0; i < n; i++)
        {
            // For printing the spaces before stars in each row
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0;j< 2*i+1;j++){

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
    static void pattern8(int n) {
        // This is the outer loop which will loop for the rows.
        for (int i = 0; i < n; i++)
        {
            // For printing the spaces before stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0;j< 2*n -(2*i +1);j++){

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
    static void pattern9(int n){
        //erect pyramid
        for(int i = 0 ; i < n ;i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for(int j= 0; j< 2* i +1 ;j++){
                System.out.print("*");
            }
            for(int j=0 ; j< n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        //inverted pyramid
        for(int i =0 ;i< n;i++){

            for(int j=0;j< i;j++){
                System.out.print(" ");
            }
            for(int j=0;j< n*2 -i*2 -1 ;j++){
                System.out.print("*");
            }
            for(int j=0;j< i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        // Outer loop for number of rows.
        for(int i=1;i<=2*n-1;i++){

            // stars would be equal to the row no. uptill first half
            int stars = i;

            // for the second half of the rotated triangle.
            if(i>n) {
                stars = 2 * n - i;
            }

            // for printing the stars in each row.
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
    static void pattern11(int n){
        int start = 1;

        for(int i =0; i< n; i++){
            if(i%2==0)
                start =1;
            else
                start =0;

            for (int j =0;j<=i ;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }


            System.out.println();
        }

    }
    static void pattern12(int n) {
        int spaces =2*(n-1);

        for (int i = 1; i <=n; i++) {

            for(int j= 1 ;j <= i ; j++ ){
                System.out.print(j);
            }

            for (int j = 1; j<= spaces; j++) {
                System.out.print(" ");
            }

            for(int j = i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
             spaces-=2;
        }

    }




    public static void main(String[] args) {
        System.out.println(" Enter the n value");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        There are 4 general rules for solving a pattern-based question:-
//
//        We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
//        Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
//        We print the ‘*’ inside the inner loop.
//        Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns.
         pattern12(n);

    }
}
