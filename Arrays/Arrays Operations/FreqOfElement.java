// Finding frequency of an Element in an Array
import java.util.Scanner;
public class FreqOfElement {
   // Function to find the frequency of an element in the array
   static int freq(int arr[], int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to find its frequency: ");
        int x = sc.nextInt();
        
        int result = freq(arr, n, x);
        System.out.println("Frequency of " + x + " is: " + result);
    }
}