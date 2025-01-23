import java.util.*;
class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double first = input.nextDouble();
      System.out.print("Enter the second number: ");
      double second = input.nextDouble();
      System.out.print("Enter the operator (+, -, *, /): ");
      String op = input.next();
      double result;
      switch (op) {
         case "+":
            result = first + second;
            System.out.println("The result of addition is: " + result);
            break;
         case "-":
            result = first - second;
            System.out.println("The result of subtraction is: " + result);
            break;
         case "*":
            result = first * second;
            System.out.println("The result of multiplication is: " + result);
            break;
         case "/":
            if (second != 0) {
               result = first / second;
               System.out.println("The result of division is: " + result);
            } else {
               System.out.println("Division by zero is not allowed.");
            }
            break;
         default:
            System.out.println("Invalid operator.");
            break;
      }
   }
}
