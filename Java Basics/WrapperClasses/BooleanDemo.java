public class BooleanDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Boolean b1 = Boolean.valueOf(true); 
        // Creates Boolean object from primitive boolean

        Boolean b2 = false; 
        // Autoboxing: boolean → Boolean


        // ===== PARSING =====
        boolean parsed = Boolean.parseBoolean("true"); 
        // Converts String → boolean (true if "true", else false)


        // ===== VALUE OF STRING =====
        Boolean fromString = Boolean.valueOf("false"); 
        // Converts String → Boolean object


        // ===== UNBOXING =====
        boolean unboxed = b1; 
        // Converts Boolean → primitive boolean


        // ===== CONSTANTS =====
        boolean trueConst = Boolean.TRUE; 
        // Constant true value

        boolean falseConst = Boolean.FALSE; 
        // Constant false value


        // ===== STRING CONVERSION =====
        String str = b1.toString(); 
        // Boolean → String


        // ===== COMPARISON =====
        boolean equals = b1.equals(b2); 
        // Compares values

        int compareStatic = Boolean.compare(b1, b2); 
        // Static comparison (true > false)

        int compareObj = b1.compareTo(b2); 
        // Object comparison


        // ===== BOOLEAN → NUMERIC (CUSTOM LOGIC) =====
        int toInt = (b1) ? 1 : 0; 
        // true → 1, false → 0

        double toDouble = (b1) ? 1.0 : 0.0; 
        // true → 1.0, false → 0.0


        // ===== BOOLEAN → CHAR (CUSTOM LOGIC) =====
        char toChar = (b1) ? 'T' : 'F'; 
        // true → 'T', false → 'F'


        // ===== LOGICAL OPERATIONS =====
        boolean andResult = Boolean.logicalAnd(true, false); 
        // Logical AND

        boolean orResult = Boolean.logicalOr(true, false); 
        // Logical OR

        boolean xorResult = Boolean.logicalXor(true, false); 
        // Logical XOR


        // ===== HASHCODE =====
        int hash = b1.hashCode(); 
        // Returns hash code of Boolean object


        // ===== PRINT OUTPUT =====
        System.out.println(parsed);
        System.out.println(fromString);
        System.out.println(unboxed);
        System.out.println(trueConst);
        System.out.println(falseConst);
        System.out.println(str);
        System.out.println(equals);
        System.out.println(compareStatic);
        System.out.println(compareObj);
        System.out.println(toInt);
        System.out.println(toDouble);
        System.out.println(toChar);
        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(xorResult);
        System.out.println(hash);
    }
}