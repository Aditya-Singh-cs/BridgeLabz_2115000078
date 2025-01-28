import java.util.*;
class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
        int number = input.nextInt();
	System.out.println("Enter the divisor");
        int divisor = input.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
