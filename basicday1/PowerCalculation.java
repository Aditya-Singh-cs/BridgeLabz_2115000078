import java.util.*;
class  PowerCalculation{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Base");
	double b=sc.nextDouble();
	System.out.println("Enter power");
	double p=sc.nextDouble();
	double cal=Math.pow(b,p);
	System.out.println("Exponent Value="+cal);
	}
}