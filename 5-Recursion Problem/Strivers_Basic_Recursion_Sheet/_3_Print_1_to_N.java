package Strivers_Basic_Recursion_Sheet;

public class _3_Print_1_to_N {

    static void func(int i, int n){
        if(i>n){
            return;
        }

        System.out.println(i);
        func(i+1,n);
    }

    public static void main(String[] args) {
        int n =5;
        func(1, n);
    }
}


//By backtracking


    class backtracking{
    static void func(int i, int n){
        if(i<1){
            return;
        }

        func(i-1, n);
        System.out.println(i);

    }

    public static void main(String[]args) {

        int n = 5;
        func(n, n);
    }
    }