import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "Electronics: 18% GST";
    }
}

class Clothing extends Product implements Taxable {
    Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.2;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "Clothing: 5% GST";
    }
}

class Groceries extends Product {
    Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Smartphone", 50000));
        products.add(new Clothing("C001", "T-Shirt", 1000));
        products.add(new Groceries("G001", "Rice", 500));

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            
            System.out.println("Product: " + p.getName());
            System.out.println("Original Price: Rs." + p.getPrice());
            System.out.println("Discount: Rs." + discount);
            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
                System.out.println("Tax: Rs." + tax);
            }
            System.out.println("Final Price: Rs." + finalPrice+"\n");
        }
    }
}
