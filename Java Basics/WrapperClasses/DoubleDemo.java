public class DoubleDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Double d1 = Double.valueOf(10.5); 
        // Creates Double object from primitive double

        Double d2 = 20.5; 
        // Autoboxing: double → Double


        // ===== PARSING =====
        double parsed = Double.parseDouble("30.5"); 
        // Converts String → double


        // ===== VALUE OF STRING =====
        Double fromString = Double.valueOf("40.5"); 
        // Converts String → Double object


        // ===== UNBOXING =====
        double unboxed = d1; 
        // Converts Double → primitive double


        // ===== CONSTANTS =====
        double max = Double.MAX_VALUE; 
        // Maximum double value

        double min = Double.MIN_VALUE; 
        // Smallest positive double value

        double posInfinity = Double.POSITIVE_INFINITY; 
        // Positive infinity constant

        double negInfinity = Double.NEGATIVE_INFINITY; 
        // Negative infinity constant

        double nanValue = Double.NaN; 
        // Not-a-Number constant

        int size = Double.SIZE; 
        // Size in bits (64)

        int bytes = Double.BYTES; 
        // Size in bytes (8)


        // ===== STRING CONVERSION =====
        String str = d1.toString(); 
        // Double → String


        // ===== COMPARISON =====
        boolean equals = d1.equals(d2); 
        // Compares values

        int compareStatic = Double.compare(d1, d2); 
        // Static comparison

        int compareObj = d1.compareTo(d2); 
        // Object comparison


        // ===== TYPE CONVERSIONS =====
        byte toByte = d1.byteValue(); 
        // Double → byte (data loss possible)

        short toShort = d1.shortValue(); 
        // Double → short

        int toInt = d1.intValue(); 
        // Double → int (fraction lost)

        long toLong = d1.longValue(); 
        // Double → long

        float toFloat = d1.floatValue(); 
        // Double → float (precision loss)

        double toDouble = d1.doubleValue(); 
        // Double → double


        // ===== DOUBLE ↔ CHAR CONVERSION =====
        char toChar = (char) d1.intValue(); 
        // double → int → char (Unicode mapping)

        int charToInt = (int) 'A'; 
        // char → ASCII integer value

        double charToDouble = (double) charToInt; 
        // int → double


        // ===== DOUBLE → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (d1 != 0.0); 
        // Non-zero = true, zero = false


        // ===== SPECIAL DOUBLE METHODS =====
        boolean isNaN = Double.isNaN(d1); 
        // Checks if value is NaN

        boolean isInfinite = Double.isInfinite(d1); 
        // Checks if value is infinite

        boolean isFinite = Double.isFinite(d1); 
        // Checks if value is finite (not NaN or infinity)


        // ===== UTILITY METHODS =====
        double sum = Double.sum(10.5, 20.5); 
        // Adds two double values

        double maxVal = Double.max(10.5, 20.5); 
        // Returns maximum value

        double minVal = Double.min(10.5, 20.5); 
        // Returns minimum value


        // ===== HASHCODE =====
        int hash = d1.hashCode(); 
        // Returns hash code of Double object


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
        System.out.println(charToDouble);
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