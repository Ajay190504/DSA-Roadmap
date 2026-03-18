// Program demonstrating Unary Operators

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10;
        boolean flag = true;

        // Unary plus
        System.out.println("+a = " + (+a));
        // unary plus keeps value unchanged
        // result: 10

        // Unary minus
        System.out.println("-a = " + (-a));
        // changes sign of number
        // result: -10

        // Pre increment
        System.out.println("++a = " + (++a));
        // value increases before printing
        // a becomes 11
        // result: 11

        // Post increment
        System.out.println("a++ = " + (a++));
        // value printed first then increased
        // printed value: 11
        // new value of a becomes 12

        // Pre decrement
        System.out.println("--a = " + (--a));
        // a decreases before printing
        // result: 11

        // Post decrement
        System.out.println("a-- = " + (a--));
        // printed value: 11
        // new value becomes 10

        // Logical NOT
        System.out.println("!flag = " + (!flag));
        // flag = true
        // logical NOT reverses boolean
        // result: false

        // Bitwise complement
        System.out.println("~a = " + (~a));
        // a = 10
        // bitwise complement changes all bits
        // result: -11
    }
}