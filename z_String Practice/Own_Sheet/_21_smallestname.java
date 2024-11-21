package Own_Sheet;

public class _21_smallestname {
    public static void main(String[] args) {
        String[] arr = {"nikhil", "nik", "vinay", "om"};
        String smallName = checkSmallName(arr);
        System.out.println(smallName);

    }

    private static String checkSmallName(String[] arr) {
        String sname= arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(sname.length()> arr[i].length()){
                sname = arr[i];
            }

        }
        return sname;
    }
}
