package Strivers_Sheet;

public class pattern22 {

    public static void main(String[] args) {
        int n =5;
        for(int i = 0; i< 2* n-1 ; i++)
        {
            for (int j = 0; j< 2* n-1 ; j++)
            {
                //initialising  the top , bottom , left and right indices of a cell

                int top = i;
                int bottom = j;
                int right = (2*n-2) - j;
                int left = (2* n -2) - i;
                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }

    }
}
