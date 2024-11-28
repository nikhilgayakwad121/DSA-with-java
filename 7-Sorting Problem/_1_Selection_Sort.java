import java.util.Arrays;

public class _1_Selection_Sort {

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};

        int n = arr.length;

        System.out.println("before selection sort: ");

        System.out.print(Arrays.toString(arr));

        System.out.println();

        selection_Sort(arr, n);

    }

    private static void selection_Sort(int[] arr, int n) {

        for (int i = 0; i < n- 1 ; i++) {
            int mini = i;
            for (int j = i +1 ; j < n; j++) {
                if(arr[j] < arr[mini]){
                    mini = j;
                }

            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] =temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
