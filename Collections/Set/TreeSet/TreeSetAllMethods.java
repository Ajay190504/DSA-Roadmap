import java.util.*;

public class TreeSetAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        TreeSet<Integer> set = new TreeSet<>();
        // TreeSet() → creates empty TreeSet sorted by natural ordering

        TreeSet<Integer> set2 = new TreeSet<>(Collections.reverseOrder());
        // TreeSet(Comparator) → creates TreeSet with custom comparator

        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(5,2,8,1));
        // TreeSet(Collection) → creates TreeSet from collection and sorts elements

        TreeSet<Integer> set4 = new TreeSet<>(set3);
        // TreeSet(SortedSet) → creates TreeSet from another sorted set



        // =====================================================
        // ADD METHODS
        // =====================================================

        set.add(10);
        // add(E) → adds element (duplicates not allowed)

        set.add(20);

        set.addAll(Arrays.asList(30,40,50));
        // addAll(Collection) → adds all elements

        System.out.println("After adding elements: " + set);



        // =====================================================
        // ACCESS / SEARCH METHODS
        // =====================================================

        System.out.println(set.contains(10));
        // contains(Object) → checks if element exists

        System.out.println(set.containsAll(Arrays.asList(10,20)));
        // containsAll(Collection)

        System.out.println(set.size());
        // size() → number of elements

        System.out.println(set.isEmpty());
        // isEmpty() → checks if set empty



        // =====================================================
        // REMOVE METHODS
        // =====================================================

        set.remove(20);
        // remove(Object) → removes element

        set.removeAll(Arrays.asList(30));
        // removeAll(Collection)

        set.add(60);
        set.add(70);

        set.removeIf(n -> n > 65);
        // removeIf(Predicate) → removes elements matching condition



        // =====================================================
        // SORTEDSET METHODS
        // =====================================================

        System.out.println(set.first());
        // first() → returns smallest element

        System.out.println(set.last());
        // last() → returns largest element

        System.out.println(set.headSet(50));
        // headSet(E) → elements less than given value

        System.out.println(set.tailSet(10));
        // tailSet(E) → elements greater or equal to given value

        System.out.println(set.subSet(10,50));
        // subSet(from,to) → subset between range



        // =====================================================
        // NAVIGABLESET METHODS
        // =====================================================

        System.out.println(set.ceiling(15));
        // ceiling(E) → smallest element ≥ given value

        System.out.println(set.floor(15));
        // floor(E) → greatest element ≤ given value

        System.out.println(set.higher(10));
        // higher(E) → smallest element strictly greater

        System.out.println(set.lower(10));
        // lower(E) → greatest element strictly smaller

        System.out.println(set.pollFirst());
        // pollFirst() → removes and returns first element

        System.out.println(set.pollLast());
        // pollLast() → removes and returns last element

        System.out.println(set.descendingSet());
        // descendingSet() → reverse order view

        System.out.println(set.descendingIterator());
        // descendingIterator() → reverse iterator


        // Range navigation methods

        System.out.println(set.headSet(50,true));
        // headSet(E,boolean) → elements ≤ given value if true

        System.out.println(set.tailSet(10,true));
        // tailSet(E,boolean) → elements ≥ given value if true

        System.out.println(set.subSet(10,true,50,false));
        // subSet(E,boolean,E,boolean) → range with inclusive/exclusive control



        // =====================================================
        // ITERATION METHODS
        // =====================================================

        Iterator<Integer> itr = set.iterator();
        // iterator() → returns iterator for traversal

        while(itr.hasNext())
            System.out.println(itr.next());

        set.forEach(System.out::println);
        // forEach(Consumer)



        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = set.toArray();
        // toArray() → converts set to Object array

        Integer[] arr2 = set.toArray(new Integer[0]);
        // toArray(T[]) → converts to typed array



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
        // hashCode() → returns hash code

        System.out.println(set.equals(set2));
        // equals(Object) → compares two sets

        System.out.println(set.toString());
        // toString() → string representation
    }
}