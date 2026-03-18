import java.util.*;

public class HashSetAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        HashSet<Integer> set = new HashSet<>();
        // HashSet() → creates empty HashSet with default capacity

        HashSet<Integer> set2 = new HashSet<>(20);
        // HashSet(int capacity) → creates set with given initial capacity

        HashSet<Integer> set3 = new HashSet<>(20,0.75f);
        // HashSet(int capacity,float loadFactor)

        HashSet<Integer> set4 = new HashSet<>(Arrays.asList(1,2,3));
        // HashSet(Collection) → creates set from collection



        // =====================================================
        // ADD METHODS
        // =====================================================

        set.add(10);
        // add(E) → adds element if not already present

        set.add(20);

        set.addAll(set4);
        // addAll(Collection) → adds all elements from collection

        System.out.println("After adding elements: "+set);



        // =====================================================
        // ACCESS / SEARCH METHODS
        // =====================================================

        System.out.println(set.contains(10));
        // contains(Object) → checks if element exists

        System.out.println(set.containsAll(Arrays.asList(1,2)));
        // containsAll(Collection) → checks if all elements exist

        System.out.println(set.size());
        // size() → number of elements

        System.out.println(set.isEmpty());
        // isEmpty() → checks if set empty



        // =====================================================
        // REMOVE METHODS
        // =====================================================

        set.remove(20);
        // remove(Object) → removes specific element

        set.removeAll(Arrays.asList(1,2));
        // removeAll(Collection) → removes all given elements

        set.add(30);
        set.add(40);

        set.removeIf(n -> n > 35);
        // removeIf(Predicate) → removes elements matching condition



        // =====================================================
        // RETAIN METHOD
        // =====================================================

        set.retainAll(Arrays.asList(10,30));
        // retainAll(Collection) → keeps only specified elements



        // =====================================================
        // ITERATION METHODS
        // =====================================================

        Iterator<Integer> itr = set.iterator();
        // iterator() → returns iterator for traversal

        while(itr.hasNext())
            System.out.println(itr.next());

        set.forEach(System.out::println);
        // forEach(Consumer) → performs action on each element



        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = set.toArray();
        // toArray() → converts set to Object array

        Integer[] arr2 = set.toArray(new Integer[0]);
        // toArray(T[]) → converts set to typed array



        // =====================================================
        // SPLITERATOR
        // =====================================================

        Spliterator<Integer> sp = set.spliterator();
        // spliterator() → supports parallel traversal

        sp.forEachRemaining(System.out::println);



        // =====================================================
        // STREAM METHODS
        // =====================================================

        set.stream().forEach(System.out::println);
        // stream() → sequential stream

        set.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel stream



        // =====================================================
        // CLEAR METHOD
        // =====================================================

        set.clear();
        // clear() → removes all elements



        // =====================================================
        // OBJECT CLASS METHODS
        // =====================================================

        System.out.println(set.hashCode());
        // hashCode() → returns hash code of set

        System.out.println(set.equals(set2));
        // equals(Object) → compares two sets

        System.out.println(set.toString());
        // toString() → string representation
    }
}