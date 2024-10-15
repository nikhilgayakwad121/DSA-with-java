package Step2_learn_important_sorting_technique.Sorting_1;

public class bubble_sort {

    public static void main(String[] args)
    {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n  =arr.length;

        System.out.println("Array before using the bubble sort");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr, n);
    }

    static void bubbleSort(int[] arr, int n)
    {
        // loop through
        for (int i = n-1 ; i >=  0 ; i--)
        {
            // bubble sort logic , sorted from behind
            for (int j = 0; j <= i-1 ; j++)
            {
                if (arr[j]> arr[j+1])
                {
                    int temp = arr [j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println("After using the bubble sort");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}



class optimized {

    //T.C =  O(N^2) for worst case.
    //T.C =  O(N) for best case.
    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }

}

