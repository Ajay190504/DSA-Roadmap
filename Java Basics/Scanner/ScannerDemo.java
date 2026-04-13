import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        // ===== CREATION =====
        Scanner sc = new Scanner(System.in);
        // Creates Scanner object for console input


        // ===== BASIC INPUT METHODS =====
        System.out.print("Enter int: ");
        int intVal = sc.nextInt(); 
        // Reads integer

        System.out.print("Enter long: ");
        long longVal = sc.nextLong(); 
        // Reads long

        System.out.print("Enter float: ");
        float floatVal = sc.nextFloat(); 
        // Reads float

        System.out.print("Enter double: ");
        double doubleVal = sc.nextDouble(); 
        // Reads double

        System.out.print("Enter boolean: ");
        boolean boolVal = sc.nextBoolean(); 
        // Reads boolean

        System.out.print("Enter word: ");
        String word = sc.next(); 
        // Reads single word (until space)

        sc.nextLine(); 
        // Clears leftover newline from buffer

        System.out.print("Enter full line: ");
        String line = sc.nextLine(); 
        // Reads full line


        // ===== HAS METHODS (CHECK BEFORE READ) =====
        boolean hasInt = sc.hasNextInt(); 
        // Checks if next token is int

        boolean hasDouble = sc.hasNextDouble(); 
        // Checks if next token is double

        boolean hasNext = sc.hasNext(); 
        // Checks if any token exists

        boolean hasLine = sc.hasNextLine(); 
        // Checks if line exists


        // ===== DELIMITER =====
        Scanner sc2 = new Scanner("A,B,C");
        sc2.useDelimiter(","); 
        // Sets delimiter as comma

        String token1 = sc2.next(); 
        String token2 = sc2.next(); 
        String token3 = sc2.next(); 


        // ===== RADIX (NUMBER BASE) =====
        Scanner sc3 = new Scanner("1010");
        sc3.useRadix(2); 
        // Sets binary base

        int binaryValue = sc3.nextInt(); 
        // Reads binary → decimal


        // ===== LOCALE =====
        sc.useLocale(Locale.US); 
        // Sets locale for number parsing


        // ===== FIND METHODS (REGEX) =====
        Scanner sc4 = new Scanner("Java 123 Python 456");

        String foundWord = sc4.findInLine("[A-Za-z]+"); 
        // Finds first word using regex

        String skippedDigits = null;
        sc4.skip("\\d+"); 
        // Skips digits (regex)


        // ===== MATCH RESULT =====
        Scanner sc5 = new Scanner("ABC123");

        sc5.findInLine("[A-Z]+"); 
        String match = sc5.match().group(); 
        // Gets last matched result


        // ===== ITERATION =====
        Scanner sc6 = new Scanner("1 2 3 4");

        while (sc6.hasNextInt()) {
            int num = sc6.nextInt(); 
            // Reads numbers one by one
            System.out.println("Iterated: " + num);
        }


        // ===== IO EXCEPTION CHECK =====
        Exception ex = sc.ioException(); 
        // Returns last IO exception (if any)


        // ===== RESET =====
        sc.reset(); 
        // Resets delimiter, radix, locale


        // ===== CLOSE =====
        sc.close(); 
        // Closes scanner (important to avoid resource leak)


        // ===== PRINT OUTPUT =====
        System.out.println(intVal);
        System.out.println(longVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(boolVal);
        System.out.println(word);
        System.out.println(line);
        System.out.println(hasInt);
        System.out.println(hasDouble);
        System.out.println(hasNext);
        System.out.println(hasLine);
        System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);
        System.out.println(binaryValue);
        System.out.println(foundWord);
        System.out.println(match);
        System.out.println(ex);
    }
}