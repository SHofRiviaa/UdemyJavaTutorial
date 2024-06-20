package Section3_Advanced.Concepts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Section3_Advanced.Concepts.a.b.c;

import java.util.Iterator;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age<o.age) 
                    return 1;
                else
                    return -1;
    }
    
}

public class ConceptsCollection {
    public static void main(String[] args) {
        
        // Collection API concept
        // Collection interface is the root interface in the collection hierarchy
        // Collections is a utility class in java.util package

        // Collection interface
        // Collection has List, Set, Queue interfaces
        // List interface has ArrayList, LinkedList, Vector, Stack classes
        // Set interface has HashSet, LinkedHashSet, TreeSet classes
        // Queue interface has PriorityQueue class, Deque interface has ArrayDeque class
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        
        System.out.println(nums.get(0));

        for (Integer num : nums) {
            System.out.println(num);
        }

        // Sets
        // Set is a collection that does not allow duplicate elements
        // Set is an interface that extends Collection interface
        // Set has HashSet, LinkedHashSet, TreeSet classes
        // Set does not have get() method to retrieve elements
        // Set doesn't have any order
        // HashSet does not maintain the insertion order
        // LinkedHashSet maintains the insertion order
        // TreeSet maintains the ascending order

        Set<Integer> nums2 = new java.util.HashSet<Integer>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(4);

        System.out.println("Sets");
        for (Integer num : nums2) {
            System.out.println(num);
        }

        // TreeSet
        Set<Integer> nums3 = new java.util.TreeSet<Integer>();
        nums3.add(4);
        nums3.add(3);
        nums3.add(2);
        nums3.add(1);

        System.out.println("TreeSet");
        for (Integer num : nums3) {
            System.out.println(num);
        }

        // Iterator interface
        // Iterator is an interface in java.util package
        // Iterator is used to iterate over a collection
        // Iterator has hasNext(), next(), remove() methods

        Iterator<Integer> it = nums.iterator();
        System.out.println("Iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Map
        // Map is an interface in java.util package
        // Map is used to store key-value pairs
        // Map has HashMap, LinkedHashMap, TreeMap classes
        // HashMap does not maintain the insertion order, and allows one null key, and keys are unique
        // LinkedHashMap maintains the insertion order
        // TreeMap maintains the ascending order of keys

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        
        System.out.println("Map");
        System.out.println(map);
        System.out.println(map.keySet());
        
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // Comparator vs Comparable
        // Comparator is an interface in java.util package
        // Comparator is used to sort objects of user-defined classes
        // Comparator has compare() method
        // Comparable is an interface in java.lang package
        // Comparable is used to sort objects of user-defined classes
        // Comparable has compareTo() method
        // Comparable is implemented by the class whose objects are to be sorted
        // Comparator is implemented by a separate class
        // Difference is that Comparable is implemented in the class whose objects are to be sorted, while Comparator is implemented in a separate class

        List<Integer> nums4 = new ArrayList<Integer>();
        nums4.add(43);
        nums4.add(31);
        nums4.add(72);
        nums4.add(29);

        
        Comparator<Integer> comp = new Comparator<Integer>()
        {
            
            public int compare(Integer a, Integer b) {
                if(a%10>b%10) 
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums4,comp); 

        System.out.println("Comparator" );
        System.out.println(nums4);

        // If you want a custom sorting order, you can use Comparator

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(23, "Alice"));
        students.add(new Student(27, "Bob"));
        students.add(new Student(22, "Charlie"));
        students.add(new Student(25, "David"));

        for (Student student : students) {
            System.out.println(student.age + " " + student.name);
        }
        
        // ex with lambda: Comparator<Student> comp = (Student a, Student b) 
        //-> a.age>b.age?1:-1;
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if(a.age>b.age) 
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println("Custom Comparator lower to higher");
        for (Student student : students) {
            System.out.println(student.age + " " + student.name);
        }

        System.out.println("Custom Comparator higher to lower");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.age + " " + student.name);
        }


    }
}
