import java.util.Scanner;

public class InterestCalculator {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        
        scanner.close();
        
        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
