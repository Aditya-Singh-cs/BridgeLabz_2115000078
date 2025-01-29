import java.util.*;
class PalindromeChecker{
	public String getInput(){
		Scanner input=new Scanner(System.in);
		String str="";
		str=input.nextLine();
		return str.toLowerCase();
	}
	public boolean palindromeCheck(String string){
		int low=0,high=string.length()-1;
		while(low<high){
			if(string.charAt(low)!=string.charAt(high)){
			return false;
			}
			low++;
			high--;
		}
		return true;
	}
	public void displayResult(boolean isPalindrome){
	if(isPalindrome){
	System.out.println("The String is Palindrome");
	}
	else{
		System.out.println("The String is not palindrome");
	}
	}
	public static void main(String args[]){
		PalindromeChecker obj=new PalindromeChecker();
		System.out.println("Enter the String");
		String string=obj.getInput();
		boolean isPalindrome=obj.palindromeCheck(string);
		obj.displayResult(isPalindrome);
	}
}