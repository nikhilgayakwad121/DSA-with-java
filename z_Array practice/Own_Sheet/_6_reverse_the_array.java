package Own_Sheet;

import java.util.Arrays;

public class _6_reverse_the_array {

    public static void main(String[] args) {
        int[]  arr= {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        arr = reverseArray(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseArray(int[] arr) {

        int first  = 0 , last =arr.length-1;

        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last]  = temp;
            first++;
            last--;
        }
        return arr;
    }
}
