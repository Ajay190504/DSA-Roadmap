import java.util.*;
import java.util.stream.*;

public class StreamApiSet {

    public static void main(String[] args) {

        // ===================== SECTION 1: STREAM CREATION =====================
        System.out.println("== SECTION 1: Stream Creation ==");
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 8, 3, 9, 1, 5));

        // From collection
        Stream<Integer> stream = set.stream(); // Stream from Set

        // Parallel stream
        Stream<Integer> parallelStream = set.parallelStream(); // Parallel processing

        // Stream.of
        Stream<Integer> ofStream = Stream.of(10, 20, 30);

        // Empty stream
        Stream<Object> emptyStream = Stream.empty();

        // Infinite stream
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n+2).limit(5);
        infiniteStream.forEach(n -> System.out.print(n + " "));
        System.out.println(" // Infinite Stream");

        // ===================== SECTION 2: INTERMEDIATE OPERATIONS =====================
        System.out.println("\n== SECTION 2: Intermediate Operations ==");

        // filter
        set.stream().filter(e -> e > 4).forEach(e -> System.out.print(e + " "));
        System.out.println(" // filter: elements >4");

        // map
        set.stream().map(e -> e*2).forEach(e -> System.out.print(e + " "));
        System.out.println(" // map: multiply by 2");

        // distinct (redundant for Set but included)
        set.stream().distinct().forEach(e -> System.out.print(e + " "));
        System.out.println(" // distinct(): remove duplicates (already unique in Set)");

        // sorted ascending
        set.stream().sorted().forEach(e -> System.out.print(e + " "));
        System.out.println(" // sorted(): ascending order");

        // sorted descending
        set.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println(" // sorted(Comparator.reverseOrder()): descending");

        // skip
        set.stream().skip(2).forEach(e -> System.out.print(e + " "));
        System.out.println(" // skip(n): skip first n elements");

        // limit
        set.stream().limit(3).forEach(e -> System.out.print(e + " "));
        System.out.println(" // limit(n): first n elements");

        // peek
        set.stream().peek(e -> System.out.print("[" + e + "]")).count();
        System.out.println(" // peek(): inspect elements");

        // map/filter chaining
        set.stream().map(e -> e*3).filter(e -> e>10).forEach(e -> System.out.print(e + " "));
        System.out.println(" // chaining: map*3 then filter>10");

        // ===================== SECTION 3: TERMINAL OPERATIONS =====================
        System.out.println("\n== SECTION 3: Terminal Operations ==");

        int sum = set.stream().mapToInt(Integer::intValue).sum(); // sum
        long count = set.stream().count(); // count
        int max = set.stream().max(Integer::compareTo).get(); // max
        int min = set.stream().min(Integer::compareTo).get(); // min
        int reduceSum = set.stream().reduce(0, Integer::sum); // reduce sum
        boolean any = set.stream().anyMatch(e -> e>7);
        boolean all = set.stream().allMatch(e -> e<10);
        boolean none = set.stream().noneMatch(e -> e<0);
        int first = set.stream().findFirst().get();
        int anyElem = set.stream().findAny().get();

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

        int[] arrayResult = set.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> listResult = set.stream().collect(Collectors.toList());
        Set<Integer> setResult = set.stream().collect(Collectors.toSet());
        Map<Integer,String> mapResult = set.stream()
                                           .collect(Collectors.toMap(e -> e, e -> "val"+e, (v1,v2)->v1));

        System.out.println("toArray: " + Arrays.toString(arrayResult));
        System.out.println("collect to List: " + listResult);
        System.out.println("collect to Set: " + setResult);
        System.out.println("collect to Map: " + mapResult);

        /*
        ================== NOTES ON STREAM METHODS FOR SET ==================
        SECTION 1: STREAM CREATION
        - set.stream(): Stream<T> from Set
        - parallelStream(): parallel processing
        - Stream.of(...): from varargs
        - Stream.empty(): empty stream
        - Stream.iterate(...).limit(n): infinite stream with limit

        SECTION 2: INTERMEDIATE OPERATIONS
        - filter(Predicate): retain elements matching condition
        - map(Function): transform elements
        - distinct(): remove duplicates (already unique in Set)
        - sorted(): ascending
        - sorted(Comparator): descending
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
        - repeated elements (irrelevant for Set)
        - distinct, ascending/descending
        - mapping, filtering, chaining
        */
    }
}