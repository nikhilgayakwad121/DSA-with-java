package comparable_comparator_Both;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Natural order by ID
    }
}

class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Custom order by Name
    }
}

// Usage

class Test{

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Alice"));
        students.add(new Student(1, "Bob"));

        // Natural order (by ID)
        Collections.sort(students);
        for(Student st : students){
            System.out.println(st.name+" "+ st.id);
        }

        // Custom order (by Name)
        Collections.sort(students, new StudentComparatorByName());
        for(Student st : students){
            System.out.println(st.name+" "+ st.id);
        }
    }
}