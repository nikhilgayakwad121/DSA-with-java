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

        // Character hashing using HashMap
        Map<Character, Integer> charFrequency = new HashMap<>();
        // Count the frequency of each character
        for (char c : arr) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }





        // Output: character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        int query;
        query = sc.nextInt();
        while (query-- > 0) {
            int character;
            character = sc.nextLine().charAt(0);

            //fetching
            if (charFrequency.containsKey(character))
                System.out.println(charFrequency.get(character));
            else
                System.out.println("0");
        }


    }

}