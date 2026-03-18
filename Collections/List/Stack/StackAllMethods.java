import java.util.*;

public class StackAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTOR
        // =====================================================

        Stack<Integer> stack = new Stack<>();
        // Stack() → creates an empty stack


        // =====================================================
        // STACK SPECIFIC METHODS
        // =====================================================

        stack.push(10);
        // push(E item) → pushes element onto top of stack

        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        // peek() → returns top element without removing

        System.out.println(stack.pop());
        // pop() → removes and returns top element

        System.out.println(stack.search(10));
        // search(Object) → returns position from top (1-based)

        System.out.println(stack.empty());
        // empty() → checks if stack is empty


        // =====================================================
        // ADD METHODS (from Vector/List)
        // =====================================================

        stack.add(40);
        // add(E) → adds element at end

        stack.add(1,15);
        // add(index,E) → inserts element at index

        stack.addAll(Arrays.asList(50,60));
        // addAll(Collection)

        stack.addAll(2, Arrays.asList(100,200));
        // addAll(index,Collection)


        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(stack.get(2));
        // get(index) → returns element at index

        System.out.println(stack.firstElement());
        // firstElement() → returns first element

        System.out.println(stack.lastElement());
        // lastElement() → returns last element

        System.out.println(stack.elementAt(1));
        // elementAt(index) → returns element at index

        System.out.println(stack.size());
        // size() → number of elements

        System.out.println(stack.capacity());
        // capacity() → current internal capacity


        // =====================================================
        // SEARCH METHODS
        // =====================================================

        System.out.println(stack.contains(20));
        // contains(Object) → checks if element exists

        System.out.println(stack.indexOf(20));
        // indexOf(Object)

        System.out.println(stack.lastIndexOf(20));
        // lastIndexOf(Object)


        // =====================================================
        // UPDATE METHODS
        // =====================================================

        stack.set(1,111);
        // set(index,E) → replaces element

        stack.setElementAt(222,2);
        // setElementAt(E,index) → replaces element at index

        stack.replaceAll(n -> n*2);
        // replaceAll(UnaryOperator) → modify each element


        // =====================================================
        // REMOVE METHODS
        // =====================================================

        stack.remove(2);
        // remove(index)

        stack.remove(Integer.valueOf(40));
        // remove(Object)

        stack.removeElement(50);
        // removeElement(Object)

        stack.removeElementAt(1);
        // removeElementAt(index)

        stack.removeAll(Arrays.asList(60));
        // removeAll(Collection)

        stack.removeIf(n -> n>200);
        // removeIf(Predicate)

        stack.retainAll(Arrays.asList(20,30));
        // retainAll(Collection)


        // =====================================================
        // ITERATION METHODS
        // =====================================================

        Iterator<Integer> itr = stack.iterator();
        // iterator() → forward traversal

        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

        ListIterator<Integer> litr = stack.listIterator();
        // listIterator() → bidirectional iterator

        while(litr.hasNext())
            System.out.print(litr.next()+" ");
        System.out.println();

        stack.forEach(System.out::println);
        // forEach(Consumer) → performs action on each element

        Enumeration<Integer> en = stack.elements();
        // elements() → returns Enumeration for traversal

        while(en.hasMoreElements())
            System.out.print(en.nextElement()+" ");
        System.out.println();


        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = stack.toArray();
        // toArray() → converts stack to Object array

        Integer[] arr2 = stack.toArray(new Integer[0]);
        // toArray(T[]) → converts to typed array


        // =====================================================
        // SUBLIST
        // =====================================================

        stack.addAll(Arrays.asList(5,7,9));

        List<Integer> sub = stack.subList(1,3);
        // subList(from,to) → returns portion of list


        // =====================================================
        // SORTING
        // =====================================================

        stack.sort(null);
        // sort(Comparator) → ascending order

        stack.sort(Collections.reverseOrder());
        // descending order


        // =====================================================
        // STREAM METHODS
        // =====================================================

        stack.stream().forEach(System.out::println);
        // stream() → sequential stream

        stack.parallelStream().forEach(System.out::println);
        // parallelStream() → parallel stream


        // =====================================================
        // SPLITERATOR
        // =====================================================

        Spliterator<Integer> sp = stack.spliterator();
        // spliterator() → supports parallel iteration

        sp.forEachRemaining(System.out::println);


        // =====================================================
        // CLONE
        // =====================================================

        Stack<Integer> copy = (Stack<Integer>) stack.clone();
        // clone() → creates shallow copy


        // =====================================================
        // CAPACITY METHODS (Vector)
        // =====================================================

        stack.ensureCapacity(50);
        // ensureCapacity() → increases capacity

        stack.trimToSize();
        // trimToSize() → reduces capacity to current size


        // =====================================================
        // CLEAR
        // =====================================================

        stack.clear();
        // clear() → removes all elements


        // =====================================================
        // OBJECT METHODS
        // =====================================================

        System.out.println(stack.equals(copy));
        // equals(Object) → compares two stacks

        System.out.println(stack.hashCode());
        // hashCode() → returns hash value

        System.out.println(stack.toString());
        // toString() → string representation
    }
}