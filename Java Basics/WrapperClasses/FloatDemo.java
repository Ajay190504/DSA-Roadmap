public class FloatDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Float f1 = Float.valueOf(10.5f); 
        // Creates Float object from primitive float

        Float f2 = 20.5f; 
        // Autoboxing: float → Float


        // ===== PARSING =====
        float parsed = Float.parseFloat("30.5"); 
        // Converts String → float


        // ===== VALUE OF STRING =====
        Float fromString = Float.valueOf("40.5"); 
        // Converts String → Float object


        // ===== UNBOXING =====
        float unboxed = f1; 
        // Converts Float → primitive float


        // ===== CONSTANTS =====
        float max = Float.MAX_VALUE; 
        // Maximum float value

        float min = Float.MIN_VALUE; 
        // Smallest positive float value

        float posInfinity = Float.POSITIVE_INFINITY; 
        // Positive infinity constant

        float negInfinity = Float.NEGATIVE_INFINITY; 
        // Negative infinity constant

        float nanValue = Float.NaN; 
        // Not-a-Number constant

        int size = Float.SIZE; 
        // Size in bits (32)

        int bytes = Float.BYTES; 
        // Size in bytes (4)


        // ===== STRING CONVERSION =====
        String str = f1.toString(); 
        // Float → String


        // ===== COMPARISON =====
        boolean equals = f1.equals(f2); 
        // Compares values

        int compareStatic = Float.compare(f1, f2); 
        // Static comparison

        int compareObj = f1.compareTo(f2); 
        // Object comparison


        // ===== TYPE CONVERSIONS =====
        byte toByte = f1.byteValue(); 
        // Float → byte (data loss possible)

        short toShort = f1.shortValue(); 
        // Float → short

        int toInt = f1.intValue(); 
        // Float → int (fraction lost)

        long toLong = f1.longValue(); 
        // Float → long

        float toFloat = f1.floatValue(); 
        // Float → float

        double toDouble = f1.doubleValue(); 
        // Float → double


        // ===== FLOAT ↔ CHAR CONVERSION =====
        char toChar = (char) f1.intValue(); 
        // float → int → char (ASCII/Unicode mapping)

        int charToInt = (int) 'A'; 
        // char → ASCII integer value

        float charToFloat = (float) charToInt; 
        // int → float


        // ===== FLOAT → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (f1 != 0.0f); 
        // Non-zero = true, zero = false


        // ===== SPECIAL FLOAT METHODS =====
        boolean isNaN = Float.isNaN(f1); 
        // Checks if value is NaN

        boolean isInfinite = Float.isInfinite(f1); 
        // Checks if value is infinite

        boolean isFinite = Float.isFinite(f1); 
        // Checks if value is finite (not NaN or infinity)


        // ===== UTILITY METHODS =====
        float sum = Float.sum(10.5f, 20.5f); 
        // Adds two float values

        float maxVal = Float.max(10.5f, 20.5f); 
        // Returns maximum value

        float minVal = Float.min(10.5f, 20.5f); 
        // Returns minimum value


        // ===== HASHCODE =====
        int hash = f1.hashCode(); 
        // Returns hash code of Float object


        // ===== PRINT OUTPUT =====
        System.out.println(parsed);
        System.out.println(fromString);
        System.out.println(unboxed);
        System.out.println(max);
        System.out.println(min);
        System.out.println(posInfinity);
        System.out.println(negInfinity);
        System.out.println(nanValue);
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
        System.out.println(charToFloat);
        System.out.println(toBoolean);
        System.out.println(isNaN);
        System.out.println(isInfinite);
        System.out.println(isFinite);
        System.out.println(sum);
        System.out.println(maxVal);
        System.out.println(minVal);
        System.out.println(hash);
    }
}