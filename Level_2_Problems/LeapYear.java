import java.util.*;
class LeapYear{
	public int leapYearChecker(int year){
	if(year<1582){
	return -1;
	}
	else if((year%4==0 && year%100!=0) || (year%400==0)){
	return 1;
	}
	else{
	return 0;
	}
	}
	public static void main(String args[]){
	  LeapYear obj=new LeapYear();
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the year");
	  int year=input.nextInt();
	  int result=obj.leapYearChecker(year);
	  if(result==1){
		System.out.println("The year is a Leap Year");
	  }
	  else if(result==0){
		System.out.println("The Year is not a Leap Year");
	  }
	  else{
		System.out.println("Enter year above 1582");
	  }
	}
}
