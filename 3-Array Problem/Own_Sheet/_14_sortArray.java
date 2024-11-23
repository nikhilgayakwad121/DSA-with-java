package Own_Sheet;

import java.util.Arrays;

public class _14_sortArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5, 5, 4, 3, 2, 1};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting");
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }


        }
    }
}
