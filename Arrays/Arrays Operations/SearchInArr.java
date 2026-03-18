// Searching an element in an array
public class SearchInArr {

   // Linear search method to find the element in the array
    static boolean searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }


   // Binary search method to find the element in the array (array must be sorted)
    static boolean binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return true; // Element found
            } else if (arr[mid] < key) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        boolean found = searchElement(arr, key);

        if (found) {
            System.out.println("Element " + key + " is present in the array.");
        } else {
            System.out.println("Element " + key + " is not present in the array.");
        }
      // Uncomment this line to use binary search (make sure the array is sorted)
      
      int arr2[] = {10, 20, 30, 40, 50}; // Sorted array for binary search
      int key2 = 30;
      boolean found2 = binarySearch(arr2, key); 

      if (found2) {
            System.out.println("Element " + key2 + " is present in the array (Binary Search).");
        } else {
            System.out.println("Element " + key2 + " is not present in the array (Binary Search).");
        }
        
    }
}