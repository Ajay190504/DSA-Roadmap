import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {

        // ===================== SECTION 1: PRIMITIVE WRAPPERS =====================
        System.out.println("== SECTION 1: Primitive Wrapper Sorting with Comparator ==");

        List<Integer> intList = Arrays.asList(5, 3, 8, 1, 5);
        intList.sort(Comparator.naturalOrder()); // ascending
        System.out.println("Sorted Integer List Ascending: " + intList);

        intList.sort(Comparator.reverseOrder()); // descending
        System.out.println("Sorted Integer List Descending: " + intList);

        List<String> strList = Arrays.asList("apple", "kiwi", "banana", "apple");
        strList.sort(Comparator.naturalOrder());
        System.out.println("Sorted String List Ascending: " + strList);

        strList.sort(Comparator.reverseOrder());
        System.out.println("Sorted String List Descending: " + strList);

        // ===================== SECTION 2: ARRAYS =====================
        System.out.println("\n== SECTION 2: Arrays Sorting with Comparator ==");

        String[] strArr = {"apple", "kiwi", "banana", "apple"};
        Arrays.sort(strArr, Comparator.naturalOrder());
        System.out.println("Sorted String Array Asc: " + Arrays.toString(strArr));

        Arrays.sort(strArr, Comparator.reverseOrder());
        System.out.println("Sorted String Array Desc: " + Arrays.toString(strArr));

        // ===================== SECTION 3: CUSTOM CLASS =====================
        System.out.println("\n== SECTION 3: Custom Class with Comparator ==");

        List<Student2> students = new ArrayList<>();
        students.add(new Student2("Ajay", 85));
        students.add(new Student2("Rahul", 75));
        students.add(new Student2("Vikram", 85));
        students.add(new Student2("Sita", 90));

        // Sort by marks ascending
        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("Students Sorted by Marks Asc: " + students);

        // Sort by marks descending
        students.sort(Comparator.comparingInt((Student2 s) -> s.marks).reversed());
        System.out.println("Students Sorted by Marks Desc: " + students);

        // ===================== SECTION 4: MULTI-CRITERIA SORTING =====================
        System.out.println("\n== SECTION 4: Multi-Criteria Sorting with Comparator ==");

        students.add(new Student2("Anita", 85));
        students.add(new Student2("Ravi", 75));

        // Marks ascending, then name ascending
        students.sort(Comparator.comparingInt((Student2 s) -> s.marks)
                                .thenComparing(s -> s.name));
        System.out.println("Students Sorted by Marks Asc, then Name Asc: " + students);

        // Marks descending, then name descending
        students.sort(Comparator.comparingInt((Student2 s) -> s.marks).reversed()
                                .thenComparing((Student2 s) -> s.name, Comparator.reverseOrder()));
        System.out.println("Students Sorted by Marks Desc, then Name Desc: " + students);

        // ===================== SECTION 5: HANDLING NULLS =====================
        System.out.println("\n== SECTION 5: Handling Nulls with Comparator ==");

        List<String> nullList = new ArrayList<>(Arrays.asList("apple", null, "banana"));
        nullList.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Nulls First: " + nullList);

        nullList.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println("Nulls Last: " + nullList);

        // ===================== SECTION 6: DUPLICATES =====================
        System.out.println("\n== SECTION 6: Duplicates with Comparator ==");

        List<Integer> dupList = Arrays.asList(5, 3, 5, 1, 3, 8);
        dupList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List with Duplicates Asc: " + dupList);

        dupList.sort(Comparator.reverseOrder());
        System.out.println("Sorted List with Duplicates Desc: " + dupList);

        // ===================== SECTION 7: NOTES =====================
        /*
        NOTES ON COMPARATOR:

        1. Comparator is used for custom ordering (does not require implementing Comparable).

        2. Methods:
           - Comparator.naturalOrder(): ascending order
           - Comparator.reverseOrder(): descending order
           - Comparator.comparing(Function): sort by property
           - thenComparing(): add secondary sorting criteria
           - Comparator.nullsFirst()/nullsLast(): handle nulls safely

        3. Can be used with Collections.sort(list), list.sort(comparator), Arrays.sort(array, comparator)

        4. Can chain multiple criteria for real-world sorting (e.g., marks then name).

        5. Useful when:
           - Sorting objects without natural ordering
           - Applying multiple sorting rules
           - Handling null values
           - Reversing order easily
        */
    }
}