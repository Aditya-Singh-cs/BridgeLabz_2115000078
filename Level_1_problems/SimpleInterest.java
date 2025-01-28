import java.util.*;
class SimpleInterest{
	public double simpleInterestCalculator(double principal,double rate,double time){
	  return ((principal*rate*time)/100);
	}
	public static void main(String args[]){
	  SimpleInterest obj=new SimpleInterest();
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the principal");
	  double principal=input.nextDouble();
	  System.out.println("Enter the rate of interest");
	  double rate=input.nextDouble();
	  System.out.println("Enter the time");
	  double time=input.nextDouble();
	  double simpleInterest=obj.simpleInterestCalculator(principal,rate,time);
	  System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+",Rate of Interest "+rate+" and Time "+time);
	}
}
