import java.util.*;
class SpringSeason {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter the day (1-31): ");
      int day = input.nextInt();
      boolean isSpring = false;
      if ((month == 3 && day >= 20 && day <= 31) ||
          (month == 4 && day >= 1 && day <= 30) ||
          (month == 5 && day >= 1 && day <= 31) ||
          (month == 6 && day >= 1 && day <= 20)) {
         isSpring = true;
      }
      if (isSpring) {
         System.out.println("It's a Spring Season.");
      } else {
         System.out.println("Not a Spring Season.");
      }
   }
}
