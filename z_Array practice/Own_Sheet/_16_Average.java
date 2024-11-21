package Own_Sheet;

public class _16_Average {

    public static void main(String[] args) {

        double[] arr = {1.0, 34.0, 78.97,34.76};
        double average= findAverage(arr);
        System.out.println(average);
    }

     static double findAverage(double[] arr) {
        double sum=0, count=0;
         for (int i = 0; i < arr.length; i++) {
             count++;
             sum = sum + arr[i];
         }
         return sum/count;
    }
}
