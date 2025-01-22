class DiscountedFee{
	public static void main(String args[]){
		int fee=125000, discountPercent=10;
		double discount=(fee*discountPercent)/100;
		double discountFee=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountFee);
	}
}
