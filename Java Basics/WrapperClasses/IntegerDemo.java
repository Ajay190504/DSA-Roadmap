public class IntegerDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Integer i1 = Integer.valueOf(100); 
        // Creates Integer object from int value

        Integer i2 = 200; 
        // Autoboxing: primitive int → Integer object


        // ===== PARSING =====
        int parsed = Integer.parseInt("123"); 
        // Converts String to primitive int

        int parsedUnsigned = Integer.parseUnsignedInt("123"); 
        // Parses String as unsigned integer (no negative values)


        // ===== DECODE =====
        Integer decoded = Integer.decode("0x1A"); 
        // Converts hex/octal/decimal String → Integer


        // ===== UNBOXING =====
        int unboxed = i1; 
        // Converts Integer object → primitive int


        // ===== CONSTANTS =====
        int max = Integer.MAX_VALUE; 
        // Maximum value of int

        int min = Integer.MIN_VALUE; 
        // Minimum value of int

        int size = Integer.SIZE; 
        // Size of int in bits (32)

        int bytes = Integer.BYTES; 
        // Size of int in bytes (4)


        // ===== STRING CONVERSIONS =====
        String str = i1.toString(); 
        // Converts Integer → String

        String binary = Integer.toBinaryString(10); 
        // Converts int → binary string

        String hex = Integer.toHexString(10); 
        // Converts int → hexadecimal string

        String octal = Integer.toOctalString(10); 
        // Converts int → octal string

        String unsignedStr = Integer.toUnsignedString(-1); 
        // Converts signed int to unsigned string representation


        // ===== VALUE OF STRING =====
        Integer fromString = Integer.valueOf("500"); 
        // Converts String → Integer object


        // ===== COMPARISON =====
        boolean equals = i1.equals(i2); 
        // Compares values (not reference)

        int compareStatic = Integer.compare(i1, i2); 
        // Static comparison method

        int compareObj = i1.compareTo(i2); 
        // Instance comparison method

        int compareUnsigned = Integer.compareUnsigned(-1, 1); 
        // Compares values as unsigned integers


        // ===== TYPE CONVERSIONS =====
        byte toByte = i1.byteValue(); 
        // Integer → byte

        short toShort = i1.shortValue(); 
        // Integer → short

        int toInt = i1.intValue(); 
        // Integer → int

        long toLong = i1.longValue(); 
        // Integer → long

        float toFloat = i1.floatValue(); 
        // Integer → float

        double toDouble = i1.doubleValue(); 
        // Integer → double


        // ===== INTEGER ↔ CHAR CONVERSION =====
        char toChar = (char) i1.intValue(); 
        // Converts Integer → char using ASCII/Unicode

        int charToInt = (int) 'A'; 
        // Converts char → ASCII integer value

        Integer charToInteger = charToInt; 
        // Converts int → Integer (autoboxing)


        // ===== INTEGER → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (i1 != 0); 
        // Converts Integer to boolean (non-zero = true)


        // ===== BIT OPERATIONS =====
        int bitCount = Integer.bitCount(10); 
        // Counts number of 1 bits

        int leadingZeros = Integer.numberOfLeadingZeros(10); 
        // Counts leading zeros in binary

        int trailingZeros = Integer.numberOfTrailingZeros(10); 
        // Counts trailing zeros

        int highestBit = Integer.highestOneBit(10); 
        // Gets highest set bit

        int lowestBit = Integer.lowestOneBit(10); 
        // Gets lowest set bit


        // ===== ROTATION =====
        int rotateLeft = Integer.rotateLeft(10, 2); 
        // Rotates bits to left

        int rotateRight = Integer.rotateRight(10, 2); 
        // Rotates bits to right


        // ===== REVERSE =====
        int reversedBits = Integer.reverse(10); 
        // Reverses bits

        int reversedBytes = Integer.reverseBytes(10); 
        // Reverses byte order


        // ===== SIGN =====
        int sign = Integer.signum(-10); 
        // Returns -1, 0, or 1 based on sign


        // ===== UNSIGNED OPERATIONS =====
        int unsignedDivide = Integer.divideUnsigned(10, 3); 
        // Performs unsigned division

        int unsignedRemainder = Integer.remainderUnsigned(10, 3); 
        // Performs unsigned remainder


        // ===== UTILITY METHODS =====
        int maxVal = Integer.max(10, 20); 
        // Returns maximum value

        int minVal = Integer.min(10, 20); 
        // Returns minimum value

        int sum = Integer.sum(10, 20); 
        // Returns sum


        // ===== HASHCODE =====
        int hash = i1.hashCode(); 
        // Returns hash code of Integer object


        // ===== PRINT OUTPUT =====
        System.out.println(parsed);
        System.out.println(parsedUnsigned);
        System.out.println(decoded);
        System.out.println(unboxed);
        System.out.println(max);
        System.out.println(min);
        System.out.println(size);
        System.out.println(bytes);
        System.out.println(str);
        System.out.println(binary);
        System.out.println(hex);
        System.out.println(octal);
        System.out.println(unsignedStr);
        System.out.println(fromString);
        System.out.println(equals);
        System.out.println(compareStatic);
        System.out.println(compareObj);
        System.out.println(compareUnsigned);
        System.out.println(toByte);
        System.out.println(toShort);
        System.out.println(toInt);
        System.out.println(toLong);
        System.out.println(toFloat);
        System.out.println(toDouble);
        System.out.println(toChar);
        System.out.println(charToInt);
        System.out.println(charToInteger);
        System.out.println(toBoolean);
        System.out.println(bitCount);
        System.out.println(leadingZeros);
        System.out.println(trailingZeros);
        System.out.println(highestBit);
        System.out.println(lowestBit);
        System.out.println(rotateLeft);
        System.out.println(rotateRight);
        System.out.println(reversedBits);
        System.out.println(reversedBytes);
        System.out.println(sign);
        System.out.println(unsignedDivide);
        System.out.println(unsignedRemainder);
        System.out.println(maxVal);
        System.out.println(minVal);
        System.out.println(sum);
        System.out.println(hash);
    }
}