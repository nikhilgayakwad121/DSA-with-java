package Step1_learn_the_basics.Lecture_1_Thing_to_know;

public class time_complexity {
    String strivers = "https://takeuforward.org/time-complexity/time-and-space-complexity-strivers-a2z-dsa-course/";
//    time_complexity
//    The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity.
//    Basically, the time complexity of a particular code depends on the given input size, not on the machine used to run the code.

//    Here come the 3 rules,
//    that we are going to follow while calculating the time complexity:
//
//    We will always calculate the time complexity for the worst-case scenario.
//    We will avoid including the constant terms.
//    We will also avoid the lower values.


    static void que1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+ " = i value , j value = "+ j);
            }
        }
//        In order to calculate the time complexity of the code, we need to first observe how the loops are working. The outer loop i.e. i runs from 0 to N-1 i.e. N times and for every value of i, the inner loop i.e. j also runs from 0 to N-1 i.e. N times. The following illustration depicts the process:
//        Now, we can clearly observe the total number of steps i.e. N+N+N+N+.......+N times = N*N = N2. So, the time complexity will be O(N2). We can ignore other constant steps as well as the innermost block of code as it runs in constant time.

    }

    static void que2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " = i value , j value = " + j);
            }
        }
//        In order to calculate the time complexity of the code, we again need to first observe how the loops are working. The outer loop i.e. i runs from 0 to N-1 i.e. N times and for every value of i, the inner loop i.e. j also runs from 0 to i i.e. (i+1) times.
//        Now, we can clearly observe the total number of steps i.e. 1+2+3+4+.......+N. Now we know the formula of the summation of the first N natural numbers i.e. (N*(N+1))/2 = N2/2 + N/2. So, the precise time complexity will be O(N2/2 + N/2). Now, we should ignore the lower values. So, the time complexity will be O(N2/2). It can be also written as O(N2) avoiding the coefficient 1/2.

    }



        public static void main(String[] args) {
            int n=5;
            que1(n);
            que2(n);
        }

}


