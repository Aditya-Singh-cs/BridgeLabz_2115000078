import java.util.*;
class EmployeeBonus {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the employee's salary: ");
      double salary = input.nextDouble();
      System.out.print("Enter the employee's years of service: ");
      int yearsOfService = input.nextInt();
      if (yearsOfService > 5) {
         double bonus = salary * 0.05;
         System.out.println("The employee is eligible for a bonus. The bonus amount is: " + bonus);
      } else {
         System.out.println("The employee is not eligible for a bonus.");
      }
   }
}

