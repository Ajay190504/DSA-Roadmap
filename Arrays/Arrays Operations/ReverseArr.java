// Reverse an array
public class ReverseArr {
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverseArray(arr);

        System.out.println("\nReversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}