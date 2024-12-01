package Strivers_Sheet_Easy;

public class _3_Check_if_Array_Sorted_or_not_Brute_force {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n= 5;

        System.out.println(isSorted(arr,n));
    }

    private static boolean isSorted(int[] arr, int n) {

        for(int i = 0;i< n;i++){
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

//    Time Complexity: O(N^2)
//    Space Complexity: O(1)
}


class _3_Check_if_Array_Sorted_or_not_optimal_Approach{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4}, n = 5;

        System.out.println(isSortedOptimal(arr, n));
    }

    private static boolean isSortedOptimal(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if(arr[i]< arr[i-1])
            return true;
        }
        return false;
    }


}