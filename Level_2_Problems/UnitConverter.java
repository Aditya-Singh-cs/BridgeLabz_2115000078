import java.util.*;
class UnitConverter {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in kilometers to convert to miles:");
        double km = input.nextDouble();
        System.out.println("Result: " + convertKmToMiles(km));
        System.out.println("Enter value in miles to convert to kilometers:");
        double miles = input.nextDouble();
        System.out.println("Result: " + convertMilesToKm(miles));
        System.out.println("Enter value in meters to convert to feet:");
        double meters = input.nextDouble();
        System.out.println("Result: " + convertMetersToFeet(meters));
        System.out.println("Enter value in feet to convert to meters:");
        double feet = input.nextDouble();
        System.out.println("Result: " + convertFeetToMeters(feet));
    }
}
