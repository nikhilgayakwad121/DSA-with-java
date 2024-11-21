package Own_Sheet;

public class _2_Freq_of_elements {

    public static void main(String[] args) {
        int[] arr = {34,34,78,9,4,33, 34, 45, 45};
        freqOfElements(arr);
    }

    static void freqOfElements(int[] arr) {

        boolean[] check = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (check[i]==false){
                int count = 1;
                for(int j =i+1;j < arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        check[j] = true;
                    }
                }
                System.out.println(arr[i]+" -> "+count);
            }

        }
    }
}
