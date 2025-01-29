import java.util.*;
class PrimeCheck{
	public boolean isPrime(int number){
		int count=0;
	for(int i=2;i<=number;i++){
		if(number%i==0){
		count++;
		}
		if(count>1){
		return false;
		}
	}
	return true;
	}
	public void displayResult(boolean result){
		if(result){
			System.out.println("The number is a Prime number");
		}
		else{
			System.out.println("The number is not a Prime number");
		}
	}
	public static void main(String args[]){
	PrimeCheck obj=new PrimeCheck();
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number to be checked");
	int number=input.nextInt();
	boolean result=obj.isPrime(number);
	obj.displayResult(result);
	}
}