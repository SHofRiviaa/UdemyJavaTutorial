package Section3_Advanced.Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConceptStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = 0;

/*         for(int n: nums)
        {
            if(n%2==0)
            {
                n = n*2;
                sum = sum + n;
                System.out.println(n);
            }
        } */

        // Stream API
        // Stream API is used to process collections of objects
        // Stream API is used to process elements from a collection
        // Stream API is used to process elements from an array
        // Stream API is used to process elements from a file
        // Benefits of Stream API
        // 1. No need to write loops
        // 2. No need to write nested loops
        // 3. No need to write if-else conditions
        // 4. No need to write switch-case statements

        Stream<Integer> stream1 = nums.stream();
        Stream<Integer> stream2 = stream1.filter(n -> n%2==0);
        Stream<Integer> stream3 = stream2.map(n -> n*2);
/* 
        System.out.println("Stream 1 example: ");
        stream1.forEach(n -> System.out.println(n));

        System.out.println("Stream 2 example: ");
        stream2.forEach(n -> System.out.println(n));
 */
        System.out.println("Stream 3 example: ");
        stream3.forEach(n -> System.out.println(n));

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        int result = nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (n1, n2) -> n1+n2);
        System.out.println("Result: ");
        System.out.println(result);

        Consumer<Integer> consumer2 = n -> System.out.println(n);

        //nums.forEach(n -> System.out.println(n));

        //System.out.println(nums);
        nums.forEach(consumer);
        //nums.forEach(n -> System.out.println(n));

    }
}
