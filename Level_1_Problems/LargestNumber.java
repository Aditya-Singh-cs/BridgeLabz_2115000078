import java.util.*;
class LargestNumber{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int number1 = input.nextInt();
      System.out.print("Enter the second number: ");
      int number2 = input.nextInt();
      System.out.print("Enter the third number: ");
      int number3 = input.nextInt();
      boolean isFirstLargest = (number1 > number2) && (number1 > number3);
      boolean isSecondLargest = (number2 > number1) && (number2 > number3);
      boolean isThirdLargest = (number3 > number1) && (number3 > number2);
      System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
      System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
      System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
   }
}
