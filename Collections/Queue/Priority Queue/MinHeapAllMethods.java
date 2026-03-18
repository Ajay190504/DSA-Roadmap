import java.util.*;

public class MinHeapAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue() → creates min heap with natural ordering

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10);
        // PriorityQueue(int capacity) → creates heap with initial capacity

        PriorityQueue<Integer> pq3 =
                new PriorityQueue<>(Arrays.asList(30,10,20));
        // PriorityQueue(Collection) → creates heap from collection

        PriorityQueue<Integer> pq4 =
                new PriorityQueue<>(Comparator.naturalOrder());
        // PriorityQueue(Comparator) → heap using comparator



        // =====================================================
        // ADD METHODS
        // =====================================================

        pq.add(40);
        // add(E) → inserts element into heap

        pq.offer(10);
        // offer(E) → inserts element (preferred for queues)

        pq.offer(30);
        pq.offer(20);

        pq.addAll(Arrays.asList(50,60));
        // addAll(Collection) → adds all elements

        System.out.println("Heap: " + pq);



        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(pq.peek());
        // peek() → returns smallest element without removing

        System.out.println(pq.element());
        // element() → same as peek but throws exception if empty



        // =====================================================
        // REMOVE METHODS
        // =====================================================

        System.out.println(pq.poll());
        // poll() → removes and returns smallest element

        System.out.println(pq.remove());
        // remove() → removes head (throws exception if empty)

        pq.remove(30);
        // remove(Object) → removes specific element

        pq.removeIf(x -> x > 50);
        // removeIf(Predicate) → removes elements matching condition



        // =====================================================
        // SEARCH METHODS
        // =====================================================

        System.out.println(pq.contains(20));
        // contains(Object) → checks if element exists

        System.out.println(pq.containsAll(Arrays.asList(10,20)));
        // containsAll(Collection)



        // =====================================================
        // SIZE METHODS
        // =====================================================

        System.out.println(pq.size());
        // size() → number of elements

        System.out.println(pq.isEmpty());
        // isEmpty() → checks if heap empty



        // =====================================================
        // ITERATION
        // =====================================================

        Iterator<Integer> itr = pq.iterator();
        // iterator() → returns iterator

        while(itr.hasNext())
            System.out.println(itr.next());

        pq.forEach(System.out::println);
        // forEach(Consumer)



        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = pq.toArray();
        // toArray() → converts to Object array

        Integer[] arr2 = pq.toArray(new Integer[0]);
        // toArray(T[]) → converts to typed array



        // =====================================================
        // SPLITERATOR
        // =====================================================

        Spliterator<Integer> sp = pq.spliterator();
        // spliterator() → supports parallel traversal

        sp.forEachRemaining(System.out::println);



        // =====================================================
        // STREAM METHODS
        // =====================================================

        pq.stream().forEach(System.out::println);
        // stream() → sequential stream

        pq.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel stream



        // =====================================================
        // CLEAR METHOD
        // =====================================================

        pq.clear();
        // clear() → removes all elements



        // =====================================================
        // OBJECT CLASS METHODS
        // =====================================================

        System.out.println(pq.hashCode());
        // hashCode() → returns hash code

        System.out.println(pq.equals(pq2));
        // equals(Object)

        System.out.println(pq.toString());
        // toString() → string representation
    }
}