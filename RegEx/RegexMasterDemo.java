import java.util.regex.*;

public class RegexMasterDemo {

    public static void main(String[] args) {

        // -----------------------------------------------------
        // 1. Only alphabets
        System.out.println("Only alphabets: " +
                "Java".matches("[a-zA-Z]+"));

        // -----------------------------------------------------
        // 2. Only digits
        System.out.println("Only digits: " +
                "12345".matches("\\d+"));

        // -----------------------------------------------------
        // 3. Alphanumeric
        System.out.println("Alphanumeric: " +
                "Java123".matches("[a-zA-Z0-9]+"));

        // -----------------------------------------------------
        // 4. String containing only lowercase
        System.out.println("Lowercase: " +
                "hello".matches("[a-z]+"));

        // -----------------------------------------------------
        // 5. String containing only uppercase
        System.out.println("Uppercase: " +
                "HELLO".matches("[A-Z]+"));

        // -----------------------------------------------------
        // 6. Check if string starts with specific word
        System.out.println("Starts with Java: " +
                "JavaProgramming".matches("^Java.*"));

        // -----------------------------------------------------
        // 7. Check if string ends with specific word
        System.out.println("Ends with Java: " +
                "LearnJava".matches(".*Java$"));

        // -----------------------------------------------------
        // 8. Word with exactly 5 characters
        System.out.println("5 characters: " +
                "Hello".matches(".{5}"));

        // -----------------------------------------------------
        // 9. Word length between 3 and 8
        System.out.println("3–8 characters: " +
                "JavaDev".matches(".{3,8}"));

        // -----------------------------------------------------
        // 10. Check whitespace
        System.out.println("Contains whitespace: " +
                " ".matches("\\s"));

        // -----------------------------------------------------
        // 11. Non whitespace
        System.out.println("Non whitespace: " +
                "A".matches("\\S"));

        // -----------------------------------------------------
        // 12. Optional character example
        System.out.println("Optional u: " +
                "color".matches("colou?r"));

        // -----------------------------------------------------
        // 13. Repetition example
        System.out.println("Repeated digits: " +
                "1111".matches("1+"));

        // -----------------------------------------------------
        // 14. Email validation
        String email = "user123@gmail.com";
        System.out.println("Valid Email: " +
                email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}"));

        // -----------------------------------------------------
        // 15. Mobile number validation (India 10 digits)
        String mobile = "9876543210";
        System.out.println("Valid Mobile: " +
                mobile.matches("[6-9]\\d{9}"));

        // -----------------------------------------------------
        // 16. Username validation (5–12 characters)
        String username = "user_123";
        System.out.println("Valid Username: " +
                username.matches("[a-zA-Z0-9_]{5,12}"));

        // -----------------------------------------------------
        // 17. Password validation
        String password = "Abc@1234";
        System.out.println("Valid Password: " +
                password.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{6,}"));

        // -----------------------------------------------------
        // 18. PAN card validation (India)
        String pan = "ABCDE1234F";
        System.out.println("Valid PAN: " +
                pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"));

        // -----------------------------------------------------
        // 19. Aadhaar number validation (12 digits)
        String aadhaar = "123412341234";
        System.out.println("Valid Aadhaar: " +
                aadhaar.matches("\\d{12}"));

        // -----------------------------------------------------
        // 20. Date validation (dd-mm-yyyy)
        String date = "25-12-2025";
        System.out.println("Valid Date: " +
                date.matches("\\d{2}-\\d{2}-\\d{4}"));

        // -----------------------------------------------------
        // 21. Time validation (HH:MM)
        String time = "23:45";
        System.out.println("Valid Time: " +
                time.matches("\\d{2}:\\d{2}"));

        // -----------------------------------------------------
        // 22. IP address validation
        String ip = "192.168.1.1";
        System.out.println("Valid IP: " +
                ip.matches("(\\d{1,3}\\.){3}\\d{1,3}"));

        // -----------------------------------------------------
        // 23. URL validation
        String url = "https://example.com";
        System.out.println("Valid URL: " +
                url.matches("https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}"));

        // -----------------------------------------------------
        // 24. Credit card pattern (16 digits)
        String card = "1234567812345678";
        System.out.println("Valid Card: " +
                card.matches("\\d{16}"));

        // -----------------------------------------------------
        // 25. Find numbers inside string using Pattern/Matcher
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("Order id 123 and product 456");

        System.out.println("Numbers found:");
        while (m.find()) {
            System.out.println(m.group());
        }

        // -----------------------------------------------------
        // 26. Alternation example
        System.out.println("Cat or Dog: " +
                "Dog".matches("Cat|Dog"));

        // -----------------------------------------------------
        // 27. Group repetition
        System.out.println("Repeated group: " +
                "ababab".matches("(ab)+"));

        // -----------------------------------------------------
        // 28. Remove digits from string
        String result = "Java123".replaceAll("\\d", "");
        System.out.println("Remove digits: " + result);

        // -----------------------------------------------------
        // 29. Remove spaces
        String noSpace = "Java Programming".replaceAll("\\s", "");
        System.out.println("Remove spaces: " + noSpace);

        // -----------------------------------------------------
        // 30. Extract words using Matcher
        Pattern wordPattern = Pattern.compile("[a-zA-Z]+");
        Matcher wordMatcher = wordPattern.matcher("Java 123 Programming 456");

        System.out.println("Words found:");
        while(wordMatcher.find()) {
            System.out.println(wordMatcher.group());
        }

    }
}