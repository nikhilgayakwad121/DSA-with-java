package Strivers_Basic_hashing_Sheet;

import java.util.HashMap;
import java.util.Map;

public class _6_find_highest_lowest_frequency_element_using_twoLoops {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 5, 4, 4};
        int n = arr.length;
        countHighestLowest(arr, n);
    }

    private static void countHighestLowest(int[] arr, int n) {

        boolean[] visited = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // Update max frequency and corresponding element
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }

            // Update min frequency and corresponding element
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle + " (Frequency: " + maxFreq + ")");
        System.out.println("The lowest frequency element is: " + minEle + " (Frequency: " + minFreq + ")");
    }
}



class using_Map {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 5, 4, 4};
        int n = arr.length;
        countHighestLowestByMap(arr, n);
    }

    static void countHighestLowestByMap(int[] arr, int n) {
        Map<Integer, Integer> hm = new HashMap<>();

        // Count frequencies using HashMap
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }

            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("Element with the highest frequency: " + maxEle + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with the lowest frequency: " + minEle + " (Frequency: " + minFreq + ")");
    }
}
