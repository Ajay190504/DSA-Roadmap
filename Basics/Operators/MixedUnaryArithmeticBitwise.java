// 20 Examples using Mixed Unary, Arithmetic and Bitwise Operators

public class MixedUnaryArithmeticBitwise {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // 1
        System.out.println(a + b * 2);
        // b * 2 = 10
        // 10 + 10
        // result: 20

        // 2
        System.out.println(++a + b);
        // a becomes 11
        // 11 + 5
        // result: 16

        // 3
        System.out.println(a++ + b);
        // printed value of a is 11
        // 11 + 5
        // result: 16
        // a becomes 12

        // 4
        System.out.println(~a + b);
        // a is 12
        // ~12 = -13
        // -13 + 5
        // result: -8

        // 5
        System.out.println((a & b) + 3);
        // 12 & 5
        // binary AND gives 4
        // 4 + 3
        // result: 7

        // 6
        System.out.println((a | b) - 2);
        // 12 OR 5 = 13
        // 13 - 2
        // result: 11

        // 7
        System.out.println((a ^ b) * 2);
        // 12 XOR 5 = 9
        // 9 * 2
        // result: 18

        // 8
        System.out.println((a % b) + (~b));
        // 12 % 5 = 2
        // ~5 = -6
        // 2 + (-6)
        // result: -4

        // 9
        System.out.println((a + b) & 7);
        // 12 + 5 = 17
        // 17 AND 7 = 1
        // result: 1

        // 10
        System.out.println((a * b) | 3);
        // 12 * 5 = 60
        // 60 OR 3 = 63
        // result: 63

        // 11
        System.out.println(~(a + b));
        // a + b = 17
        // complement of 17
        // result: -18

        // 12
        System.out.println(-(a + b));
        // 12 + 5 = 17
        // unary minus
        // result: -17

        // 13
        System.out.println(++b * a);
        // b becomes 6
        // 6 * 12
        // result: 72

        // 14
        System.out.println((a-- + b));
        // printed value of a = 12
        // 12 + 6
        // result: 18
        // a becomes 11

        // 15
        System.out.println((a & b) * 2);
        // 11 AND 6 = 2
        // 2 * 2
        // result: 4

        // 16
        System.out.println((a | b) + (~a));
        // 11 OR 6 = 15
        // ~11 = -12
        // 15 + (-12)
        // result: 3

        // 17
        System.out.println((a ^ b) + (a % b));
        // 11 XOR 6 = 13
        // 11 % 6 = 5
        // 13 + 5
        // result: 18

        // 18
        System.out.println((~a) & 7);
        // ~11 = -12
        // -12 AND 7 = 4
        // result: 4

        // 19
        System.out.println((a + b) ^ 4);
        // 11 + 6 = 17
        // 17 XOR 4 = 21
        // result: 21

        // 20
        System.out.println((a * b) % 7);
        // 11 * 6 = 66
        // 66 % 7
        // result: 3

    }
}