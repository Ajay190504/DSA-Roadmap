import java.util.*;

public class ArrayListAllMethods {

    public static void main(String[] args) {

        // ======================================================
        // CONSTRUCTORS
        // ======================================================

        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList() → creates an empty ArrayList

        ArrayList<Integer> list2 = new ArrayList<>(10);
        // ArrayList(int capacity) → creates list with initial capacity

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
        // ArrayList(Collection c) → creates list from another collection


        // ======================================================
        // ADDING ELEMENTS
        // ======================================================

        list.add(10); 
        // add(E e) → adds element at the end of the list

        list.add(20);
        list.add(30);

        list.add(1,15); 
        // add(index,E) → inserts element at specific index

        list.addAll(Arrays.asList(40,50)); 
        // addAll(Collection) → adds all elements of collection

        list.addAll(2, Arrays.asList(100,200)); 
        // addAll(index,Collection) → inserts collection at index

        System.out.println("After adding: " + list);


        // ======================================================
        // ACCESSING ELEMENTS
        // ======================================================

        System.out.println(list.get(2));
        // get(index) → returns element at given index

        System.out.println(list.size());
        // size() → returns number of elements

        System.out.println(list.isEmpty());
        // isEmpty() → checks if list is empty

        System.out.println(list.contains(20));
        // contains(Object) → checks if element exists


        // ======================================================
        // SEARCH OPERATIONS
        // ======================================================

        list.add(20);

        System.out.println(list.indexOf(20));
        // indexOf(Object) → returns first occurrence index

        System.out.println(list.lastIndexOf(20));
        // lastIndexOf(Object) → returns last occurrence index


        // ======================================================
        // MODIFYING ELEMENTS
        // ======================================================

        list.set(1,111);
        // set(index,E) → replaces element at given index

        list.replaceAll(n -> n * 2);
        // replaceAll(UnaryOperator) → replaces each element using function


        // ======================================================
        // REMOVING ELEMENTS
        // ======================================================

        list.remove(2);
        // remove(index) → removes element at index

        list.remove(Integer.valueOf(40));
        // remove(Object) → removes first occurrence of element

        list.removeIf(n -> n > 300);
        // removeIf(Predicate) → removes elements matching condition

        list.removeAll(Arrays.asList(50));
        // removeAll(Collection) → removes elements present in collection

        list.retainAll(Arrays.asList(40,222));
        // retainAll(Collection) → keeps only specified elements


        // ======================================================
        // BULK CHECK METHODS
        // ======================================================

        System.out.println(list.containsAll(Arrays.asList(40)));
        // containsAll(Collection) → checks if list contains all elements


        // ======================================================
        // ITERATION METHODS
        // ======================================================

        Iterator<Integer> itr = list.iterator();
        // iterator() → returns iterator for traversal

        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();


        ListIterator<Integer> litr = list.listIterator();
        // listIterator() → bidirectional iterator

        while(litr.hasNext())
            System.out.print(litr.next()+" ");
        System.out.println();


        ListIterator<Integer> litr2 = list.listIterator(1);
        // listIterator(index) → iterator starting at index

        while(litr2.hasNext())
            System.out.print(litr2.next()+" ");
        System.out.println();


        list.forEach(System.out::println);
        // forEach(Consumer) → performs action on each element


        // ======================================================
        // ARRAY CONVERSION
        // ======================================================

        Object[] arr = list.toArray();
        // toArray() → converts list to Object array

        Integer[] arr2 = list.toArray(new Integer[0]);
        // toArray(T[]) → converts list to typed array


        // ======================================================
        // SUBLIST
        // ======================================================

        list.addAll(Arrays.asList(5,7,9));

        List<Integer> sub = list.subList(1,3);
        // subList(from,to) → returns view of portion of list


        // ======================================================
        // SORTING
        // ======================================================

        list.sort(null);
        // sort(Comparator) → sorts list in ascending order

        list.sort(Collections.reverseOrder());
        // sorts list in descending order


        // ======================================================
        // STREAM METHODS
        // ======================================================

        list.stream().forEach(System.out::println);
        // stream() → sequential stream of elements

        list.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel processing stream


        // ======================================================
        // SPLITERATOR
        // ======================================================

        Spliterator<Integer> sp = list.spliterator();
        // spliterator() → supports parallel traversal

        sp.forEachRemaining(System.out::println);


        // ======================================================
        // CLONE
        // ======================================================

        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone();
        // clone() → creates shallow copy of ArrayList


        // ======================================================
        // CAPACITY METHODS (ArrayList SPECIFIC)
        // ======================================================

        list.ensureCapacity(50);
        // ensureCapacity() → increases internal capacity

        list.trimToSize();
        // trimToSize() → trims capacity to current size


        // ======================================================
        // CLEAR
        // ======================================================

        list.clear();
        // clear() → removes all elements


        // ======================================================
        // OBJECT CLASS METHODS
        // ======================================================

        System.out.println(list.equals(list2));
        // equals(Object) → checks equality of lists

        System.out.println(list.hashCode());
        // hashCode() → returns hash value

        System.out.println(list.toString());
        // toString() → string representation of list
    }
}