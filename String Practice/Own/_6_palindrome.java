package Own;

import java.util.Scanner;

public class _6_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean rs  = isPalinderome(str);
        System.out.println(rs);

    }

    private static boolean isPalinderome(String str) {
        int i =0, j = str.length()-1;

        while(i < j){
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
                i++;
                j--;
            }
        return true;
    }
}
