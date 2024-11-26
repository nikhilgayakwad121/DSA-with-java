package Strivers_Sheet;

public class _7_Reverse_number {

    static int reverseNumber(int n){
        int revnum = 0;
        while(n>0)
        {
            int ld= n%10;
            revnum = (revnum*10) + ld;
            n=n/10;
        }
        return revnum;
    }

    public static void main(String[] args) {
        int n = 7789;
        System.out.println(reverseNumber(n));
    }
}