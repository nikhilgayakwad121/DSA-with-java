public class _1_SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr= {2,5,6,7,5,64,4,5};
        double sum = calculateSum(arr);
        System.out.println(sum);

    }

    static double calculateSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+ arr[i];
        }

        return sum;                                      // Calculate sum
        //return (double) sum / arr.length;             // Calculate average

    }
}
