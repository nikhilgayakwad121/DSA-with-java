package Own;

import java.util.Scanner;

public class _7_ConvertEveryWordLastCharintoCapitalreminingIntoSmall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str= resMethod(str);
        System.out.println(str);

    }

    private static String resMethod(String str) {

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // Convert all characters of the word to lowercase first
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32);  // Convert uppercase to lowercase
            }
            // Check for end of word or the last character
            if ((i == ch.length - 1 || ch[i + 1] == ' ') && ch[i] != ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 32);  // Convert the last character to uppercase
                }
            }
        }
        return new String(ch);
    }
}

