package Strivers_Sheet;

public class pattern13 {

    public static void main(String[] args) {
        int n = 5;
        int temp = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
