import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {

      // Static Array Declaration and Initialization
        String[] stringArr1 = {"Java", "Python", "C++", "JavaScript"};

        System.out.println("Static String Array:");

        for(int i = 0; i < stringArr1.length; i++) {
            System.out.println(stringArr1[i]);
        }


      // Dynamic Array Declaration and Initialization
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of dynamic array: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] stringArr2 = new String[size];

        System.out.println("Enter elements:");

        for(int i = 0; i < size; i++) {
            stringArr2[i] = sc.nextLine();
        }

        System.out.println("Dynamic String Array:");

        for(int i = 0; i < size; i++) {
            System.out.println(stringArr2[i]);
        }

        sc.close();
    }
}