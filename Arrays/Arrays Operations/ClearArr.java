// Deleting entire array (clearing the array)
import java.util.Arrays;

public class ClearArr {

    static void fillArray(int[] arr, int value) {
        for(int i=0; i<arr.length;i++){
            arr[i] = value;
        } // Fill the array with the specified value
    }   

    // method to clear the array by setting all elements to zero
    static void clearArray(int[] arr) {
        fillArray(arr, 0); // This will set all elements of the array to zero
        //Alternative Method : Arrays.fill(arr, 0); // This will also set all elements of the array to zero
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(arr));

        clearArray(arr);

        System.out.println("Array after clearing: " + Arrays.toString(arr));

        // method to delete the entire array by removing reference
        // Remove reference : Array is deleted by garbage collector after reference is removed
        arr = null;
        System.out.println(arr); // prints null
    }
}