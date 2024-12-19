package Strivers_Sheet_Easy;
import java.util.Arrays;

//(Brute Force) [this approach only works if there are no duplicates]
public class _2_Second_largest_smallest_in_Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getElements(arr, n);
    }
    private static void getElements(int[] arr, int n) {
        if(n==0|| n ==-1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("The second largest is "+ large);
        System.out.println("The second smallest is "+ small);
    }
//Time Complexity: O(NlogN), For sorting the array
//Space Complexity: O(1)
}

class Better_solution{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        getElements(arr, n);
    }
    static void getElements(int[] arr, int n) {
        if(n==0|| n ==-1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int i;

        for ( i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);

        }
        for ( i = 0; i < n; i++) {
            if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
            if(arr[i] > secondLarge && arr[i]!= large){
                secondLarge = arr[i];
            }
        }
    }
//    Time Complexity: O(N), We do two linear traversals in our array
//    Space Complexity: O(1)
}

class Optimal_Solution{


    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;
        int sL = secondLargest(arr, n);
        int sS = secondSmallest(arr, n);
        System.out.println("Second Smallest is "+sS);
        System.out.println("Second largest is " +sL);
    }

    private static int secondSmallest(int[] arr, int n) {
        if(n<2) return -1;
        int small = Integer.MAX_VALUE;
        int secondSmall= Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<small){
                small = arr[i];
            }
           else if(arr[i]<secondSmall && arr[i]!=small){
               secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    private static int secondLargest(int[] arr, int n) {
        if(n<2) return -1;

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i ;

        for ( i = 0; i < n; i++) {
            if(arr[i]> large){
                large = arr[i];
            }
            else if (arr[i]>second_large && arr[i]!= large) {
                second_large= arr[i];

            }

        }

        return second_large;
    }
}