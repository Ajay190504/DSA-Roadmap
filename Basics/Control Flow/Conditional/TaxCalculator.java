import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax;

        if(income <= 250000)
            tax = 0;
        else if(income <= 500000)
            tax = income * 0.05;
        else if(income <= 1000000)
            tax = income * 0.20;
        else
            tax = income * 0.30;

        System.out.println("Tax: " + tax);

        // Input: 600000
        // Output: Tax: 120000.0
    }
}