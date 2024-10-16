package Step2_learn_important_sorting_technique.Sorting_2;

public class recursive_insertion_sort {

    public static void main(String[] args) {
        int arr [] = {56,56,98,2,67,9,3};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Before the recursive insertion sort");

        }
        System.out.println();

        recursive_Insertion_Sort(arr, 0, n);

        System.out.println("after the recursive insertion sort");
        for(int i =0;i< n ;i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void recursive_Insertion_Sort(int[] arr, int i, int n) {
        // Base case:  i==n;
        if(i==n)
            return;

        int j =i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j -1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursive_Insertion_Sort(arr, i +1, n);

    }


}
