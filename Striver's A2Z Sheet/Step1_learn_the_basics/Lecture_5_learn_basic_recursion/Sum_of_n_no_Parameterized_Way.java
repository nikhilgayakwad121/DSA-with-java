package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;

public class Sum_of_n_no_Parameterized_Way {

    static void func(int i, int sum ){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        func(i-1, sum);

    }

    public static void main(String[] args) {
        func(5,0);
    }
}


class Sum_of_n_no_funtional_Way{
    static int funCall(int i ){
        if (i==0){
            return 0;
        }
        return i + funCall(i-1);
    }
    public static void main(String[] args) {
        int n =3;
        int sum = funCall(n);
        System.out.println(sum );
    }
}