// First index of an element in an array
public class IndexOfElement {

    static int indexOf(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int elementToFind = 30;

        int index = indexOf(arr, elementToFind);

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }
}