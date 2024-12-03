package Strivers_Sheet_Easy;

public class _6_Rotate_Array_By_D_Places_Using_temp_Array {
    public static void main(String[] args) {

        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        RotateOrRight(arr, n, d);
        System.out.println("After Rotating the elements to right");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" " );
        }

    }
    static void RotateOrRight(int[] arr, int n, int d) {
        if(n == 0) return;
        d=  d % n;
        if(d > n){
            return;
        }
        int[] temp = new int[d];

        //  shifting after  d elements
        for (int i = n - d; i < n; i++) {
            temp[i - n + d] = arr[i];
        }

        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }

    }
}
