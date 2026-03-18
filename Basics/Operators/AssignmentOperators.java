// Program to demonstrate all Assignment Operators in Java
// Each operator updates the value of the variable

public class AssignmentOperators {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println("Initial Values:");
        System.out.println("a = " + a); // a = 20 
        System.out.println("b = " + b); // b = 6

        // = (Simple Assignment)
        int c = a;
        System.out.println("\nSimple Assignment (c = a): " + c); // c = 20  (since a = 20)

        // += (Addition Assignment)
        a += b;      // a = a + b
        System.out.println("After a += b : " + a); // a = 26 (since 20 + 6 = 26)

        // -= (Subtraction Assignment)
        a -= b;      // a = a - b
        System.out.println("After a -= b : " + a); // a = 20 (since 26 - 6 = 20)

        // *= (Multiplication Assignment)
        a *= b;      // a = a * b
        System.out.println("After a *= b : " + a); //  a = 120 (since 20 * 6 = 120)

        // /= (Division Assignment)
        a /= b;      // a = a / b
        System.out.println("After a /= b : " + a); // a = 20 (since 120 / 6 = 20)

        // %= (Modulus Assignment)
        a %= b;      // a = a % b
        System.out.println("After a %= b : " + a); // a = 2 (since 20 % 6 = 2)

        // Bitwise Assignment Operators

        int x = 10;
        int y = 5;

        // &= (Bitwise AND Assignment)
        x &= y;      // x = x & y
        System.out.println("\nAfter x &= y : " + x); // x = 0 (since 10 & 5 = 0)

        x = 10;

        // |= (Bitwise OR Assignment)
        x |= y;      // x = x | y
        System.out.println("After x |= y : " + x); // x = 15 (since 10 | 5 = 15)

        x = 10;

        // ^= (Bitwise XOR Assignment)
        x ^= y;      // x = x ^ y
        System.out.println("After x ^= y : " + x); // x = 15 (since 10 ^ 5 = 15)

        x = 10;

        // <<= (Left Shift Assignment)
        x <<= 2;     // x = x << 2
        System.out.println("After x <<= 2 : " + x); // x = 40 (since 10 << 2 = 10 * 2^2 = 10 * 4 = 40)

        x = 10;

        // >>= (Right Shift Assignment)
        x >>= 2;     // x = x >> 2
        System.out.println("After x >>= 2 : " + x); // x = 2 (since 10 >> 2 = 10 / 2^2 = 10 / 4 = 2)

        x = 10;

        // >>>= (Unsigned Right Shift Assignment)
        x >>>= 2;    // x = x >>> 2
        System.out.println("After x >>>= 2 : " + x); // x = 2 (since 10 >>> 2 = 10 / 2^2 = 10 / 4 = 2)

    }
}