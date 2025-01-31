import java.util.*;
class Circle{
	static double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public static double circumferenceOfCircle(double radius){
		return 2*3.14*radius;
	}
	public static double areaOfCircle(double radius){
		return 3.14*Math.pow(radius,2);
	}
	public void display(double circumference,double area){
		System.out.println("The circumference of the Circle is "+circumference);
		System.out.println("The Area of the circle is "+area);
	}
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Radius of the Circle");
	double radius=input.nextDouble(); 
	Circle obj=new Circle(radius);
	double circumference=circumferenceOfCircle(radius);
	double area=areaOfCircle(radius);
	obj.display(circumference,area);
	}
}