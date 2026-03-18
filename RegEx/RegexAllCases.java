import java.util.regex.*;

public class RegexAllCases {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. Simple exact match
        String s1 = "Java";
        System.out.println("Exact match: " + s1.matches("Java"));

        // ----------------------------------------------------
        // 2. Dot (.) → matches any single character
        System.out.println("Dot operator: " + "cat".matches("c.t"));

        // ----------------------------------------------------
        // 3. Character class [abc] → matches any one character
        System.out.println("Character class: " + "a".matches("[abc]"));

        // ----------------------------------------------------
        // 4. Negated character class [^abc]
        System.out.println("Negated class: " + "d".matches("[^abc]"));

        // ----------------------------------------------------
        // 5. Range [a-z]
        System.out.println("Lowercase range: " + "g".matches("[a-z]"));

        // ----------------------------------------------------
        // 6. Range [A-Z]
        System.out.println("Uppercase range: " + "G".matches("[A-Z]"));

        // ----------------------------------------------------
        // 7. Range [0-9]
        System.out.println("Digit range: " + "5".matches("[0-9]"));

        // ----------------------------------------------------
        // 8. Combined ranges
        System.out.println("Alpha numeric: " + "A".matches("[a-zA-Z0-9]"));

        // ----------------------------------------------------
        // 9. Predefined class \d → digit
        System.out.println("Digit check: " + "7".matches("\\d"));

        // ----------------------------------------------------
        // 10. \D → non digit
        System.out.println("Non digit: " + "A".matches("\\D"));

        // ----------------------------------------------------
        // 11. \w → word character (a-z A-Z 0-9 _)
        System.out.println("Word char: " + "_".matches("\\w"));

        // ----------------------------------------------------
        // 12. \W → non word character
        System.out.println("Non word char: " + "#".matches("\\W"));

        // ----------------------------------------------------
        // 13. \s → whitespace
        System.out.println("Whitespace: " + " ".matches("\\s"));

        // ----------------------------------------------------
        // 14. \S → non whitespace
        System.out.println("Non whitespace: " + "A".matches("\\S"));

        // ----------------------------------------------------
        // 15. Quantifier ? → 0 or 1 occurrence
        System.out.println("Optional u: " + "color".matches("colou?r"));

        // ----------------------------------------------------
        // 16. Quantifier * → 0 or more
        System.out.println("Zero or more: " + "abbbb".matches("ab*"));

        // ----------------------------------------------------
        // 17. Quantifier + → 1 or more
        System.out.println("One or more: " + "abbbb".matches("ab+"));

        // ----------------------------------------------------
        // 18. Exact repetition {n}
        System.out.println("Exact 3 digits: " + "123".matches("\\d{3}"));

        // ----------------------------------------------------
        // 19. Range repetition {min,max}
        System.out.println("2 to 4 digits: " + "123".matches("\\d{2,4}"));

        // ----------------------------------------------------
        // 20. At least n {n,}
        System.out.println("At least 2 digits: " + "12345".matches("\\d{2,}"));

        // ----------------------------------------------------
        // 21. Anchor ^ → start of string
        System.out.println("Starts with Java: " + "JavaProgramming".matches("^Java.*"));

        // ----------------------------------------------------
        // 22. Anchor $ → end of string
        System.out.println("Ends with Java: " + "LearnJava".matches(".*Java$"));

        // ----------------------------------------------------
        // 23. Alternation | → OR condition
        System.out.println("Cat or Dog: " + "Dog".matches("Cat|Dog"));

        // ----------------------------------------------------
        // 24. Grouping ()
        System.out.println("Grouping example: " + "abab".matches("(ab)+"));

        // ----------------------------------------------------
        // 25. Email validation example
        String email = "test123@gmail.com";
        System.out.println("Email valid: " +
                email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}"));

        // ----------------------------------------------------
        // 26. Mobile number validation (10 digits)
        String mobile = "9876543210";
        System.out.println("Mobile valid: " + mobile.matches("\\d{10}"));

        // ----------------------------------------------------
        // 27. Username validation (5–12 characters)
        String username = "user_123";
        System.out.println("Username valid: " +
                username.matches("[a-zA-Z0-9_]{5,12}"));

        // ----------------------------------------------------
        // 28. Password validation
        String password = "Abc@1234";
        System.out.println("Password pattern: " +
                password.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$]).{6,}"));

        // ----------------------------------------------------
        // 29. Using Pattern and Matcher classes
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("Order number is 12345");

        System.out.println("Digits found using Matcher:");
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}