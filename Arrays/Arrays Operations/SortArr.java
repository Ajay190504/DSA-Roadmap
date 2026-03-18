// Sorting an array
public class SortArr {

   // bubble sort algorithm to sort the array in ascending order
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


   //bubble sort algorithm to sort the array in descending order
    static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    // selection sort algorithm to sort the array in ascending order
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // selection sort algorithm to sort the array in descending order
    static void selectionSortDescending(int[] arr) {
         int n = arr.length;
   
         for (int i = 0; i < n - 1; i++) {
               int maxIndex = i;
               for (int j = i + 1; j < n; j++) {
                  if (arr[j] > arr[maxIndex]) {
                     maxIndex = j;
                  }
               }
               // Swap arr[i] and arr[maxIndex]
               int temp = arr[i];
               arr[i] = arr[maxIndex];
               arr[maxIndex] = temp;
         }
      }

      // insertion sort algorithm to sort the array in ascending order
      static void insertionSort(int[] arr) {
         int n = arr.length;
         for (int i = 1; i < n; i++) {
               int key = arr[i];
               int j = i - 1;

               // Move elements of arr[0..i-1], that are greater than key,
               // to one position ahead of their current position
               while (j >= 0 && arr[j] > key) {
                  arr[j + 1] = arr[j];
                  j = j - 1;
               }
               arr[j + 1] = key;
         }
      }

      // insertion sort algorithm to sort the array in descending order
      static void insertionSortDescending(int[] arr) {
         int n = arr.length;
         for (int i = 1; i < n; i++) {
               int key = arr[i];
               int j = i - 1;

               // Move elements of arr[0..i-1], that are less than key,
               // to one position ahead of their current position
               while (j >= 0 && arr[j] < key) {
                  arr[j + 1] = arr[j];
                  j = j - 1;
               }
               arr[j + 1] = key;
         }
      }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr);
        System.out.println("Sorted array in ascending using BubbleSort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

         bubbleSortDescending(arr);
         System.out.println("\nSorted array in descending using BubbleSort: ");
         for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
         }

         selectionSort(arr);
         System.out.println("\nSorted array in ascending using SelectionSort: ");
         for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
         }

         selectionSortDescending(arr);
         System.out.println("\nSorted array in descending using SelectionSort: ");
         for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
         }

         insertionSort(arr);
         System.out.println("\nSorted array in ascending using InsertionSort: ");
         for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
         }

         insertionSortDescending(arr);
         System.out.println("\nSorted array in descending using InsertionSort: ");
         for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
         }

    }
}