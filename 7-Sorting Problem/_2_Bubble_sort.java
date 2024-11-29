import java.util.Arrays;

// Pushes maximum to the last by adjacent swap
// 0(n^2)
// After didSwap optimization O(n)
public class _2_Bubble_sort {
    public static void main(String[] args) {

        int arr[] = {13, 46, 24, 52, 20, 9};

        int n = arr.length;

        System.out.println("Before using Bubble sort");

        System.out.println(Arrays.toString(arr));

        bubble_sort(arr,n);
    }

    private static void bubble_sort(int[] arr, int n) {

        for (int i = n-1; i >= 0; i--) {
            int didSwap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; //chota dhundne ke baad jis place ke liye dhund rhe the usko uthya  temp me save kiya or swap kiya
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0)
                break;
        }

        System.out.println("After bubble sort");
        System.out.println(Arrays.toString(arr));

    }
}