package Strivers_Basic_hashing_Sheet;

import java.util.HashMap;
import java.util.Map;

public class _5_Count_frequency_each_element_in_array_Using_two_loops {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
        countFreq(arr, n);
    }

    private static void countFreq(int[] arr, int n) {

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            //skip this element if already processed
            if(visited[i]== true){
                continue;
            }

            //count frequency
            int count =1;
            for(int j = i+1;j< n;j++){
                if(arr[i] == arr[j]){
                    visited[j] =true;
                    count++;
                }
            }
            System.out.println("Count of "+arr[i]+" is ->"+ count);

        }
    }
}


class _5_Count_frequency_each_element_in_array_Using_MAp{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0,9,3,3,6};
        int n = arr.length;
        countFreqByMAp(arr, n);
    }

    private static void countFreqByMAp(int[] arr, int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue() );
        }
    }
}