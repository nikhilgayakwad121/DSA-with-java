import java.util.Arrays;

public class _5_Recursion_Bubble_Sort {

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before the recursive bubble sort");
        System.out.println(Arrays.toString(arr));
        recursive_Bubble(arr,n);
        System.out.println("After the recursive bubble sort");
        System.out.println(Arrays.toString(arr));

    }

    private static void recursive_Bubble(int[] arr, int n) {
        //base case
        if(n==1){
            return;
        }
        int didSwap = 0;
        for (int j = 0; j <=n-2; j++) {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap =1;
            }
        }
        //if no swapping happens.
        if(didSwap==1){
            return;
        }
        //Range reduced after recursion:
        recursive_Bubble(arr,n-1 );
    }
}

// Time Complexity: O(N2) for the worst and
// average cases and O(N) for the best case.
// Here, N = size of the array.

//Space Complexity: O(N) auxiliary stack space.
