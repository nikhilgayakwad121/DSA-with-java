package Own_Sheet;

import java.util.Arrays;

public class _15_Non_primitiveArray {

    public static void main(String[] args) {
        Student s1= new Student(123, "ramesh", 78.90);

        Student s2= new Student(1234, "suresh", 71.90);

        Student s3= new Student(12345, "bablu", 73.90);


        Student[] arr = {s1, s2, s3};

        System.out.println(Arrays.toString(arr));

    }
}
class Student{

    final int rollno;
    final String name;
    final double percentage;

    @Override
    public String toString() {
        return rollno+" "+name+" "+percentage;
    }

    public Student(int rollno, String name, double percentage) {
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;

    }

}


class heterogenousArray{
    public static void main(String[] args) {
        Object arr[]= { 34, 56.756, "Raghu", true,false,  };

    }
}


class CharArrayReverse
{
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'D', 'E'};

        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);

        }
    }
}