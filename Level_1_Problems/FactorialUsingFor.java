import java.util.*;
class FactorialUsingFor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int num = input.nextInt();
      if (num < 0) {
         System.out.println("Invalid Input");
      } else {
         int factorial = 1;
         for(int i=num;i>0;i--){
		factorial*=i;
	}
         System.out.println("The factorial is: " + factorial);
      }
   }
}

