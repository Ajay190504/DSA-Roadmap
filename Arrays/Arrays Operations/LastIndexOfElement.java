// Last index of an element in an array
public class LastIndexOfElement {
   
    static int lastIndexOf(int[] arr, int element) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i; // Return the index of the last occurrence
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 30};
        int elementToFind = 30;

        int index = lastIndexOf(arr, elementToFind);

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at last index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }
}