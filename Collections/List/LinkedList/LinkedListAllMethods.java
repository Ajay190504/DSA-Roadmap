import java.util.*;

public class LinkedListAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        LinkedList<Integer> list = new LinkedList<>();
        // LinkedList() → creates empty LinkedList

        LinkedList<Integer> list2 =
                new LinkedList<>(Arrays.asList(1,2,3));
        // LinkedList(Collection c) → creates list from collection


        // =====================================================
        // ADD METHODS (List)
        // =====================================================

        list.add(10);
        // add(E e) → adds element at end

        list.add(20);
        list.add(30);

        list.add(1,15);
        // add(index,E) → inserts element at specific index

        list.addAll(Arrays.asList(40,50));
        // addAll(Collection) → adds all elements from collection

        list.addAll(2, Arrays.asList(100,200));
        // addAll(index,Collection) → inserts collection at index

        System.out.println("After adding: " + list);


        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(list.get(2));
        // get(index) → returns element at index

        System.out.println(list.getFirst());
        // getFirst() → returns first element

        System.out.println(list.getLast());
        // getLast() → returns last element

        System.out.println(list.size());
        // size() → returns number of elements

        System.out.println(list.isEmpty());
        // isEmpty() → checks if list empty

        System.out.println(list.contains(20));
        // contains(Object) → checks if element exists


        // =====================================================
        // SEARCH METHODS
        // =====================================================

        list.add(20);

        System.out.println(list.indexOf(20));
        // indexOf(Object) → first occurrence index

        System.out.println(list.lastIndexOf(20));
        // lastIndexOf(Object) → last occurrence index


        // =====================================================
        // UPDATE METHODS
        // =====================================================

        list.set(1,111);
        // set(index,E) → replaces element at index

        list.replaceAll(n -> n * 2);
        // replaceAll(UnaryOperator) → modifies each element


        // =====================================================
        // REMOVE METHODS
        // =====================================================

        list.remove(2);
        // remove(index) → removes element at index

        list.remove(Integer.valueOf(40));
        // remove(Object) → removes first occurrence

        list.removeFirst();
        // removeFirst() → removes first element

        list.removeLast();
        // removeLast() → removes last element

        list.removeIf(n -> n > 300);
        // removeIf(Predicate) → removes elements matching condition

        list.removeAll(Arrays.asList(50));
        // removeAll(Collection)

        list.retainAll(Arrays.asList(40,222));
        // retainAll(Collection)


        // =====================================================
        // QUEUE METHODS
        // =====================================================

        list.offer(70);
        // offer(E) → inserts element like queue

        System.out.println(list.peek());
        // peek() → returns head without removing

        System.out.println(list.poll());
        // poll() → removes and returns head

        System.out.println(list.element());
        // element() → returns head but throws exception if empty


        // =====================================================
        // DEQUE METHODS
        // =====================================================

        list.addFirst(5);
        // addFirst() → inserts element at beginning

        list.addLast(99);
        // addLast() → inserts element at end

        list.offerFirst(1);
        // offerFirst() → adds element at front

        list.offerLast(100);
        // offerLast() → adds element at end

        System.out.println(list.peekFirst());
        // peekFirst() → returns first element

        System.out.println(list.peekLast());
        // peekLast() → returns last element

        list.pollFirst();
        // pollFirst() → removes first element

        list.pollLast();
        // pollLast() → removes last element

        list.push(500);
        // push() → inserts element like stack

        list.pop();
        // pop() → removes first element


        // =====================================================
        // ITERATION METHODS
        // =====================================================

        Iterator<Integer> itr = list.iterator();
        // iterator() → forward iterator

        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();


        ListIterator<Integer> litr = list.listIterator();
        // listIterator() → bidirectional iterator

        while(litr.hasNext())
            System.out.print(litr.next()+" ");
        System.out.println();


        Iterator<Integer> ditr = list.descendingIterator();
        // descendingIterator() → reverse traversal

        while(ditr.hasNext())
            System.out.print(ditr.next()+" ");
        System.out.println();


        list.forEach(System.out::println);
        // forEach() → applies action on each element


        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = list.toArray();
        // toArray() → converts list to Object array

        Integer[] arr2 = list.toArray(new Integer[0]);
        // toArray(T[]) → converts list to typed array


        // =====================================================
        // SUBLIST
        // =====================================================

        list.addAll(Arrays.asList(5,7,9));

        List<Integer> sub = list.subList(1,3);
        // subList(from,to) → returns portion of list


        // =====================================================
        // SORTING
        // =====================================================

        list.sort(null);
        // sort(Comparator) → sorts list in ascending order

        list.sort(Collections.reverseOrder());
        // sorts list in descending order


        // =====================================================
        // STREAM METHODS
        // =====================================================

        list.stream().forEach(System.out::println);
        // stream() → sequential stream

        list.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel processing


        // =====================================================
        // SPLITERATOR
        // =====================================================

        Spliterator<Integer> sp = list.spliterator();
        // spliterator() → supports parallel traversal

        sp.forEachRemaining(System.out::println);


        // =====================================================
        // CLONE
        // =====================================================

        LinkedList<Integer> copy =
                (LinkedList<Integer>) list.clone();
        // clone() → creates shallow copy


        // =====================================================
        // CLEAR
        // =====================================================

        list.clear();
        // clear() → removes all elements


        // =====================================================
        // OBJECT METHODS
        // =====================================================

        System.out.println(list.equals(list2));
        // equals() → compares two lists

        System.out.println(list.hashCode());
        // hashCode() → returns hash value

        System.out.println(list.toString());
        // toString() → string representation
    }
}