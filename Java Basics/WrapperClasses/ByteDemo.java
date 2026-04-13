public class ByteDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Byte b1 = Byte.valueOf((byte) 10); 
        // Creates Byte object from primitive byte

        Byte b2 = 20; 
        // Autoboxing: byte → Byte


        // ===== PARSING =====
        byte parsed = Byte.parseByte("30"); 
        // Converts String → byte

        byte parsedRadix = Byte.parseByte("10", 2); 
        // Parses binary string → byte (base 2)


        // ===== VALUE OF STRING =====
        Byte fromString = Byte.valueOf("40"); 
        // Converts String → Byte object

        Byte fromStringRadix = Byte.valueOf("10", 2); 
        // Converts binary string → Byte


        // ===== UNBOXING =====
        byte unboxed = b1; 
        // Converts Byte → primitive byte


        // ===== CONSTANTS =====
        byte max = Byte.MAX_VALUE; 
        // Maximum value (127)

        byte min = Byte.MIN_VALUE; 
        // Minimum value (-128)

        int size = Byte.SIZE; 
        // Size in bits (8)

        int bytes = Byte.BYTES; 
        // Size in bytes (1)


        // ===== STRING CONVERSION =====
        String str = b1.toString(); 
        // Byte → String


        // ===== COMPARISON =====
        boolean equals = b1.equals(b2); 
        // Compares values

        int compareStatic = Byte.compare(b1, b2); 
        // Static comparison

        int compareObj = b1.compareTo(b2); 
        // Object comparison


        // ===== TYPE CONVERSIONS =====
        byte toByte = b1.byteValue(); 
        // Byte → byte

        short toShort = b1.shortValue(); 
        // Byte → short

        int toInt = b1.intValue(); 
        // Byte → int

        long toLong = b1.longValue(); 
        // Byte → long

        float toFloat = b1.floatValue(); 
        // Byte → float

        double toDouble = b1.doubleValue(); 
        // Byte → double


        // ===== BYTE ↔ CHAR CONVERSION =====
        char toChar = (char) b1.byteValue(); 
        // byte → char (ASCII/Unicode mapping)

        int charToInt = (int) 'A'; 
        // char → ASCII integer value

        Byte charToByte = (byte) charToInt; 
        // int → byte (possible data loss)


        // ===== BYTE → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (b1 != 0); 
        // Non-zero = true, zero = false


        // ===== UTILITY METHODS =====
        int hash = b1.hashCode(); 
        // Returns hash code of Byte object


        // ===== PRINT OUTPUT =====
        System.out.println(parsed);
        System.out.println(parsedRadix);
        System.out.println(fromString);
        System.out.println(fromStringRadix);
        System.out.println(unboxed);
        System.out.println(max);
        System.out.println(min);
        System.out.println(size);
        System.out.println(bytes);
        System.out.println(str);
        System.out.println(equals);
        System.out.println(compareStatic);
        System.out.println(compareObj);
        System.out.println(toByte);
        System.out.println(toShort);
        System.out.println(toInt);
        System.out.println(toLong);
        System.out.println(toFloat);
        System.out.println(toDouble);
        System.out.println(toChar);
        System.out.println(charToInt);
        System.out.println(charToByte);
        System.out.println(toBoolean);
        System.out.println(hash);
    }
}