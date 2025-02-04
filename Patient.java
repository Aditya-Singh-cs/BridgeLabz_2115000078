class Patient{
	static String hospitalName="Medanta";
	private String name;
	private int age;
	private String ailment;
	private final int patientId;
	private static int totalPatients=0;
	//Parameterized Constructor
	Patient(String name,int age,String ailment,int patientId){
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		this.patientId=patientId;
		totalPatients++;
	}
	//Method For Total Number Of Patients
	public static void getTotalPatients(){
		System.out.println("The Total Number of Patients are "+totalPatients);
	}
	//Method to display Result
	public void displayResult(){
		if(this instanceof Patient){
			System.out.println("Object is an Instance of Patient");
			System.out.println("Patient Name: "+name);
			System.out.println("Patient Age: "+age);
			System.out.println("Patient Ailment: "+ailment);
			System.out.println("Patient Id: "+patientId+"\n");
		}
		else{
			System.out.println("Object is not an Instance of Patient");
		}
	}
	
	public static void main(String args[]){
		Patient patient1=new Patient("Aditya",21,"Headache",98984);
		Patient patient2=new Patient("Yash",22,"Viral",87387);
		
		System.out.println("Hospital Name: "+hospitalName+"\n");
		//Displaying Patient details
		patient1.displayResult();
		patient2.displayResult();
		
		getTotalPatients();
	}
}