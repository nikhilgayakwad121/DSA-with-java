package Strivers_Sheet;

public class pattern20 {

    public static void main(String[] args) {
        int n = 5;
            //initializing the spaces
            int spaces = n*2 -2;

            //outer loop
            for(int i =1; i<=n*2-1;i++){

                //stars for 1st half
                int stars = i;

                //stars for 2nd half
                if(i>n)
                    stars = 2*n - i;

                //stars
                for(int j =1;j<=stars ;j++){
                    System.out.print("*");
                }
                //spaces
                for(int j =1 ; j<= spaces ;j++){
                    System.out.print(" ");
                }

                //stars
                for(int j= 1 ; j<= stars ; j++){
                    System.out.print("*");
                }

                System.out.println();
                if(i<n)
                    spaces -=2;
                else
                    spaces +=2;
            }
        }
    }

