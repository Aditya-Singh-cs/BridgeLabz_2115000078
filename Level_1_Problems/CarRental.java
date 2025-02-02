import java.util.Scanner;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRentalRate;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRentalRate = dailyRentalRate;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRentalRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter the number of rental days: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Enter the daily rental rate: ");
        double dailyRentalRate = scanner.nextDouble();

        CarRental rental = new CarRental(customerName, carModel, rentalDays, dailyRentalRate);

        rental.displayRentalDetails();
    }
}
