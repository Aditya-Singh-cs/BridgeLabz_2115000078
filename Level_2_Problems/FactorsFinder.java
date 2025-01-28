import java.util.*;
class FactorsFinder{
    public static int[] factors(int number){
    int count=0;
    for (int i=1;i<=number;i++){
    if(number%i==0){
	count++;
    }
    }
    int factors[]=new int[count];
    int k=0;
    for(int i=1;i<=number;i++){
	if(number%i==0){
	    factors[k]=i;
	    k++;
	}
    }
    return factors;
    }
    public int factorsSum(int[] numberOfFactors){
    int sum=0;
    for(int i=0;i<numberOfFactors.length;i++){
	sum+=numberOfFactors[i];
    }
    return sum;
    }
    public int factorsProduct(int[] numberOfFactors){
	int product=1;
	for(int i=0;i<numberOfFactors.length;i++){
		product*=numberOfFactors[i];
	}
    return product;
    }
    public int squareSum(int[] numberOfFactors){
	int sumSquare=0;
	for(int i=0;i<numberOfFactors.length;i++){
		sumSquare+=Math.pow(numberOfFactors[i],2);
	}
    return sumSquare;
    }
    public static void main(String args[]){
	FactorsFinder obj=new FactorsFinder();
        Scanner input=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=input.nextInt();
	int[] numberOfFactors=factors(number);
	int sumOfFactors=obj.factorsSum(numberOfFactors);
	int productOfFactors=obj.factorsProduct(numberOfFactors);
	int sumOfSquares=obj.squareSum(numberOfFactors);
	System.out.println("The Factors are:");
	for(int i=0;i<numberOfFactors.length;i++){
		System.out.print(numberOfFactors[i]+" ");
	}
	System.out.println();
	System.out.println("The Sum Of factors is "+sumOfFactors);
	System.out.println("The Product Of factors is "+productOfFactors);
	System.out.println("The Sum of Squares is "+sumOfSquares);
	}
}
