import java.util.*;
class  Average{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int first=sc.nextInt();
	System.out.println("Enter second number");
	int second=sc.nextInt();
	System.out.println("Enter third number");
	int third=sc.nextInt();
	double avg=(first+second+third)/3;
	System.out.println("The Average is="+avg);
	}
}