package Strivers_Basic_hashing_Sheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_Character_hashing_Using_Map_data_Structure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        char[] arr = new char[n];
        System.out.println("Enter the characters one by one:");

        // Input: characters in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().charAt(0); // Read one character at a time
        }


        //precompute:
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < n;i++) {
            char key = arr[i];
            int freq = 0;
            if(charFrequency.containsKey(key))  freq = charFrequency.get(key);  // fetching from the map
            freq++;

            charFrequency.put(key, freq);  // inserting into the map
        }

        // Output: character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Enter how many time we want to check for a characters frequency");
        int query;
        query = sc.nextInt();
        while (query-- > 0) {
            char character;
            character = sc.next().charAt(0);

            //fetching
            if (charFrequency.containsKey(character))


                System.out.println(charFrequency.get(character));
            else
                System.out.println("0");
        }


    }

}