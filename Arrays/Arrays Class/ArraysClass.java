// All built-in array operations are available in the java.util.Arrays class.
import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Sorting the array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Searching for an element (binary search requires sorted array)
        int index = Arrays.binarySearch(arr, 3);
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Filling an array with a specific value
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArr));

        // Comparing two arrays
        int[] arr2 = {5, 2, 8, 1, 3};
        boolean areEqual = Arrays.equals(arr, arr2);
        System.out.println("Are the two arrays equal? " + areEqual);

        // Copying an array
        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArr));
       
       // Copying a range of an array
        int[] rangeCopiedArr = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Range copied array (index 1 to 3): " + Arrays.toString(rangeCopiedArr));

        // Converting an array to a list (only works for arrays of objects, not primitives)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Array as list: " + list);

        // Converting a list to an array (only works for lists of objects, not primitives)
        Integer[] listToArray = list.toArray(new Integer[0]);
        System.out.println("List converted to array: " + Arrays.toString(listToArray));

       // Finding the hash code of an array
        int hashCode = Arrays.hashCode(arr);
        System.out.println("Hash code of the array: " + hashCode);

      // Finding the string representation of an array
        String arrayString = Arrays.toString(arr);
        System.out.println("String representation of the array: " + arrayString);

      // Finding the deep string representation of a multi-dimensional array
        int[][] multiArr = {{1, 2}, {3, 4}};
        String multiArrayString = Arrays.deepToString(multiArr);
        System.out.println("Deep string representation of the multi-dimensional array: " + multiArrayString);

      // setAll()
        int[] setArray = new int[5];
        Arrays.setAll(setArray, i -> i * 10);
        System.out.println("setAll: " + Arrays.toString(setArray));
 

      // Finding the hash code of a multi-dimensional array
        int multiHashCode = Arrays.deepHashCode(multiArr);
        System.out.println("Hash code of the multi-dimensional array: " + multiHashCode);

     // Comparing two multi-dimensional arrays
        int[][] multiArr2 = {{1, 2}, {3, 4}};
        boolean areMultiEqual = Arrays.deepEquals(multiArr, multiArr2);
        System.out.println("Are the two multi-dimensional arrays equal? " + areMultiEqual);

     // Sorting a multi-dimensional array (sorts based on the first element of each sub-array)
        Arrays.sort(multiArr, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("Sorted multi-dimensional array: " + Arrays.deepToString(multiArr));

    }
}