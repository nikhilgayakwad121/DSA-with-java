//calculate the area of rectangle and perimeter of rectangle
import java.util.Scanner;
class  MainRectange{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length and breadth of the rectangle");
        float l = sc. nextFloat();
        float b = sc. nextFloat();
        System.out.println("Area of the rectangle ="+ (l*b));
        System.out.println("perimter of the rectangle ="+ (2*(l+b)));

        
        }
}