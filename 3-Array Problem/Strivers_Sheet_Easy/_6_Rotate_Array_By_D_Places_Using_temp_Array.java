package Strivers_Sheet_Easy;

public class _6_Rotate_Array_By_D_Places_Using_temp_Array {
    public static void main(String[] args) {

        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        Rotatetoleft(arr, n, d);
        System.out.println("After Rotating the elements to left");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        Rotatetoright(arr, n, d);
        System.out.println("After Rotating the elements to right");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void Rotatetoleft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        // Copy the first k elements into the temp array.
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // Shift n-k elements from last by k position to the left
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        // Copy the elements into the main array from the temp array.
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }
    public static void Rotatetoright(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        // Copy the last k elements into the temp array.
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        // Shift n-k elements from the beginning by k position to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        // Copy the elements into the main array from the temp array.
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}

