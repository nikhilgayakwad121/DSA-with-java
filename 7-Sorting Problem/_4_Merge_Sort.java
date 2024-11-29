import java.util.ArrayList;
import java.util.Arrays;

public class _4_Merge_Sort {

//    Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts.
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,7};
        int n = arr.length;
        System.out.println("Before merge sort");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,n-1);
        System.out.println("After merge sort");
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        //base case
        if(low>=high){
            return;
        }
        int mid = (low + high)/2;

        //left half
        mergeSort(arr, low, mid );

        //Right half
        mergeSort(arr, mid+1, high);

        merge(arr,low, mid, high );
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array

        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//
        while(left <=mid && right <= high) {
            if(arr[left]  <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }


        // if elements on the left half are still left //
        while(left<= mid){
            temp.add(arr[left]);
            left++;
        }

        //if elements on the right half are still left
        while(right <=high){
            temp.add(arr[right]);
            right++;
        }

        //transferring all the elements from temp to arr
        for (int i = low; i <=high; i++) {
            arr[i] = temp.get(i-low);
        }
    }

}
