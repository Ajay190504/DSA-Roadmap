public class CharacterDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Character c1 = Character.valueOf('A'); 
        // Creates Character object from primitive char

        Character c2 = 'b'; 
        // Autoboxing: char → Character


        // ===== UNBOXING =====
        char unboxed = c1; 
        // Converts Character → primitive char


        // ===== CONSTANTS =====
        int minCode = Character.MIN_VALUE; 
        // Minimum Unicode value (0)

        int maxCode = Character.MAX_VALUE; 
        // Maximum Unicode value (65535)

        int size = Character.SIZE; 
        // Size in bits (16)

        int bytes = Character.BYTES; 
        // Size in bytes (2)


        // ===== STRING CONVERSION =====
        String str = c1.toString(); 
        // Character → String


        // ===== COMPARISON =====
        boolean equals = c1.equals(c2); 
        // Compares values

        int compareStatic = Character.compare(c1, c2); 
        // Static comparison

        int compareObj = c1.compareTo(c2); 
        // Object comparison


        // ===== CHARACTER CLASSIFICATION =====
        boolean isLetter = Character.isLetter(c1); 
        // Checks if character is a letter

        boolean isDigit = Character.isDigit(c1); 
        // Checks if character is a digit

        boolean isWhitespace = Character.isWhitespace(c1); 
        // Checks whitespace

        boolean isUpper = Character.isUpperCase(c1); 
        // Checks uppercase

        boolean isLower = Character.isLowerCase(c2); 
        // Checks lowercase

        boolean isLetterOrDigit = Character.isLetterOrDigit(c1); 
        // Checks if letter or digit

        boolean isAlphabetic = Character.isAlphabetic(c1); 
        // Checks alphabetic character

        boolean isDefined = Character.isDefined(c1); 
        // Checks if defined in Unicode


        // ===== CASE CONVERSION =====
        char toLower = Character.toLowerCase(c1); 
        // Converts to lowercase

        char toUpper = Character.toUpperCase(c2); 
        // Converts to uppercase

        char toTitle = Character.toTitleCase(c2); 
        // Converts to title case


        // ===== NUMERIC CONVERSION =====
        int numericValue = Character.getNumericValue('9'); 
        // Converts char digit → int (9)

        int charToInt = (int) c1; 
        // char → ASCII/Unicode integer value

        Character intToChar = (char) 66; 
        // int → Character ('B')


        // ===== CHARACTER → BOOLEAN (CUSTOM LOGIC) =====
        boolean toBoolean = (c1 != '\0'); 
        // Non-null character = true


        // ===== HASHCODE =====
        int hash = c1.hashCode(); 
        // Returns hash code


        // ===== PRINT OUTPUT =====
        System.out.println(unboxed);
        System.out.println(minCode);
        System.out.println(maxCode);
        System.out.println(size);
        System.out.println(bytes);
        System.out.println(str);
        System.out.println(equals);
        System.out.println(compareStatic);
        System.out.println(compareObj);
        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isWhitespace);
        System.out.println(isUpper);
        System.out.println(isLower);
        System.out.println(isLetterOrDigit);
        System.out.println(isAlphabetic);
        System.out.println(isDefined);
        System.out.println(toLower);
        System.out.println(toUpper);
        System.out.println(toTitle);
        System.out.println(numericValue);
        System.out.println(charToInt);
        System.out.println(intToChar);
        System.out.println(toBoolean);
        System.out.println(hash);
    }
}