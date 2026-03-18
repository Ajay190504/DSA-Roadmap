import java.util.*;
public class ComparableDemo {

    public static void main(String[] args) {

        // ===================== SECTION 1: PRIMITIVE WRAPPERS =====================
        System.out.println("== SECTION 1: Primitive Wrapper Sorting ==");
        List<Integer> intList = Arrays.asList(5, 3, 8, 1, 5);
        Collections.sort(intList);
        System.out.println("Sorted Integer List: " + intList);

        List<String> strList = Arrays.asList("apple", "kiwi", "banana", "apple");
        Collections.sort(strList);
        System.out.println("Sorted String List: " + strList);

        List<Double> doubleList = Arrays.asList(2.2, 1.1, 3.3, 2.2);
        Collections.sort(doubleList);
        System.out.println("Sorted Double List: " + doubleList);

        // ===================== SECTION 2: ARRAYS =====================
        System.out.println("\n== SECTION 2: Arrays Sorting Using Comparable ==");
        Integer[] intArr = {5, 3, 8, 1, 5};
        Arrays.sort(intArr);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArr));

        String[] strArr = {"apple", "kiwi", "banana", "apple"};
        Arrays.sort(strArr);
        System.out.println("Sorted String Array: " + Arrays.toString(strArr));

        // ===================== SECTION 3: CUSTOM CLASS =====================
        System.out.println("\n== SECTION 3: Custom Class with Comparable ==");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ajay", 85));
        students.add(new Student("Rahul", 75));
        students.add(new Student("Vikram", 85));
        students.add(new Student("Sita", 90));

        Collections.sort(students);
        System.out.println("Students Sorted by Marks Ascending: " + students);

        // ===================== SECTION 4: CUSTOM CLASS DESCENDING =====================
        System.out.println("\n== SECTION 4: Custom Sorting Descending Using Comparable ==");
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);
        System.out.println("Students Sorted by Marks Descending: " + students);

        // ===================== SECTION 5: DUPLICATES AND EDGE CASES =====================
        System.out.println("\n== SECTION 5: Duplicates and Edge Cases ==");
        List<Integer> dupList = Arrays.asList(5, 3, 5, 1, 3, 8);
        Collections.sort(dupList);
        System.out.println("Sorted List with Duplicates: " + dupList);

        List<String> nullList = new ArrayList<>(Arrays.asList("apple", null, "banana"));
        nullList.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Sorted List with Nulls First: " + nullList);

        nullList.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println("Sorted List with Nulls Last: " + nullList);

        // ===================== SECTION 6: SUMMARY NOTES =====================
        /*
        NOTES ON COMPARABLE:

        1. Primitive wrappers like Integer, Double, String implement Comparable by default.
           - compareTo defines natural order: a.compareTo(b) <0 : a<b, 0: a=b, >0: a>b

        2. Custom classes implement Comparable<T> to define natural order.

        3. Collections.sort(list) or Arrays.sort(array) use compareTo for sorting.

        4. Duplicates are kept in natural order.

        5. Null elements throw NullPointerException unless Comparator.nullsFirst or nullsLast is used.

        6. For descending order, either:
           - Use Collections.reverseOrder()
           - Modify compareTo (b-a for integers)
           - Use Comparator in sort()

        7. compareTo should be consistent with equals for proper behavior in sorted collections.

        8. Edge Cases:
           - Duplicate elements
           - Null values
           - Custom sorting with multiple criteria (e.g., marks then name)
        */

        // ===================== SECTION 7: MULTI-CRITERIA SORTING =====================
        System.out.println("\n== SECTION 7: Multi-Criteria Sorting (Marks Asc, then Name Asc) ==");

        students.add(new Student("Anita", 85));
        students.add(new Student("Ravi", 75));

        // Sort by marks ascending, then by name ascending
        students.sort(Comparator.comparingInt((Student s) -> s.marks)
                                .thenComparing(s -> s.name));

        System.out.println("Students Sorted by Marks Asc, then Name Asc: " + students);

        // Sort by marks descending, then name descending
        students.sort(Comparator.comparingInt((Student s) -> s.marks).reversed()
                                .thenComparing((Student s) -> s.name, Comparator.reverseOrder()));

        System.out.println("Students Sorted by Marks Desc, then Name Desc: " + students);

        /*
        NOTES ON MULTI-CRITERIA:
        - Use Comparator.comparing()/comparingInt() for first criterion
        - thenComparing() for second criterion (can chain more)
        - Can apply ascending or descending independently for each criterion
        - Useful when multiple sorting priorities exist
        */
    }
}