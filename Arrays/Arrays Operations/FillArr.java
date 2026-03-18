// Fill Array with a specific value

import java.util.Arrays;
public class FillArr {
   static void fillArray(int[] arr, int value) {
        for(int i=0; i<arr.length;i++){
            arr[i] = value;
        } // Fill the array with the specified value
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 5); // Fill the array with the value 5
        System.out.println(Arrays.toString(arr)); // Print the filled array
    }
}