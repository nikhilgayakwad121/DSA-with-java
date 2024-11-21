package Own_Sheet;

import java.util.Arrays;
import java.util.List;

public class _11_TwoArrayintoSingle
{

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] resultArray= mergeTwoArray(arr1, arr2);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {

        int resultArr[] = new int[arr1.length+ arr2.length];

        for (int i = 0; i <arr1.length ; i++) {
            resultArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            resultArr[i+ arr1.length]  = arr2[i];
        }

        return resultArr;
    }
}
