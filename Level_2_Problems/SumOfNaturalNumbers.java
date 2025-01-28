import java.util.*;
class SumOfNaturalNumbers{
	public int sumUsingRecursion(int number){
	if(number==1) return 1;
	else{
	return (number+(sumUsingRecursion(number-1)));
	}
    }
	public int sumUsingFormula(int number){
	return ((number*(number+1))/2);
	}
	public static void main(String args[]){
	   SumOfNaturalNumbers obj=new SumOfNaturalNumbers();
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int number=input.nextInt();
	   if(number>0){
	   int sumRecursion=obj.sumUsingRecursion(number);
	   int sumFormula=obj.sumUsingFormula(number);
	      if(sumRecursion==sumFormula){
		System.out.println("Result using Recursion "+sumRecursion+" And result using Formula "+sumFormula);
	      }
	      else{
		System.out.println("Result is Different");
	      }
	   }
	   else{
		System.out.println("The number is not a Natural number");
	   }
	}
}

