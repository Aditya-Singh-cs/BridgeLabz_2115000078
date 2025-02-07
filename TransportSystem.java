class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        System.out.println("Car -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        System.out.println("Truck -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    void displayInfo() {
        System.out.println("Motorcycle -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

class TransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15.0);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", false);

        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
    }
}
