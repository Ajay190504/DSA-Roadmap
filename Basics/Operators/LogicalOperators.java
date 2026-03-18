// Program demonstrating Logical Operators
// Operators used: &&  ||  !

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int c = 10;

        // Logical AND
        System.out.println("(a > b) && (b > c) : " + ((a > b) && (b > c)));
        // 20 greater than 15 AND 15 greater than 10
        // true AND true
        // result: true


        System.out.println("(a < b) && (b > c) : " + ((a < b) && (b > c)));
        // 20 less than 15 AND 15 greater than 10
        // false AND true
        // result: false


        // Logical OR
        System.out.println("(a < b) || (b > c) : " + ((a < b) || (b > c)));
        // 20 less than 15 OR 15 greater than 10
        // false OR true
        // result: true


        System.out.println("(a < b) || (b < c) : " + ((a < b) || (b < c)));
        // 20 less than 15 OR 15 less than 10
        // false OR false
        // result: false


        // Logical NOT
        System.out.println("!(a > b) : " + !(a > b));
        // 20 greater than 15
        // true
        // logical NOT reverses the result
        // result: false


        System.out.println("!(b < c) : " + !(b < c));
        // 15 less than 10
        // false
        // logical NOT reverses the result
        // result: true


        // More complex logical expressions

        boolean result1 = (a > b) && (a > c);
        System.out.println("(a > b) && (a > c) : " + result1);
        // 20 greater than 15 AND 20 greater than 10
        // true AND true
        // result: true


        boolean result2 = (a < b) || (a > c);
        System.out.println("(a < b) || (a > c) : " + result2);
        // 20 less than 15 OR 20 greater than 10
        // false OR true
        // result: true


        boolean result3 = !((a > b) && (b > c));
        System.out.println("!((a > b) && (b > c)) : " + result3);
        // 20 greater than 15 AND 15 greater than 10
        // true AND true
        // logical NOT applied to true
        // result: false

    }
}