// Program demonstrating all Comparison Operators
// Operators used: ==  !=  >  <  >=  <=

public class ComparisonOperators {

    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int c = 15;

        // == (Equal to)
        System.out.println("a == b : " + (a == b));
        // 15 is equal to 10
        // result: false

        System.out.println("a == c : " + (a == c));
        // 15 is equal to 15
        // result: true


        // != (Not equal to)
        System.out.println("a != b : " + (a != b));
        // 15 is not equal to 10
        // result: true

        System.out.println("a != c : " + (a != c));
        // 15 is not equal to 15
        // result: false


        // > (Greater than)
        System.out.println("a > b : " + (a > b));
        // 15 greater than 10
        // result: true

        System.out.println("b > a : " + (b > a));
        // 10 greater than 15
        // result: false


        // < (Less than)
        System.out.println("a < b : " + (a < b));
        // 15 less than 10
        // result: false

        System.out.println("b < a : " + (b < a));
        // 10 less than 15
        // result: true


        // >= (Greater than or equal to)
        System.out.println("a >= c : " + (a >= c));
        // 15 greater than or equal to 15
        // result: true

        System.out.println("b >= a : " + (b >= a));
        // 10 greater than or equal to 15
        // result: false


        // <= (Less than or equal to)
        System.out.println("a <= c : " + (a <= c));
        // 15 less than or equal to 15
        // result: true

        System.out.println("a <= b : " + (a <= b));
        // 15 less than or equal to 10
        // result: false


        // Additional relational logic examples

        boolean largest = (a > b) && (a >= c);
        System.out.println("Is a the largest? : " + largest);
        // 15 greater than 10 AND 15 greater than or equal to 15
        // result: true


        boolean allEqual = (a == b) && (b == c);
        System.out.println("Are all numbers equal? : " + allEqual);
        // 15 equal to 10 AND 10 equal to 15
        // result: false


        boolean increasing = (b < a) && (a <= c);
        System.out.println("Numbers increasing? : " + increasing);
        // 10 less than 15 AND 15 less than or equal to 15
        // result: true

    }
}