package Own_Sheet;

public class _13_element_pre_or_notreturnIndex {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int element = 5;

        checkElement(arr, element);


    }

    private static void checkElement(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                System.out.println("Present at index : "+ i);
                break;
            }
        }
        System.out.println("Not present");
    }


}
