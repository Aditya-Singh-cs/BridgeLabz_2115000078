import java.util.*;
class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit to convert to Celsius:");
        double fahrenheit = input.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("Enter temperature in Celsius to convert to Fahrenheit:");
        double celsius = input.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println("Enter weight in pounds to convert to kilograms:");
        double pounds = input.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Enter weight in kilograms to convert to pounds:");
        double kilograms = input.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("Enter volume in gallons to convert to liters:");
        double gallons = input.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Enter volume in liters to convert to gallons:");
        double liters = input.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));
    }
}
