package Strivers_Sheet;

class _1_ArmStrongNumber
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
//          sum =  sum + pow(ld, Funcdigitcounts)   This is to calculate n random number
            n = n/10;
        }
        if(temp==sum)
            return "Armstrong number";
        else
            return "No Armstrong number";

    }
}