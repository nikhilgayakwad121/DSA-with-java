package Strivers_Basic_Recursion_Sheet;

public class _4_print_N_to_1 {
    static void func(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        func(n);
    }
}


//By backtracking
class backtracking_n_to_1 {
    static void funCall(int i, int n){
        // base condition
        if(i>n){
            return;
        }

        //function call to print
        funCall(i+ 1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n =5;
        funCall(1, n);
    }
}