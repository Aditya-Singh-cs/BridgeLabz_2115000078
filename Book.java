class Book{
	static String libraryName="CEA Library";
	private String title;
	private String author;
	private final int isbn;
	
	Book(String title,String author,int isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public static void displayLibraryName(){
		System.out.println("The Library Name is "+libraryName);
		System.out.println();
	}
	
	public void displayResults(){
		if(this instanceof Book){
			System.out.println("Object is an Instance of Book");
			System.out.println("The Book Details are:");
			System.out.println("The Title is "+title);
			System.out.println("The Author Name is "+author);
			System.out.println("The ISBN of Book is "+isbn);
			System.out.println();
		}
		else{
			System.out.println("Object is not an Instance of Book");
		}
	}
	
	public static void main(String args[]){
		Book book1=new Book("Tempest","William Shakespeare",588079);
		Book book2=new Book("Intelligent Investor","Benjamin Graham",965457);
		
		displayLibraryName();
		
		book1.displayResults();
		book2.displayResults();
	}
}