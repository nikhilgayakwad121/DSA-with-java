package Strivers_Sheet;

public class pattern10 {

    public static void main(String[] args) {
        int n = 5;
        //star
        for (int i = 1; i <= 2 * n -1 ; i++) {

            int stars = i ;// For first half

            if(stars > n){
                stars = 2 * n - i ;  // For second half
            }
            //star
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
