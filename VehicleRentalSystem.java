import java.util.*;
// Abstract class Vehicle
abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber(){
		return vehicleNumber;
	}
	
    public String getType(){
		return type;
	}
	
    public double getRentalRate(){
		return rentalRate;
	}

    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days){
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Cost: " + calculateRentalCost(days));
    }
}

//Interface Insurable
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

//Car class
class Car extends Vehicle implements Insurable{
    private String insurancePolicy;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicy){
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // Fixed insurance cost for simplicity
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicy;
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicy;
    }
}

//Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; //Extra charge for heavy vehicles
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicy;
    }
}

//Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
		//creating objects
        vehicles.add(new Car("C123", 1000, "CAR12345"));
        vehicles.add(new Bike("B456", 500, "BIKE6789"));
        vehicles.add(new Truck("T789", 2000, "TRUCK1011"));
        
        int days = 5;
		
		//displaying vehicle details
        for (Vehicle vehicle : vehicles){
            vehicle.displayDetails(days);
            if (vehicle instanceof Insurable){
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
