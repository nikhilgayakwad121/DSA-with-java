package Strivers_Basic_hashing_Sheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class

_3_Integer_hashing_Using_Map_data_Structure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character


        int[] arr = new int[n];
        System.out.println("Enter the integers :");


        // Input: integers in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        //precompute:
        Map<Integer, Integer> integerFrequency = new HashMap<>();
        for (int i = 0; i < n;i++) {
           int key = arr[i];
           int freq = 0;
           if(integerFrequency.containsKey(key))  freq = integerFrequency.get(key);  // fetching from the map
                freq++;

                integerFrequency.put(key, freq);  // inserting into the map
        }


        // Output: character frequencies
        System.out.println("integer frequencies:");
        for (Map.Entry<Integer, Integer> entry : integerFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Enter how many time we want to check for a integer frequency");
        int query;
        query = sc.nextInt();
        while(query--> 0){
            int number;
            number = sc.nextInt();

            //fetching
            if(integerFrequency.containsKey(number))
                System.out.println(integerFrequency.get(number));
            else
                System.out.println("0");
        }






    }
}
