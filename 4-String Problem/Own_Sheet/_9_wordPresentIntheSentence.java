package Own_Sheet;

import java.util.Scanner;

public class _9_wordPresentIntheSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int wordCount = countWord(str);
        System.out.println(wordCount);

    }

    private static int countWord(String str) {
        int wc = 0;
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if ((i == 0 || ch[i - 1] == ' ') && ch[i] != ' ') {
                wc++;
            }
        }
        return wc;
    }

}
