package Own_Sheet;

public class _10_vowelPresentInString {

    public static void main(String[] args) {
        String str = "klklkl";

        int result= countVowel(str);
        System.out.println(result);
    }

    private static int countVowel(String str) {

        char[] ch = str.toCharArray();
        int vc=0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                vc++;
            }
        }
        return vc;
    }
}
