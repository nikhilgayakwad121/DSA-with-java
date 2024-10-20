//calculate temperature in terms of calcius and print the equivalent temperature in the form fehrenheit.
import java.util.Scanner;
class Temperature{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in terms of celcius");
        double c = sc.nextDouble();
        double f=1.8*c+32;
        System.out.println("Equivalent temperature in terms of fehrenheit is : "+f);

    }
}