package Own_Sheet;

public class _15_String_Angaram_ornot {
    public static void main(String[] args) {
        String str1 = "keep";
        String str2= "peek";

        boolean result= AnagramOrNot(str1, str2);

        if(result){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }

    private static boolean AnagramOrNot(String str1, String str2) {
       int[] str1Char = countAlpha(str1);
       int[] str2Char = countAlpha(str2);

        for (int i = 0; i < 26 ; i++) {
            if(str1Char[i]!=str2Char[i]){
                return false;
            }
        }
        return false;
    }
    static int[] countAlpha(String str){
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch>='a'&&ch<='z'){
                count[ch-97]++;
            }
            else if(ch>='A'&&ch<='Z'){
                count[ch-65]++;
            }
        }
        return count;
    }
}
