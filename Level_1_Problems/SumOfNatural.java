import java.util.*;
class SumOfNatural {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      int n = input.nextInt();
      if (n > 0) {
         int sumWhileLoop = 0;
         int i = 1;
         while (i <= n) {
            sumWhileLoop += i;
            i++;
         }
         int sumFormula = n * (n + 1) / 2;
         System.out.println("Sum using while loop: " + sumWhileLoop);
         System.out.println("Sum using formula: " + sumFormula);
         if (sumWhileLoop == sumFormula) {
            System.out.println("Both computations are correct.");
         } else {
            System.out.println("The computations do not match.");
         }
      } else {
         System.out.println(n + " is not a natural number.");
      }
   }
}
