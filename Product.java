import java.util.*;
class Product{
	static double discount=10.0;
	private String productName;
	private int price;
	private int quantity;
	private final int productId;
	
	//Parameterized Constructor
	Product(String productName,int price,int quantity,int productId){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		this.productId=productId;
	}
	
	//Method to update discount percentage
	public static void updateDiscount(double newDiscount){
		discount=newDiscount;
	}
	
	//Method to Display The result
	public void displayResults(){
		if(this instanceof Product){
			System.out.println("Object is an Instance of Product");
			System.out.println("The Product Name is "+productName);
			System.out.println("The Price is "+price);
			System.out.println("The quantity is "+quantity);
			System.out.println("The productId is "+productId);
			System.out.println("The discounted Price is "+(price-((discount/100)*price)));
			System.out.println();
		}
		else{
			System.out.println("Object is not an Instance of Product");
		}
	}
	
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		Product product1=new Product("Mobile Phone",20000,2,873478);
		Product product2=new Product("Earphones",3000,5,8776376);
		
		//Displaying Result before updation of discount
		product1.displayResults();
		product2.displayResults();
		
		//Updating Discount percentage
		System.out.println("Enter the new Discount:");
		double newDiscount=input.nextDouble();
		updateDiscount(newDiscount);
		
		//Displaying Result After Updation of discount
		product1.displayResults();
		product2.displayResults();
	}
}