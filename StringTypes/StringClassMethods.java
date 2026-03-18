public class StringClassMethods {

    public static void main(String[] args) {

        // Base strings
        String str = "  Hello World  ";
        String str2 = "Java";
        String str3 = "hello world";

        // ---------------------------------------------------
        // 1. length() → Returns total number of characters
        System.out.println("Length: " + str.length());

        // ---------------------------------------------------
        // 2. charAt(index) → Returns character at given index
        System.out.println("Character at index 2: " + str.charAt(2));

        // ---------------------------------------------------
        // 3. toLowerCase() → Converts string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // ---------------------------------------------------
        // 4. toUpperCase() → Converts string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // ---------------------------------------------------
        // 5. trim() → Removes leading and trailing spaces
        System.out.println("Trimmed: '" + str.trim() + "'");

        // ---------------------------------------------------
        // 6. substring(start) → Returns substring from start index
        System.out.println("Substring from 2: " + str.substring(2));

        // ---------------------------------------------------
        // 7. substring(start,end) → Returns substring between indexes
        System.out.println("Substring (2,7): " + str.substring(2,7));

        // ---------------------------------------------------
        // 8. equals() → Compares content of two strings
        System.out.println("Equals: " + str2.equals("Java"));

        // ---------------------------------------------------
        // 9. equalsIgnoreCase() → Compares strings ignoring case
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str3));

        // ---------------------------------------------------
        // 10. compareTo() → Lexicographically compares two strings
        System.out.println("CompareTo: " + str2.compareTo("Cava"));

        // ---------------------------------------------------
        // 11. contains() → Checks if string contains given sequence
        System.out.println("Contains 'World': " + str.contains("World"));

        // ---------------------------------------------------
        // 12. startsWith() → Checks if string starts with given prefix
        System.out.println("Starts with '  He': " + str.startsWith("  He"));

        // ---------------------------------------------------
        // 13. endsWith() → Checks if string ends with given suffix
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  "));

        // ---------------------------------------------------
        // 14. indexOf() → Returns first index of given character/substring
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // ---------------------------------------------------
        // 15. lastIndexOf() → Returns last occurrence index
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // ---------------------------------------------------
        // 16. replace(old,new) → Replaces characters
        System.out.println("Replace l with x: " + str.replace('l','x'));

        // ---------------------------------------------------
        // 17. replaceAll(regex,new) → Replaces using regex
        System.out.println("Replace all spaces: " + str.replaceAll(" ", "_"));

        // ---------------------------------------------------
        // 18. concat() → Joins two strings
        System.out.println("Concat: " + str2.concat(" Programming"));

        // ---------------------------------------------------
        // 19. isEmpty() → Checks if string length is zero
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());

        // ---------------------------------------------------
        // 20. isBlank() → Checks if string contains only whitespace
        String blankStr = "   ";
        System.out.println("Is Blank: " + blankStr.isBlank());

        // ---------------------------------------------------
        // 21. toCharArray() → Converts string to character array
        char[] arr = str2.toCharArray();
        System.out.print("Char Array: ");
        for(char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ---------------------------------------------------
        // 22. split() → Splits string based on delimiter
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for(String w : words) {
            System.out.println(w);
        }

        // ---------------------------------------------------
        // 23. valueOf() → Converts other data types to string
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("String value of int: " + numStr);

        // ---------------------------------------------------
        // 24. intern() → Returns canonical representation from string pool
        String s1 = new String("test");
        String s2 = s1.intern();
        System.out.println("Intern example: " + (s2 == "test"));

        // ---------------------------------------------------
        // 25. matches(regex) → Checks if string matches regex
        System.out.println("Matches 'Hello.*': " + str.trim().matches("Hello.*"));

    }
}