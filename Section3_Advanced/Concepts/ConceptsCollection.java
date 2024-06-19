package Section3_Advanced.Concepts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

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

    }
}
