
192303
        11923032933494192303

        package Step1_learn_the_basics.Lecture_1_Thing_to_know;

public class Strings {
    String strivers= "No article ";
    public static void main(String[] args) {

        //String literal
        //To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).
        String String_literal = "Geeks for Geeks";

        //Using new keyword
        //In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool)
        String string_bynewkeyword = new String("Geeks for Geeks");

        System.out.println("String created by the string literal "+ String_literal);
        System.out.println("String created by the new keyword "+ string_bynewkeyword);

    }
}
