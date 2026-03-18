import java.util.*;
import java.util.stream.*;

public class StreamApiArrays {

    public static void main(String[] args) {

        // ===================== SECTION 1: STREAM CREATION =====================
        System.out.println("== SECTION 1: Stream Creation ==");
        int[] intArr = {5, 3, 8, 3, 9, 1, 5};
        long[] longArr = {100L, 200L, 100L, 300L};
        double[] doubleArr = {1.1, 2.2, 3.3, 2.2};
        String[] strArr = {"apple", "banana", "apple", "kiwi"};

        // From array
        IntStream intStream = Arrays.stream(intArr); // Creates IntStream from int array

        // From collection
        List<String> strList = Arrays.asList(strArr);
        Stream<String> strStream = strList.stream(); // Creates Stream<String> from collection

        // Stream.of
        Stream<String> ofStream = Stream.of("x", "y", "z"); // Creates Stream from varargs

        // Parallel stream
        Stream<String> parallelStream = strList.parallelStream(); // Parallel processing

        // Empty stream
        Stream<Object> emptyStream = Stream.empty(); // Empty stream

        // Infinite stream
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 2).limit(5); // Infinite stream limited to 5
        infiniteStream.forEach(n -> System.out.print(n + " "));
        System.out.println(" // Infinite Stream with iterate + limit");

        // ===================== SECTION 2: INTERMEDIATE OPERATIONS =====================
        System.out.println("\n== SECTION 2: Intermediate Operations ==");

        // filter
        Arrays.stream(intArr).filter(e -> e > 4).forEach(e -> System.out.print(e + " "));
        System.out.println(" // filter: keeps elements > 4");

        // map
        Arrays.stream(intArr).map(e -> e * 2).forEach(e -> System.out.print(e + " "));
        System.out.println(" // map: transforms each element (multiply by 2)");

        // mapToInt / mapToDouble / mapToLong
        Stream.of(1,2,3).mapToInt(Integer::intValue).forEach(System.out::print);
        System.out.println(" // mapToInt: convert Stream<Integer> to IntStream");

        // boxed
        Arrays.stream(intArr).boxed().forEach(e -> System.out.print(e + " "));
        System.out.println(" // boxed(): converts IntStream to Stream<Integer>");

        // distinct
        Arrays.stream(intArr).distinct().forEach(e -> System.out.print(e + " "));
        System.out.println(" // distinct(): removes duplicate elements");

        // sorted ascending
        Arrays.stream(intArr).sorted().forEach(e -> System.out.print(e + " "));
        System.out.println(" // sorted(): natural ascending order");

        // sorted descending
        Arrays.stream(intArr).boxed().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println(" // sorted(Comparator.reverseOrder()): descending order");

        // skip
        Arrays.stream(intArr).skip(3).forEach(e -> System.out.print(e + " "));
        System.out.println(" // skip(n): skip first n elements");

        // limit
        Arrays.stream(intArr).limit(3).forEach(e -> System.out.print(e + " "));
        System.out.println(" // limit(n): take first n elements");

        // peek
        Arrays.stream(intArr).peek(e -> System.out.print("[" + e + "]")).count();
        System.out.println(" // peek(): inspect elements without modifying the stream");

        // unordered
        Arrays.stream(intArr).unordered().forEach(e -> System.out.print(e + " "));
        System.out.println(" // unordered(): hint for unordered processing");

        // map/filter chaining
        Arrays.stream(intArr).map(e -> e*3).filter(e -> e>10).forEach(e -> System.out.print(e + " "));
        System.out.println(" // chaining: map -> filter");

        // ===================== SECTION 3: TERMINAL OPERATIONS =====================
        System.out.println("\n== SECTION 3: Terminal Operations ==");

