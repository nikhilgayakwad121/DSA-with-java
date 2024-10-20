//calculate area of a circle and circumference of a circle

import java.util.Scanner;
class Circle{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double radius =sc.nextDouble();
        double Area_of_circle= 3.143*radius*radius;
        double circum_of_circle= 2*3.143*radius;
        System.out.println("Area of circle is = "+ Area_of_circle);
        System.out.println("Circumference of circle is = "+ circum_of_circle);

    }

 }
