package Step1_learn_the_basics.Lecture_1_Thing_to_know;

import java.util.Scanner;

public class Arrays {
    String strivers= "No article ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sample array
        int[] myNum = {10, 20, 30, 40};

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        //initialization of the array
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" element of an array ");
        //Storing the elements of the array index wise
        for(int i =0;i< arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }

        // Printing the array
        for(int i =0;i< arr.length ;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
