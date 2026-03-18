import java.util.*;

public class CollectionsMethods {

    public static void main(String[] args) {

        // Creating a list
        List<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("Original List: " + list);

        // ---------------------------------------------------------
        // 1. sort() → Sorts the list in ascending order
        // ---------------------------------------------------------
        Collections.sort(list);
        System.out.println("Sorted Ascending: " + list);

        // ---------------------------------------------------------
        // 2. sort() with reverseOrder() → Sorts list in descending order
        // ---------------------------------------------------------
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Descending: " + list);

        // ---------------------------------------------------------
        // 3. reverse() → Reverses the order of elements in list
        // ---------------------------------------------------------
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // ---------------------------------------------------------
        // 4. shuffle() → Randomly shuffles the list elements
        // ---------------------------------------------------------
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // ---------------------------------------------------------
        // 5. max() → Returns maximum element in collection
        // ---------------------------------------------------------
        int max = Collections.max(list);
        System.out.println("Maximum Element: " + max);

        // ---------------------------------------------------------
        // 6. min() → Returns minimum element in collection
        // ---------------------------------------------------------
        int min = Collections.min(list);
        System.out.println("Minimum Element: " + min);

        // ---------------------------------------------------------
        // 7. frequency() → Counts number of occurrences of element
        // ---------------------------------------------------------
        list.add(20);
        list.add(20);

        int freq = Collections.frequency(list, 20);
        System.out.println("Frequency of 20: " + freq);

        // ---------------------------------------------------------
        // 8. binarySearch() → Searches element in sorted list
        // (List must be sorted before using this)
        // ---------------------------------------------------------
        Collections.sort(list);
        int index = Collections.binarySearch(list, 30);
        System.out.println("Index of 30 using binary search: " + index);

        // ---------------------------------------------------------
        // 9. replaceAll() → Replaces all occurrences of a value
        // ---------------------------------------------------------
        Collections.replaceAll(list, 20, 99);
        System.out.println("After replacing 20 with 99: " + list);

        // ---------------------------------------------------------
        // 10. fill() → Replaces all elements with a specified value
        // ---------------------------------------------------------
        List<Integer> fillList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Collections.fill(fillList, 100);
        System.out.println("After fill(): " + fillList);

        // ---------------------------------------------------------
        // 11. copy() → Copies elements from source list to destination list
        // Destination list must be equal or larger in size
        // ---------------------------------------------------------
        List<Integer> source = Arrays.asList(10,20,30);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0,0,0));

        Collections.copy(dest, source);
        System.out.println("After copy(): " + dest);

        // ---------------------------------------------------------
        // 12. disjoint() → Checks if two collections have no common elements
        // ---------------------------------------------------------
        List<Integer> listA = Arrays.asList(1,2,3);
        List<Integer> listB = Arrays.asList(4,5,6);

        boolean disjoint = Collections.disjoint(listA, listB);
        System.out.println("Are lists disjoint: " + disjoint);

        // ---------------------------------------------------------
        // 13. addAll() → Adds multiple elements into collection
        // ---------------------------------------------------------
        List<Integer> addList = new ArrayList<>();
        Collections.addAll(addList, 5,10,15,20);
        System.out.println("After addAll(): " + addList);

        // ---------------------------------------------------------
        // 14. swap() → Swaps elements at two specified indexes
        // ---------------------------------------------------------
        Collections.swap(addList, 0, 3);
        System.out.println("After swap(): " + addList);

        // ---------------------------------------------------------
        // 15. rotate() → Rotates elements by given distance
        // ---------------------------------------------------------
        Collections.rotate(addList, 2);
        System.out.println("After rotate(): " + addList);

        // ---------------------------------------------------------
        // 16. nCopies() → Creates immutable list with repeated elements
        // ---------------------------------------------------------
        List<String> copyList = Collections.nCopies(5, "Java");
        System.out.println("nCopies List: " + copyList);

        // ---------------------------------------------------------
        // 17. singleton() → Creates immutable set with single element
        // ---------------------------------------------------------
        Set<String> single = Collections.singleton("OnlyOne");
        System.out.println("Singleton Set: " + single);

        // ---------------------------------------------------------
        // 18. unmodifiableList() → Returns read-only list
        // ---------------------------------------------------------
        List<Integer> modifiable = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> unmodifiable = Collections.unmodifiableList(modifiable);

        System.out.println("Unmodifiable List: " + unmodifiable);

        // unmodifiable.add(5); // This will throw UnsupportedOperationException
    }
}