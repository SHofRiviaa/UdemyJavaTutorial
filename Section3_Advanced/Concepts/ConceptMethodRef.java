package Section3_Advanced.Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConceptMethodRef {



    public static void main(String[] args) {
        // Method Reference
        // Method Reference is used to refer method of functional interface
        // Method Reference is a shorthand syntax for lambda expression to call a method
        // Method Reference is used to call a method by referring to it with the help of its class directly
        // Pass a method as an argument to another method

        // Types of Method Reference
        // 1. Reference to a static method
        // 2. Reference to an instance method
        // 3. Reference to a constructor

        // Method reference is done using ::

        List<String> names = Arrays.asList("McDavid", "Draisatl", "Bouchard");

        List<String> uNames = names.stream().map(String::toUpperCase).toList();

        uNames.forEach(System.out::println);

        // Constructor reference
        // Constructor reference is used to refer a constructor of a class
        // Constructor reference is used to create new objects

        List <Student> students = new ArrayList<>();

        /* for(String name : names)
        {
            students.add(new Student(20, name));
        }

        students.forEach(s -> System.out.println(s.name + " "+ s.age)); */

        // students = names.stream().map(name -> new Student(20, name)).toList();
        students = names.stream().map(Student::new).toList();

        students.forEach(s -> System.out.println(s.name + " "+ s.age));
    
}
}
