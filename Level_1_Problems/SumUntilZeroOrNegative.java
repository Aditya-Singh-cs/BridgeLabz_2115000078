import java.util.*;
class SumUntilZeroOrNegative {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double total = 0.0;
      double number;
      while (true) {
         System.out.print("Enter a number: ");
         number = input.nextDouble();
         if (number <= 0) {
            break;
         }
         total += number;
      }
      System.out.println("The total sum is: " + total);
   }
}
