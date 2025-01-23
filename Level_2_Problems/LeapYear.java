import java.util.*;
class LeapYear{
	public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the year");
	  int year=input.nextInt();
	  if(year<1582){
	  System.out.println("Enter year above 1582");
	  }
	// Using Multiple If Statements
	  if(year%4==0){
	     if(year%100==0){
		if(year%400==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");
		}
	     }
	     else{
		System.out.println("Leap Year");
	     }
	  }
	  else{
		System.out.println("Not a Leap Year");
	  }

	//Using Single If
	if((year%4==0 && year%100!=0)||(year%400==0)){
	   System.out.println("The year is a Leap Year");
	}
	else{
	   System.out.println("The year is not a leap Year");
	}
	}
}
