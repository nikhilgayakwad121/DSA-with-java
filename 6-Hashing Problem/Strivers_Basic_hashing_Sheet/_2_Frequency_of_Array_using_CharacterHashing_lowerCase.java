package Strivers_Basic_hashing_Sheet;

import java.util.Scanner;

//if the contains only in lowerCase
public class _2_Frequency_of_Array_using_CharacterHashing_lowerCase {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str =sc.next();

        //Pre-compute
        int[]  hash = new int[26];
        for (int i = 0; i < str.length() ; i++) {
            hash[str.charAt(i)-'a']++;
        }

        System.out.println("How many time we want to run a loop");
        int q;
        q = sc.nextInt();
        while(q-- >0){
            char ch;
            ch =  sc.next().charAt(0);
            //fetch:
            System.out.println(hash[ch-'a']);
        }

    }
}


///if the String contains in upperCase
class _2_Frequency_of_Array_using_CharacterHashing_upperCase{
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //pre-storing
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)-'A']++ ;
        }

        System.out.println("How many time we want to run the loop");
        int q = sc.nextInt();
        while(q-- >0){
            char ch = sc.next().charAt(0);

            //Fetching
            System.out.println(hash[ch-'a']);
        }
    }
}


//if the String contains lowerCase or upper Case
class  _2_Frequency_of_Array_using_CharacterHashing_UpperOrLower{
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //preStoring
        int[] hash= new int[256];

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        int q = sc.nextInt();
        while(q-- >0){
            char ch = sc.next().charAt(0);

            //fetching
            System.out.println(hash[ch]);

        }

    }
}