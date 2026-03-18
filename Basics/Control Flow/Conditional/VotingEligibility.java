import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String citizen = sc.next();

        if(age >= 18 && citizen.equals("yes"))
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");

        // Input: 20 yes
        // Output: Eligible to vote
    }
}