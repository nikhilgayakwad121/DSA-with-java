package Own_Sheet;

import java.util.Arrays;

public class _4_Arr_ele_replaced_by_sum_of_digits {

    public static void main(String[] args) {
        int arr [] ={35,456,56,56,66,78,6,44,23};

        arrsumOfArrayEle(arr);
        System.out.println("After replacing by sum");

        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrsumOfArrayEle(int[] arr) {

        for (int i = 0; i <arr.length ; i++) {
            int x = arr[i];

            int sum=0;
            do{
                int ld=x%10;
                sum=sum+ld;

                x= x/10;

            }while(x!=0);

            arr[i] = sum;
        }

        return arr;
    }
}
