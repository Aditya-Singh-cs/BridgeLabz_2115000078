import java.util.*;
class FibonacciSeries{
	public int[] getFibonacci(int range){
	if(range==1){
		return new int[]{0};
	}
	if(range==2){
		return new int[]{0,1};
	}
	if(range>2){
		int fibonacci[]=new int[range];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for(int i=2;i<range;i++){
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		return fibonacci;
	}
	return new int[]{};
	}
	public void printResult(int[] fibonacci){
		System.out.println("The Fibonacci Series is");
		for(int i=0;i<fibonacci.length;i++){
			System.out.print(fibonacci[i]+" ");
		}
	}
	public static void main(String args[]){
	FibonacciSeries obj=new FibonacciSeries();
	Scanner input=new Scanner(System.in);	
	System.out.println("Enter the Range");
	int range=input.nextInt();
	int[] fibonacci=obj.getFibonacci(range);
	obj.printResult(fibonacci);
	}
}