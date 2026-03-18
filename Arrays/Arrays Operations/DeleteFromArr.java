// Deleting an element from an array
import java.util.Scanner;

public class DeleteFromArr {

   // delete an element from the array and return the new array
    static int[] deleteElement(int[] arr, int element) {
        int n = arr.length;
        int[] newArr = new int[n - 1];
        int index = -1;

        // Find the index of the element to be deleted
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        // If the element is not found, return the original array
        if (index == -1) {
            return arr;
        }

        // Copy elements except the one to be deleted
        for (int i = 0, j = 0; i < n; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    // delete an element using given index and return the new array
    static int[] deleteElementByIndex(int[] arr, int index) {
        int n = arr.length;
        int[] newArr = new int[n - 1];

        // If the index is out of bounds, return the original array
        if (index < 0 || index >= n) {
            return arr;
        }

        // Copy elements except the one at the given index
        for (int i = 0, j = 0; i < n; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            // Taking size of the array from user
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            // Creating an array of size n
            int[] arr = new int[n];

            // Taking input from user and storing it in the array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Taking the element to be deleted from user
            System.out.print("Enter the element to be deleted: ");
            int elementToDelete = sc.nextInt();

            // Deleting the element from the array
            int[] newArr = deleteElement(arr, elementToDelete);

            // Printing the elements of the new array
            System.out.println("The elements of the array after deletion are: ");
            for (int i : newArr) {
                System.out.print(i + " ");
            }

            // Taking the index of the element to be deleted from user
            System.out.print("\nEnter the index of the element to be deleted: ");
            int indexToDelete = sc.nextInt();

            // Deleting the element at the given index from the array
            int[] newArrByIndex = deleteElementByIndex(arr, indexToDelete);

            // Printing the elements of the new array
            System.out.println("The elements of the array after deletion by index are: ");
            for (int i : newArrByIndex) {
                System.out.print(i + " ");
            }
        }
    }
}