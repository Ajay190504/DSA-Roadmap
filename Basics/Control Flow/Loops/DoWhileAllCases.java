public class DoWhileAllCases {

    public static void main(String[] args) {

        // -------------------------------------------------
        // 1. Basic do-while loop
        // executes at least once
        // -------------------------------------------------
        System.out.println("1. Basic do-while loop");

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i <= 5);



        // -------------------------------------------------
        // 2. Decrementing loop
        // reverse counting
        // -------------------------------------------------
        System.out.println("\n2. Decrementing loop");

        int j = 5;

        do {
            System.out.println(j);
            j--;
        } while(j >= 1);



        // -------------------------------------------------
        // 3. Step increment
        // increment by more than 1
        // -------------------------------------------------
        System.out.println("\n3. Step increment");

        int k = 0;

        do {
            System.out.println(k);
            k += 2;
        } while(k <= 10);



        // -------------------------------------------------
        // 4. Multiple variables
        // manual control of variables
        // -------------------------------------------------
        System.out.println("\n4. Multiple variables");

        int a = 1;
        int b = 10;

        do {
            System.out.println("a = " + a + " b = " + b);
            a++;
            b--;
        } while(a <= 5);



        // -------------------------------------------------
        // 5. Loop runs once even if condition false
        // special behavior of do-while
        // -------------------------------------------------
        System.out.println("\n5. Condition false initially");

        int x = 10;

        do {
            System.out.println("Runs once even though condition false");
        } while(x < 5);



        // -------------------------------------------------
        // 6. Infinite loop (condition always true)
        // -------------------------------------------------
        System.out.println("\n6. Infinite style loop");

        int y = 1;

        do {

            System.out.println(y);
            y++;

            if(y == 5)
                break;

        } while(y >= 0);



        // -------------------------------------------------
        // 7. Boolean true condition
        // -------------------------------------------------
        System.out.println("\n7. Boolean true condition");

        int count = 1;

        do {

            System.out.println(count);

            if(count == 4)
                break;

            count++;

        } while(true);



        // -------------------------------------------------
        // 8. Missing update (can cause infinite loop)
        // -------------------------------------------------
        System.out.println("\n8. Missing update");

        int z = 1;

        do {

            System.out.println(z);

            break; // without update infinite

        } while(z <= 5);



        // -------------------------------------------------
        // 9. Nested do-while loops
        // -------------------------------------------------
        System.out.println("\n9. Nested do-while");

        int r = 1;

        do {

            int c = 1;

            do {
                System.out.print("* ");
                c++;
            } while(c <= 3);

            System.out.println();

            r++;

        } while(r <= 3);



        // -------------------------------------------------
        // 10. Break example
        // -------------------------------------------------
        System.out.println("\n10. Break example");

        int n = 1;

        do {

            if(n == 5)
                break;

            System.out.println(n);
            n++;

        } while(n <= 10);



        // -------------------------------------------------
        // 11. Continue example
        // -------------------------------------------------
        System.out.println("\n11. Continue example");

        int m = 0;

        do {

            m++;

            if(m % 2 == 0)
                continue;

            System.out.println(m);

        } while(m <= 10);



        // -------------------------------------------------
        // 12. Labelled break with nested loops
        // -------------------------------------------------
        System.out.println("\n12. Labelled break");

        int p = 1;

        outer:

        do {

            int q = 1;

            do {

                if(p == 2 && q == 2)
                    break outer;

                System.out.println(p + " " + q);

                q++;

            } while(q <= 3);

            p++;

        } while(p <= 3);

    }
}