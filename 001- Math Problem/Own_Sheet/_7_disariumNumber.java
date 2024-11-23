package Own_Sheet;


import static java.lang.Math.pow;

class _7_disariumNumber
{
    public static void main(String[] args)
    {
        int n = 51 ;

        System.out.println(armStrong(n));
    }

    static String armStrong(int n) {
        int temp = n;
        double sum=0;
        int digitCount= Funcdigitcounts(n);
        while(n>0&&digitCount>0)
        {
            int ld= n%10;
          sum =  sum + pow(ld, digitCount) ;  //This is to calculate n random number
            n = n/10;
            digitCount--;
        }
        if(temp==sum)
            return "deserium Number";
        else
            return "No deserium Number";

    }

    private static int Funcdigitcounts(int n) {
        int count= 0 ;
        while(n>0){
            int ld = n%10;
            count++;
             n = n/10;
        }
        return count;
    }
}