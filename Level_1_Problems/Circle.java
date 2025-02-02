import java.util.*;

class Circle {
    private double radius;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius; 
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle defaultCircle = new Circle();
        System.out.println("Default Circle (radius 1.0):");
        System.out.println("Area: " + defaultCircle.area());
        System.out.println("Circumference: " + defaultCircle.circumference());

        System.out.println("Enter the radius of the circle: ");
        double userRadius = input.nextDouble();

        Circle userCircle = new Circle(userRadius);
        System.out.println("Circle with radius " + userRadius);
        System.out.println("Area: " + userCircle.area());
        System.out.println("Circumference: " + userCircle.circumference());

    }
}