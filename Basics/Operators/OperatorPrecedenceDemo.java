public class OperatorPrecedenceDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 2;

        int result1 = a + b * c;
        System.out.println("Result1: " + result1); 
        // Output: 20  (b*c = 10, then a + 10 = 20)

        int result2 = (a + b) * c;
        System.out.println("Result2: " + result2);
        // Output: 30  ((a+b)=15, then 15*2=30)

        int result3 = a + b * c - b;
        System.out.println("Result3: " + result3);
        // Output: 15  (b*c=10 → a+10=20 → 20-b=15)

        int result4 = a / b + c * b;
        System.out.println("Result4: " + result4);
        // Output: 12  (a/b=2 → c*b=10 → 2+10=12)

        int result5 = a + ++c * b;
        System.out.println("Result5: " + result5);
        // Output: 25  (++c=3 → 3*5=15 → 10+15=25)

        boolean result6 = a > b && b > c;
        System.out.println("Result6: " + result6);
        // Output: true (10>5 and 5>3)

        boolean result7 = a > b || b < c;
        System.out.println("Result7: " + result7);
        // Output: true (first condition true so OR becomes true)

        boolean result8 = !(a < b);
        System.out.println("Result8: " + result8);
        // Output: true (a<b is false → !false = true)

        int result9 = a + b * c / 2;
        System.out.println("Result9: " + result9);
        // Output: 15 (b*c=10 → 10/2=5 → a+5=15)

        int result10 = (a + b) * (c + 1);
        System.out.println("Result10: " + result10);
        // Output: 60 ((10+5)=15 → (3+1)=4 → 15*4=60)

    }
}

/*
OPERATOR PRECEDENCE USED IN THIS PROGRAM (Highest to Lowest)

1. Unary Operators
   ++  --  !  

2. Multiplicative Operators
   *   /   %

3. Additive Operators
   +   -

4. Relational Operators
   >   <   >=   <=

5. Equality Operators
   ==   !=

6. Logical AND
   &&

7. Logical OR
   ||

8. Assignment
   =

NOTE:
Parentheses () always have the highest priority because they force
the expression inside them to execute first.
*/