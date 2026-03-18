import java.util.Scanner;

public class LongArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
      // Static Array Declaration and Initialization
        long[] longArr1 = {1000L, 2000L, 3000L};

        System.out.println("Static Long Array:");
        for(int i = 0; i < longArr1.length; i++) {
            System.out.println(longArr1[i]);
        }

      // Dynamic Array Declaration and Initialization
        System.out.print("\nEnter size of long array: ");
        int size = sc.nextInt();

        long[] longArr2 = new long[size];

        System.out.println("Enter long elements:");
        for(int i = 0; i < size; i++) {
            longArr2[i] = sc.nextLong();
        }

        System.out.println("Dynamic Long Array:");
        for(int i = 0; i < size; i++) {
            System.out.println(longArr2[i]);
        }

        sc.close();
    }
}