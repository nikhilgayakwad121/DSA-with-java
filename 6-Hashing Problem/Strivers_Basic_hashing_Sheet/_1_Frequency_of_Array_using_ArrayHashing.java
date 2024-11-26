package Strivers_Basic_hashing_Sheet;

import java.util.Scanner;

public class _1_Frequency_of_Array_using_ArrayHashing{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("find frequency ");

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println("The Frequency of "+number+" is "+hash[number]);

        }
    }
}
