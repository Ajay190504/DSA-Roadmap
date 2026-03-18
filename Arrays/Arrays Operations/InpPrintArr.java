// Take input from user and store it in an array and print the array
import java.util.Scanner;

public class InpPrintArr {
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            //Taking size of the array from user
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            //Creating an array of size n
            int[] arr = new int[n];

            //Taking input from user and storing it in the array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }


            //Printing the elements of the array
            System.out.println("The elements of the array are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}