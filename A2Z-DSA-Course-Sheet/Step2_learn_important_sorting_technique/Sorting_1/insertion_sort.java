package Step2_learn_important_sorting_technique.Sorting_1;

public class insertion_sort {

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before the insertion sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        insertion_Sort(arr,n);

    }

    static void insertion_Sort(int[] arr, int n) {
        // Outer loop: Iterates through the array
        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            // Inner loop: Shifts elements in sorted part to the right until correct position is found
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j-1] and arr[j]
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }


        System.out.println("After using the insertion sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
