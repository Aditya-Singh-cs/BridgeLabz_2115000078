import java.util.*;
class GCDAndLCM {
    // Method to calculate GCD using the Euclidean algorithm
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        GCDAndLCM obj = new GCDAndLCM();
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int gcd = obj.findGCD(num1, num2);
        int lcm = obj.findLCM(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
