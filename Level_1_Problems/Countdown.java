import java.util.*;
class Countdown {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the countdown starting number: ");
      int counter = input.nextInt();
      while (counter >= 1) {
         System.out.println(counter);
         counter--;
      }
      System.out.println("Launch");
   }
}
