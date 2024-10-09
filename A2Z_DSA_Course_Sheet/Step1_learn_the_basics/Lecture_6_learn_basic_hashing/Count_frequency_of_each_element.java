package Step1_learn_the_basics.Lecture_6_learn_basic_hashing;

import java.util.HashMap;
import java.util.Map;

class Count_frequency_of_each_element_using_for_loop {
    public static void main(String args[]){

        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}




class Count_frequency_of_each_element_using_for_map {
    public static void main(String args[]){

        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        Frequency(arr, n);
    }
    static void Frequency(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
