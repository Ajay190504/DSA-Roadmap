import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch)) {
            if(Character.isUpperCase(ch))
                System.out.println("Uppercase letter");
            else
                System.out.println("Lowercase letter");
        }
        else
            System.out.println("Not a letter");

        // Input: A
        // Output: Uppercase letter
    }
}