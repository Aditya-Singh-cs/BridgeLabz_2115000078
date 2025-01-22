import java.util.*;
class KmToMiles{
	public static void main(String args[]){
		double km;
		Scanner sc=new Scanner(System.in);
		km=sc.nextDouble();
		double miles=km/1.6;
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
	}
}
