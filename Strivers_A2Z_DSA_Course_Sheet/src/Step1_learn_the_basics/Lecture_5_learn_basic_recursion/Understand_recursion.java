package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;

public class Understand_recursion {
    static int cnt = 0;
    public static void main(String[] args) {

                printStatment();
        }

    static void printStatment(){

        // Base Condition.
        if(cnt == 3 ) return;
        System.out.println(cnt);

        // Count incremented.
        cnt = cnt+1;
        printStatment();

    }
}


