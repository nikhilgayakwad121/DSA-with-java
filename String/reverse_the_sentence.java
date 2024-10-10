import java.util.Scanner;

public class reverse_the_sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = reverse_Sent(str);
        System.out.println(result);
    }

    static String reverse_Sent(String str) {

        char[] ch = str.toCharArray();
        String rev = "";

        for (int i = ch.length - 1; i >= 0; i--) {

            // l stores the current position of i (starting at the last character).
            int l = i;
            //Identifying Words:
            while (i >= 0 && ch[i] != ' ') {
                i--;
            }

            //Extracting Words:
            int f = i + 1;
            while (f <= l) {
                rev = rev + ch[f];
                f++;
            }
            //Adding a Space Between Words:
            if (i >= 0) {
                rev = rev + " ";
            }
        }
        return rev;
    }
}
