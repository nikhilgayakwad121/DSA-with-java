package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;

public class Print_N_times {

    static void func(int i, int n){

        // Base Condition.
        if(i>n) return;

        System.out.println("Nikhil"+ i);

        // Function call to print till i increments.
        func(i+1,n);

    }
    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        int n = 3;
        func(1,n);
    }

//    Time Complexity:
//    O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

//
//    Space Complexity:
//    O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
}
