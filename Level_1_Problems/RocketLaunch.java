import java.util.*;
class RocketLaunch {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the countdown starting number: ");
      int counter = input.nextInt();
      for (int i = counter; i >= 1; i--) {
         System.out.println(i);
      }
      System.out.println("Launch");
   }
}
