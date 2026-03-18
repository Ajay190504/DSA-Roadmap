import java.util.Scanner;

public class ByteArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      // Static Array Declaration and Initialization
        byte[] byteArr1 = {1, 2, 3};

        System.out.println("Static Byte Array:");
        for(int i = 0; i < byteArr1.length; i++) {
            System.out.println(byteArr1[i]);
        }

      // Dynamic Array Declaration and Initialization
        System.out.print("\nEnter size of byte array: ");
        int size = sc.nextInt();

        byte[] byteArr2 = new byte[size];

        System.out.println("Enter byte elements:");
        for(int i = 0; i < size; i++) {
            byteArr2[i] = sc.nextByte();
        }

        System.out.println("Dynamic Byte Array:");
        for(int i = 0; i < size; i++) {
            System.out.println(byteArr2[i]);
        }

        sc.close();
    }
}