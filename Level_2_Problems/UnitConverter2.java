import java.util.*;
class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in yards to convert to feet:");
        double yards = input.nextDouble();
        System.out.println("Result: " + convertYardsToFeet(yards));
        System.out.println("Enter value in feet to convert to yards:");
        double feet = input.nextDouble();
        System.out.println("Result: " + convertFeetToYards(feet));
        System.out.println("Enter value in meters to convert to inches:");
        double meters = input.nextDouble();
        System.out.println("Result: " + convertMetersToInches(meters));
        System.out.println("Enter value in inches to convert to meters:");
        double inchesToMeters = input.nextDouble();
        System.out.println("Result: " + convertInchesToMeters(inchesToMeters));
        System.out.println("Enter value in inches to convert to centimeters:");
        double inchesToCm = input.nextDouble();
        System.out.println("Result: " + convertInchesToCentimeters(inchesToCm));
    }
}
