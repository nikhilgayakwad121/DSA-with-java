package Own;

public class _14_String_is_pangram_or_not {
    public static void main(String[] args) {
        String str = "My name is nikhil ";
        boolean result= pangramOrNot(str);
        System.out.println(result);
    }

    private static boolean pangramOrNot(String str) {

        if(str.length()<26){
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>= 'a'&&ch<='z'){
                count[ch-97]++;
            }

            else if (ch>='A'&&ch<='Z') {
                count[ch-65]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]==0){
                return false;
            }
        }
        return false;

    }
}
