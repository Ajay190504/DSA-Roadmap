// Insert an element at a specific position in an array
public class InsertIntoArr {
      
      @SuppressWarnings("ManualArrayToCollectionCopy")
      static int[] insertElement(int[] arr, int element, int position) {
         int n = arr.length;
         int[] newArr = new int[n + 1];
   
         // If the position is out of bounds, return the original array
         if (position < 0 || position > n) {
               return arr;
         }
   
         // Copy elements before the position
         for (int i = 0; i < position; i++) {
               newArr[i] = arr[i];
         }
   
         // Insert the new element at the specified position
         newArr[position] = element;
   
         // Copy elements after the position
         for (int i = position; i < n; i++) {
               newArr[i + 1] = arr[i];
         }
   
         return newArr;
      }
   
      public static void main(String[] args) {
         
         int[] arr = {10, 20, 30, 40, 50};
         int elementToInsert = 25;
         int positionToInsert = 2;
   
         int[] newArr = insertElement(arr, elementToInsert, positionToInsert);
   
         System.out.println("Array after insertion: ");
         for (int i : newArr) {
               System.out.print(i + " ");
         }
      }
   }