import java.util.Scanner;

public class ShortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     // Static Array Declaration and Initialization
        short[] shortArr1 = {10, 20, 30};

        System.out.println("Static Short Array:");
        for(int i = 0; i < shortArr1.length; i++) {
            System.out.println(shortArr1[i]);
        }

      // Dynamic Array Declaration and Initialization
        System.out.print("\nEnter size of short array: ");
        int size = sc.nextInt();

        short[] shortArr2 = new short[size];

        System.out.println("Enter short elements:");
        for(int i = 0; i < size; i++) {
            shortArr2[i] = sc.nextShort();
        }

        System.out.println("Dynamic Short Array:");
        for(int i = 0; i < size; i++) {
            System.out.println(shortArr2[i]);
        }

        sc.close();
    }
}