package Strivers_Basic_hashing_Sheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_Integer_hashing_Using_Map_data_Structure {

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


        // Integer hashing using HashMap
        Map<Integer, Integer> integerFrequency = new HashMap<>();
        // Count the frequency of each integer
        for (int i = 0; i < n;i++) {
           int key = arr[i];
           int freq = 0;
           if(integerFrequency.containsKey(key))
               freq = integerFrequency.get(key);
                freq++;

                integerFrequency.put(key, freq);
        }


        // Output: character frequencies
        System.out.println("integer frequencies:");
        for (Map.Entry<Integer, Integer> entry : integerFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        
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
