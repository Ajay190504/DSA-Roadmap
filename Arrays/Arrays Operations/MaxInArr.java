// Finding maximum element in an array
public class MaxInArr {

   static int maxElement(int[] arr) {
        int max = arr[0]; // Assuming the first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        return max;
    }
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

        int max = maxElement(arr);

        System.out.println("The maximum element in the array is: " + max);
    }
}  