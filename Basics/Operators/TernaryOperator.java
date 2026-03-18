// Program demonstrating Ternary Operator

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 25;
        int b = 40;

        int max = (a > b) ? a : b;

        System.out.println("Maximum number is: " + max);

        // condition
        // 25 greater than 40
        // condition is false
        // value after colon selected
        // result: 40


        int number = 7;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number is: " + result);

        // 7 modulus 2 equals 1
        // condition false
        // result: Odd
    }
}