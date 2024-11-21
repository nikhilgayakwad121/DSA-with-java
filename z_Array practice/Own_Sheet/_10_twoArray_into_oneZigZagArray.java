package Own_Sheet;

import java.util.Arrays;

public class _10_twoArray_into_oneZigZagArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] zigZagArray = zigZagArrayFunc(arr1, arr2);

        System.out.println(Arrays.toString(zigZagArray));

    }

    static int[] zigZagArrayFunc(int[] arr1, int[] arr2) {


        int[] zigZagArray = new int[arr1.length+ arr2.length];

        int i =0, j =0 , k =0;

        while( i < arr1.length && j < arr2.length){

            zigZagArray[k] = arr1[i];
            i++;
            k++;

            zigZagArray[k]= arr2[j];
            j++;
            k++;

        }

        while(i<arr1.length){
            zigZagArray[k]= arr1[i];
            i++;
            j++;
        }
        while(j< arr1.length){
            j++;
            k++;
        }

        return zigZagArray;
    }


}
