import java.util.*;
class Book{
	static String title;
	static String author;
	static int price;
	Book(String name,String author,int price){
		this.title=name;
		this.author=author;
		this.price=price;
	}
	public void display(){
		System.out.println("The title of the Book is "+title);
		System.out.println("The author of the Book is "+author);
		System.out.println("The price of the Book is "+price);
	}
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the title of the book");
	String title=input.nextLine();
	System.out.println("Enter the author of the book");
	String author=input.nextLine();
	System.out.println("Enter the price of the book");
	int price=input.nextInt();
	Book obj=new Book(title,author,price);
	obj.display();
	}
}