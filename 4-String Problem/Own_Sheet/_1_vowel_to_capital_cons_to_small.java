package Own_Sheet;

import java.util.Scanner;

public class _1_vowel_to_capital_cons_to_small {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.toLowerCase();
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
             {
                 ch[i] = (char)(ch[i]-32);
             }
        }
        String str =new String(ch);
        System.out.println(str);

    }
}
