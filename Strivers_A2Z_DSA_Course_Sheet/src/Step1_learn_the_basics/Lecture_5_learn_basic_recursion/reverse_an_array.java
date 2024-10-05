package Step1_learn_the_basics.Lecture_5_learn_basic_recursion;

import static java.util.Collections.swap;

class Using_an_extra_array {

    static void printArray(int ans[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
    //Function to reverse array using an auxiliary array
    static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--)
        {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, n);
    }
}

class space_Optimized_iterative_method{
    //Function to print array
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Function to reverse array
    static void reverseArray(int arr[], int n) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        printArray(arr, n);
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, n);

    }
}

class By_recursion{
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end) {
        if (start <= end/2 ) {
            int tmp = arr[start];
            arr[start] = arr[end -1];
            arr[end -1] = tmp;
            reverseArray(arr, start + 1, end-1);
        }
    }

    public static void main(String[] args) {
        int end = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, 0, end);
        printArray(arr, end);
    }
}