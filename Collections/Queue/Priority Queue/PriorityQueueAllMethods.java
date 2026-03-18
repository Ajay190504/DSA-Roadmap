import java.util.*;

public class PriorityQueueAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue() → creates empty priority queue (min-heap)

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10);
        // PriorityQueue(int capacity) → initial capacity

        PriorityQueue<Integer> pq3 =
                new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue(Comparator) → custom ordering (max-heap)

        PriorityQueue<Integer> pq4 =
                new PriorityQueue<>(Arrays.asList(5,2,8,1));
        // PriorityQueue(Collection) → creates queue from collection


        // =====================================================
        // ADD METHODS
        // =====================================================

        pq.add(10);
        // add(E) → inserts element into queue

        pq.add(20);

        pq.offer(15);
        // offer(E) → inserts element safely (preferred for queues)

        pq.addAll(Arrays.asList(25,5,30));
        // addAll(Collection) → adds all elements from collection

        System.out.println("After adding: " + pq);


        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(pq.peek());
        // peek() → returns head element without removing

        System.out.println(pq.element());
        // element() → returns head element (throws exception if empty)

        System.out.println(pq.size());
        // size() → number of elements

        System.out.println(pq.isEmpty());
        // isEmpty() → checks if queue empty


        // =====================================================
        // REMOVE METHODS
        // =====================================================

        System.out.println(pq.poll());
        // poll() → removes and returns head element

        System.out.println(pq.remove());
        // remove() → removes head element (throws exception if empty)

        pq.remove(Integer.valueOf(25));
        // remove(Object) → removes specific element

        pq.removeIf(n -> n > 50);
        // removeIf(Predicate) → removes elements matching condition


        // =====================================================
        // SEARCH METHODS
        // =====================================================

        System.out.println(pq.contains(20));
        // contains(Object) → checks if element exists

        System.out.println(pq.containsAll(Arrays.asList(10)));
        // containsAll(Collection)


        // =====================================================
        // ITERATION METHODS
        // =====================================================

        Iterator<Integer> itr = pq.iterator();
        // iterator() → returns iterator for traversal

        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

        pq.forEach(System.out::println);
        // forEach(Consumer) → performs action on each element


        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = pq.toArray();
        // toArray() → converts queue to Object array

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
        // parallelStream() → parallel processing


        // =====================================================
        // BULK OPERATIONS
        // =====================================================

        pq.retainAll(Arrays.asList(10,20));
        // retainAll(Collection) → keeps only specified elements

        pq.removeAll(Arrays.asList(5));
        // removeAll(Collection) → removes specified elements


        // =====================================================
        // CLEAR
        // =====================================================

        pq.clear();
        // clear() → removes all elements


        // =====================================================
        // OBJECT METHODS
        // =====================================================

        System.out.println(pq.hashCode());
        // hashCode() → returns hash value

        System.out.println(pq.toString());
        // toString() → string representation
    }
}