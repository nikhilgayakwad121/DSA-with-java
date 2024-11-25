package Strivers_Basic_Recursion_Sheet;

public class _2_PrintNames_N_times {

    static  void func(int i, int n){
        if(i>n){
            return;
        }

        System.out.println("Nikhil");
        func(i+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        func(1,n);
    }
}
