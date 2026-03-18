import java.util.*;
import java.util.stream.*;

public class StreamApiList {

    public static void main(String[] args) {

        // ===================== SECTION 1: STREAM CREATION =====================
        System.out.println("== SECTION 1: Stream Creation ==");
        List<Integer> list = Arrays.asList(5, 3, 8, 3, 9, 1, 5);

        // From collection
        Stream<Integer> stream = list.stream(); // Creates Stream<Integer> from List

        // Parallel stream
        Stream<Integer> parallelStream = list.parallelStream(); // Parallel processing

        // Stream.of
        Stream<Integer> ofStream = Stream.of(10, 20, 30); // Stream from varargs

        // Empty stream
        Stream<Object> emptyStream = Stream.empty(); // Empty stream

        // Infinite stream example
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n+2).limit(5);
        infiniteStream.forEach(n -> System.out.print(n + " "));
        System.out.println(" // Infinite Stream");

        // ===================== SECTION 2: INTERMEDIATE OPERATIONS =====================
        System.out.println("\n== SECTION 2: Intermediate Operations ==");

        // filter
        list.stream().filter(e -> e > 4).forEach(e -> System.out.print(e + " "));
        System.out.println(" // filter: elements >4");

        // map
        list.stream().map(e -> e*2).forEach(e -> System.out.print(e + " "));
        System.out.println(" // map: multiply by 2");

        // distinct
        list.stream().distinct().forEach(e -> System.out.print(e + " "));
        System.out.println(" // distinct(): removes duplicates");

        // sorted ascending
        list.stream().sorted().forEach(e -> System.out.print(e + " "));
        System.out.println(" // sorted(): ascending order");

        // sorted descending
        list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println(" // sorted(Comparator.reverseOrder()): descending");

        // skip
        list.stream().skip(3).forEach(e -> System.out.print(e + " "));
        System.out.println(" // skip(n): skip first n elements");

        // limit
        list.stream().limit(3).forEach(e -> System.out.print(e + " "));
        System.out.println(" // limit(n): first n elements");

        // peek
        list.stream().peek(e -> System.out.print("[" + e + "]")).count();
        System.out.println(" // peek(): inspect elements");

        // map/filter chaining
        list.stream().map(e -> e*3).filter(e -> e>10).forEach(e -> System.out.print(e + " "));
        System.out.println(" // chaining: map*3 then filter>10");

        // ===================== SECTION 3: TERMINAL OPERATIONS =====================
        System.out.println("\n== SECTION 3: Terminal Operations ==");

        int sum = list.stream().mapToInt(Integer::intValue).sum(); // sum
        long count = list.stream().count(); // count
        int max = list.stream().max(Integer::compareTo).get(); // max
        int min = list.stream().min(Integer::compareTo).get(); // min
        int reduceSum = list.stream().reduce(0, Integer::sum); // reduce sum
        boolean any = list.stream().anyMatch(e -> e>7); // anyMatch
        boolean all = list.stream().allMatch(e -> e<10); // allMatch
        boolean none = list.stream().noneMatch(e -> e<0); // noneMatch
        int first = list.stream().findFirst().get(); // findFirst
        int anyElem = list.stream().findAny().get(); // findAny

        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("reduce sum: " + reduceSum);
        System.out.println("anyMatch>7: " + any);
        System.out.println("allMatch<10: " + all);
        System.out.println("noneMatch<0: " + none);
        System.out.println("findFirst: " + first);
        System.out.println("findAny: " + anyElem);

        // ===================== SECTION 4: CONVERSION =====================
        System.out.println("\n== SECTION 4: Conversion to Collections / Arrays ==");

        int[] arrayResult = list.stream().mapToInt(Integer::intValue).toArray(); // to array
        List<Integer> listResult = list.stream().collect(Collectors.toList()); // to list
        Set<Integer> setResult = list.stream().collect(Collectors.toSet()); // to set
        Map<Integer,String> mapResult = list.stream()
                                            .collect(Collectors.toMap(e -> e, e -> "val"+e, (v1,v2)->v1)); // to map

        System.out.println("toArray: " + Arrays.toString(arrayResult));
        System.out.println("collect to List: " + listResult);
        System.out.println("collect to Set: " + setResult);
        System.out.println("collect to Map: " + mapResult);

        /*
        ================== NOTES ON STREAM METHODS FOR LIST ==================
        SECTION 1: STREAM CREATION
        - list.stream(): creates Stream<T> from list
        - parallelStream(): parallel processing
        - Stream.of(...): from varargs
        - Stream.empty(): empty stream
        - Stream.iterate(...).limit(n): infinite stream with limit

        SECTION 2: INTERMEDIATE OPERATIONS
        - filter(Predicate): retain matching elements
        - map(Function): transform elements
        - distinct(): remove duplicates
        - sorted(): natural ascending
        - sorted(Comparator): custom sorting (descending)
        - skip(n): skip first n
        - limit(n): take first n
        - peek(Consumer): inspect elements
        - chained operations: map -> filter

        SECTION 3: TERMINAL OPERATIONS
        - forEach(), count(), sum(), max(), min(), reduce()
        - anyMatch(), allMatch(), noneMatch()
        - findFirst(), findAny()

        SECTION 4: CONVERSION
        - toArray(), collect(Collectors.toList()), collect(Collectors.toSet()), collect(Collectors.toMap())

        CASES COVERED:
        - repeated elements, distinct, ascending/descending, mapping, filtering, chained operations
        */
    }
}