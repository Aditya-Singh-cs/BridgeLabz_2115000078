class Student{
	static String universityName="GLA";
	private String name;
	private final int rollNumber;
	private String grade;
	private static int totalStudents=0;
	
	//Parameterized Constructor
	Student(String name,int rollNumber,String grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		totalStudents++;
	}
	//Method to Display Total Students
	public static void displayTotalStudents(){
		System.out.println("The Total Number of Students are "+totalStudents);
	}
	//Method to display Result
	public void displayResults(){
		if(this instanceof Student){
			System.out.println("Object is an Instance of Student");
			System.out.println("Name: "+name);
			System.out.println("Roll Number: "+rollNumber);
			System.out.println("Grade: "+grade);
			System.out.println();
		}
		else{
			System.out.println("Object is not an Instance of Student");
		}
	}
	
	public static void main(String args[]){
		Student student1=new Student("Aditya",24,"A");
		Student student2=new Student("Yash",123345,"C+");
		
		System.out.println("University Name: "+universityName+"\n");
		
		student1.displayResults();
		student2.displayResults();
		
		displayTotalStudents();
	}
}