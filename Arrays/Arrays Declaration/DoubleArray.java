import java.util.Scanner;

public class DoubleArray {

    public static void main(String[] args) {

      // Static Array Declaration and Initialization
        double[] doubleArr1 = {10.5, 20.2, 30.8, 40.4};

        System.out.println("Static Double Array:");

        for(int i = 0; i < doubleArr1.length; i++) {
            System.out.println(doubleArr1[i]);
        }


      // Dynamic Array Declaration and Initialization
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of dynamic array: ");
        int size = sc.nextInt();

        double[] doubleArr2 = new double[size];

        System.out.println("Enter elements:");

        for(int i = 0; i < size; i++) {
            doubleArr2[i] = sc.nextDouble();
        }

        System.out.println("Dynamic Double Array:");

        for(int i = 0; i < size; i++) {
            System.out.println(doubleArr2[i]);
        }

        sc.close();
    }
}