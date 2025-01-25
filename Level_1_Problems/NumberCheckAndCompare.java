import java.util.*;
class NumberCheckAndCompare {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even");
                } else {
                    System.out.println(number + " is positive and odd");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative");
            } else {
                System.out.println(number + " is zero");
            }
        }
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last");
        } else {
            System.out.println("The first element is less than the last");
        }
    }
}

