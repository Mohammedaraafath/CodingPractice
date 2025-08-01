package java8;

import java.util.*;
import java.util.stream.*;

    public class StreamApi {

        // What is Stream API?
        // ➤ A powerful feature in Java 8 for processing collections.
        // ➤ A Stream is a sequence of elements that supports:
        //    - Sequential and parallel aggregate operations.
        // ➤ It does NOT store data.
        // ➤ It does NOT modify the original collection.

        // Why use Stream API?
        // ✓ Clean, concise code (functional style)
        // ✓ Improved readability
        // ✓ Powerful data transformation
        // ✓ Supports parallel processing (multi-core utilization)
        // ✓ Lazy evaluation (operations are only run when needed)
        // ✓ Chaining operations (pipeline of steps)

        public static void main(String[] args) {

            // Create a list
            List<String> list = Arrays.asList("apple", "banana", "orange", "apricot");

            // Create a stream
            Stream<String> stream = list.stream();

            System.out.println("Filter elements starting with 'a':");
            list.stream()
                    .filter(s -> s.startsWith("a"))     // filter elements
                    .forEach(System.out::println);

            System.out.println("\nConvert to uppercase:");
            list.stream()
                    .map(String::toUpperCase)          // transform elements
                    .forEach(System.out::println);

            System.out.println("\nSorted elements:");
            list.stream()
                    .sorted()                          // sort elements
                    .forEach(System.out::println);

            System.out.println("\nCollect uppercase starting with 'B':");
            List<String> result = list.stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.startsWith("B"))
                    .collect(Collectors.toList());
            System.out.println(result);           // Output: [BANANA]

            System.out.println("\nReduce (sum of integers):");
            int sum = Arrays.asList(1, 2, 3, 4).stream()
                    .reduce(0, Integer::sum);         // reduce to sum
            System.out.println(sum);              // Output: 10

            System.out.println("\nDistinct elements:");
            List<Integer> integers = Arrays.asList(1, 2, 2, 4);
            integers.stream()
                    .distinct()                       // remove duplicates
                    .forEach(System.out::println);

            System.out.println("\nParallel Stream Example:");
            list.parallelStream()
                    .forEach(System.out::println);    // parallel processing

            // When to use parallelStream?
            // ➤ Useful for large datasets and CPU-intensive tasks.

            List<Integer> bigList = IntStream.range(1, 1_000_000)
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println("\nSum of doubled values (parallel):");
            long bigSum = bigList.parallelStream()
                    .mapToLong(i -> i * 2)
                    .sum();
            System.out.println(bigSum);           // Should print large number
        }
    }


