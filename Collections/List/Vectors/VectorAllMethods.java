import java.util.*;

public class VectorAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        Vector<Integer> v = new Vector<>();
        // Vector() → creates empty vector with default capacity

        Vector<Integer> v2 = new Vector<>(10);
        // Vector(int capacity) → creates vector with given capacity

        Vector<Integer> v3 = new Vector<>(10,5);
        // Vector(int capacity, int increment) → capacity increases by increment

        Vector<Integer> v4 = new Vector<>(Arrays.asList(1,2,3));
        // Vector(Collection) → creates vector from collection


        // =====================================================
        // ADD METHODS
        // =====================================================

        v.add(10);
        // add(E) → adds element at end

        v.add(20);
        v.add(30);

        v.add(1,15);
        // add(index,E) → inserts element at index

        v.addElement(40);
        // addElement(E) → legacy method to add element

        v.addAll(Arrays.asList(50,60));
        // addAll(Collection)

        v.addAll(2,Arrays.asList(100,200));
        // addAll(index,Collection)

        System.out.println("After adding: " + v);


        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(v.get(2));
        // get(index) → returns element at index

        System.out.println(v.elementAt(1));
        // elementAt(index) → returns element at index

        System.out.println(v.firstElement());
        // firstElement() → returns first element

        System.out.println(v.lastElement());
        // lastElement() → returns last element

        System.out.println(v.size());
        // size() → returns number of elements

        System.out.println(v.capacity());
        // capacity() → returns internal capacity

        System.out.println(v.isEmpty());
        // isEmpty() → checks if vector is empty


        // =====================================================
        // SEARCH METHODS
        // =====================================================

        System.out.println(v.contains(20));
        // contains(Object) → checks if element exists

        System.out.println(v.indexOf(20));
        // indexOf(Object) → first occurrence index

        System.out.println(v.lastIndexOf(20));
        // lastIndexOf(Object) → last occurrence index

        System.out.println(v.containsAll(Arrays.asList(10,15)));
        // containsAll(Collection)


        // =====================================================
        // UPDATE METHODS
        // =====================================================

        v.set(1,111);
        // set(index,E) → replaces element

        v.setElementAt(222,2);
        // setElementAt(E,index) → replaces element at index

        v.replaceAll(n -> n*2);
        // replaceAll(UnaryOperator) → modifies each element


        // =====================================================
        // REMOVE METHODS
        // =====================================================

        v.remove(2);
        // remove(index)

        v.remove(Integer.valueOf(40));
        // remove(Object)

        v.removeElement(50);
        // removeElement(Object)

        v.removeElementAt(1);
        // removeElementAt(index)

        v.removeAll(Arrays.asList(60));
        // removeAll(Collection)

        v.removeIf(n -> n>200);
        // removeIf(Predicate)

        v.retainAll(Arrays.asList(20,30));
        // retainAll(Collection)


        // =====================================================
        // ITERATION METHODS
        // =====================================================

        Iterator<Integer> itr = v.iterator();
        // iterator() → forward traversal

        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

        ListIterator<Integer> litr = v.listIterator();
        // listIterator() → bidirectional iterator

        while(litr.hasNext())
            System.out.print(litr.next()+" ");
        System.out.println();

        v.forEach(System.out::println);
        // forEach(Consumer)

        Enumeration<Integer> en = v.elements();
        // elements() → returns Enumeration

        while(en.hasMoreElements())
            System.out.print(en.nextElement()+" ");
        System.out.println();


        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = v.toArray();
        // toArray() → converts vector to Object array

        Integer[] arr2 = v.toArray(new Integer[0]);
        // toArray(T[]) → converts to typed array


        // =====================================================
        // SUBLIST
        // =====================================================

        v.addAll(Arrays.asList(5,7,9));

        List<Integer> sub = v.subList(1,3);
        // subList(from,to) → returns portion of list


        // =====================================================
        // SORTING
        // =====================================================

        v.sort(null);
        // sort(Comparator) → ascending order

        v.sort(Collections.reverseOrder());
        // descending order


        // =====================================================
        // STREAM METHODS
        // =====================================================

        v.stream().forEach(System.out::println);
        // stream() → sequential stream

        v.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel processing


        // =====================================================
        // SPLITERATOR
        // =====================================================

        Spliterator<Integer> sp = v.spliterator();
        // spliterator() → supports parallel traversal

        sp.forEachRemaining(System.out::println);


        // =====================================================
        // CLONE
        // =====================================================

        Vector<Integer> copy = (Vector<Integer>) v.clone();
        // clone() → creates shallow copy


        // =====================================================
        // CAPACITY MANAGEMENT
        // =====================================================

        v.ensureCapacity(50);
        // ensureCapacity() → increases vector capacity

        v.trimToSize();
        // trimToSize() → reduces capacity to current size

        v.setSize(5);
        // setSize() → sets new size of vector


        // =====================================================
        // CLEAR
        // =====================================================

        v.clear();
        // clear() → removes all elements


        // =====================================================
        // OBJECT METHODS
        // =====================================================

        System.out.println(v.equals(copy));
        // equals(Object) → compares vectors

        System.out.println(v.hashCode());
        // hashCode() → returns hash value

        System.out.println(v.toString());
        // toString() → string representation
    }
}