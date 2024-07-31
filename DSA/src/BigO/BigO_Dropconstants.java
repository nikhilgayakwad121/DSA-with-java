package BigO;

public class BigO_Dropconstants {
    public static void main(String[] args) {
        printItems(10);
    }
    public static void printItems(int n){
        //O(n)
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
        //O(n)
        for(int j=0;j<n;j++){
            System.out.println(j);
        }
    }
}

