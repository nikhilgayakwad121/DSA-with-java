package Strivers_Basic_Recursion_Sheet;

public class _9_fibonacci_naive {

    public static void main(String[] args) {
        int n =5;
        if(n==0){
            System.out.println(0);
        }else{
            int fib[] = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= n ; i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }

            System.out.println("The fibonacci series up to "+ n + " th term :");




            for (int i = 0; i <= n; i++) {
                System.out.print(fib[i] + " ");
            }
        }
    }
}


class  Space_optimized{
    public static void main(String args[]) {
        int n = 5;
        if (n == 0) {
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            System.out.print(0);
        } else {
            int secondLast = 0;
            int last = 1;
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            System.out.print(secondLast + " " + last + " ");
            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;
                secondLast = last;
                last = cur;
                System.out.print(cur + " ");
            }
        }
    }
}

class By_recursion_{
    static int fibonacci(int n ){
        if(n<=1){
            return n;
        }

        int last = fibonacci(n-1);
        int secondLast = fibonacci(n-2);

        return last +secondLast;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(fibonacci(n));
    }
}