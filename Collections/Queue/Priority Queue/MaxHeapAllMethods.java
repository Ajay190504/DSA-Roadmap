import java.util.*;

public class MaxHeapAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // MAX HEAP CREATION
        // =====================================================

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Comparator.reverseOrder());
        // reverseOrder() → creates max heap



        // =====================================================
        // ADD METHODS
        // =====================================================

        maxHeap.add(10);
        maxHeap.add(40);
        maxHeap.offer(20);
        maxHeap.offer(30);

        maxHeap.addAll(Arrays.asList(50,60,70));

        System.out.println("Max Heap: " + maxHeap);



        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(maxHeap.peek());
        // peek() → returns largest element

        System.out.println(maxHeap.element());
        // element() → returns head (largest)



        // =====================================================
        // REMOVE METHODS
        // =====================================================

        System.out.println(maxHeap.poll());
        // poll() → removes largest element

        System.out.println(maxHeap.remove());
        // remove() → removes head

        maxHeap.remove(20);
        // remove(Object)



        // =====================================================
        // SEARCH METHODS
        // =====================================================

        System.out.println(maxHeap.contains(40));
        // contains(Object)



        // =====================================================
        // ITERATION
        // =====================================================

        Iterator<Integer> itr = maxHeap.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());

        maxHeap.forEach(System.out::println);



        // =====================================================
        // ARRAY CONVERSION
        // =====================================================

        Object[] arr = maxHeap.toArray();
        Integer[] arr2 = maxHeap.toArray(new Integer[0]);



        // =====================================================
        // STREAM
        // =====================================================

        maxHeap.stream().forEach(System.out::println);

        maxHeap.parallelStream().forEach(System.out::println);



        // =====================================================
        // CLEAR
        // =====================================================

        maxHeap.clear();



        // =====================================================
        // OBJECT METHODS
        // =====================================================

        System.out.println(maxHeap.hashCode());
        System.out.println(maxHeap.equals(new PriorityQueue<>()));
        System.out.println(maxHeap.toString());
    }
}