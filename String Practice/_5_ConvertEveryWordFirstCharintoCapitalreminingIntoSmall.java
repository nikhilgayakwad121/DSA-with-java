import java.util.Scanner;

public class _5_ConvertEveryWordFirstCharintoCapitalreminingIntoSmall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ResStr = firstCharCapitalintoRemSmall(str);
        System.out.println(ResStr);
    }

    private static String firstCharCapitalintoRemSmall(String str) {

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            // Detect the start of a word
            if ((i == 0 || ch[i - 1] == ' ') && ch[i] != ' ')
            {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                {
                    ch[i] = (char) (ch[i] - 32);
                }
            }
            else
            {
                if (ch[i] >= 'A' && ch[i] <= 'Z')
                {
                    ch[i] = (char) (ch[i] + 32);
                }
            }

        }
        String ResStr = new String(ch);
        return ResStr;
    }
}
