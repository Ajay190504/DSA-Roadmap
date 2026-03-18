import java.util.*;

public class CollectionsAllMethods {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // BASIC COLLECTION CREATION
        // ---------------------------------------------------------

        List<Integer> list = new ArrayList<>();

        // addAll() → Adds multiple elements into collection
        Collections.addAll(list, 40, 10, 30, 20, 50);

        System.out.println("Original List: " + list);


        // ---------------------------------------------------------
        // SORTING AND ORDERING METHODS
        // ---------------------------------------------------------

        // sort() → Sorts list in ascending order
        Collections.sort(list);
        System.out.println("Ascending Sort: " + list);

        // reverseOrder() → Comparator used for descending sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sort: " + list);

        // reverse() → Reverses order of list elements
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // shuffle() → Randomly shuffles elements
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // rotate() → Rotates elements by given distance
        Collections.rotate(list, 2);
        System.out.println("Rotated List: " + list);

        // swap() → Swaps elements at given indexes
        Collections.swap(list, 0, 3);
        System.out.println("After Swap: " + list);


        // ---------------------------------------------------------
        // SEARCHING AND STATISTICS
        // ---------------------------------------------------------

        Collections.sort(list);

        // binarySearch() → Searches element in sorted list
        int index = Collections.binarySearch(list, 30);
        System.out.println("Index of 30: " + index);

        // max() → Returns maximum element
        int max = Collections.max(list);
        System.out.println("Maximum Element: " + max);

        // min() → Returns minimum element
        int min = Collections.min(list);
        System.out.println("Minimum Element: " + min);

        // frequency() → Counts occurrences of element
        list.add(20);
        list.add(20);
        int freq = Collections.frequency(list, 20);
        System.out.println("Frequency of 20: " + freq);

        // disjoint() → Checks if two collections share no common elements
        List<Integer> list2 = Arrays.asList(100, 200, 300);
        boolean disjoint = Collections.disjoint(list, list2);
        System.out.println("Collections Disjoint: " + disjoint);


        // ---------------------------------------------------------
        // MODIFICATION METHODS
        // ---------------------------------------------------------

        // replaceAll() → Replaces all occurrences of a value
        Collections.replaceAll(list, 20, 99);
        System.out.println("After replaceAll: " + list);

        // fill() → Replaces every element with specified value
        List<Integer> fillList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Collections.fill(fillList, 0);
        System.out.println("After fill(): " + fillList);

        // copy() → Copies source collection into destination
        List<Integer> src = Arrays.asList(7,8,9);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0,0,0));

        Collections.copy(dest, src);
        System.out.println("After copy(): " + dest);


        // ---------------------------------------------------------
        // IMMUTABLE COLLECTION FACTORY METHODS
        // ---------------------------------------------------------

        // emptyList() → Immutable empty list
        List<String> emptyList = Collections.emptyList();

        // emptySet() → Immutable empty set
        Set<String> emptySet = Collections.emptySet();

        // emptyMap() → Immutable empty map
        Map<String,Integer> emptyMap = Collections.emptyMap();

        System.out.println("Empty List: " + emptyList);
        System.out.println("Empty Set: " + emptySet);
        System.out.println("Empty Map: " + emptyMap);


        // singleton() → Immutable set with one element
        Set<String> singletonSet = Collections.singleton("Java");

        // singletonList() → Immutable list with one element
        List<String> singletonList = Collections.singletonList("AI");

        // singletonMap() → Immutable map with single entry
        Map<String,Integer> singletonMap = Collections.singletonMap("Age",25);

        System.out.println("Singleton Set: " + singletonSet);
        System.out.println("Singleton List: " + singletonList);
        System.out.println("Singleton Map: " + singletonMap);


        // nCopies() → Immutable list containing repeated element
        List<String> copies = Collections.nCopies(5, "Hello");

        System.out.println("nCopies List: " + copies);


        // ---------------------------------------------------------
        // UNMODIFIABLE COLLECTION WRAPPERS
        // ---------------------------------------------------------

        List<Integer> modifiableList = new ArrayList<>(Arrays.asList(1,2,3));

        // unmodifiableList() → Creates read-only list
        List<Integer> unmodifiableList = Collections.unmodifiableList(modifiableList);

        Set<Integer> modifiableSet = new HashSet<>(Arrays.asList(10,20,30));

        // unmodifiableSet() → Creates read-only set
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(modifiableSet);

        Map<Integer,String> modifiableMap = new HashMap<>();
        modifiableMap.put(1,"A");
        modifiableMap.put(2,"B");

        // unmodifiableMap() → Creates read-only map
        Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(modifiableMap);

        System.out.println("Unmodifiable List: " + unmodifiableList);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);


        // ---------------------------------------------------------
        // SYNCHRONIZED COLLECTION WRAPPERS (THREAD SAFE)
        // ---------------------------------------------------------

        // synchronizedList() → Thread-safe list
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add(10);
        syncList.add(20);

        // synchronizedSet() → Thread-safe set
        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
        syncSet.add(5);
        syncSet.add(15);

        // synchronizedMap() → Thread-safe map
        Map<Integer,String> syncMap = Collections.synchronizedMap(new HashMap<>());
        syncMap.put(1,"One");
        syncMap.put(2,"Two");

        System.out.println("Synchronized List: " + syncList);
        System.out.println("Synchronized Set: " + syncSet);
        System.out.println("Synchronized Map: " + syncMap);


        // ---------------------------------------------------------
        // ENUMERATION UTILITIES
        // ---------------------------------------------------------

        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.add("C");

        // enumeration() → Returns Enumeration over collection
        Enumeration<String> e = Collections.enumeration(vector);

        System.out.print("Enumeration elements: ");

        while(e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }

        System.out.println();

        // list() → Converts Enumeration to List
        Enumeration<String> e2 = vector.elements();

        List<String> enumList = Collections.list(e2);

        System.out.println("List from Enumeration: " + enumList);

    }
}