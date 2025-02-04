import java.util.*;
class Vehicle{
	static int registrationFee=1500;
	private String ownerName;
	private String vehicleType;
	private final String registrationNumber;
	
	//Parameterized Constructor
	Vehicle(String ownerName,String vehicleType,String registrationNumber){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.registrationNumber=registrationNumber;
	}
	//Method to Update Registration Fee
	public static void updateRegistrationFee(int newRegistrationFee){
		registrationFee=newRegistrationFee;
	}
	//Method to displayResults
	public void displayResults(){
		if(this instanceof Vehicle){
			System.out.println("Object is an Instance of Vehicle");
			System.out.println("Owner Name: "+ownerName);
			System.out.println("Vehicle Type: "+vehicleType);
			System.out.println("Registration Fee: "+registrationFee);
			System.out.println("Registration Number: "+registrationNumber);
			System.out.println();
		}
		else{
			System.out.println("Object is not an Instance of Vehicle");
		}
	}
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		Vehicle vehicle1=new Vehicle("Aditya","Car","UP85AD0000");
		Vehicle vehicle2=new Vehicle("Yash","Bike","UP85AT0000");
		//Displaying result before updation of Registration fee
		vehicle1.displayResults();
		vehicle2.displayResults();
		
		System.out.println("Enter New Registration Fee");
		int newRegistrationFee=input.nextInt();
		updateRegistrationFee(newRegistrationFee);
		//Displaying result after updation of Registration fee
		vehicle1.displayResults();
		vehicle2.displayResults();
	}
}