import java.util.Arrays;


// Takes an element and places it in its correct position
public class _3_Insertion_Sort {

    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Using the insertion sort");
        insertion_sort(arr, n);

    }

    private static void insertion_sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]   =  temp;
                    j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
