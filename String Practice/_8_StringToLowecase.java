import java.util.Scanner;

public class _8_StringToLowecase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String resultStr = StringToLower(str);
        System.out.println(resultStr);

    }

    private static String StringToLower(String str) {

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='A'&& ch[i]<='Z'){
                ch[i] = (char)(ch[i]+32);
            }
        }
        return new String(ch);
    }
}
