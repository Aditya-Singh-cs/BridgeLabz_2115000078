import java.util.*;
class CountDigits{
     public static void main(String args[]){
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int number=input.nextInt();
	 int digits=0;
	 while(number!=0){
		digits++;
		number/=10;
	 }
	System.out.println("The Number of digits are "+digits);
	}
}
