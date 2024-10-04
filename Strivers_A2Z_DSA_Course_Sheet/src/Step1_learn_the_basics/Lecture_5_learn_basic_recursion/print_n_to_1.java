package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;

public class print_n_to_1 {
    public static void main(String[] args) {
        int n = 3;
        func(n,n);
    }
     static void func(int i , int n){
         if(i<0)
        {
            return;
        }
         System.out.println(i+" ");
         func(i-1,n);

    }

}
