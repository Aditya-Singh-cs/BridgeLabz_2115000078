class BankAccount{
	static String bankName="Axis";
	private static int totalAccounts=0;
	private String accountHolderName;
	private final int accountNumber;
	BankAccount(String accountHolderName,int accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		totalAccounts++;
	}
	public static void getTotalAccounts(){
		System.out.println("The Total Number of Accounts "+totalAccounts);
	}
	public void displayResults(){
		if(this instanceof BankAccount){
			System.out.println("Object is an Instance of BankAccount");
			System.out.println("The Bank Name is "+bankName);
			System.out.println("The Account Number is "+accountNumber);
			System.out.println("The Account Holder Name is "+accountHolderName);
			System.out.println();
		}
		else{
			System.out.println("Object is not an Instance of BankAccount");
		}
	}
	public static void main(String args[]){
		BankAccount account1=new BankAccount("Aditya",123456789);
		BankAccount account2=new BankAccount("Yash",987654321);
		account1.displayResults();
		account2.displayResults();
		getTotalAccounts();
	}
}