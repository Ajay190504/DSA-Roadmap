import java.util.Scanner;

public class CharArray {

    public static void main(String[] args) {

    // Static Array Declaration and Initialization
        char[] charArr1 = {'A', 'B', 'C', 'D'};

        System.out.println("Static Character Array:");

        for(int i = 0; i < charArr1.length; i++) {
            System.out.println(charArr1[i]);
        }


    // Dynamic Array Declaration and Initialization
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of dynamic array: ");
        int size = sc.nextInt();

        char[] charArr2 = new char[size];

        System.out.println("Enter characters:");

        for(int i = 0; i < size; i++) {
            charArr2[i] = sc.next().charAt(0);
        }

        System.out.println("Dynamic Character Array:");

        for(int i = 0; i < size; i++) {
            System.out.println(charArr2[i]);
        }

        sc.close();
    }
}