import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per km: Rs." + ratePerKm;
    }

    abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return "Car is at: Agra";
    }

    public void updateLocation(String newLocation) {
        System.out.println("Car location updated to: " + newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% cheaper than cars
    }

    public String getCurrentLocation() {
        return "Bike is at: Mathura";
    }

    public void updateLocation(String newLocation) {
        System.out.println("Bike location updated to: " + newLocation);
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // 20% cheaper than cars
    }
}
class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C001", "Aditya", 15));
        rides.add(new Bike("B001", "Yash", 10));
        rides.add(new Auto("A001", "Anirudh", 12));

        double distance = 10; // Example distance in km

        for (Vehicle v : rides) {
            double fare = v.calculateFare(distance);
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: Rs." + fare);
            if (v instanceof GPS) {
                System.out.println(((GPS) v).getCurrentLocation()+"\n");
            }
        }
    }
}
