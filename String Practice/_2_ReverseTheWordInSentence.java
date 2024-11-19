import java.util.Scanner;

public class _2_ReverseTheWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedSentence = revTheWord(str);
        System.out.println(reversedSentence);
    }

    static String revTheWord(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = 0; i < ch.length; i++) {
            int first = i;
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }
            int last = i - 1;
            // Reverse characters from index l down to f
            while (last >= first) {
                rev = rev + ch[last];
                last--;
            }
            // Add a space after each word (except the last word)
            if (i < ch.length) {
                rev = rev + ' ';
            }
        }
        return rev;
    }
}
