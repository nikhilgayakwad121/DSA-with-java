package Own_Sheet;

import java.util.Arrays;

public class _5_insert_specified_index {

    public static void main(String[] args) {
        int[] arr = {34, 56, 87, 45, 23, 78};
        int element = 24;
        int atIndex = 1;

        int[] resultArray = insertAtSpecifiedIndex(arr, element, atIndex);

        System.out.println(Arrays.toString(resultArray));
    }

    static int[] insertAtSpecifiedIndex(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) { // index validation
            System.out.println("Index out of bounds");
            return arr; // Return original array if index is invalid
        }

        int[] resultArray = new int[arr.length + 1];

        // Copy elements up to the specified index
        for (int i = 0; i < index; i++) {
            resultArray[i] = arr[i];
        }

        // Insert the new element at the specified index
        resultArray[index] = element;

        // Copy remaining elements after the specified index
        for (int i = index; i < arr.length; i++) {
            resultArray[i + 1] = arr[i];
        }

        return resultArray;
    }
}
