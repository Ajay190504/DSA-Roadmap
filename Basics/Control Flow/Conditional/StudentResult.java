import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        if(m1 < 35 || m2 < 35 || m3 < 35)
            System.out.println("Fail");
        else if(avg >= 75)
            System.out.println("Distinction");
        else if(avg >= 60)
            System.out.println("First Class");
        else
            System.out.println("Pass");

        // Input: 80 75 90
        // Output: Distinction
    }
}