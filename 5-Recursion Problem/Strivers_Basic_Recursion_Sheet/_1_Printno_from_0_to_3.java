package Strivers_Basic_Recursion_Sheet;

public class _1_Printno_from_0_to_3 {
    static int cnt=0;
    static void print(){
        //Base condition
        if(cnt == 3)   return;

        System.out.println(cnt);

        //count incremented.

            cnt = cnt +1 ;
            print();
    }
    public static void main(String[] args) {
        print();
    }
}
