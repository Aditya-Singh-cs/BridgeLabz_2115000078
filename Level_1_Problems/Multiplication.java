import java.util.*;
class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] multiplicationResult = new int[4];
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
