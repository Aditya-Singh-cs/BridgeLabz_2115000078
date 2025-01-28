import java.util.*;
class AthleteRounds{
	public double numberOfRounds(double firstSide,double secondSide,double thirdSide){
	double distance=5*1000;
	double perimeter=firstSide+secondSide+thirdSide;
	return (distance/perimeter);
	}
	public static void main(String args[]){
	  AthleteRounds obj=new AthleteRounds();
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the first Side Of Triangle");
	  double firstSide=input.nextDouble();
	  System.out.println("Enter the Second side Of Triangle");
	  double secondSide=input.nextDouble();
	  System.out.println("Enter the third side Of Triangle");
	  double thirdSide=input.nextDouble();
	  double rounds=obj.numberOfRounds(firstSide,secondSide,thirdSide);
	  System.out.println("The Number Of Rounds to complete 5Km is"+rounds);
	}
}
