package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;


public class print_1_to_n {

    static void func(int i, int n){
        if(i>n) {
            return;
        }
        System.out.println(i);
        func(i+1,n);
    }

    public static void main(String[] args) {
        int n =3;
        func(0, n);
    }
}


class print_1_to_n_using_backtracking {

    static void func(int i, int n){

        // Base Condition.
        if(i<1) return;

        // Function call to print(n-1) integers.
        func(i-1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        int n = 4;
        func(n,n);
    }
}