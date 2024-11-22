package Own_Sheet;

public class _10_Xylem_Pholem {

    public static void main(String[] args) {
        int n =1231;
        System.out.println(checkXylemPholem(n));
    }

    private static boolean checkXylemPholem(int n) {
        int endSum= 0, middleSum=0;
        int ld1 = n%10;
        endSum = endSum + ld1;
        n= n/10;
        while(n>9){
            int ld2 = n%10;
            middleSum = middleSum +ld2;
            n= n/10;
        }

        endSum = endSum + n ;
        if(endSum==middleSum){
            return true;
        }
        else{
            return false;
        }
    }
}
