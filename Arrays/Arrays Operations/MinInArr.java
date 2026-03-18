// Finding the minimum element in an array

public class MinInArr {

   static int minElement(int[] arr) {
        int min = arr[0]; // Assuming the first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i]; // Update max if current element is greater
            }
        }

        return min;
    } 
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 5, 40, 50};
      
        int min = minElement(arr);
        
        System.out.println("The minimum element in the array is: " + min);
    }
}