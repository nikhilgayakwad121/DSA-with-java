package Step1_learn_the_basics.Lecture_1_Thing_to_know;

public class space_complexity {

//    Space complexity generally represents the summation of auxiliary space and the input space. Auxiliary space refers to the space
//    that we use additionally to solve a problem. And input space refers to the space that we use to store the inputs.

//    Similarly, if we use an array of size n, the space complexity will be O(N).
public static void main(String[] args) {
    int a  =1; //input space
    int b  =2; //input space

    int c = a+b ; //auxiliary space

//    The variables a and b are used to store the inputs but c refers to the space we are using to solve the problem and c is the auxiliary space. Here the space complexity will be O(3).
//    Similarly, if we use an array of size n, the space complexity will be O(N)
}

}
