package Own_Sheet;

import java.util.Arrays;

public class  _9_twoUnsortedArrayIntoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 6};
        int[] arr2 = {8, 7, 3, 4, 0};

        int[] resultedArray = mergeAndSortArrays(arr1, arr2);

        System.out.println("Merged and Sorted Array:");
        System.out.println(Arrays.toString(resultedArray));
    }

    private static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        // Step 1: Combine both arrays
        int[] combinedArray = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            combinedArray[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            combinedArray[k++] = arr2[i];
        }

        // Step 2: Sort the combined array
        Arrays.sort(combinedArray);

        return combinedArray;
    }
}
