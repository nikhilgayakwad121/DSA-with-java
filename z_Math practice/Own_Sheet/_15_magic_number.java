package Own_Sheet;

public class _15_magic_number {

    public static void main(String[] args) {

        int n= 12345;
        int sum = 0;

        while(n>0||sum>9){

        if(n==0){
            n= sum;
            sum = 0;

        }
        sum = sum+ n%10;
        n=n/10;

        }

        if(sum == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
