package Own;

public class _12_CountAlphabet {

    public static void main(String[] args) {
        String str = "Nikhil";
        int[] arr =countAlphabet(str);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                System.out.println("The character is "+(char)(i+ 65)+" ="+arr[i]);
            }
        }
    }

    private static int[] countAlphabet(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                count[ch-65]++;
            }
            if(ch>='a'&&ch<='z'){
                count[ch-97]++;
            }

        }
        return count;
    }
}
