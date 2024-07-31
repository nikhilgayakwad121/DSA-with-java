package BigO;

public class BigO_nof2 {
    public static void main(String[] args) {
        printItems(10);
    }
    public static void printItems(int n){
        // O(n^2)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+ "  " +j);
            }
        }

    }

}

