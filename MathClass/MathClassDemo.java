public class MathClassAllMethods {

    public static void main(String[] args) {

        constants();
        basicOperations();
        powerAndRoots();
        roundingFunctions();
        randomNumbers();
        logarithmicFunctions();
        trigonometricFunctions();
        angleConversions();
        floatingPointUtilities();
        exactArithmetic();
    }

    // 1. Constants
    static void constants() {
        System.out.println("\n--- CONSTANTS ---");

        System.out.println("PI = " + Math.PI); // PI - ratio of circle circumference to diameter
        System.out.println("E = " + Math.E);   // E - Euler's number used in exponential calculations
    }

    // 2. Basic numeric operations
    static void basicOperations() {
        System.out.println("\n--- BASIC OPERATIONS ---");

        System.out.println("abs(-10) = " + Math.abs(-10)); // abs() - returns absolute value
        System.out.println("max(10,20) = " + Math.max(10,20)); // max() - returns larger number
        System.out.println("min(10,20) = " + Math.min(10,20)); // min() - returns smaller number
        System.out.println("signum(-5) = " + Math.signum(-5)); // signum() - returns sign (-1,0,1)
    }

    // 3. Power and root functions
    static void powerAndRoots() {
        System.out.println("\n--- POWER AND ROOT FUNCTIONS ---");

        System.out.println("pow(2,3) = " + Math.pow(2,3)); // pow(a,b) - a raised to power b
        System.out.println("sqrt(25) = " + Math.sqrt(25)); // sqrt(x) - square root of x
        System.out.println("cbrt(27) = " + Math.cbrt(27)); // cbrt(x) - cube root of x
        System.out.println("hypot(3,4) = " + Math.hypot(3,4)); // hypot(x,y) - sqrt(x² + y²)
    }

    // 4. Rounding functions
    static void roundingFunctions() {
        System.out.println("\n--- ROUNDING FUNCTIONS ---");

        System.out.println("ceil(5.2) = " + Math.ceil(5.2)); // ceil() - smallest integer >= value
        System.out.println("floor(5.8) = " + Math.floor(5.8)); // floor() - largest integer <= value
        System.out.println("round(5.6) = " + Math.round(5.6)); // round() - nearest integer
        System.out.println("rint(5.6) = " + Math.rint(5.6)); // rint() - nearest double integer
    }

    // 5. Random numbers
    static void randomNumbers() {
        System.out.println("\n--- RANDOM NUMBER ---");

        System.out.println("random() = " + Math.random()); // random() - returns number between 0.0 and 1.0
    }

    // 6. Logarithmic and exponential functions
    static void logarithmicFunctions() {
        System.out.println("\n--- LOGARITHMIC FUNCTIONS ---");

        System.out.println("exp(2) = " + Math.exp(2)); // exp(x) - e raised to power x
        System.out.println("log(10) = " + Math.log(10)); // log(x) - natural logarithm (base e)
        System.out.println("log10(100) = " + Math.log10(100)); // log10(x) - base 10 logarithm
        System.out.println("log1p(5) = " + Math.log1p(5)); // log1p(x) - log(1 + x)
    }

    // 7. Trigonometric functions
    static void trigonometricFunctions() {
        System.out.println("\n--- TRIGONOMETRIC FUNCTIONS ---");

        System.out.println("sin(90) = " + Math.sin(Math.toRadians(90))); // sin() - sine of angle
        System.out.println("cos(0) = " + Math.cos(Math.toRadians(0))); // cos() - cosine of angle
        System.out.println("tan(45) = " + Math.tan(Math.toRadians(45))); // tan() - tangent of angle
        System.out.println("asin(1) = " + Math.asin(1)); // asin() - inverse sine
        System.out.println("acos(1) = " + Math.acos(1)); // acos() - inverse cosine
        System.out.println("atan(1) = " + Math.atan(1)); // atan() - inverse tangent
        System.out.println("atan2(4,3) = " + Math.atan2(4,3)); // atan2(y,x) - angle from coordinates
    }

    // 8. Angle conversions
    static void angleConversions() {
        System.out.println("\n--- ANGLE CONVERSIONS ---");

        System.out.println("toRadians(180) = " + Math.toRadians(180)); // converts degrees to radians
        System.out.println("toDegrees(PI) = " + Math.toDegrees(Math.PI)); // converts radians to degrees
    }

    // 9. Floating point utility methods
    static void floatingPointUtilities() {
        System.out.println("\n--- FLOATING POINT UTILITIES ---");

        System.out.println("copySign(5,-3) = " + Math.copySign(5,-3)); // copy sign of second number
        System.out.println("getExponent(16.0) = " + Math.getExponent(16.0)); // returns exponent
        System.out.println("nextUp(5.0) = " + Math.nextUp(5.0)); // next larger floating value
        System.out.println("nextDown(5.0) = " + Math.nextDown(5.0)); // next smaller floating value
        System.out.println("ulp(5.0) = " + Math.ulp(5.0)); // distance to next floating value
    }

    // 10. Exact arithmetic methods
    static void exactArithmetic() {
        System.out.println("\n--- EXACT ARITHMETIC ---");

        System.out.println("addExact(10,20) = " + Math.addExact(10,20)); // exact addition
        System.out.println("subtractExact(20,5) = " + Math.subtractExact(20,5)); // exact subtraction
        System.out.println("multiplyExact(3,4) = " + Math.multiplyExact(3,4)); // exact multiplication
        System.out.println("incrementExact(9) = " + Math.incrementExact(9)); // adds 1
        System.out.println("decrementExact(9) = " + Math.decrementExact(9)); // subtracts 1
        System.out.println("negateExact(9) = " + Math.negateExact(9)); // changes sign
        System.out.println("toIntExact(100L) = " + Math.toIntExact(100L)); // long to int conversion
    }
}