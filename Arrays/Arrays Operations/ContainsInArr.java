// Check if an element is present in the array or not
public class ContainsInArr {

    static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true; // Element found in the array
            }
        }
        return false; // Element not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        boolean result = contains(arr, target);

        if (result) {
            System.out.println("Element " + target + " is present in the array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
}