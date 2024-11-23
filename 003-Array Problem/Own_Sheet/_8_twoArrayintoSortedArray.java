package Own_Sheet;

import java.util.Arrays;

public class _8_twoArrayintoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {6, 7, 8, 9, 10, 11};

        int[] resultedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged and Sorted Array:");
        System.out.println(Arrays.toString(resultedArray));
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Create a new array to hold all elements of arr1 and arr2
        int[] resultedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge elements from both arrays in sorted order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultedArray[k++] = arr1[i++];
            } else {
                resultedArray[k++] = arr2[j++];
            }
        }

        // Add remaining elements from arr1, if any
        while (i < arr1.length) {
            resultedArray[k++] = arr1[i++];
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.length) {
            resultedArray[k++] = arr2[j++];
        }

        return resultedArray;
    }
}
