import java.util.*;
class ConvertHeight{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		double cmToInches=2.54;
		int inchesPerFoot=12;
		double heightInInches=height/cmToInches;
		int feet=(int)(heightInInches/inchesPerFoot);
		int inches=(int)(heightInInches%inchesPerFoot);
		System.out.println("Your height in cm is " + height +" while in feet is " + feet + " and inches is " + inches);
	}
}
