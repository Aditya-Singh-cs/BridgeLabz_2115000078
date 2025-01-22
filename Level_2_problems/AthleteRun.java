import java.util.*;
class AthleteRun {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length of side 1 of the triangle ");
      double side1 = input.nextDouble();

      System.out.print("Enter the length of side 2 of the triangle ");
      double side2 = input.nextDouble();

      System.out.print("Enter the length of side 3 of the triangle  ");
      double side3 = input.nextDouble();

      double perimeter = side1 + side2 + side3;
      double targetDistance = 5 * 1000;
      double rounds = targetDistance / perimeter;

      System.out.println("The total number of rounds the athlete will run is"+rounds+" to complete 5 km ");
   }
}
