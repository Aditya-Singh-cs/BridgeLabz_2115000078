import java.util.*;
class MaxOfThree{
	public int getInput(){
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	return num;
	}
	public int maximum(int number1,int number2,int number3){
		return (Math.max(number1,Math.max(number2,number3)));
	}
	public static void main(String args[]){
	MaxOfThree obj=new MaxOfThree();
	System.out.println("Enter the first Number");
	int number1=obj.getInput();
	System.out.println("Enter the Second Number");
	int number2=obj.getInput();
	System.out.println("Enter the third Number");
	int number3=obj.getInput();
	int maxValue=obj.maximum(number1,number2,number3);
	System.out.println("The maximum value is "+maxValue);
	}
}