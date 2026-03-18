public class ForLoopAllCases {

    public static void main(String[] args) {

        // -------------------------------------------------
        // 1. Basic for loop
        // -------------------------------------------------
        System.out.println("1. Basic for loop");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // -------------------------------------------------
        // 2. Decrementing loop
        // -------------------------------------------------
        System.out.println("\n2. Decrementing loop");
        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }


        // -------------------------------------------------
        // 3. Step increment
        // -------------------------------------------------
        System.out.println("\n3. Step increment");
        for(int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }


        // -------------------------------------------------
        // 4. Multiple variables initialization
        // -------------------------------------------------
        System.out.println("\n4. Multiple variables");
        for(int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println("i = " + i + " j = " + j);
        }


        // -------------------------------------------------
        // 5. Missing initialization
        // -------------------------------------------------
        System.out.println("\n5. Missing initialization");
        int i = 1;
        for(; i <= 5; i++) {
            System.out.println(i);
        }


        // -------------------------------------------------
        // 6. Missing update (update inside loop)
        // -------------------------------------------------
        System.out.println("\n6. Missing update");
        for(int x = 1; x <= 5;) {
            System.out.println(x);
            x++;
        }


        // -------------------------------------------------
        // 7. Missing condition
        // -------------------------------------------------
        System.out.println("\n7. Missing condition");

        int y = 1;
        for( ; ; y++) {

            if(y == 5)
                break;

            System.out.println(y);
        }


        // -------------------------------------------------
        // 8. Infinite loop (all parts missing)
        // -------------------------------------------------
        System.out.println("\n8. Infinite loop (controlled)");

        int count = 0;

        for(;;) {

            System.out.println("Running...");

            count++;

            if(count == 3)
                break;
        }


        // -------------------------------------------------
        // 9. Condition always true (infinite style)
        // -------------------------------------------------
        System.out.println("\n9. Condition always true");

        for(int a = 1; a >= 0; a++) {

            System.out.println(a);

            if(a == 5)
                break;
        }


        // -------------------------------------------------
        // 10. Wrong update direction
        // -------------------------------------------------
        System.out.println("\n10. Wrong update direction");

        for(int b = 1; b <= 5; b--) {

            System.out.println(b);

            if(b == -3)
                break;
        }


        // -------------------------------------------------
        // 11. Boolean condition always true
        // -------------------------------------------------
        System.out.println("\n11. Boolean true condition");

        for(int n = 1; true; n++) {

            System.out.println(n);

            if(n == 4)
                break;
        }


        // -------------------------------------------------
        // 12. Initialization problem
        // -------------------------------------------------
        System.out.println("\n12. Initialization problem");

        for(int z = -5; z < 100; z--) {

            System.out.println(z);

            if(z == -10)
                break;
        }


        // -------------------------------------------------
        // 13. Multiple variables but one not updated
        // -------------------------------------------------
        System.out.println("\n13. Multiple variables issue");

        for(int p = 1, q = 5; p < q; p++) {

            System.out.println(p + " " + q);

            if(p == 3)
                break;
        }


        // -------------------------------------------------
        // 14. Nested for loop
        // -------------------------------------------------
        System.out.println("\n14. Nested for loop");

        for(int r = 1; r <= 3; r++) {

            for(int c = 1; c <= 3; c++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // -------------------------------------------------
        // 15. Break example
        // -------------------------------------------------
        System.out.println("\n15. Break example");

        for(int k = 1; k <= 10; k++) {

            if(k == 5)
                break;

            System.out.println(k);
        }


        // -------------------------------------------------
        // 16. Continue example
        // -------------------------------------------------
        System.out.println("\n16. Continue example");

        for(int k = 1; k <= 10; k++) {

            if(k % 2 == 0)
                continue;

            System.out.println(k);
        }


        // -------------------------------------------------
        // 17. Enhanced for loop (for-each)
        // -------------------------------------------------
        System.out.println("\n17. Enhanced for loop");

        int[] arr = {10,20,30,40};

        for(int num : arr) {
            System.out.println(num);
        }


        // -------------------------------------------------
        // 18. Labelled break
        // -------------------------------------------------
        System.out.println("\n18. Labelled break");

        outer:
        for(int m = 1; m <= 3; m++) {

            for(int n = 1; n <= 3; n++) {

                if(m == 2 && n == 2)
                    break outer;

                System.out.println(m + " " + n);
            }
        }

    }
}