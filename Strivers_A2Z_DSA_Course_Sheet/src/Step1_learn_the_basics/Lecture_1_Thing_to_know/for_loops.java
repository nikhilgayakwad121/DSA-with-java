package Step1_learn_the_basics.Lecture_1_Thing_to_know;

public class for_loops {
    String Strivers = "https://takeuforward.org/for-loop/understanding-for-loop/";

    //Nested For Loops
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                // Nested loop code
            }
        }

        //Conditionals Inside For Loops
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Code for even numbers
                System.out.println(i);
            }
            else if (i % 2 != 0) {
                // Code for odd numbers
                System.out.println(i);
            }
        }

        //Customising For Loops
        for (int i = 1; i <= 25; i += 5) {
            System.out.println("i = " + i);
        }
    }

}