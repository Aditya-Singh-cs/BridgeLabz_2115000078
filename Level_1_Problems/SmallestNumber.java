import java.util.*;
class SmallestNumber{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int number1 = input.nextInt();
      System.out.print("Enter the second number: ");
      int number2 = input.nextInt();
      System.out.print("Enter the third number: ");
      int number3 = input.nextInt();
      boolean isSmallest = (number1 < number2) && (number1 < number3);
      System.out.println("Is the first number the smallest? " + (isSmallest ? "Yes" : "No"));
   }
}
