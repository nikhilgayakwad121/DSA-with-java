// Recursive way of calculating the factorial of first N Numbers (functional way):

// The Factorial of a number N can be calculated by multiplying all the natural numbers till the number N. Through this approach,
// we can visualize the factorial of n natural numbers in the following way as shown below:

package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;

public class factorial_of_n_no {

    static int factOfn(int n ){
        if(n ==0){
            return 1;
        }

        return  n* factOfn(n-1);
    }

    public static void main(String[] args) {

        int n = 5;
        int fact = factOfn(n);
        System.out.println(fact);

    }
}
