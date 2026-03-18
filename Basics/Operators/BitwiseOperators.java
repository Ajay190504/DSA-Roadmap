// Program demonstrating Bitwise Operators
// Operators used: &  |  ^  ~

public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 10;   // binary: 00001010
        int b = 6;    // binary: 00000110

        // Bitwise AND
        System.out.println("a & b = " + (a & b));
        // 00001010
        // 00000110
        // result after AND
        // 00000010
        // decimal value: 2


        // Bitwise OR
        System.out.println("a | b = " + (a | b));
        // 00001010
        // 00000110
        // result after OR
        // 00001110
        // decimal value: 14


        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));
        // 00001010
        // 00000110
        // result after XOR
        // 00001100
        // decimal value: 12


        // Bitwise Complement
        System.out.println("~a = " + (~a));
        // a = 10
        // binary representation (32-bit signed)
        // 00000000 00000000 00000000 00001010
        // after complement
        // 11111111 11111111 11111111 11110101
        // decimal value: -11


        System.out.println("~b = " + (~b));
        // b = 6
        // binary representation
        // 00000000 00000000 00000000 00000110
        // after complement
        // 11111111 11111111 11111111 11111001
        // decimal value: -7


        // Additional bitwise expressions

        int result1 = (a & b) | a;
        System.out.println("(a & b) | a = " + result1);
        // a & b = 2
        // 2 OR 10
        // binary
        // 00000010
        // 00001010
        // result: 10


        int result2 = (a ^ b) & b;
        System.out.println("(a ^ b) & b = " + result2);
        // a ^ b = 12
        // 12 AND 6
        // binary
        // 00001100
        // 00000110
        // result: 4

    }
}