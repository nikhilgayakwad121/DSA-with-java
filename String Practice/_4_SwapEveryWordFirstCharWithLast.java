import java.util.Scanner;

public class _4_SwapEveryWordFirstCharWithLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = swapEveryWordFirstCharWithLast(str);
        System.out.println(res);
    }

    static String swapEveryWordFirstCharWithLast(String str) {
        char[] ch = str.toCharArray();
        int first = -1; // Track the first character of the word

        for (int i = 0; i < ch.length; i++) {
            // Detect the start of a word
            if ((i == 0 || ch[i - 1] == ' ') && ch[i] != ' ') {
                first = i;
            }
            // Detect the end of a word
            if ((i == ch.length - 1 || ch[i + 1] == ' ') && ch[i] != ' ' && first != -1) {
                // Swap first and last character of the word
                char temp = ch[i];
                ch[i] = ch[first];
                ch[first] = temp;
                first = -1; // Reset first after swapping
            }
        }

        // Convert character array back to a string
        return new String(ch);
    }
}
