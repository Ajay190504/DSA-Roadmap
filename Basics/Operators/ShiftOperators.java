// Program demonstrating Shift Operators

public class ShiftOperators {

    public static void main(String[] args) {

        int a = 8;

        // Left Shift
        System.out.println("a << 2 = " + (a << 2));
        // binary of 8 is 00001000
        // shift left by 2 positions
        // 00100000
        // result: 32

        // Signed Right Shift
        System.out.println("a >> 2 = " + (a >> 2));
        // shift bits to right by 2
        // 00000010
        // result: 2

        int b = -8;

        // Signed Right Shift
        System.out.println("b >> 2 = " + (b >> 2));
        // sign bit preserved
        // result: -2

        // Unsigned Right Shift
        System.out.println("b >>> 2 = " + (b >>> 2));
        // zero filled from left side
        // produces large positive number
    }
}