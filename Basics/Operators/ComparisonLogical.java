// Program demonstrating 20 mixed examples of Comparison and Logical Operators

public class ComparisonLogical {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int c = 10;

        // Example 1
        System.out.println((a > b) && (b > c));
        // 20 greater than 15 AND 15 greater than 10
        // true AND true
        // result: true

        // Example 2
        System.out.println((a < b) && (b > c));
        // 20 less than 15 AND 15 greater than 10
        // false AND true
        // result: false

        // Example 3
        System.out.println((a > b) || (b < c));
        // 20 greater than 15 OR 15 less than 10
        // true OR false
        // result: true

        // Example 4
        System.out.println((a < b) || (b < c));
        // false OR false
        // result: false

        // Example 5
        System.out.println(!(a > b));
        // 20 greater than 15
        // true
        // logical NOT reverses value
        // result: false

        // Example 6
        System.out.println(!(a < b));
        // 20 less than 15
        // false
        // logical NOT reverses value
        // result: true

        // Example 7
        System.out.println((a >= b) && (c <= b));
        // 20 greater than or equal to 15 AND 10 less than or equal to 15
        // true AND true
        // result: true

        // Example 8
        System.out.println((a == b) || (b > c));
        // 20 equal to 15 OR 15 greater than 10
        // false OR true
        // result: true

        // Example 9
        System.out.println((a != b) && (b != c));
        // 20 not equal to 15 AND 15 not equal to 10
        // true AND true
        // result: true

        // Example 10
        System.out.println((a == c) || (b == c));
        // 20 equal to 10 OR 15 equal to 10
        // false OR false
        // result: false

        // Example 11
        System.out.println((a > b) && (b == 15));
        // true AND true
        // result: true

        // Example 12
        System.out.println((a < b) || (c == 10));
        // false OR true
        // result: true

        // Example 13
        System.out.println((a >= 20) && (c < b));
        // true AND true
        // result: true

        // Example 14
        System.out.println((a <= 10) || (b > c));
        // false OR true
        // result: true

        // Example 15
        System.out.println((a != 20) || (b < c));
        // false OR false
        // result: false

        // Example 16
        System.out.println((a == 20) && !(b < c));
        // true AND NOT(false)
        // true AND true
        // result: true

        // Example 17
        System.out.println(!(a > b && b > c));
        // (true AND true)
        // NOT(true)
        // result: false

        // Example 18
        System.out.println((a > b) || !(c < b));
        // true OR NOT(true)
        // true OR false
        // result: true

        // Example 19
        System.out.println((a < b) && !(b > c));
        // false AND NOT(true)
        // false AND false
        // result: false

        // Example 20
        System.out.println(!(a < b || c > b));
        // (false OR false)
        // NOT(false)
        // result: true
    }
}