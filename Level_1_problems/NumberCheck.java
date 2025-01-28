import java.util.*;
class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; // Positive number
        } else if (num < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }
}
