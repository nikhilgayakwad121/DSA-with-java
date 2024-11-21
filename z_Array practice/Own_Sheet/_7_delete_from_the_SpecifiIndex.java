package Own_Sheet;

import java.util.Arrays;

public class _7_delete_from_the_SpecifiIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int indexDelete = 0;
        int[] resultArray = indexDeleteFromIndex(arr, indexDelete);

        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] indexDeleteFromIndex(int[] arr, int indexDelete) {

        if (indexDelete < 0 || indexDelete >= arr.length) { // Fix index validation
            System.out.println("Index out of bounds");
            return arr;
        }

        int[] resultArray = new int[arr.length - 1];

        // Copy elements up to the index to delete
        for (int i = 0; i < indexDelete; i++) {
            resultArray[i] = arr[i];
        }

        // Copy elements after the index to delete
        for (int i = indexDelete; i < resultArray.length; i++) {
            resultArray[i] = arr[i + 1];
        }

        return resultArray;
    }
}
