import java.util.*;
class StudentFeeDiscount{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        	int fee=sc.nextInt();
		int discountPercent=sc.nextInt();
        	double discount=(fee*discountPercent)/100;
        	double discountFee=fee-discount;
        	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountFee);
    }
}

