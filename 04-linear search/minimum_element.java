public class minimum_element {

    public static void main(String[] args) {

        int[] arr  =  {2,45,56,6,67};
        int minimum_value= min_ele(arr);
        int maximum_value= max_ele(arr);
        System.out.println(maximum_value);
        System.out.println(minimum_value);
    }

    private static int max_ele(int[] arr) {
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return  min;
    }

    private static int min_ele(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
