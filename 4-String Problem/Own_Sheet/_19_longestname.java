package Own_Sheet;

import java.util.ArrayList;
import java.util.List;

public class _19_longestname {

    public static void main(String[] args) {
        String[] arr = {"nikhil", "kunal", "Striver", "hunter", "dreams"};
        List<String> longestNames = longName(arr);

        System.out.println("The longest names are: " + longestNames);
    }

    private static List<String> longName(String[] arr) {
        List<String> longestNames = new ArrayList<>();
        int maxLength = 0;

        for (String name : arr) {
            if (name.length() > maxLength) {
                // Found a new longer name
                longestNames.clear();
                longestNames.add(name);
                maxLength = name.length();
            } else if (name.length() == maxLength) {
                // Found another name with the same maximum length
                longestNames.add(name);
            }
        }

        return longestNames;
    }
}
