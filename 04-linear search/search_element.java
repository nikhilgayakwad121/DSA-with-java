import java.util.Scanner;

public class search_element {
    static int linearSearch(int[] arr, int target ){
        if(arr.length == 0){
            return -1;
        }

        //run a loop
        for (int index = 0; index < arr.length ; index++) {

            //check for element at every index
            int element = arr[index];
            if(element == target){
                return  index;
            }

        }
        return  -1;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,5};

        int target =  5;

        int ans = linearSearch(arr, target);

        System.out.println(ans);


    }
}
