import java.util.*;

public class DequeAllMethods {

    public static void main(String[] args) {

        // ======================================================
        // DECLARATION
        // ======================================================

        Deque<Integer> dq = new ArrayDeque<>();
        // Creates a Deque using ArrayDeque implementation


        // ======================================================
        // ADD METHODS (Deque specific)
        // ======================================================

        dq.addFirst(10);
        // addFirst(E) → inserts element at front

        dq.addLast(20);
        // addLast(E) → inserts element at end

        dq.offerFirst(5);
        // offerFirst(E) → inserts element at front (returns boolean)

        dq.offerLast(30);
        // offerLast(E) → inserts element at end

        dq.push(1);
        // push(E) → pushes element onto stack (adds at front)

        dq.add(40);
        // add(E) → inserts element at end

        dq.offer(50);
        // offer(E) → inserts element like queue

        dq.addAll(Arrays.asList(60,70));
        // addAll(Collection) → adds all elements from collection

        System.out.println("After adding: " + dq);


        // ======================================================
        // ACCESS METHODS
        // ======================================================

        System.out.println(dq.getFirst());
        // getFirst() → returns first element

        System.out.println(dq.getLast());
        // getLast() → returns last element

        System.out.println(dq.peekFirst());
        // peekFirst() → retrieves first element without removing

        System.out.println(dq.peekLast());
        // peekLast() → retrieves last element without removing

        System.out.println(dq.peek());
        // peek() → retrieves head element

        System.out.println(dq.element());
        // element() → retrieves head but throws exception if empty


        // ======================================================
        // REMOVE METHODS
        // ======================================================

        dq.removeFirst();
        // removeFirst() → removes first element

        dq.removeLast();
        // removeLast() → removes last element

        dq.pollFirst();
        // pollFirst() → removes first element, returns null if empty

        dq.pollLast();
        // pollLast() → removes last element

        dq.pop();
        // pop() → removes element from stack (front)

        dq.remove();
        // remove() → removes head element

        dq.poll();
        // poll() → removes head element safely

        dq.removeFirstOccurrence(40);
        // removeFirstOccurrence(Object)

        dq.removeLastOccurrence(70);
        // removeLastOccurrence(Object)


        // ======================================================
        // SEARCH METHODS
        // ======================================================

        System.out.println(dq.contains(20));
        // contains(Object) → checks if element exists


        // ======================================================
        // SIZE / STATUS METHODS
        // ======================================================

        System.out.println(dq.size());
        // size() → number of elements

        System.out.println(dq.isEmpty());
        // isEmpty() → checks if deque empty


        // ======================================================
        // ITERATION METHODS
        // ======================================================

        Iterator<Integer> itr = dq.iterator();
        // iterator() → forward traversal

        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

        Iterator<Integer> ditr = dq.descendingIterator();
        // descendingIterator() → reverse traversal

        while(ditr.hasNext())
            System.out.print(ditr.next()+" ");
        System.out.println();

        dq.forEach(System.out::println);
        // forEach(Consumer) → performs action on each element


        // ======================================================
        // ARRAY CONVERSION
        // ======================================================

        Object[] arr = dq.toArray();
        // toArray() → converts deque to Object array

        Integer[] arr2 = dq.toArray(new Integer[0]);
        // toArray(T[]) → converts to typed array


        // ======================================================
        // STREAM METHODS
        // ======================================================

        dq.stream().forEach(System.out::println);
        // stream() → sequential stream

        dq.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel processing


        // ======================================================
        // SPLITERATOR
        // ======================================================

        Spliterator<Integer> sp = dq.spliterator();
        // spliterator() → supports parallel traversal

        sp.forEachRemaining(System.out::println);


        // ======================================================
        // BULK OPERATIONS
        // ======================================================

        dq.removeIf(n -> n>50);
        // removeIf(Predicate) → removes elements matching condition

        dq.retainAll(Arrays.asList(10,20));
        // retainAll(Collection)

        dq.containsAll(Arrays.asList(10));
        // containsAll(Collection)


        // ======================================================
        // CLEAR
        // ======================================================

        dq.clear();
        // clear() → removes all elements


        // ======================================================
        // OBJECT METHODS
        // ======================================================

        System.out.println(dq.hashCode());
        // hashCode() → returns hash value

        System.out.println(dq.toString());
        // toString() → string representation

    }
}