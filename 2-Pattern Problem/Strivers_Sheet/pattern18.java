package Strivers_Sheet;

public class pattern18 {

    public static void main(String[] args) {

        int N =5;
        for(int i = 0 ; i < N ;i++)
        {
            for(char ch =(char)('A'+N-1-i); ch<=(char)('A'+N-1); ch++)
            {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
