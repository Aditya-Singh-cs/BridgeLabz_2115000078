import java.util.*;
class  VolumeofCylinder{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius");
	double r=sc.nextDouble();
	System.out.println("Enter height");
	double h=sc.nextDouble();
	double vol=3.14*Math.pow(r,2)*h;
	System.out.println("The Volume is="+vol);
	}
}