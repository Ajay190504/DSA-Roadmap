import java.util.Scanner;

public class BooleanArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      // Static Array Declaration and Initialization
        boolean[] boolArr1 = {true, false, true};

        System.out.println("Static Boolean Array:");
        for(int i = 0; i < boolArr1.length; i++) {
            System.out.println(boolArr1[i]);
        }

      // Dynamic Array Declaration and Initialization
        System.out.print("\nEnter size of boolean array: ");
        int size = sc.nextInt();

        boolean[] boolArr2 = new boolean[size];

        System.out.println("Enter boolean values (true/false):");
        for(int i = 0; i < size; i++) {
            boolArr2[i] = sc.nextBoolean();
        }

        System.out.println("Dynamic Boolean Array:");
        for(int i = 0; i < size; i++) {
            System.out.println(boolArr2[i]);
        }

        sc.close();
    }
}