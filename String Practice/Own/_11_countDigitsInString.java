package Own;

import java.sql.PreparedStatement;

public class _11_countDigitsInString {
    public static void main(String[] args) {
        String str ="234b3nb4r4k8bdb4545vb";
        int result= digitCount(str);
        System.out.println(result);

    }

    private static int digitCount(String str) {
        int dc=0;
        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
//                sum = sum+ ch[i];
                dc++;
            }

        }
        return dc;
    }
}

