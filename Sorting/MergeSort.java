// Merge Sort Algorithm in Java
public class MergeSort {
      // Method to perform merge sort
      public static void mergeSort(int[] arr) {
         if (arr.length < 2) {
               return; // Base case: array is already sorted
         }
         int mid = arr.length / 2;
         int[] left = new int[mid];
         int[] right = new int[arr.length - mid];
         // Split the array into two halves
         for (int i = 0; i < mid; i++) {
               left[i] = arr[i];
         }
         for (int i = mid; i < arr.length; i++) {
               right[i - mid] = arr[i];
         }
         // Recursively sort both halves
         mergeSort(left);
         mergeSort(right);
         // Merge the sorted halves
         merge(arr, left, right);
      }
   
      // Method to merge two sorted arrays into one sorted array
      public static void merge(int[] arr, int[] left, int[] right) {
         int i = 0, j = 0, k = 0;
         while (i < left.length && j < right.length) {
               if (left[i] <= right[j]) {
                  arr[k++] = left[i++];
               } else {
                  arr[k++] = right[j++];
               }
         }
         while (i < left.length) {
               arr[k++] = left[i++];
         }
         while (j < right.length) {
               arr[k++] = right[j++];
         }
      }
   
      // Main method to test the merge sort implementation
      public static void main(String[] args) {
         int[] arr = {38, 27, 43, 3, 9, 82, 10};
         System.out.println("Original array:");
         printArray(arr);
         mergeSort(arr);
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