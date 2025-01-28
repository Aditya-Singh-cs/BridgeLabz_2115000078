import java.util.*;
class SumOfNaturalNumbers {
    public static int findSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Sum of " + number + " natural numbers: " + findSum(number));
        } else {
            System.out.println("Enter a positive number.");
        }
    }
}
