package Own_Sheet;

import java.util.Arrays;

public class _3_insert_one_array_ele_into_another_from_index {

    public static void main(String[] args) {
        int[] arr1 = {23, 56, 7, 88, 9, 5, 545, 4, 45, 5656, 345, 455, 5, 5, 453};
        int[] arr2 = {98, 455, 4534, 45, 34, 3434, 34};
        int fromIndex = 2;

        int[] resultArray = insertArr(arr1, arr2, fromIndex);
        System.out.println(Arrays.toString(resultArray));
    }

    static int[] insertArr(int[] arr1, int[] arr2, int fromIndex) {
        if (fromIndex < 0 || fromIndex > arr1.length) {
            System.out.println("Index out of bounds");
            return arr1;
        }

        // Create result array with combined length of both arrays
        int[] resultArray = new int[arr1.length + arr2.length];

        // Copy elements from arr1 up to fromIndex
        for (int i = 0; i < fromIndex; i++) {
            resultArray[i] = arr1[i];
        }

        // Copy elements from arr2 into resultArray
        for (int i = 0; i < arr2.length; i++) {
            resultArray[fromIndex + i] = arr2[i];
        }

        // Copy remaining elements from arr1 after fromIndex
        for (int i = fromIndex; i < arr1.length; i++) {
            resultArray[arr2.length + i] = arr1[i];
        }

        return resultArray;
    }
}
