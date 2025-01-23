import java.util.*;
class BMI {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight in kilograms: ");
      double weight = input.nextDouble();
      System.out.print("Enter height in centimeters: ");
      double heightCm = input.nextDouble();
      double heightM = heightCm / 100;
      double bmi = weight / (heightM * heightM);
      System.out.println("Your BMI is: " + bmi);
      if (bmi <= 18.4) {
         System.out.println("Weight Status: Underweight");
      } else if (bmi >= 18.5 && bmi <= 24.9) {
         System.out.println("Weight Status: Normal");
      } else if (bmi >= 25 && bmi <= 39.9) {
         System.out.println("Weight Status: Overweight");
      } else if (bmi >= 40) {
         System.out.println("Weight Status: Obese");
      }
   }
}

