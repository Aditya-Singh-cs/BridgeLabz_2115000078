import java.util.*;
class LeapYearSingleIf{
	public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter Year");
	  int year=input.nextInt();
	  if(year<1582){
		System.out.println("Enter year above 1582");
	  }
	  if((year%4==0 && year%100!=0)||(year%400==0)){
		System.out.println("The year is a leap Year");
	  }
	  else{
		System.out.println("The year is not a Leap Year");
	  }
	}
}
