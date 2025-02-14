import java.util.*;
class InsertionSort{
	//Method to sort
	public void sorting(int[] employeeId){
	int j,key;
	for(int i=1;i<employeeId.length;i++){
		key=employeeId[i];
		j=i-1;
		while(j>=0 && employeeId[j]>key){
			employeeId[j+1]=employeeId[j];
			j--;
		}
		employeeId[j+1]=key;
	}
    }
	//Method to display result
	void display(int[] employeeId){
		for(int i:employeeId){
			System.out.print(i+" ");
		}
	}
	
	//Main Method
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	//Creating Object
	InsertionSort obj1=new InsertionSort();	
	//Taking the size of array as input
	int employee=0;
	System.out.println("Enter the number of Employees");
	employee=input.nextInt();
	
	int employeeId[]=new int[employee];
	//Taking EmployeeId for each Employees
	for(int i=0;i<employee;i++){
		System.out.println("Enter the Id of Employee "+ (i+1));
		employeeId[i]=input.nextInt();
	}
	//InsertionSort
	obj1.sorting(employeeId);
	//Displaying Result
	obj1.display(employeeId);
	}
}