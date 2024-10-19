public class Even_no_digits_or_not {
    public static void main(String[] args) {
        int n = 3423345;
        int count =0;
        while(n>0){
            int ld =  n%10;
            count++;
            n= n/10;

        }
        if (count%2==0){
            System.out.println("even digits");
        }
        else
            System.out.println("Not a even digits");
    }
}
