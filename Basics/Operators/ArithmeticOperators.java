// Program demonstrating all Arithmetic Operators
// Operators used: +  -  *  /  %

public class ArithmeticOperators{

    public static void main(String[] args) {

        int a = 25;
        int b = 7;

        // Addition
        System.out.println("a + b = " + (a + b));
        // 25 + 7
        // result: 32


        // Subtraction
        System.out.println("a - b = " + (a - b));
        // 25 minus 7
        // result: 18


        // Multiplication
        System.out.println("a * b = " + (a * b));
        // 25 multiplied by 7
        // result: 175


        // Division
        System.out.println("a / b = " + (a / b));
        // 25 divided by 7
        // integer division removes decimal part
        // result: 3


        // Modulus
        System.out.println("a % b = " + (a % b));
        // remainder when 25 is divided by 7
        // 7 * 3 = 21
        // remainder: 4


        // More complex arithmetic expressions

        int expression1 = (a + b) * 2;
        System.out.println("(a + b) * 2 = " + expression1);
        // (25 + 7) * 2
        // 32 * 2
        // result: 64


        int expression2 = (a * b) - (a / b);
        System.out.println("(a * b) - (a / b) = " + expression2);
        // (25 * 7) minus (25 / 7)
        // 175 minus 3
        // result: 172


        int expression3 = (a % b) + (a / b);
        System.out.println("(a % b) + (a / b) = " + expression3);
        // remainder of 25 divided by 7 plus quotient
        // 4 + 3
        // result: 7


        int expression4 = (a * a) + (b * b);
        System.out.println("a^2 + b^2 = " + expression4);
        // 25 * 25 plus 7 * 7
        // 625 plus 49
        // result: 674

    }
}