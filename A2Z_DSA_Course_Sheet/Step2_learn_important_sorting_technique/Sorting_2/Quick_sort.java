package Step2_learn_important_sorting_technique.Sorting_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quick_sort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4,6,7,8,2,4,1});
        int n = arr.size();
        System.out.println("Before using quick sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr= Quick_sort.quickSort(arr);
        System.out.println(" After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr. get(i)+" ");
        }
        System.out.println();
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        //write your code here
        qs(arr, 0, arr.size() - 1);
        return  arr;
    }

    static void qs(List<Integer> arr, int low, int high) {

        if(low< high){
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
