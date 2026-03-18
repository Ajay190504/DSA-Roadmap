public class WhileLoopAllCases {

    public static void main(String[] args) {

        // -------------------------------------------------
        // 1. Basic while loop
        // -------------------------------------------------
        System.out.println("1. Basic while loop");

        int i = 1;

        while(i <= 5) {
            System.out.println(i);
            i++;
        }



        // -------------------------------------------------
        // 2. Decrementing while loop
        // -------------------------------------------------
        System.out.println("\n2. Decrementing loop");

        int j = 5;

        while(j >= 1) {
            System.out.println(j);
            j--;
        }



        // -------------------------------------------------
        // 3. Step increment
        // -------------------------------------------------
        System.out.println("\n3. Step increment");

        int k = 0;

        while(k <= 10) {
            System.out.println(k);
            k += 2;
        }



        // -------------------------------------------------
        // 4. Multiple variables
        // -------------------------------------------------
        System.out.println("\n4. Multiple variables");

        int a = 1;
        int b = 10;

        while(a <= 5) {
            System.out.println("a = " + a + " b = " + b);
            a++;
            b--;
        }



        // -------------------------------------------------
        // 5. Infinite loop (condition always true)
        // -------------------------------------------------
        System.out.println("\n5. Condition always true");

        int x = 1;

        while(x >= 0) {

            System.out.println(x);
            x++;

            if(x == 5)
                break;
        }



        // -------------------------------------------------
        // 6. Missing update (causes infinite loop)
        // -------------------------------------------------
        System.out.println("\n6. Missing update");

        int y = 1;

        while(y <= 5) {

            System.out.println(y);

            break; // without update infinite
        }



        // -------------------------------------------------
        // 7. Boolean true condition
        // -------------------------------------------------
        System.out.println("\n7. Boolean true condition");

        int count = 1;

        while(true) {

            System.out.println(count);

            if(count == 4)
                break;

            count++;
        }



        // -------------------------------------------------
        // 8. Initialization problem
        // -------------------------------------------------
        System.out.println("\n8. Initialization issue");

        int z = -5;

        while(z < 100) {

            System.out.println(z);
            z--;

            if(z == -10)
                break;
        }



        // -------------------------------------------------
        // 9. Nested while loop
        // -------------------------------------------------
        System.out.println("\n9. Nested while loop");

        int r = 1;

        while(r <= 3) {

            int c = 1;

            while(c <= 3) {
                System.out.print("* ");
                c++;
            }

            System.out.println();
            r++;
        }



        // -------------------------------------------------
        // 10. Break example
        // -------------------------------------------------
        System.out.println("\n10. Break example");

        int n = 1;

        while(n <= 10) {

            if(n == 5)
                break;

            System.out.println(n);
            n++;
        }



        // -------------------------------------------------
        // 11. Continue example
        // -------------------------------------------------
        System.out.println("\n11. Continue example");

        int m = 0;

        while(m <= 10) {

            m++;

            if(m % 2 == 0)
                continue;

            System.out.println(m);
        }



        // -------------------------------------------------
        // 12. Labelled break with nested loops
        // -------------------------------------------------
        System.out.println("\n12. Labelled break");

        int p = 1;

        outer:

        while(p <= 3) {

            int q = 1;

            while(q <= 3) {

                if(p == 2 && q == 2)
                    break outer;

                System.out.println(p + " " + q);
                q++;
            }

            p++;
        }

    }
}