        int sum = Arrays.stream(intArr).sum(); // sum of elements
        long count = Arrays.stream(intArr).count(); // number of elements
        int max = Arrays.stream(intArr).max().getAsInt(); // maximum value, getAsInt() from OptionalInt
        int min = Arrays.stream(intArr).min().getAsInt(); // minimum value
        double avg = Arrays.stream(intArr).average().getAsDouble(); // average
        boolean any = Arrays.stream(intArr).anyMatch(e -> e>7); // true if any element > 7
        boolean all = Arrays.stream(intArr).allMatch(e -> e<10); // true if all elements < 10
        boolean none = Arrays.stream(intArr).noneMatch(e -> e<0); // true if no element < 0
        int first = Arrays.stream(intArr).findFirst().getAsInt(); // first element
        int anyElem = Arrays.stream(intArr).findAny().getAsInt(); // any element
        int reduceSum = Arrays.stream(intArr).reduce(0, (a,b)->a+b); // reduce: sum of elements

        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("average: " + avg);
        System.out.println("anyMatch>7: " + any);
        System.out.println("allMatch<10: " + all);
        System.out.println("noneMatch<0: " + none);
        System.out.println("findFirst: " + first);
        System.out.println("findAny: " + anyElem);
        System.out.println("reduce sum: " + reduceSum);

        // ===================== SECTION 4: CONVERSION =====================
        System.out.println("\n== SECTION 4: Conversion to Collections / Arrays ==");

        int[] filteredArr = Arrays.stream(intArr).filter(e -> e>3).toArray(); // to array
        List<Integer> listFromStream = Arrays.stream(intArr).boxed().collect(Collectors.toList()); // to list
        Set<Integer> setFromStream = Arrays.stream(intArr).boxed().collect(Collectors.toSet()); // to set
        Map<Integer, String> mapFromStream = Arrays.stream(intArr).boxed()
                .collect(Collectors.toMap(e -> e, e -> "val"+e, (v1,v2)->v1)); // to map

        System.out.println("toArray filtered>3: " + Arrays.toString(filteredArr));
        System.out.println("collect to List: " + listFromStream);
        System.out.println("collect to Set: " + setFromStream);
        System.out.println("collect to Map: " + mapFromStream);

        // ===================== SECTION 5: STRING STREAM =====================
        System.out.println("\n== SECTION 5: String Stream Example ==");

        Arrays.stream(strArr)
                .distinct() // remove duplicates
                .filter(s -> s.length()>4) // filter strings with length>4
                .map(String::toUpperCase) // map to uppercase
                .sorted() // sort ascending
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        /*
        ================== NOTES ON STREAM METHODS ==================

        SECTION 1: STREAM CREATION
        - Arrays.stream(array): create stream from array
        - Collection.stream(): create stream from collection
        - Stream.of(...): create stream from varargs
        - parallelStream(): create parallel stream
        - Stream.empty(): empty stream
        - Stream.iterate(seed, func).limit(n): infinite stream with limit
        - Stream.generate(Supplier): infinite stream generated from supplier

        SECTION 2: INTERMEDIATE OPERATIONS
        - filter(Predicate): retain elements matching condition
        - map(Function): transform elements
        - mapToInt/Long/Double: convert object stream to primitive stream
        - boxed(): convert primitive stream to object stream
        - distinct(): remove duplicates
        - sorted(): natural ascending order
        - sorted(Comparator): custom sorting
        - skip(n): skip first n elements
        - limit(n): take first n elements
        - peek(Consumer): inspect elements during pipeline
        - unordered(): hint for unordered processing
        - flatMap(Function): flatten nested streams (not used in code)

        SECTION 3: TERMINAL OPERATIONS
        - forEach(Consumer): iterate elements
        - count(): number of elements
        - sum(), average(), max(), min(): aggregation operations
        - anyMatch(), allMatch(), noneMatch(): boolean checks
        - findFirst(), findAny(): retrieve element
        - reduce(BinaryOperator): combine elements
        - Optional getters: getAsInt(), getAsDouble(), getAsLong()

        SECTION 4: CONVERSION
        - toArray(): convert stream to array
        - collect(Collectors.toList()): convert stream to list
        - collect(Collectors.toSet()): convert stream to set
        - collect(Collectors.toMap()): convert stream to map

        SECTION 5: STRING STREAM
        - all operations above apply
        - filter, map, distinct, sorted demonstrated
        - Example shows mapping to uppercase, removing duplicates, sorting

        PRIMITIVE STREAMS: IntStream, LongStream, DoubleStream
        OBJECT STREAMS: Stream<T>
        CONVERSIONS: boxed(), asIntStream(), asDoubleStream(), asLongStream()
        CASES COVERED: repeated elements, distinct, ascending/descending, mapping, filtering, chained operations
        */
    }
}