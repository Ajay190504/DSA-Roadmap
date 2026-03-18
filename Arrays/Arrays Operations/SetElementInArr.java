// Set element in array at given index
import java.util.Scanner;

public class SetElementInArr {
    static void setElement(int[] arr, int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value; // Set the element at the specified index
        } else {
            System.out.println("Index out of bounds");
        }
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

            // Taking index and value to set from user
            System.out.print("Enter the index to set: ");
            int index = sc.nextInt();
            System.out.print("Enter the value to set: ");
            int value = sc.nextInt();

            // Setting the element at the specified index
            setElement(arr, index, value);

            // Printing the elements of the array after setting the value
            System.out.println("The elements of the array after setting the value are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}