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
        int countDigits = String.valueOf(n).length();
        while(n>0)
        {
            int ld= n%10;
            sum += Math.pow(ld, countDigits);
            n = n/10;
        }
        if(temp==sum)
            return "Armstrong number";
        else
            return "No Armstrong number";

    }
}