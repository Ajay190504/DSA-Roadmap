public class LongDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Long l1 = Long.valueOf(1000L); 
        // Creates Long object from primitive long

        Long l2 = 2000L; 
        // Autoboxing: long → Long


        // ===== PARSING =====
        long parsed = Long.parseLong("3000"); 
        // Converts String → long

        long parsedRadix = Long.parseLong("1010", 2); 
        // Parses binary string → long (base 2)

        long parsedUnsigned = Long.parseUnsignedLong("4000"); 
        // Parses String as unsigned long


        // ===== VALUE OF STRING =====
        Long fromString = Long.valueOf("5000"); 
        // Converts String → Long object

        Long fromStringRadix = Long.valueOf("1010", 2); 
        // Converts binary string → Long


        // ===== DECODE =====
        Long decoded = Long.decode("0x1A"); 
        // Converts hex/octal/decimal String → Long


        // ===== UNBOXING =====
        long unboxed = l1; 
        // Converts Long → primitive long


        // ===== CONSTANTS =====
        long max = Long.MAX_VALUE; 
        // Maximum long value

        long min = Long.MIN_VALUE; 
        // Minimum long value

        int size = Long.SIZE; 
        // Size in bits (64)

        int bytes = Long.BYTES; 
        // Size in bytes (8)


        // ===== STRING CONVERSIONS =====
        String str = l1.toString(); 
        // Long → String

        String binary = Long.toBinaryString(l1); 
        // Converts long → binary string

        String hex = Long.toHexString(l1); 
        // Converts long → hexadecimal string

        String octal = Long.toOctalString(l1); 
        // Converts long → octal string

        String unsignedStr = Long.toUnsignedString(-1L); 
        // Converts signed long → unsigned string


        // ===== COMPARISON =====
        boolean equals = l1.equals(l2); 
        // Compares values

        int compareStatic = Long.compare(l1, l2); 
        // Static comparison

        int compareObj = l1.compareTo(l2); 
        // Object comparison

        int compareUnsigned = Long.compareUnsigned(-1L, 1L); 
        // Compares as unsigned values


        // ===== TYPE CONVERSIONS =====
        byte toByte = l1.byteValue(); 
        // Long → byte (data loss possible)

        short toShort = l1.shortValue(); 
        // Long → short

        int toInt = l1.intValue(); 
        // Long → int

        long toLong = l1.longValue(); 
        // Long → long

        float toFloat = l1.floatValue(); 
        // Long → float

        double toDouble = l1.doubleValue(); 
        // Long → double


        // ===== LONG ↔ CHAR CONVERSION =====
        char toChar = (char) l1.intValue(); 
        // long → int → char (Unicode mapping)

        int charToInt = (int) 'A'; 
        // char → ASCII integer value

        Long charToLong = (long) charToInt; 
        // int → long


        // ===== LONG → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (l1 != 0L); 
        // Non-zero = true, zero = false


        // ===== BIT OPERATIONS =====
        int bitCount = Long.bitCount(l1); 
        // Counts number of 1 bits

        int leadingZeros = Long.numberOfLeadingZeros(l1); 
        // Counts leading zeros

        int trailingZeros = Long.numberOfTrailingZeros(l1); 
        // Counts trailing zeros

        long highestBit = Long.highestOneBit(l1); 
        // Highest set bit

        long lowestBit = Long.lowestOneBit(l1); 
        // Lowest set bit


        // ===== ROTATION =====
        long rotateLeft = Long.rotateLeft(l1, 2); 
        // Rotates bits left

        long rotateRight = Long.rotateRight(l1, 2); 
        // Rotates bits right


        // ===== REVERSE =====
        long reversedBits = Long.reverse(l1); 
        // Reverses bits

        long reversedBytes = Long.reverseBytes(l1); 
        // Reverses byte order


        // ===== SIGN =====
        int sign = Long.signum(l1); 
        // Returns -1, 0, or 1


        // ===== UNSIGNED OPERATIONS =====
        long unsignedDivide = Long.divideUnsigned(10L, 3L); 
        // Unsigned division

        long unsignedRemainder = Long.remainderUnsigned(10L, 3L); 
        // Unsigned remainder


        // ===== UTILITY METHODS =====
        long maxVal = Long.max(10L, 20L); 
        // Returns maximum

        long minVal = Long.min(10L, 20L); 
        // Returns minimum

        long sum = Long.sum(10L, 20L); 
        // Returns sum


        // ===== HASHCODE =====
        int hash = l1.hashCode(); 
        // Returns hash code


        // ===== PRINT OUTPUT =====
        System.out.println(parsed);
        System.out.println(parsedRadix);
        System.out.println(parsedUnsigned);
        System.out.println(fromString);
        System.out.println(fromStringRadix);
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
        System.out.println(charToLong);
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