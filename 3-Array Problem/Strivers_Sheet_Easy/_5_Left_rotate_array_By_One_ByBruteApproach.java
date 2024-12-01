package Strivers_Sheet_Easy;

public class _5_Left_rotate_array_By_One_ByBruteApproach {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        solve(arr, n);

    }

    private static void solve(int[] arr, int n) {
        int[] temp =  new int[n];

        for (int i = 1; i < n; i++) {
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+ " ");
        }

    }
//    Time Complexity: O(n), as we iterate through the array only once.
//    Space Complexity: O(n) as we are using another array of size, same as the given array.

}


class _5_Left_rotate_array_By_One_ByOptimalApproach{

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        solveOptimal(arr,n);
    }

    private static void solveOptimal(int[] arr, int n) {
        int temp = arr[0];  // Storing the first value of variable in the array.
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//    Time Complexity: O(n), as we iterate through the array only once.
//    Space Complexity: O(1) as no extra space is used

}