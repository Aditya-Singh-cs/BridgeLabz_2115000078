import java.util.*;
class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double[] trigValues = new double[3];
        trigValues[0] = Math.sin(radians);
        trigValues[1] = Math.cos(radians);
        trigValues[2] = Math.tan(radians);
        return trigValues;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
}

