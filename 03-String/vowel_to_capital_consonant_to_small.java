import java.util.Scanner;

public class vowel_to_capital_consonant_to_small {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String str= func(st);
        System.out.println(str);
    }

    static String func(String st) {

        char[] ch= st.toCharArray();

        for(int i =0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                {
                    ch[i]=(char)(ch[i]-32);
                }
            }
            else if(ch[i]>='A' && ch[i]<='Z'){
                if(ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U')
                {
                    ch[i]= (char)(ch[i]+32);
                }

            }
        }
       String str = new String(ch);
        System.out.println(str);
        return  str;

    }

}
