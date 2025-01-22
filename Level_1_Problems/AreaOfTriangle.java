import java.util.*;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / 6.4516;
        System.out.println("The area of the triangle in square inches is"+areaIn+" while in square centimeters is "+areaCm);
    }
}
