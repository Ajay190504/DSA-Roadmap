// 20 Examples using Mixed Unary, Arithmetic and Assignment Operators

public class MixedUnaryArithmeticAssignment {

    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        // 1
        int result1 = a + b;
        System.out.println(result1);
        // 10 + 4
        // result: 14

        // 2
        int result2 = ++a + b;
        System.out.println(result2);
        // a becomes 11
        // 11 + 4
        // result: 15

        // 3
        int result3 = a++ + b;
        System.out.println(result3);
        // printed value of a is 11
        // 11 + 4
        // result: 15
        // a becomes 12

        // 4
        int result4 = -a + b;
        System.out.println(result4);
        // a is 12
        // -12 + 4
        // result: -8

        // 5
        a += b;
        System.out.println(a);
        // a = 12 + 4
        // result: 16

        // 6
        a -= b;
        System.out.println(a);
        // a = 16 - 4
        // result: 12

        // 7
        a *= b;
        System.out.println(a);
        // a = 12 * 4
        // result: 48

        // 8
        a /= b;
        System.out.println(a);
        // a = 48 / 4
        // result: 12

        // 9
        a %= b;
        System.out.println(a);
        // a = 12 % 4
        // result: 0

        // reset value
        a = 10;

        // 10
        int result10 = (a + b) * 2;
        System.out.println(result10);
        // 10 + 4 = 14
        // 14 * 2
        // result: 28

        // 11
        int result11 = (a - b) * 3;
        System.out.println(result11);
        // 10 - 4 = 6
        // 6 * 3
        // result: 18

        // 12
        int result12 = a * b + 5;
        System.out.println(result12);
        // 10 * 4 = 40
        // 40 + 5
        // result: 45

        // 13
        int result13 = a / b + 3;
        System.out.println(result13);
        // 10 / 4 = 2
        // 2 + 3
        // result: 5

        // 14
        int result14 = a % b + 7;
        System.out.println(result14);
        // 10 % 4 = 2
        // 2 + 7
        // result: 9

        // 15
        int result15 = ++a * b;
        System.out.println(result15);
        // a becomes 11
        // 11 * 4
        // result: 44

        // 16
        int result16 = a-- + b;
        System.out.println(result16);
        // printed value of a = 11
        // 11 + 4
        // result: 15
        // a becomes 10

        // 17
        a += (b * 2);
        System.out.println(a);
        // b * 2 = 8
        // a = 10 + 8
        // result: 18

        // 18
        a -= (b + 3);
        System.out.println(a);
        // b + 3 = 7
        // a = 18 - 7
        // result: 11

        // 19
        a *= (b - 1);
        System.out.println(a);
        // b - 1 = 3
        // a = 11 * 3
        // result: 33

        // 20
        a /= (b - 2);
        System.out.println(a);
        // b - 2 = 2
        // a = 33 / 2
        // integer division
        // result: 16

    }
}