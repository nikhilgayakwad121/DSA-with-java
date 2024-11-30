package Strivers_Sheet_Easy;

import java.util.Arrays;

public class _1_Largest_Element_in_the_Array_Brute_force {

    public static void main(String[] args) {


        int[] arr1 = {2,5,1,3,0};
        System.out.println("The largest element in the Array :"+ sort(arr1));

        int[]  arr2 = {8,10,5,7,9};
        System.out.println("The largest element in the Array : "+ sort(arr2));


    }

    static int sort(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //TC : O(N*log(n)
    //O(n)
}


class _1_Largest_Element_in_the_Array_{

    public static void main(String[] args) {

        int[] arr1 = {2,5,1,3,0};
        System.out.println("The largest element in the array is: "+ findLargestElement(arr1));

        int[]  arr2 = {8,10,5,7,9};
        System.out.println("The largest element in the array is: "+ findLargestElement(arr2));
    }

    static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
//Time Complexity: O(N)
//
//Space Complexity: O(1)