package Own_Sheet;

public class _12_Even_Odd_in_Array {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        Evenodd(arr1);
    }

    private static void Evenodd(int[] arr1) {
        int evenCount= 0, oddCount =0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2==0){
                System.out.println(arr1[i]+" is Even" );
                evenCount++;
            }
            else {
                System.out.println(arr1[i] + " is Odd");
                oddCount++;
            }
        }

        System.out.println("Even count is "+ evenCount);
        System.out.println("Odd count is "+ oddCount);
    }
}
