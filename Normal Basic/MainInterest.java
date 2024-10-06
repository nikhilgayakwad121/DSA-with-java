//calculate the simple interest and compound interest  

import java.util.Scanner;
class MainInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle");
        double P = sc.nextDouble();
        System.out.println("Enter Rate");
        double r = sc.nextDouble();
        System.out.println("Enter Time");
        double t = sc.nextDouble();
        double SI = P*r*t/100;
        double A = P*(1+r)*t;
        double CI = A-P;
        System.out.println("Simple interest is " + SI);
        System.out.println("Compound interest is "+ CI);

    }
}