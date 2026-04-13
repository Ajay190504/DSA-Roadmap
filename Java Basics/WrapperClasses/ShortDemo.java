public class ShortDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Short s1 = Short.valueOf((short) 100); 
        // Creates Short object from primitive short

        Short s2 = 200; 
        // Autoboxing: short → Short


        // ===== PARSING =====
        short parsed = Short.parseShort("300"); 
        // Converts String → short

        short parsedRadix = Short.parseShort("10", 2); 
        // Parses binary string → short (base 2)


        // ===== VALUE OF STRING =====
        Short fromString = Short.valueOf("400"); 
        // Converts String → Short object

        Short fromStringRadix = Short.valueOf("10", 2); 
        // Converts binary string → Short


        // ===== UNBOXING =====
        short unboxed = s1; 
        // Converts Short → primitive short


        // ===== CONSTANTS =====
        short max = Short.MAX_VALUE; 
        // Maximum value (32767)

        short min = Short.MIN_VALUE; 
        // Minimum value (-32768)

        int size = Short.SIZE; 
        // Size in bits (16)

        int bytes = Short.BYTES; 
        // Size in bytes (2)


        // ===== STRING CONVERSION =====
        String str = s1.toString(); 
        // Short → String


        // ===== COMPARISON =====
        boolean equals = s1.equals(s2); 
        // Compares values

        int compareStatic = Short.compare(s1, s2); 
        // Static comparison

        int compareObj = s1.compareTo(s2); 
        // Object comparison


        // ===== TYPE CONVERSIONS =====
        byte toByte = s1.byteValue(); 
        // Short → byte (possible data loss)

        short toShort = s1.shortValue(); 
        // Short → short

        int toInt = s1.intValue(); 
        // Short → int

        long toLong = s1.longValue(); 
        // Short → long

        float toFloat = s1.floatValue(); 
        // Short → float

        double toDouble = s1.doubleValue(); 
        // Short → double


        // ===== SHORT ↔ CHAR CONVERSION =====
        char toChar = (char) s1.shortValue(); 
        // short → char (Unicode mapping)

        int charToInt = (int) 'A'; 
        // char → ASCII integer value

        Short charToShort = (short) charToInt; 
        // int → short (possible overflow)


        // ===== SHORT → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (s1 != 0); 
        // Non-zero = true, zero = false


        // ===== UTILITY METHODS =====
        int hash = s1.hashCode(); 
        // Returns hash code of Short object


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
        System.out.println(charToShort);
        System.out.println(toBoolean);
        System.out.println(hash);
    }
}