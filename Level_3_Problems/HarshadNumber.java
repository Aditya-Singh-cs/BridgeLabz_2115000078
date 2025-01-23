import java.util.*;
class HarshadNumber{
	public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int number=input.nextInt();
	  int sum=0;
	  while(number!=0){
	 	int remainder=number%10;
		sum+=remainder;
		number/=10;
	  }
	 if(sum%3==0){
		System.out.println("Harshad Number");
	 }
	 else{
		System.out.println("Not a Harshad Number");
	}
	}
}
