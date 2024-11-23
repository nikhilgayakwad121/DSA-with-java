package Own_Sheet;

import java.util.Scanner;

public class _13_Reverse_the_given_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  str = "nikhil";
        String newstr= revString(str);
        System.out.println(newstr);
    }

   static String revString(String str) {
        String rev = "";
       for (int i = str.length()-1; i >=0; i--) {
           rev = rev + str.charAt(i);
       }


       return rev;


}
}
