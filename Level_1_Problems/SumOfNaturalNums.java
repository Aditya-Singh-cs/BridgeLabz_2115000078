import java.util.*;
class SumOfNaturalNums {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      int n = input.nextInt();
      if (n > 0) {
         int sumForLoop = 0;
         for (int i = 1; i <= n; i++) {
            sumForLoop += i;
         }
         int sumFormula = n * (n + 1) / 2;
         System.out.println("Sum using for loop: " + sumForLoop);
         System.out.println("Sum using formula: " + sumFormula);
         if (sumForLoop == sumFormula) {
            System.out.println("Both computations are correct.");
         } else {
            System.out.println("The computations do not match.");
         }
      } else {
         System.out.println(n + " is not a natural number.");
      }
   }
}
