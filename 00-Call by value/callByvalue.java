package Step1_learn_the_basics.Lecture_1_Thing_to_know;

public class callByvalue {

    public static void main(String[] args) {
        int number = 10;
        modifyValue(number);
        System.out.println(number); // Output: 10
    }

    public static void modifyValue(int value) {
        value = 20; // This change is local to the method
    }
}


// For objects, Java passes the value of the reference to the object, not the object itself. This means that the reference (or pointer) is copied,
// but both the original and the copied references point to the same object in memory.
// Therefore, while you cannot change the reference itself to point to a different object, you can modify the contents of the object it points to.
class PassByValueObjectExample {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        modifyObject(person);
        System.out.println(person.getName()); // Output: Bob
    }
    public static void modifyObject(Person p) {
        p.setName("Bob"); // Modifies the object that both references point to
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
