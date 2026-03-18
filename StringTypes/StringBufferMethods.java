public class StringBufferMethods {

    public static void main(String[] args) {

        // Creating StringBuffer objects
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("World");

        // -------------------------------------------------
        // 1. append() → Adds text at the end of the buffer
        sb.append(" Java");
        System.out.println("append(): " + sb);

        // -------------------------------------------------
        // 2. insert(index,value) → Inserts value at given index
        sb.insert(5, " Beautiful");
        System.out.println("insert(): " + sb);

        // -------------------------------------------------
        // 3. replace(start,end,string) → Replaces characters in range
        sb.replace(6, 15, "Amazing");
        System.out.println("replace(): " + sb);

        // -------------------------------------------------
        // 4. delete(start,end) → Deletes characters from start to end-1
        sb.delete(5, 13);
        System.out.println("delete(): " + sb);

        // -------------------------------------------------
        // 5. deleteCharAt(index) → Deletes character at specific index
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        // -------------------------------------------------
        // 6. reverse() → Reverses the sequence
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // Reverse again to restore
        sb.reverse();

        // -------------------------------------------------
        // 7. capacity() → Returns current buffer capacity
        System.out.println("capacity(): " + sb.capacity());

        // -------------------------------------------------
        // 8. length() → Returns number of characters present
        System.out.println("length(): " + sb.length());

        // -------------------------------------------------
        // 9. ensureCapacity(min) → Ensures minimum capacity
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sb.capacity());

        // -------------------------------------------------
        // 10. setLength(newLength) → Changes length of buffer
        sb.setLength(5);
        System.out.println("setLength(): " + sb);

        // -------------------------------------------------
        // 11. charAt(index) → Returns character at given index
        System.out.println("charAt(): " + sb.charAt(2));

        // -------------------------------------------------
        // 12. setCharAt(index,char) → Changes character at index
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt(): " + sb);

        // -------------------------------------------------
        // 13. substring(start) → Returns substring from index
        System.out.println("substring(start): " + sb.substring(1));

        // -------------------------------------------------
        // 14. substring(start,end) → Returns substring in range
        System.out.println("substring(start,end): " + sb.substring(1,4));

        // -------------------------------------------------
        // 15. indexOf(string) → Returns first index of substring
        sb.append(" World");
        System.out.println("indexOf(): " + sb.indexOf("World"));

        // -------------------------------------------------
        // 16. lastIndexOf(string) → Returns last occurrence
        sb.append(" World");
        System.out.println("lastIndexOf(): " + sb.lastIndexOf("World"));

        // -------------------------------------------------
        // 17. toString() → Converts StringBuffer to String
        String str = sb.toString();
        System.out.println("toString(): " + str);

        // -------------------------------------------------
        // 18. append different data types
        sb.append(100);     // integer
        sb.append(true);    // boolean
        sb.append('X');     // character
        System.out.println("append different types: " + sb);

        // -------------------------------------------------
        // 19. append another StringBuffer
        sb.append(sb2);
        System.out.println("append StringBuffer: " + sb);

    }
}