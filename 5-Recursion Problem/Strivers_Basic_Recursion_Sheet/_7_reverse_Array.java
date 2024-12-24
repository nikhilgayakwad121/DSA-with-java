package Strivers_Basic_Recursion_Sheet;

import java.util.Arrays;
import java.util.Collections;


class using_an_extra_Array {

    static int[] byExtraArray(int[] arr){
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i>=0 ; i--) {

            ans[ans.length-1-i] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int[] ans = byExtraArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}


class Using_space_optimized{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
        By_spaceOptimized(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void By_spaceOptimized(int[] arr, int n) {

        int first = 0, last = n-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last]  = temp;
            first++;
            last--;
        }

    }


}

class by_recursive_Method{

    static void byRecursion(int arr[],int first,int last){
        if(first<last){
            int temp= arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            byRecursion(arr, first+1, last-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        byRecursion(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}

class Using_LibraryFunction{
    static void printArray(Integer arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Reverse array using library function
    static void reverseArray(Integer arr[]) {
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        int n = 5;
        Integer arr[] = {5,4,3,2,1};
        reverseArray(arr);
        printArray(arr, n);
    }
}