//calculate the area of square and perimter of the square

import java.util.Scanner;
class MainSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        float s = sc.nextFloat();
        System.out.println("Area of square is "+ (s*s));
        System.out.println("perimeter of square is "+ (4*s));
    }
}