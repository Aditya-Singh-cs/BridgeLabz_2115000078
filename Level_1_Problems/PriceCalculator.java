import java.util.*;
class PriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity is " + quantity + " and the unit price is INR " + unitPrice);
    }
}
