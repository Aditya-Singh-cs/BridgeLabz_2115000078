import java.util.*;
class Factorial{
	public int getInput(){
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		return number;
	}
	public static int factorialCalculate(int number){
		if(number==1){
			return 1;
		}
		else{
			return (number*factorialCalculate(number-1));
		}
	}
	public void displayResult(int factorial){
	System.out.println("The factorial is "+factorial);
	}
	public static void main(String args[]){
		Factorial obj=new Factorial();
		System.out.println("Enter the Number");
		int number=obj.getInput();
		int factorial=obj.factorialCalculate(number);
		obj.displayResult(factorial);
	}
}