package Strivers_Sheet_Easy;

import java.util.Arrays;
import java.util.HashSet;

public class _4_Remove_duplicates_in_place_from_sorted_Array {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    private static int removeDuplicates(int[] arr) {
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length ;i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0; // for iterating the for loop
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }
//    Time complexity: O(n*log(n))+O(n)
//    So, n(logarithmic) n for Hashset DataStructure , second loop runs n times
//    Space Complexity: O(n)

}




class _4_Remove_duplicates_in_place_by_optimal_approach{
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    private static int removeDuplicates(int[] arr) {

        int i = 0;
        for (int j = 1; j < arr.length ; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
//    Time Complexity: O(N)
//    Space Complexity: O(1)

}