import java.util.Scanner;

public class IntArray {

    public static void main(String[] args) {

      // Static Array Declaration and Initialization
        int[] intArr1 = {10, 20, 30, 40, 50};

        System.out.println("Static Integer Array:");

        for(int i = 0; i < intArr1.length; i++) {
            System.out.println(intArr1[i]);
        }


      // Dynamic Array Declaration and Initialization
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of dynamic array: ");
        int size = sc.nextInt();

        int[] intArr2 = new int[size];

        System.out.println("Enter elements:");

        for(int i = 0; i < size; i++) {
            intArr2[i] = sc.nextInt();
        }

        System.out.println("Dynamic Integer Array:");

        for(int i = 0; i < size; i++) {
            System.out.println(intArr2[i]);
        }

        sc.close();
    }
}