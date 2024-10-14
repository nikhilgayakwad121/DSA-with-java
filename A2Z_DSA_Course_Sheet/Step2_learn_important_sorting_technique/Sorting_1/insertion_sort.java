package Step2_learn_important_sorting_technique.Sorting_1;

public class insertion_sort {

    public static void main(String[] args) {

        int arr[]= {13,46,78,56,9,21};
        int n = arr.length;
        System.out.println("Before selection sort");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        selection_sort(arr, n);
    }

    static void selection_sort(int[] arr, int n) {
        //looping through elements ,
        for(int i =0; i < n-1; i++)
        {
            int mini = i;

            // we can leave first index as it is already sorted
            // we can check if mini is big than element if yes assign
            for (int j = i + 1 ; j < n ; j++) {
                if (arr[j] < arr[mini])
                    mini = j;
            }

            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        //print
        System.out.println(" After the selection sort");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

//Time complexity: O(N2), (where N = size of the array), for the best, worst, and
// average cases.
//Reason: If we carefully observe, we can notice that the outer loop, say i, is
// running from 0 to n-2 i.e. n-1 times, and for each i, the inner loop j runs from
// i to n-1. For, i = 0, the inner loop runs n-1 times, for i = 1, the inner loop runs
// n-2 times, and so on. So, the total steps will be approximately the following:
// (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1. The summation is approximately the sum
// of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will
// be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values
// as well as the constant coefficients. So, the time complexity is O(n2).
// Here the value of n is N i.e. the size of the array.
//
//Space Complexity: O(1)

