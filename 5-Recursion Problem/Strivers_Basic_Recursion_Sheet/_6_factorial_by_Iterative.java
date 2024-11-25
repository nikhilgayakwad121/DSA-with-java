package Strivers_Basic_Recursion_Sheet;

public class _6_factorial_by_Iterative {

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <=n; i++) {

             fact = fact * i;

        }
        System.out.println(fact);
    }
}


class factorial_by_recursive{

    static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        int n =5;

        System.out.println(factorial(n));
    }
}
