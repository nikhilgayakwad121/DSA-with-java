package Step1_learn_the_basics.Lecture_4_know_basic_maths;

public class palindrome_no_or_not {
    static String palindrome(int n){
        int Ncopy= n;
        int revnum =0;
        while(n>0){
            int ld =n%10;
            revnum = (revnum * 10 )+ ld;
            n=n/10;
        }
        if(Ncopy == revnum)
            return "Palindrome Number";
        else
            return "Not Palindrome";
    }

    public static void main(String[] args) {
        int n = 12133;
        String Ans= palindrome(n);
        System.out.println(Ans);
    }
}


