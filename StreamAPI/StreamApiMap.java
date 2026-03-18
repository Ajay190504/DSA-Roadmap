import java.util.*;
import java.util.stream.*;

public class StreamApiMap {

    public static void main(String[] args) {

        // ===================== SECTION 1: STREAM CREATION =====================
        System.out.println("== SECTION 1: Stream Creation ==");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "kiwi");
        map.put(4, "apple");

        // Stream from entrySet()
        Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();

        // Stream from keySet()
        Stream<Integer> keyStream = map.keySet().stream();

        // Stream from values()
        Stream<String> valueStream = map.values().stream();

        // Parallel stream
        Stream<Map.Entry<Integer,String>> parallelEntryStream = map.entrySet().parallelStream();

        // Stream.of
        Stream<Map.Entry<Integer,String>> ofStream = Stream.of(Map.entry(5,"mango"), Map.entry(6,"grape"));

        // Empty stream
        Stream<Object> emptyStream = Stream.empty();

        System.out.println("Map Stream created from entrySet, keySet, values, and Stream.of");

        // ===================== SECTION 2: INTERMEDIATE OPERATIONS =====================
        System.out.println("\n== SECTION 2: Intermediate Operations ==");

        // filter entries where key>2
        map.entrySet().stream()
                .filter(e -> e.getKey() > 2)
                .forEach(e -> System.out.println(e));
        System.out.println(" // filter: key>2");

        // map entries to key*10
        map.entrySet().stream()
                .map(e -> e.getKey()*10)
                .forEach(k -> System.out.print(k + " "));
        System.out.println(" // map: key*10");

        // distinct values
        map.values().stream().distinct().forEach(v -> System.out.print(v + " "));
        System.out.println(" // distinct values");

        // sorted by key ascending
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println(" // sorted by key ascending");

        // sorted by value descending
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
                .forEach(System.out::println);
        System.out.println(" // sorted by value descending");

        // skip
        map.entrySet().stream().skip(1).forEach(System.out::println);
        System.out.println(" // skip first entry");

        // limit
        map.entrySet().stream().limit(2).forEach(System.out::println);
        System.out.println(" // limit first 2 entries");

        // peek
        map.entrySet().stream().peek(e -> System.out.print("[" + e + "]")).count();
        System.out.println(" // peek: inspect entries");

        // map/filter chaining
        map.entrySet().stream()
                .filter(e -> e.getKey()>1)
                .map(Map.Entry::getValue)
                .forEach(v -> System.out.print(v + " "));
        System.out.println(" // chaining: filter key>1 -> map value");

        // ===================== SECTION 3: TERMINAL OPERATIONS =====================
        System.out.println("\n== SECTION 3: Terminal Operations ==");

        long count = map.entrySet().stream().count();
        boolean any = map.entrySet().stream().anyMatch(e -> e.getKey()>2);
        boolean all = map.entrySet().stream().allMatch(e -> e.getKey()<10);
        boolean none = map.entrySet().stream().noneMatch(e -> e.getKey()<0);

        Optional<Map.Entry<Integer,String>> first = map.entrySet().stream().findFirst();
        Optional<Map.Entry<Integer,String>> anyElem = map.entrySet().stream().findAny();

        System.out.println("count: " + count);
        System.out.println("anyMatch key>2: " + any);
        System.out.println("allMatch key<10: " + all);
        System.out.println("noneMatch key<0: " + none);
        System.out.println("findFirst: " + first.get());
        System.out.println("findAny: " + anyElem.get());

        // reduce example: concatenate all values
        String reduceValues = map.values().stream().reduce("", (a,b) -> a + "," + b);
        System.out.println("reduce values concatenated: " + reduceValues);

        // ===================== SECTION 4: CONVERSION =====================
        System.out.println("\n== SECTION 4: Conversion to Collections / Arrays ==");

        // keys to array
        Integer[] keyArray = map.keySet().stream().toArray(Integer[]::new);

        // values to list
        List<String> valueList = map.values().stream().collect(Collectors.toList());

        // entries to set
        Set<Map.Entry<Integer,String>> entrySetResult = map.entrySet().stream().collect(Collectors.toSet());

        // map reconstruction from stream
        Map<Integer,String> mapResult = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1,v2)->v1));

        System.out.println("keys to array: " + Arrays.toString(keyArray));
        System.out.println("values to list: " + valueList);
        System.out.println("entries to set: " + entrySetResult);
        System.out.println("collect back to map: " + mapResult);

        /*
        ================== NOTES ON STREAM METHODS FOR MAP ==================
        SECTION 1: STREAM CREATION
        - map.entrySet().stream(): Stream<Entry<K,V>>
        - map.keySet().stream(): Stream<K>
        - map.values().stream(): Stream<V>
        - parallelStream(): parallel processing
        - Stream.of(...): from varargs
        - Stream.empty(): empty stream

        SECTION 2: INTERMEDIATE OPERATIONS
        - filter(Predicate): retain entries matching condition
        - map(Function): transform elements (key, value, or entry)
        - distinct(): remove duplicates
        - sorted(): natural order (or comparator)
        - skip(n): skip first n elements
        - limit(n): take first n elements
        - peek(Consumer): inspect elements
        - chained operations: filter -> map -> sorted

        SECTION 3: TERMINAL OPERATIONS
        - forEach(), count(), anyMatch(), allMatch(), noneMatch()
        - findFirst(), findAny()
        - reduce(BinaryOperator): combine elements (e.g., concatenate values)

        SECTION 4: CONVERSION
        - toArray(): convert keys/values/entries to array
        - collect(Collectors.toList()): convert to List
        - collect(Collectors.toSet()): convert to Set
        - collect(Collectors.toMap()): convert back to Map

        CASES COVERED:
        - filter by key, map to value, distinct values
        - sorting by key or value
        - chaining filter + map
        - terminal operations: count, findFirst, reduce
        */
    }
}