class Employee{
	static String companyName="Capgemini";
	private static int totalEmployees=0;
	private String name;
	private String designation;
	private final int id;
	
	//Parameterized Constructor
	Employee(String name,String designation,int id){
		this.name=name;
		this.designation=designation;
		this.id=id;
		totalEmployees++;
	}
	
	//Displaying Company Name
	public static void displayCompanyName(){
		System.out.println("The Company Name is "+companyName);
		System.out.println();
	}
	
	//Displaying Total Number of Employees
	public static void displayTotalEmployees(){
		System.out.println("The Total Number of Employee is "+ totalEmployees);
		System.out.println();
	}
	
	public void displayResults(){
		if(this instanceof Employee){
			System.out.println("Object is an Instance of Employee");
			System.out.println("The Employee Details are:");
			System.out.println("Employee Name is "+name);
			System.out.println("The designation is "+designation);
			System.out.println("The ID of the Employee is "+id);
			System.out.println();
		}
		else{
			System.out.println("Object is not an Instance of Employee");
		}
	}
	
	//Main Method 
	public static void main(String args[]){
		Employee employee1=new Employee("Aditya","Web Developer",588079);
		Employee employee2=new Employee("Yash","Software Developer",965457);
		
		displayCompanyName();
		
		displayTotalEmployees();
		
		employee1.displayResults();
		employee2.displayResults();
	}
}