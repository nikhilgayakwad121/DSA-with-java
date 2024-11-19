import java.util.Scanner;

public class _3_revTheSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revSent = reverseTheSent(str);
        System.out.println(revSent);
    }

    static String reverseTheSent(String str) {

        char ch[] = str.toCharArray();
        String rev= " ";
        for(int i=ch.length-1; i>=0 ; i--){
            int last = i;
            while(i>=0 && ch[i]!= ' '){
                i--;
            }
            int first = i+1;
            while (first <= last )
            {
                rev = rev + ch[first];
                first++;
            }
            if(i>=0){
                rev =rev+" ";
            }

        }
        return  rev;
    }
}
