import java.util.*;
class Armstrong{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=input.nextInt();
		int sum=0;
		int originalNumber=number;
		while(originalNumber!=0){
			int remainder=originalNumber%10;
			sum+=Math.pow(remainder,3);
			originalNumber/=10;
		}
		if(sum==number){
		System.out.println("The number is an Armstrong Number");
		}
		else{
		System.out.println("The number is not an Armstrong NUmber");
		}
	}
}
