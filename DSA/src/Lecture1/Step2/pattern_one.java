package Lecture1.Step2;

public class pattern_one {
    public static void main(String[] args) {
        nForest(5);
    }
    public static void nForest(int n) {
        for(int i=0;i<n;i++)
        {

            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
