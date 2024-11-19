package Own;

import java.util.Scanner;

public class _1_vowel_to_capital_cons_to_small {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.toLowerCase();

        for (int i = 0; i < st.length(); i++) {
             char[] ch = st.toCharArray();
             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
             {
                 ch[i] = (char)(ch[i]-32);
             }
             st =new String(ch);
        }
        System.out.println(st);

    }
}
