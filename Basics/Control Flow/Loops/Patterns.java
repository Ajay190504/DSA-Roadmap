public class Patterns {

    public static void main(String[] args) {

        int n = 5;

        // -------------------------------------------------
        // 1. Square Star Pattern
        // -------------------------------------------------
        System.out.println("1. Square Pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        */


        // -------------------------------------------------
        // 2. Right Triangle
        // -------------------------------------------------
        System.out.println("\n2. Right Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */


        // -------------------------------------------------
        // 3. Inverted Triangle
        // -------------------------------------------------
        System.out.println("\n3. Inverted Triangle");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
        * * * * *
        * * * *
        * * *
        * *
        *
        */


        // -------------------------------------------------
        // 4. Right Aligned Triangle
        // -------------------------------------------------
        System.out.println("\n4. Right Aligned Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
                *
              * *
            * * *
          * * * *
        * * * * *
        */


        // -------------------------------------------------
        // 5. Pyramid
        // -------------------------------------------------
        System.out.println("\n5. Pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
            *
           * *
          * * *
         * * * *
        * * * * *
        */


        // -------------------------------------------------
        // 6. Inverted Pyramid
        // -------------------------------------------------
        System.out.println("\n6. Inverted Pyramid");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
        * * * * *
         * * * *
          * * *
           * *
            *
        */


        // -------------------------------------------------
        // 7. Diamond Pattern
        // -------------------------------------------------
        System.out.println("\n7. Diamond");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
        */


        // -------------------------------------------------
        // 8. Number Triangle
        // -------------------------------------------------
        System.out.println("\n8. Number Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */


        // -------------------------------------------------
        // 9. Same Number Pattern
        // -------------------------------------------------
        System.out.println("\n9. Same Number Pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
        /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        */


        // -------------------------------------------------
        // 10. Floyd Triangle
        // -------------------------------------------------
        System.out.println("\n10. Floyd Triangle");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(num++ +" ");
            System.out.println();
        }
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */


        // -------------------------------------------------
        // 11. Continuous Numbers
        // -------------------------------------------------
        System.out.println("\n11. Continuous Numbers");
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print(k++ +" ");
            System.out.println();
        }
        /*
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25
        */


        // -------------------------------------------------
        // 12. Alphabet Triangle
        // -------------------------------------------------
        System.out.println("\n12. Alphabet Triangle");
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++)
                System.out.print(ch++ +" ");
            System.out.println();
        }
        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        */


        // -------------------------------------------------
        // 13. Continuous Alphabet
        // -------------------------------------------------
        System.out.println("\n13. Continuous Alphabet");
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(ch++ +" ");
            System.out.println();
        }
        /*
        A
        B C
        D E F
        G H I J
        K L M N O
        */


        // -------------------------------------------------
        // 14. Same Character Pattern
        // -------------------------------------------------
        System.out.println("\n14. Same Character Pattern");
        for(int i=1;i<=n;i++){
            char c=(char)('A'+i-1);
            for(int j=1;j<=i;j++)
                System.out.print(c+" ");
            System.out.println();
        }
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        */


        // -------------------------------------------------
        // 15. Reverse Alphabet Triangle
        // -------------------------------------------------
        System.out.println("\n15. Reverse Alphabet");
        for(int i=n;i>=1;i--){
            char c='A';
            for(int j=1;j<=i;j++)
                System.out.print(c++ +" ");
            System.out.println();
        }
        /*
        A B C D E
        A B C D
        A B C
        A B
        A
        */


        // -------------------------------------------------
        // 16. Hollow Square
        // -------------------------------------------------
        System.out.println("\n16. Hollow Square");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        /*
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
        */


        // -------------------------------------------------
        // 17. Hollow Triangle
        // -------------------------------------------------
        System.out.println("\n17. Hollow Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        /*
        *
        * *
        *   *
        *     *
        * * * * *
        */


        // -------------------------------------------------
        // 18. Pascal Style Pattern
        // -------------------------------------------------
        System.out.println("\n18. Pascal Pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
        */


        // -------------------------------------------------
        // 19. Checker Pattern
        // -------------------------------------------------
        System.out.println("\n19. Checker Pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        /*
        *   *   *
          *   *
        *   *   *
          *   *
        *   *   *
        */


        // -------------------------------------------------
        // 20. Alphabet Square
        // -------------------------------------------------
        System.out.println("\n20. Alphabet Square");
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=n;j++)
                System.out.print(c++ +" ");
            System.out.println();
        }
        /*
        A B C D E
        A B C D E
        A B C D E
        A B C D E
        A B C D E
        */

    }
}