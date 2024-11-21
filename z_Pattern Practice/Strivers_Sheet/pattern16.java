package Strivers_Sheet;

public class pattern16 {

    public static void main(String[] args) {
        int n =5;

        // no. of rows
        for (int i = 0; i < n; i++) {
            // print char
            for (int j = 0; j <= i ; j++) {
                System.out.print((char)('A'+ i ));
            }
            System.out.println();
        }
    }
}
