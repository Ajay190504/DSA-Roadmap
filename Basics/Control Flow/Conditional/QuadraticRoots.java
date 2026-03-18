public class QuadraticRoots {

    public static void main(String[] args) {

        double a = 1;
        double b = 5;
        double c = 6;

        double d = b*b - 4*a*c;

        if(d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2*a);
            double root2 = (-b - Math.sqrt(d)) / (2*a);

            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);

            // Output:
            // Root1 = -2.0
            // Root2 = -3.0
        }

        else if(d == 0) {
            double root = (-b) / (2*a);

            System.out.println("Root = " + root);

            // Example if a=1, b=2, c=1
            // Output:
            // Root = -1.0
        }

        else {
            double realPart = (-b) / (2*a);
            double imaginaryPart = Math.sqrt(-d) / (2*a);

            System.out.println("Root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginaryPart + "i");

            // Example if a=1, b=2, c=5
            // Output:
            // Root1 = -1.0 + 2.0i
            // Root2 = -1.0 - 2.0i
        }

    }
}