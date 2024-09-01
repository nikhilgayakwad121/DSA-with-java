package Step1_learn_the_basics.Lecture_1_Thing_to_know;

import java.util.Scanner;

public class dataTypes {

    String strivers= "No article ";

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Integer value");
    int integer = sc.nextInt();
    System.out.println("integer value "+ integer);

    System.out.println("Enter short value");
    short shortvalue = sc.nextByte();
    System.out.println("short value "+ shortvalue);


    System.out.println("Enter byte value");
    byte bytevalue = sc.nextByte();
    System.out.println("byte value "+ bytevalue);

    System.out.println("Enter long value");
    long longvalue = sc.nextLong();
    System.out.println("long value "+ longvalue);

    System.out.println("Enter float value");
    float floatvalue = sc.nextFloat();
    System.out.println(" Float value "+ floatvalue);

    System.out.println("Enter boolean value");
    boolean booleanvalue =sc.nextBoolean();
    System.out.println("boolean value "+ booleanvalue);


    System.out.println("Enter String value");
    String stringvalue = sc.next();
    System.out.println("String value "+ stringvalue);

    System.out.println("Enter char value");
    char charvalue = stringvalue.charAt(0);
    System.out.println("char value "+ charvalue);

    }
}
