package Step1_learn_the_basics.Lecture_2_build_up_logical_thinking;

import java.util.Scanner;

public class pattern {
    static void pattern1(int n){
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

            // stars would be equal to the row no. up till first half
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
    static void pattern13(int n){
        int temp = 1;
        for(int i= 0;i<n;i++){
            for(int j = 0 ;j <=i ;j++){
                System.out.print(temp +" ");
                temp++;
            }
            System.out.println();
        }
    }
    static void pattern14(int n ){
        for(int i = 0; i< n ;i++){
            for(char ch  = 'A'; ch <='A'+ i ;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int i=0; i < n ;i++){
            for(char ch ='A'; ch <= 'A'+ n -i -1 ; ch ++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        for(int i = 0 ; i < n; i++){
            for( char ch = 'A' ; ch <= 'A' + i ; ch++ ){
                System.out.print( (char)('A' + i)+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < n - i -1 ; j ++)
            {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2* i +1)/2;
            for(int j=1 ; j <= 2 * i + 1 ; j++ ){

                System.out.print(ch);

                if(j <= breakpoint)
                    ch++;

                else
                    ch --;

            }
            for(int j=0 ; j < n-i-1 ;j++){
                System.out.print(" ");
            }


            System.out.println();

        }
    }
    static void pattern18(int N){
        for(int i = 0 ; i < N ;i++)
        {

            for(char ch =(char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1);ch++)
            {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
    static void pattern19(int N) {
        // for the upper half of the pattern.

        // initial spaces.
        int iniS = 0;
        for(int i=0;i< N;i++){

            //for printing the stars in the row.
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            //for printing the stars in the row.
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            // The spaces increase by 2 every time we hit a new row.
            iniS+=2;

            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }

        // for lower half of the pattern

        // initial spaces.
        iniS = 2*N -2;
        for(int i=1;i<=N;i++){

            //for printing the stars in the row.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            //for printing the stars in the row.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // The spaces decrease by 2 every time we hit a new row.
            iniS-=2;

            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
    }
    static void pattern20(int n){
        //initializing the spaces
        int spaces = n*2 -2;

        //outer loop
        for(int i =1; i<=n*2-1;i++){

            //stars for 1st half
            int stars = i;

            //stars for 2nd half
            if(i>n)
                stars = 2*n - i;

            //for printing the stars
            for(int j =1;j<=stars ;j++){
                System.out.print("*");
            }
            //spaces
            for(int j =1 ; j<= spaces ;j++){
                System.out.print(" ");
            }

            //stars
            for(int j= 1 ; j<= stars ; j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<n)
                spaces -=2;
            else
                spaces +=2;
        }
    }
    static void pattern21(int n){
        for(int i= 0 ; i< n ; i++){
            for ( int j= 0 ; j< n ;j++){
                if(i==0|| j==0 || i==n-1 || j==n-1 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern22(int n){
        for(int i =0; i< 2* n-1 ; i++)
        {
            for (int j = 0; j< 2* n-1 ; j++)
            {
                //initialising  the top , bottom , left and right indices of a cell

                int top = i;
                int bottom = j;
                int right = (2*n-2) - j;
                int left = (2* n -2) - i;
                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println(" Enter the n value");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
         pattern22(n);

//        There are 4 general rules for solving a pattern-based question:-
//
//        We always use nested loops for printing the patterns.
//        For the outer loop, we count the number of lines/rows and loop for them.
//        Next, for the inner loop, we focus on the number of columns and somehow
//        connect them to the rows by forming a logic such that for each row we
//        get the required number of columns to be printed.

//        We print the ‘*’ inside the inner loop.

//        Observe symmetry in the pattern or check if a pattern is a combination
//        of two or more similar patterns.
    }
}

