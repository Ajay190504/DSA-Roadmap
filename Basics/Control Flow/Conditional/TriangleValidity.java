import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");

        // Input: 3 4 5
        // Output: Valid Triangle
    }
}