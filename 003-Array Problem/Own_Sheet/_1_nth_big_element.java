package Own_Sheet;

import java.util.Arrays;

public class _1_nth_big_element {

    public static void main(String[] args) {
        int[]  arr ={44, 45, 98, 45 , 6677, 76};

//        System.out.println(Arrays.toString(arr));

        getBigElement(arr);

    }

    static void getBigElement(int[] arr) {

        int big= arr[0];
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>big)
                big= arr[i];
            else if (arr[i]<small) {
                small = arr[i];
                
            }
        }
        System.out.println("The biggest element is "+big);
        System.out.println("The smallest element is "+small);
    }
}
