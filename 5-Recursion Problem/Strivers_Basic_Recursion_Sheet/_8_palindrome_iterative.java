package Strivers_Basic_Recursion_Sheet;

public class _8_palindrome_iterative {

    public static void main(String[] args) {
        String str = "Nitin";
        System.out.println(iterative_way(str));
    }

    private static boolean iterative_way(String str) {

        int left = 0, right =str.length()-1;

        while(left<right){
            char l = str.charAt(left) ,r =  str.charAt(right);

            if(!Character.isLetterOrDigit(l))
                left++;

            else if (!Character.isLetterOrDigit(r))
                right--;


            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                return false;

            else
                left++;
                right--;
        }

        return true;
    }
}


class By_Recursive_Approach{
    public static void main(String[] args) {
        String str = "Nitin".toLowerCase();


        System.out.println(palindrome(0, str));
    }

    static boolean palindrome(int i, String str) {

        if(i>=str.length()/2)
            return true;

        if(str.charAt(i)!=str.charAt(str.length()-i-1))
            return false;


        return palindrome(i+1, str);
    }
}
