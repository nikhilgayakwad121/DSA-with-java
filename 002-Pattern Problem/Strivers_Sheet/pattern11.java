package Strivers_Sheet;

public class pattern11 {

    public static void main(String[] args) {
        int n = 5;
        int start = 1; //first row by printing  a  single 1


        for (int i = 0; i < n; i++)
        {
            if(i%2==0)
                start = 1; // if even then printing start in row with 1
            else
                start = 0 ; // if odd then printing start in row with 0

            for (int j = 0; j <=i; j++)
            {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();

        }
    }
}
