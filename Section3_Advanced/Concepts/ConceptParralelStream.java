package Section3_Advanced.Concepts;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.random.*;

public class ConceptParralelStream {
    public static void main(String[] args) {

        // Parallel Stream
        // Parallel Stream is used to process elements in parallel
        // Parallel Stream is used to process elements concurrently
        // Parallel Stream is used to process elements simultaneously
        // Parallel Stream is used to process elements in parallel using multiple threads
        // Parallel Stream is used to process elements concurrently using multiple threads

        // Benefits of Parallel Stream
        // 1. Faster processing
        // 2. Efficient processing
        // 3. Better performance
        // 4. Improved throughput
        // 5. Improved resource utilization

        List<Integer> parNums = new ArrayList<>(10000);

        Random ran = new Random();

        for (int i = 0; i < 10000; i++) {
            parNums.add(ran.nextInt(1000));
        }

        long start = System.currentTimeMillis();

        int summ1 = parNums.stream().map(i-> i*2).reduce(0, (i, j) -> i+j);

        long end1 = System.currentTimeMillis();

        int summ2 = parNums.stream().map(i-> i*2).mapToInt(i->i).sum();

        long end2 = System.currentTimeMillis();

        int summ3 = parNums.parallelStream().map(i-> i*2).reduce(0, (i, j) -> i+j);

        long end3 = System.currentTimeMillis();

        System.out.println(summ1+" "+summ2 + " " + summ3);
        System.out.println("Time taken by sequential stream1: "+(end1-start));
        System.out.println("Time taken by sequential stream2: "+(end2-start));
        System.out.println("Time taken by parallel stream: "+(end3-start));

    }
}
