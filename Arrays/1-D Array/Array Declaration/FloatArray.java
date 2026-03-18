import java.util.Scanner;

public class FloatArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      // Static Array Declaration and Initialization
        float[] floatArr1 = {1.1f, 2.2f, 3.3f};

        System.out.println("Static Float Array:");
        for(int i = 0; i < floatArr1.length; i++) {
            System.out.println(floatArr1[i]);
        }

      // Dynamic Array Declaration and Initialization
        System.out.print("\nEnter size of float array: ");
        int size = sc.nextInt();

        float[] floatArr2 = new float[size];

        System.out.println("Enter float elements:");
        for(int i = 0; i < size; i++) {
            floatArr2[i] = sc.nextFloat();
        }

        System.out.println("Dynamic Float Array:");
        for(int i = 0; i < size; i++) {
            System.out.println(floatArr2[i]);
        }

        sc.close();
    }
}