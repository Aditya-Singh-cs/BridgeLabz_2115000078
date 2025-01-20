import java.util.*;
class CelsiustoFahrenheit{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperature in Celsius");
	double temp=sc.nextDouble();
	double newTemp=(temp*(9.0/5.0))+32;
	System.out.println("Temperature in Fahrenheit is="+newTemp);
	}
}