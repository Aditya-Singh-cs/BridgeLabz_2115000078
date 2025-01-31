import java.util.*;
class Employee{
	static String name;
	static int id;
	static int salary;
	Employee(String name,int employeeId,int salary){
		this.name=name;
		this.id=employeeId;
		this.salary=salary;
	}
	public void display(){
		System.out.println("The name of the Employee is "+name);
		System.out.println("The id of the Employee is "+id);
		System.out.println("The salary of the Employee is "+salary);
	}
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the name of the Employee");
	String name=input.nextLine();
	System.out.println("Enter the id of the Employee");
	int employeeId=input.nextInt();
	System.out.println("Enter the salary of the Employee");
	int salary=input.nextInt();
	Employee obj=new Employee(name,employeeId,salary);
	obj.display();
	}
}