import java.util.*;
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Select operation: +, -, *, /");
        char operation = input.next().charAt(0);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        double result = 0;
        boolean validOperation = true;
        if (operation == '+') {
            result = calculator.add(num1, num2);
        } 
        else if (operation == '-') {
            result = calculator.subtract(num1, num2);
        } 
        else if (operation == '*') {
            result = calculator.multiply(num1, num2);
        } 
        else if (operation == '/') {
            result = calculator.divide(num1, num2);
        } 
        else {
            validOperation = false;
            System.out.println("Invalid operation! Please choose +, -, *, or /.");
        }
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        }
}
