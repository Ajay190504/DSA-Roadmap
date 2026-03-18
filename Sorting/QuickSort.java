// Quick Sort Algorithm in Java
public class QuickSort {
      // Method to perform quick sort
      public static void quickSort(int[] arr, int low, int high) {
         if (low < high) {
               // Partition the array around pivot and get the pivot index
               int pi = partition(arr, low, high);
               // Recursively sort elements before and after partition
               quickSort(arr, low, pi - 1);
               quickSort(arr, pi + 1, high);
         }
      }
   
      // Method to partition the array and return the pivot index
      public static int partition(int[] arr, int low, int high) {
         int pivot = arr[high]; // Choosing the last element as pivot
         int i = low - 1; // Index of smaller element
         for (int j = low; j < high; j++) {
               // If the current element is smaller than or equal to the pivot
               if (arr[j] <= pivot) {
                  i++; // Increment index of smaller element
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
         }
         // Swap the pivot element with the element at index i + 1
         int temp = arr[i + 1];
         arr[i + 1] = arr[high];
         arr[high] = temp;
         return i + 1; // Return the partitioning index
      }
   
      // Main method to test the quick sort implementation
      public static void main(String[] args) {
         int[] arr = {10, 7, 8, 9, 1, 5};
         System.out.println("Original array:");
         printArray(arr);
         quickSort(arr, 0, arr.length - 1);
         System.out.println("Sorted array:");
         printArray(arr);
      }
   
      // Utility method to print the array
      public static void printArray(int[] arr) {
         for (int i : arr) {
               System.out.print(i + " ");
         }
         System.out.println();
      }
   }