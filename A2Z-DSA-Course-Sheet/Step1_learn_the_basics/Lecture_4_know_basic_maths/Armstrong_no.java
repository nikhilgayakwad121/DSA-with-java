package Step1_learn_the_basics.Lecture_4_know_basic_maths;

class Armstrong_no
{
    public static void main(String[] args)
    {
        int n = 153;

        System.out.println(armStrong(n));
    }

     static String armStrong(int n) {
        int temp = n;
        int sum=0;
        while(n>0)
        {
            int ld= n%10;
            sum =  sum + ( ld* ld * ld );
            n = n/10;
        }
        if(temp==sum)
            return "Armstrong number";
        else
            return "No Armstrong number";

    }
}

//Complexity Analysis

// Time Complexity: O(log10N + 1) where N is the input number.

// The time complexity is determined by the number of digits in the input integer N.
// In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.
//In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
//In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.

//Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.